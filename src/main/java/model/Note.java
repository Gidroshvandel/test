package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Note implements Serializable {

    private String header;

    private String details;

    private String pictureURL;

    private int priority;

    public Note(String header, String details, String pictureURL, int priority) {
        this.header = header;
        this.details = details;
        this.pictureURL = pictureURL;
        this.priority = priority;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
