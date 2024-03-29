package com.POJO;

import java.util.List;

public class VideoBean {
    private int video_id;
    private String title;
    private String link;
    private String author;
    private String tag;
    private String abstract_;

    private String authorIMG;
    private String absIMG;

    public VideoBean(String title, String link, String author, String tag, String abstract_, String authorIMG, String absIMG) {
        this.title = title;
        this.link = link;
        this.author = author;
        this.tag = tag;
        this.abstract_ = abstract_;
        this.authorIMG = authorIMG;
        this.absIMG = absIMG;
    }

    public VideoBean() {
    }

    public int getVideo_id() {
        return video_id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getAuthorIMG() {
        return authorIMG;
    }

    public String getAbsIMG(){
        return absIMG;
    }

    public String getAuthor() {
        return author;
    }

    public String getTag() {
        return tag;
    }

    public String getAbstract_() {
        return abstract_;
    }

}
