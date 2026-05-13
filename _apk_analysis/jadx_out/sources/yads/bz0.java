package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bz0 extends v21 {
    public static final Parcelable.Creator<bz0> CREATOR = new az0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f88248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f88249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88250f;

    public bz0(Parcel parcel) {
        super("GEOB");
        this.f88247c = (String) ib3.a((Object) parcel.readString());
        this.f88248d = (String) ib3.a((Object) parcel.readString());
        this.f88249e = (String) ib3.a((Object) parcel.readString());
        this.f88250f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public bz0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f88247c = str;
        this.f88248d = str2;
        this.f88249e = str3;
        this.f88250f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bz0.class != obj.getClass()) {
            return false;
        }
        bz0 bz0Var = (bz0) obj;
        return ib3.a(this.f88247c, bz0Var.f88247c) && ib3.a(this.f88248d, bz0Var.f88248d) && ib3.a(this.f88249e, bz0Var.f88249e) && Arrays.equals(this.f88250f, bz0Var.f88250f);
    }

    public final int hashCode() {
        String str = this.f88247c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f88248d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f88249e;
        return Arrays.hashCode(this.f88250f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": mimeType=" + this.f88247c + ", filename=" + this.f88248d + ", description=" + this.f88249e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f88247c);
        parcel.writeString(this.f88248d);
        parcel.writeString(this.f88249e);
        parcel.writeByteArray(this.f88250f);
    }
}
