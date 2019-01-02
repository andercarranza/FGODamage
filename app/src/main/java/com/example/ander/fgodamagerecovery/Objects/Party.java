package com.example.ander.fgodamagerecovery.Objects;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Party implements Parcelable, Serializable {
    private Servant servant1;
    private Servant servant2;
    private Servant servant3;
    public transient Context myContext;


    public Party(Servant servant1, Servant servant2, Servant servant3) {
        this.servant1 = servant1;
        this.servant2 = servant2;
        this.servant3 = servant3;
    }

    protected Party(Parcel in) {
        servant1 = in.readParcelable(Servant.class.getClassLoader());
        servant2 = in.readParcelable(Servant.class.getClassLoader());
        servant3 = in.readParcelable(Servant.class.getClassLoader());
    }

    public static final Creator<Party> CREATOR = new Creator<Party>() {
        @Override
        public Party createFromParcel(Parcel in) {
            return new Party(in);
        }

        @Override
        public Party[] newArray(int size) {
            return new Party[size];
        }
    };

    public Servant getServant1() {
        return servant1;
    }

    public void setServant1(Servant servant1) {
        this.servant1 = servant1;
    }

    public Servant getServant2() {
        return servant2;
    }

    public void setServant2(Servant servant2) {
        this.servant2 = servant2;
    }

    public Servant getServant3() {
        return servant3;
    }

    public void setServant3(Servant servant3) {
        this.servant3 = servant3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(servant1, flags);
        dest.writeParcelable(servant2, flags);
        dest.writeParcelable(servant3, flags);
    }
}
