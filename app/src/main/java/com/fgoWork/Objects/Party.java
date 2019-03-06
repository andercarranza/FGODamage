package com.fgoWork.Objects;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Party implements Parcelable, Serializable {
    private com.fgoWork.Objects.Servant servant1;
    private com.fgoWork.Objects.Servant servant2;
    private com.fgoWork.Objects.Servant servant3;
    public transient Context myContext;


    public Party(com.fgoWork.Objects.Servant servant1, com.fgoWork.Objects.Servant servant2, com.fgoWork.Objects.Servant servant3) {
        this.servant1 = servant1;
        this.servant2 = servant2;
        this.servant3 = servant3;
    }

    protected Party(Parcel in) {
        servant1 = in.readParcelable(com.fgoWork.Objects.Servant.class.getClassLoader());
        servant2 = in.readParcelable(com.fgoWork.Objects.Servant.class.getClassLoader());
        servant3 = in.readParcelable(com.fgoWork.Objects.Servant.class.getClassLoader());
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

    public com.fgoWork.Objects.Servant getServant1() {
        return servant1;
    }

    public void setServant1(com.fgoWork.Objects.Servant servant1) {
        this.servant1 = servant1;
    }

    public com.fgoWork.Objects.Servant getServant2() {
        return servant2;
    }

    public void setServant2(com.fgoWork.Objects.Servant servant2) {
        this.servant2 = servant2;
    }

    public com.fgoWork.Objects.Servant getServant3() {
        return servant3;
    }

    public void setServant3(com.fgoWork.Objects.Servant servant3) {
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
