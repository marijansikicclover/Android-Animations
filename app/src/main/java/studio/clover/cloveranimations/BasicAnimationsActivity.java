package studio.clover.cloveranimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import studio.clover.cloveranimations.model.Album;

public class BasicAnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_animations);

        supportPostponeEnterTransition();

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final CollapsingToolbarLayout ctlName = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        final ImageView ivAlbumCover = (ImageView) findViewById(R.id.iv_album_art);
        final ImageButton btnFab = (ImageButton) findViewById(R.id.btn_fab);
        final LinearLayout llTrackPanel = (LinearLayout) findViewById(R.id.ll_track_panel);
        TextView tvTrackName = (TextView) findViewById(R.id.tv_track_name);
        TextView tvSongLength = (TextView) findViewById(R.id.tv_length);
        final TextView tvLyrics = (TextView) findViewById(R.id.tv_lyrics);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        final Album albumItem = extras.getParcelable(Const.EXTRA);

        ctlName.setTitle(albumItem.name);
        tvTrackName.setText(albumItem.songName);
        tvSongLength.setText(albumItem.length);
        tvLyrics.setText(albumItem.lyrics);

        Picasso.with(this).load(albumItem.url).into(ivAlbumCover, new Callback() {
            @Override
            public void onSuccess() {

                Bitmap icon = BitmapFactory.decodeResource(getResources(),
                        albumItem.url);

                Palette.from(icon)
                        .generate(new Palette.PaletteAsyncListener() {
                            @Override
                            public void onGenerated(Palette palette) {
                                Palette.Swatch textSwatch = palette.getVibrantSwatch();
                                Palette.Swatch light = palette.getLightVibrantSwatch();

                                getWindow().setStatusBarColor((textSwatch != null ? textSwatch.getRgb() : 0));

                                if (light != null) {
                                    ctlName.setContentScrimColor(light.getRgb());
                                } else {
                                    //Custom default color
                                }

                                supportStartPostponedEnterTransition();

                                ObjectAnimator scaleX = ObjectAnimator.ofFloat(btnFab, "scaleX", 0, 1);
                                ObjectAnimator scaleY = ObjectAnimator.ofFloat(btnFab, "scaleY", 0, 1);

                                AnimatorSet fabAnimatorSet = new AnimatorSet();
                                fabAnimatorSet.playTogether(scaleX, scaleY);

                                int titleStartValue = llTrackPanel.getTop();
                                int titleEndValue = llTrackPanel.getBottom();
                                ObjectAnimator titleAnimator = ObjectAnimator.ofInt(llTrackPanel, "bottom", titleStartValue, titleEndValue);
                                titleAnimator.setInterpolator(new AccelerateInterpolator());

                                ObjectAnimator trackAnimatorAlpha = ObjectAnimator.ofFloat(tvLyrics, "alpha", 0f, 1f);

                                titleAnimator.setDuration(1000);
                                trackAnimatorAlpha.setDuration(1000);

                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playSequentially(titleAnimator, trackAnimatorAlpha, fabAnimatorSet);
                                animatorSet.start();
                            }
                        });
            }

            @Override
            public void onError() {
                //Custom error handling: default colors etc.
            }
        });
    }
}