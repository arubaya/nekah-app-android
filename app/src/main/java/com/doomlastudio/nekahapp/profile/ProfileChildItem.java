package com.doomlastudio.nekahapp.profile;

import android.os.Parcel;
import android.os.Parcelable;


public class ProfileChildItem implements Parcelable {
    public String childName;
    public String childDetail;
    //public String parentDesc;

    public ProfileChildItem(String childName, String childDetail) {
        this.childName = childName;
        this.childDetail = childDetail;
        //this.parentDesc = parentDesc;
    }



    protected ProfileChildItem(Parcel in) {
        childName = in.readString();
        childDetail = in.readString();
        //parentDesc = in.readString();
    }

    public static final Creator<ProfileChildItem> CREATOR = new Creator<ProfileChildItem>() {
        @Override
        public ProfileChildItem createFromParcel(Parcel in) {
            return new ProfileChildItem(in);
        }

        @Override
        public ProfileChildItem[] newArray(int size) {
            return new ProfileChildItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(childName);
        dest.writeString(childDetail);
        //dest.writeString(parentDesc);
    }
}