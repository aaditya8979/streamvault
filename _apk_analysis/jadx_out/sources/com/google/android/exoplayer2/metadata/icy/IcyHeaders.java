package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import s7.m0;
import s7.q;

/* JADX INFO: loaded from: classes11.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f21903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f21904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f21905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21907g;

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
        s7.a.a(i11 == -1 || i11 > 0);
        this.f21902b = i10;
        this.f21903c = str;
        this.f21904d = str2;
        this.f21905e = str3;
        this.f21906f = z10;
        this.f21907g = i11;
    }

    public IcyHeaders(Parcel parcel) {
        this.f21902b = parcel.readInt();
        this.f21903c = parcel.readString();
        this.f21904d = parcel.readString();
        this.f21905e = parcel.readString();
        this.f21906f = m0.D0(parcel);
        this.f21907g = parcel.readInt();
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
                    q.i("IcyHeaders", "Invalid bitrate: " + str4);
                    i11 = -1;
                } catch (NumberFormatException unused2) {
                    q.i("IcyHeaders", "Invalid bitrate header: " + str4);
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
                        q.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        q.i("IcyHeaders", "Invalid metadata interval: " + str5);
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void a(q.b bVar) {
        String str = this.f21904d;
        if (str != null) {
            bVar.g0(str);
        }
        String str2 = this.f21903c;
        if (str2 != null) {
            bVar.X(str2);
        }
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
        return this.f21902b == icyHeaders.f21902b && m0.c(this.f21903c, icyHeaders.f21903c) && m0.c(this.f21904d, icyHeaders.f21904d) && m0.c(this.f21905e, icyHeaders.f21905e) && this.f21906f == icyHeaders.f21906f && this.f21907g == icyHeaders.f21907g;
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21902b) * 31;
        String str = this.f21903c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21904d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21905e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f21906f ? 1 : 0)) * 31) + this.f21907g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f21904d + "\", genre=\"" + this.f21903c + "\", bitrate=" + this.f21902b + ", metadataInterval=" + this.f21907g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21902b);
        parcel.writeString(this.f21903c);
        parcel.writeString(this.f21904d);
        parcel.writeString(this.f21905e);
        m0.R0(parcel, this.f21906f);
        parcel.writeInt(this.f21907g);
    }
}
