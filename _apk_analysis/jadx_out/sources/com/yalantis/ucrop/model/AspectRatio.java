package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f53809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f53810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f53811d;

    public class a implements Parcelable.Creator<AspectRatio> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AspectRatio[] newArray(int i10) {
            return new AspectRatio[i10];
        }
    }

    public AspectRatio(Parcel parcel) {
        this.f53809b = parcel.readString();
        this.f53810c = parcel.readFloat();
        this.f53811d = parcel.readFloat();
    }

    public AspectRatio(@Nullable String str, float f10, float f11) {
        this.f53809b = str;
        this.f53810c = f10;
        this.f53811d = f11;
    }

    @Nullable
    public String c() {
        return this.f53809b;
    }

    public float d() {
        return this.f53810c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.f53811d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f53809b);
        parcel.writeFloat(this.f53810c);
        parcel.writeFloat(this.f53811d);
    }
}
