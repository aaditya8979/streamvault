package com.google.android.exoplayer.metadata.icy;

import a6.k0;
import a6.m;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f20249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f20250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20252g;

    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, int i11) {
        a6.a.a(i11 == -1 || i11 > 0);
        this.f20247b = i10;
        this.f20248c = str;
        this.f20249d = str2;
        this.f20250e = str3;
        this.f20251f = z10;
        this.f20252g = i11;
    }

    public IcyHeaders(Parcel parcel) {
        this.f20247b = parcel.readInt();
        this.f20248c = parcel.readString();
        this.f20249d = parcel.readString();
        this.f20250e = parcel.readString();
        this.f20251f = k0.u0(parcel);
        this.f20252g = parcel.readInt();
    }

    @Nullable
    public static IcyHeaders b(Map<String, List<String>> map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        int i12 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i11 = -1;
            }
            if (i11 > 0) {
                z10 = true;
                i10 = i11;
            } else {
                try {
                    m.h("IcyHeaders", "Invalid bitrate: " + str4);
                    i11 = -1;
                } catch (NumberFormatException unused2) {
                    m.h("IcyHeaders", "Invalid bitrate header: " + str4);
                }
                z10 = false;
                i10 = i11;
            }
        } else {
            i10 = -1;
            z10 = false;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        m.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        m.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z10) {
            return new IcyHeaders(i10, str, str2, str3, zEquals, i12);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f20247b == icyHeaders.f20247b && k0.c(this.f20248c, icyHeaders.f20248c) && k0.c(this.f20249d, icyHeaders.f20249d) && k0.c(this.f20250e, icyHeaders.f20250e) && this.f20251f == icyHeaders.f20251f && this.f20252g == icyHeaders.f20252g;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20247b) * 31;
        String str = this.f20248c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20249d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20250e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f20251f ? 1 : 0)) * 31) + this.f20252g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f20249d + "\", genre=\"" + this.f20248c + "\", bitrate=" + this.f20247b + ", metadataInterval=" + this.f20252g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20247b);
        parcel.writeString(this.f20248c);
        parcel.writeString(this.f20249d);
        parcel.writeString(this.f20250e);
        k0.O0(parcel, this.f20251f);
        parcel.writeInt(this.f20252g);
    }
}
