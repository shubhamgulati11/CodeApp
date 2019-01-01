package com.example.shubh.codeapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    String name;
    String desc;
    String initial;
    public boolean progress = false;

    public Data() {
    }

    public Data(String name, String desc, String initial) {
        this.name = name;
        this.desc = desc;
        this.initial = initial;
    }

    protected Data(Parcel in) {
        name = in.readString();
        desc = in.readString();
        initial = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(initial);
    }
}
