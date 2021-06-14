package com.toni.masakuy;

import android.net.Uri;

import java.io.Serializable;

public class ItemsModel implements Serializable {

    //private int video;
    private String name;
    private String email;
    private int images;

    public ItemsModel(String name, String email, int images){ //, int video) {
        this.name = name;
        this.email = email;
        this.images = images;
        //this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

  //  public void setVideo(int video) { this.video = video; }

    //public Uri getVideo() { return getVideo();
   // }
}
