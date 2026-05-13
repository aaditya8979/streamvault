package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ad2 implements ss1 {
    public static final Parcelable.Creator<ad2> CREATOR = new zc2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f87664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f87665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f87666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f87667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f87668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f87669i;

    public ad2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f87662b = i10;
        this.f87663c = str;
        this.f87664d = str2;
        this.f87665e = i11;
        this.f87666f = i12;
        this.f87667g = i13;
        this.f87668h = i14;
        this.f87669i = bArr;
    }

    public ad2(Parcel parcel) {
        this.f87662b = parcel.readInt();
        this.f87663c = (String) ib3.a((Object) parcel.readString());
        this.f87664d = (String) ib3.a((Object) parcel.readString());
        this.f87665e = parcel.readInt();
        this.f87666f = parcel.readInt();
        this.f87667g = parcel.readInt();
        this.f87668h = parcel.readInt();
        this.f87669i = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f87669i;
        int i10 = this.f87662b;
        if (im1Var.f90888j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f90889k, (Object) 3)) {
            im1Var.f90888j = (byte[]) bArr.clone();
            im1Var.f90889k = Integer.valueOf(i10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad2.class != obj.getClass()) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return this.f87662b == ad2Var.f87662b && this.f87663c.equals(ad2Var.f87663c) && this.f87664d.equals(ad2Var.f87664d) && this.f87665e == ad2Var.f87665e && this.f87666f == ad2Var.f87666f && this.f87667g == ad2Var.f87667g && this.f87668h == ad2Var.f87668h && Arrays.equals(this.f87669i, ad2Var.f87669i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f87669i) + ((((((((k4.a(this.f87664d, k4.a(this.f87663c, (this.f87662b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f87665e) * 31) + this.f87666f) * 31) + this.f87667g) * 31) + this.f87668h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f87663c + ", description=" + this.f87664d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f87662b);
        parcel.writeString(this.f87663c);
        parcel.writeString(this.f87664d);
        parcel.writeInt(this.f87665e);
        parcel.writeInt(this.f87666f);
        parcel.writeInt(this.f87667g);
        parcel.writeInt(this.f87668h);
        parcel.writeByteArray(this.f87669i);
    }
}
