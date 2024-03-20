package com.RentalHome.BackEnd.PostManagement;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "post")
public class PostModel {

    //    @JsonProperty("_id")
    @Id
    String id;
    String price;
    String district;
    String pincode;
    String address;
    String imageurl;
    String posteddata;
    String email;
    String mobile;
    String ownername;

    public PostModel() {
    }

    @Override
    public String toString() {
        return "PostModel{" +
                "id='" + id + '\'' +
                ", price='" + price + '\'' +
                ", district='" + district + '\'' +
                ", pincode='" + pincode + '\'' +
                ", address='" + address + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", posteddata='" + posteddata + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", ownername='" + ownername + '\'' +
                '}';
    }

    public PostModel(String id, String price, String district, String pincode, String address, String imageurl, String posteddata, String email, String mobile, String ownername) {
        this.id = id;
        this.price = price;
        this.district = district;
        this.pincode = pincode;
        this.address = address;
        this.imageurl = imageurl;
        this.posteddata = posteddata;
        this.email = email;
        this.mobile = mobile;
        this.ownername = ownername;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getPosteddata() {
        return posteddata;
    }

    public void setPosteddata(String posteddata) {
        this.posteddata = posteddata;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }
}
