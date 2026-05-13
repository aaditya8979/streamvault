package com.google.android.exoplayer.video;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f21166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21167f;

    public class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorInfo[] newArray(int i10) {
            return new ColorInfo[i10];
        }
    }

    public ColorInfo(int i10, int i11, int i12, @Nullable byte[] bArr) {
        this.f21163b = i10;
        this.f21164c = i11;
        this.f21165d = i12;
        this.f21166e = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.f21163b = parcel.readInt();
        this.f21164c = parcel.readInt();
        this.f21165d = parcel.readInt();
        this.f21166e = k0.u0(parcel) ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f21163b == colorInfo.f21163b && this.f21164c == colorInfo.f21164c && this.f21165d == colorInfo.f21165d && Arrays.equals(this.f21166e, colorInfo.f21166e);
    }

    public int hashCode() {
        if (this.f21167f == 0) {
            this.f21167f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21163b) * 31) + this.f21164c) * 31) + this.f21165d) * 31) + Arrays.hashCode(this.f21166e);
        }
        return this.f21167f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f21163b);
        sb2.append(", ");
        sb2.append(this.f21164c);
        sb2.append(", ");
        sb2.append(this.f21165d);
        sb2.append(", ");
        sb2.append(this.f21166e != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21163b);
        parcel.writeInt(this.f21164c);
        parcel.writeInt(this.f21165d);
        k0.O0(parcel, this.f21166e != null);
        byte[] bArr = this.f21166e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
