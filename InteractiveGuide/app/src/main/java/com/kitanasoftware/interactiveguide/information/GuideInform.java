//package com.kitanasoftware.interactiveguide.information;
//
//import android.graphics.Bitmap;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.io.Serializable;
//
///**
// * Created by dasha on 29/01/16.
// */
//public class GuideInform extends Information implements Serializable{
//    private String full_name;
//    private String phone;
//    private Bitmap photo;
//
//    private static final long serialVersionUID = 1996156934189183983L;
//
//    public GuideInform(InformType type,String full_name, String phone, Bitmap photo) {
//        super(type);
//        this.full_name = full_name;
//        this.phone = phone;
//        this.photo = photo;
//    }
//
//    public GuideInform(InformType type, String full_name, String phone) {
//        super(type);
//        this.full_name = full_name;
//        this.phone = phone;
//    }
//
//    public String getFull_name() {
//        return full_name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public Bitmap getPhoto() {
//        return photo;
//    }
//
//    public void setFull_name(String full_name) {
//        this.full_name = full_name;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setPhoto(Bitmap photo) {
//        this.photo = photo;
//    }
//
//
//}
