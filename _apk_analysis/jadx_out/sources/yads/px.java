package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class px extends v21 {
    public static final Parcelable.Creator<px> CREATOR = new ox();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f93822e;

    public px(Parcel parcel) {
        super("COMM");
        this.f93820c = (String) ib3.a((Object) parcel.readString());
        this.f93821d = (String) ib3.a((Object) parcel.readString());
        this.f93822e = (String) ib3.a((Object) parcel.readString());
    }

    public px(String str, String str2, String str3) {
        super("COMM");
        this.f93820c = str;
        this.f93821d = str2;
        this.f93822e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || px.class != obj.getClass()) {
            return false;
        }
        px pxVar = (px) obj;
        return ib3.a(this.f93821d, pxVar.f93821d) && ib3.a(this.f93820c, pxVar.f93820c) && ib3.a(this.f93822e, pxVar.f93822e);
    }

    public final int hashCode() {
        String str = this.f93820c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f93821d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f93822e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": language=" + this.f93820c + ", description=" + this.f93821d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f95910b);
        parcel.writeString(this.f93820c);
        parcel.writeString(this.f93822e);
    }
}
