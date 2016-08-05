package com.data.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Geo implements Serializable {
    public static final long serialVersionUID = 491895221L;

    /**
     * : geo.Latitude
     * @author MyBatis Generator
     */
    private Double latitude;

    /**
     * : geo.Longitude
     * @author MyBatis Generator
     */
    private Double longitude;

    /**
     * : geo.Nothing
     * @author MyBatis Generator
     */
    private Long nothing;

    /**
     * : geo.Altitude
     * @author MyBatis Generator
     */
    private Long altitude;

    /**
     * : geo.Date
     * @author MyBatis Generator
     */
    private BigDecimal date;

    /**
     * : geo.DateString
     * @author MyBatis Generator
     */
    private String datestring;

    /**
     * : geo.TimeString
     * @author MyBatis Generator
     */
    private String timestring;

    /**
     * 获取: geo.Latitude
     * @return : geo.Latitude
     * @author MyBatis Generator
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置: geo.Latitude
     * @param latitude 映射数据库字段: geo.Latitude
     * @author MyBatis Generator
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取: geo.Longitude
     * @return : geo.Longitude
     * @author MyBatis Generator
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置: geo.Longitude
     * @param longitude 映射数据库字段: geo.Longitude
     * @author MyBatis Generator
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取: geo.Nothing
     * @return : geo.Nothing
     * @author MyBatis Generator
     */
    public Long getNothing() {
        return nothing;
    }

    /**
     * 设置: geo.Nothing
     * @param nothing 映射数据库字段: geo.Nothing
     * @author MyBatis Generator
     */
    public void setNothing(Long nothing) {
        this.nothing = nothing;
    }

    /**
     * 获取: geo.Altitude
     * @return : geo.Altitude
     * @author MyBatis Generator
     */
    public Long getAltitude() {
        return altitude;
    }

    /**
     * 设置: geo.Altitude
     * @param altitude 映射数据库字段: geo.Altitude
     * @author MyBatis Generator
     */
    public void setAltitude(Long altitude) {
        this.altitude = altitude;
    }

    /**
     * 获取: geo.Date
     * @return : geo.Date
     * @author MyBatis Generator
     */
    public BigDecimal getDate() {
        return date;
    }

    /**
     * 设置: geo.Date
     * @param date 映射数据库字段: geo.Date
     * @author MyBatis Generator
     */
    public void setDate(BigDecimal date) {
        this.date = date;
    }

    /**
     * 获取: geo.DateString
     * @return : geo.DateString
     * @author MyBatis Generator
     */
    public String getDatestring() {
        return datestring;
    }

    /**
     * 设置: geo.DateString
     * @param datestring 映射数据库字段: geo.DateString
     * @author MyBatis Generator
     */
    public void setDatestring(String datestring) {
        this.datestring = datestring == null ? null : datestring.trim();
    }

    /**
     * 获取: geo.TimeString
     * @return : geo.TimeString
     * @author MyBatis Generator
     */
    public String getTimestring() {
        return timestring;
    }

    /**
     * 设置: geo.TimeString
     * @param timestring 映射数据库字段: geo.TimeString
     * @author MyBatis Generator
     */
    public void setTimestring(String timestring) {
        this.timestring = timestring == null ? null : timestring.trim();
    }
}