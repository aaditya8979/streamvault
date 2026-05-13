package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public class xm3 implements ss1 {
    public static final Parcelable.Creator<xm3> CREATOR = new vm3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96822c;

    public xm3(Parcel parcel) {
        this.f96821b = (String) ib3.a((Object) parcel.readString());
        this.f96822c = (String) ib3.a((Object) parcel.readString());
    }

    public xm3(String str, String str2) {
        this.f96821b = str;
        this.f96822c = str2;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f96821b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                im1Var.f90881c = this.f96822c;
                break;
            case "TITLE":
                im1Var.f90879a = this.f96822c;
                break;
            case "DESCRIPTION":
                im1Var.f90885g = this.f96822c;
                break;
            case "ALBUMARTIST":
                im1Var.f90882d = this.f96822c;
                break;
            case "ARTIST":
                im1Var.f90880b = this.f96822c;
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xm3 xm3Var = (xm3) obj;
        return this.f96821b.equals(xm3Var.f96821b) && this.f96822c.equals(xm3Var.f96822c);
    }

    public final int hashCode() {
        return this.f96822c.hashCode() + k4.a(this.f96821b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f96821b + "=" + this.f96822c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f96821b);
        parcel.writeString(this.f96822c);
    }
}
