package ru.iojs.geovk.api;

/**
 * Created by sibirsky on 13.09.17.
 */

public class PlaceRequest {

    private Integer userId;
    private Float latitude;
    private Float longitude;
    private String text;

    public PlaceRequest() { }

    public PlaceRequest(Integer userId, Float latitude, Float longitude, String text) {
        this.userId = userId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.text = text;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
