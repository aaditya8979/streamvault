package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class Ya implements Parcelable {

    @NotNull
    public static final Xa CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Za f26627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26632f;

    public Ya(Za za2, String str, int i10, long j10) {
        tn.p.k(za2, "landingPageTelemetryMetaData");
        tn.p.k(str, "urlType");
        this.f26627a = za2;
        this.f26628b = str;
        this.f26629c = i10;
        this.f26630d = j10;
        this.f26631e = -1;
    }

    public static Ya a(Ya ya2) {
        Za za2 = ya2.f26627a;
        String str = ya2.f26628b;
        int i10 = ya2.f26629c;
        long j10 = ya2.f26630d;
        tn.p.k(za2, "landingPageTelemetryMetaData");
        tn.p.k(str, "urlType");
        return new Ya(za2, str, i10, j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya2 = (Ya) obj;
        return tn.p.f(this.f26627a, ya2.f26627a) && tn.p.f(this.f26628b, ya2.f26628b) && this.f26629c == ya2.f26629c && this.f26630d == ya2.f26630d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26630d) + AbstractC3414fi.a(this.f26629c, (this.f26628b.hashCode() + (this.f26627a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f26627a + ", urlType=" + this.f26628b + ", counter=" + this.f26629c + ", startTime=" + this.f26630d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        tn.p.k(parcel, "parcel");
        parcel.writeLong(this.f26627a.f26696a);
        parcel.writeString(this.f26627a.f26697b);
        parcel.writeString(this.f26627a.f26698c);
        parcel.writeString(this.f26627a.f26699d);
        parcel.writeString(this.f26627a.f26700e);
        parcel.writeString(this.f26627a.f26701f);
        parcel.writeString(this.f26627a.f26702g);
        parcel.writeByte(this.f26627a.f26703h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f26627a.f26704i);
        parcel.writeString(this.f26628b);
        parcel.writeInt(this.f26629c);
        parcel.writeLong(this.f26630d);
        parcel.writeInt(this.f26631e);
        parcel.writeString(this.f26632f);
    }
}
