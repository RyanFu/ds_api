package me.doushi.api.domain;

import me.doushi.api.util.DateUtil;

import java.text.ParseException;

/**
 * Created by songlijun on 15/10/13.
 */
public class Video {

    private String id;
    private String title; //标题
    private String videoUrl;// video地址
    private String pic; // 图片地址
    private int type;//video类型
    private String pushTime;//发布时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) throws ParseException {
        this.pushTime = DateUtil.countTime(pushTime);
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", pic='" + pic + '\'' +
                ", type=" + type +
                ", pushTime='" + pushTime + '\'' +
                '}';
    }

    public Video() {
        super();
    }

    public Video(String id, String title, String videoUrl, String pic, int type, String pushTime) {
        this.id = id;
        this.title = title;
        this.videoUrl = videoUrl;
        this.pic = pic;
        this.type = type;
        this.pushTime = pushTime;
    }
}
