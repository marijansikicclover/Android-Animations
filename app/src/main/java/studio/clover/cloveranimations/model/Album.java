package studio.clover.cloveranimations.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable {

    public String name;
    public String artist;
    public int url;
    public String length;
    public String songName;
    public String lyrics;

    public Album(String name, String artist, int url, String length, String songName, String lyrics) {
        this.name = name;
        this.artist = artist;
        this.url = url;
        this.length = length;
        this.songName = songName;
        this.lyrics = lyrics;
    }

    protected Album(Parcel in) {
        name = in.readString();
        artist = in.readString();
        url = in.readInt();
        length = in.readString();
        songName = in.readString();
        lyrics = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(artist);
        dest.writeInt(url);
        dest.writeString(length);
        dest.writeString(songName);
        dest.writeString(lyrics);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };
}
