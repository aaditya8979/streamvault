package com.bytedance.adsdk.ugeno.pno;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ouw implements Parcelable {
    public final Parcelable vt;
    public static final ouw ouw = new ouw() { // from class: com.bytedance.adsdk.ugeno.pno.ouw.1
    };
    public static final Parcelable.Creator<ouw> CREATOR = new Parcelable.ClassLoaderCreator<ouw>() { // from class: com.bytedance.adsdk.ugeno.pno.ouw.2
        private static ouw ouw(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return ouw.ouw;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ouw(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ouw createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return ouw(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new ouw[i10];
        }
    };

    private ouw() {
        this.vt = null;
    }

    public /* synthetic */ ouw(byte b10) {
        this();
    }

    public ouw(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.vt = parcelable == null ? ouw : parcelable;
    }

    public ouw(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.vt = parcelable == ouw ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.vt, i10);
    }
}
