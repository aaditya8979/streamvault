package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class zc1 extends v21 {
    public static final Parcelable.Creator<zc1> CREATOR = new yc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97522e;

    public zc1(Parcel parcel) {
        super("----");
        this.f97520c = (String) ib3.a((Object) parcel.readString());
        this.f97521d = (String) ib3.a((Object) parcel.readString());
        this.f97522e = (String) ib3.a((Object) parcel.readString());
    }

    public zc1(String str, String str2, String str3) {
        super("----");
        this.f97520c = str;
        this.f97521d = str2;
        this.f97522e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zc1.class != obj.getClass()) {
            return false;
        }
        zc1 zc1Var = (zc1) obj;
        return ib3.a(this.f97521d, zc1Var.f97521d) && ib3.a(this.f97520c, zc1Var.f97520c) && ib3.a(this.f97522e, zc1Var.f97522e);
    }

    public final int hashCode() {
        String str = this.f97520c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f97521d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f97522e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": domain=" + this.f97520c + ", description=" + this.f97521d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f95910b);
        parcel.writeString(this.f97520c);
        parcel.writeString(this.f97522e);
    }
}
