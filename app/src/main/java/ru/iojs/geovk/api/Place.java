package ru.iojs.geovk.api;

/**
 * Created by sibirsky on 13.09.17.
 */

public class Place {

    /** ID места */
    private Integer id;

    /** Название места */
    private String title;

    /** Широта */
    private Float latitude;

    /** Долгота */
    private Float longitude;

    /** Расстояние до места от заданных координат */
    private Integer distance;

    /** ID группы, к которой привязано место */
    private Integer groupId;

    /** Количество всех чекинов */
    private Integer checkinsCount;

    /** Количество чекинов пользователя в этом месте */
    private Integer userCheckinsCount;

    /** Количество чекинов друзей пользователя в этом месте */
    private Integer friendsCheckinsCount;

    /** Рейтинг схожести названия места и текста поста */
    private Integer textRating;

    public Place() { }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(Integer checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    public Integer getUserCheckinsCount() {
        return userCheckinsCount;
    }

    public void setUserCheckinsCount(Integer userCheckinsCount) {
        this.userCheckinsCount = userCheckinsCount;
    }

    public Integer getFriendsCheckinsCount() {
        return friendsCheckinsCount;
    }

    public void setFriendsCheckinsCount(Integer friendsCheckinsCount) {
        this.friendsCheckinsCount = friendsCheckinsCount;
    }

    public Integer getTextRating() {
        return textRating;
    }

    public void setTextRating(Integer textRating) {
        this.textRating = textRating;
    }

    @Override
    public String toString() {
        String res = "{\"id\":" + id.toString() + ", \"title\":\"" + title + "\"}";
        return res;
    }
}
