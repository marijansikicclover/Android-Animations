package studio.clover.cloveranimations.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import studio.clover.cloveranimations.BasicAnimationsActivity;
import studio.clover.cloveranimations.Const;
import studio.clover.cloveranimations.R;
import studio.clover.cloveranimations.model.Album;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    private List<Album> data = new ArrayList<>();

    public void setData(List<Album> newData) {

        if (newData != null && !newData.isEmpty()) {

            data = newData;
            notifyDataSetChanged();
        }
    }

    @Override
    public AlbumAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album_recycle_tile, parent, false));
    }

    @Override
    public void onBindViewHolder(AlbumAdapter.ViewHolder holder, int position) {

        Album album = data.get(position);
        holder.ivCover.setImageResource(album.url);
        holder.tvTitle.setText(album.name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    final class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCover;
        TextView tvTitle;
        LinearLayout llRoot;

        ViewHolder(final View itemView) {
            super(itemView);

            ivCover = (ImageView) itemView.findViewById(R.id.iv_album);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_album_title);
            llRoot = (LinearLayout) itemView.findViewById(R.id.ll_root);
            llRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(), BasicAnimationsActivity.class);

                    Pair<View, String> p1 = Pair.create((View) ivCover, "iv_transition");

                    intent.putExtra(Const.EXTRA, data.get(getAdapterPosition()));
                    intent.putExtra("iv_transition", ViewCompat.getTransitionName(ivCover));

                    ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) itemView.getContext(), p1);

                    itemView.getContext().startActivity(intent, optionsCompat.toBundle());
                }
            });
        }
    }
}