package studio.clover.cloveranimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import studio.clover.cloveranimations.adapter.AlbumAdapter;
import studio.clover.cloveranimations.model.AlbumListModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlbumListModel albumListModel = new AlbumListModel();
        albumListModel.setAlbumList();

        RecyclerView rvChannel = (RecyclerView) findViewById(R.id.rv_album);
        rvChannel.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        AlbumAdapter adapterAlbum = new AlbumAdapter();

        adapterAlbum.setData(albumListModel.getAlbumList());
        rvChannel.setAdapter(adapterAlbum);
    }
}