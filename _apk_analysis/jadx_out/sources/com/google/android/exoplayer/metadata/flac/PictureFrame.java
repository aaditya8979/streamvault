package com.google.android.exoplayer.metadata.flac;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f20244i;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f20237b = i10;
        this.f20238c = str;
        this.f20239d = str2;
        this.f20240e = i11;
        this.f20241f = i12;
        this.f20242g = i13;
        this.f20243h = i14;
        this.f20244i = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.f20237b = parcel.readInt();
        this.f20238c = (String) k0.i(parcel.readString());
        this.f20239d = (String) k0.i(parcel.readString());
        this.f20240e = parcel.readInt();
        this.f20241f = parcel.readInt();
        this.f20242g = parcel.readInt();
        this.f20243h = parcel.readInt();
        this.f20244i = (byte[]) k0.i(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f20237b == pictureFrame.f20237b && this.f20238c.equals(pictureFrame.f20238c) && this.f20239d.equals(pictureFrame.f20239d) && this.f20240e == pictureFrame.f20240e && this.f20241f == pictureFrame.f20241f && this.f20242g == pictureFrame.f20242g && this.f20243h == pictureFrame.f20243h && Arrays.equals(this.f20244i, pictureFrame.f20244i);
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20237b) * 31) + this.f20238c.hashCode()) * 31) + this.f20239d.hashCode()) * 31) + this.f20240e) * 31) + this.f20241f) * 31) + this.f20242g) * 31) + this.f20243h) * 31) + Arrays.hashCode(this.f20244i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f20238c + ", description=" + this.f20239d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20237b);
        parcel.writeString(this.f20238c);
        parcel.writeString(this.f20239d);
        parcel.writeInt(this.f20240e);
        parcel.writeInt(this.f20241f);
        parcel.writeInt(this.f20242g);
        parcel.writeInt(this.f20243h);
        parcel.writeByteArray(this.f20244i);
    }
}
