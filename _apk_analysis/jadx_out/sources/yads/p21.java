package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class p21 implements ss1 {
    public static final Parcelable.Creator<p21> CREATOR = new o21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f93390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f93391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93392g;

    public p21(int i10, String str, String str2, String str3, boolean z10, int i11) {
        ni.a(i11 == -1 || i11 > 0);
        this.f93387b = i10;
        this.f93388c = str;
        this.f93389d = str2;
        this.f93390e = str3;
        this.f93391f = z10;
        this.f93392g = i11;
    }

    public p21(Parcel parcel) {
        this.f93387b = parcel.readInt();
        this.f93388c = parcel.readString();
        this.f93389d = parcel.readString();
        this.f93390e = parcel.readString();
        this.f93391f = ib3.a(parcel);
        this.f93392g = parcel.readInt();
    }

    public static p21 a(Map map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        int i13;
        List list = (List) map.get("icy-br");
        int i14 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i13 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i13 = -1;
            }
            if (i13 > 0) {
                z10 = true;
                i10 = i13;
            } else {
                try {
                    ih1.d("IcyHeaders", "Invalid bitrate: " + str4);
                    i10 = -1;
                    z10 = false;
                } catch (NumberFormatException unused2) {
                    pk1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                    z10 = false;
                    i10 = i13;
                }
            }
        } else {
            i10 = -1;
            z10 = false;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                i12 = Integer.parseInt(str5);
            } catch (NumberFormatException unused3) {
            }
            if (i12 > 0) {
                i11 = i12;
            } else {
                try {
                    ih1.d("IcyHeaders", "Invalid metadata interval: " + str5);
                } catch (NumberFormatException unused4) {
                    i14 = i12;
                    pk1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                }
                z11 = z10;
                i11 = i14;
            }
        } else {
            z11 = z10;
            i11 = i14;
        }
        if (z11) {
            return new p21(i10, str, str2, str3, zEquals, i11);
        }
        return null;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f93389d;
        if (str != null) {
            im1Var.D = str;
        }
        String str2 = this.f93388c;
        if (str2 != null) {
            im1Var.B = str2;
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
        if (obj == null || p21.class != obj.getClass()) {
            return false;
        }
        p21 p21Var = (p21) obj;
        return this.f93387b == p21Var.f93387b && ib3.a(this.f93388c, p21Var.f93388c) && ib3.a(this.f93389d, p21Var.f93389d) && ib3.a(this.f93390e, p21Var.f93390e) && this.f93391f == p21Var.f93391f && this.f93392g == p21Var.f93392g;
    }

    public final int hashCode() {
        int i10 = (this.f93387b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f93388c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f93389d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f93390e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f93391f ? 1 : 0)) * 31) + this.f93392g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f93389d + "\", genre=\"" + this.f93388c + "\", bitrate=" + this.f93387b + ", metadataInterval=" + this.f93392g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f93387b);
        parcel.writeString(this.f93388c);
        parcel.writeString(this.f93389d);
        parcel.writeString(this.f93390e);
        boolean z10 = this.f93391f;
        int i11 = ib3.f90737a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f93392g);
    }
}
