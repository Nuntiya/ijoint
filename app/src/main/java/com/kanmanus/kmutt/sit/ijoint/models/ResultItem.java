package com.kanmanus.kmutt.sit.ijoint.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by kanmanus on 1/14/15 AD.
 */
public class ResultItem {
    public long dbId;
    public String tid;
    public String time;
    public String angle;
    public String rawAngle;
    public String azimuth;
    public String pitch;
    public String roll;
    public String magneticRoll;
    public String calibate;
    public ResultItem(String tid, String angle) {
        this.tid = tid;
        this.angle = angle;
    }

    public ResultItem(long dbId, String tid, String time, String angle, String rawAngle, String azimuth,
                        String pitch, String roll) {
        this.dbId = dbId;
        this.tid = tid;
        this.time = time;
        this.angle = angle;
        this.rawAngle = rawAngle;
        this.azimuth = azimuth;
        this.pitch = pitch;
        this.roll = roll;
    }

    public JSONObject getJSONObject() {
        JSONObject obj = new JSONObject();
        try {
            obj.put("tid", tid);
            obj.put("time", time);
            obj.put("angle", angle);
            obj.put("rawAngle", rawAngle);
            obj.put("azimuth", azimuth);
            obj.put("pitch", pitch);
            obj.put("roll", roll);
        } catch (JSONException e) {

        }
        return obj;
    }

    public String getCalibate() {
        return calibate;
    }

    public void setCalibate(String calibate) {
        this.calibate = calibate;
    }

    public String getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(String azimuth) {
        this.azimuth = azimuth;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getMagneticRoll() {
        return magneticRoll;
    }

    public void setMagneticRoll(String magneticRoll) {
        this.magneticRoll = magneticRoll;
    }
}
