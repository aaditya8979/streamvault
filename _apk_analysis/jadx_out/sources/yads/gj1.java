package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class gj1 implements ss1 {
    public static final Parcelable.Creator<gj1> CREATOR = new fj1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f90006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90008e;

    public gj1(int i10, int i11, String str, byte[] bArr) {
        this.f90005b = str;
        this.f90006c = bArr;
        this.f90007d = i10;
        this.f90008e = i11;
    }

    public gj1(Parcel parcel) {
        this.f90005b = (String) ib3.a((Object) parcel.readString());
        this.f90006c = (byte[]) ib3.a((Object) parcel.createByteArray());
        this.f90007d = parcel.readInt();
        this.f90008e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj1.class != obj.getClass()) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return this.f90005b.equals(gj1Var.f90005b) && Arrays.equals(this.f90006c, gj1Var.f90006c) && this.f90007d == gj1Var.f90007d && this.f90008e == gj1Var.f90008e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f90006c) + k4.a(this.f90005b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f90007d) * 31) + this.f90008e;
    }

    public final String toString() {
        return "mdta: key=" + this.f90005b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f90005b);
        parcel.writeByteArray(this.f90006c);
        parcel.writeInt(this.f90007d);
        parcel.writeInt(this.f90008e);
    }
}
