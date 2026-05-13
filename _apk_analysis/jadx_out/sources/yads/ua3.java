package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class ua3 extends v21 {
    public static final Parcelable.Creator<ua3> CREATOR = new ta3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95587d;

    public ua3(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f95586c = parcel.readString();
        this.f95587d = (String) ib3.a((Object) parcel.readString());
    }

    public ua3(String str, String str2, String str3) {
        super(str);
        this.f95586c = str2;
        this.f95587d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ua3.class != obj.getClass()) {
            return false;
        }
        ua3 ua3Var = (ua3) obj;
        return this.f95910b.equals(ua3Var.f95910b) && ib3.a(this.f95586c, ua3Var.f95586c) && ib3.a(this.f95587d, ua3Var.f95587d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f95910b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f95586c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95587d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": url=" + this.f95587d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f95910b);
        parcel.writeString(this.f95586c);
        parcel.writeString(this.f95587d);
    }
}
