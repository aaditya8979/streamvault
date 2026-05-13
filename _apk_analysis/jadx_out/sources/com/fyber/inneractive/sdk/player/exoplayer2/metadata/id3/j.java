package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18431d;

    public j(Parcel parcel) {
        super("COMM");
        this.f18429b = parcel.readString();
        this.f18430c = parcel.readString();
        this.f18431d = parcel.readString();
    }

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f18429b = str;
        this.f18430c = str2;
        this.f18431d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return z.a(this.f18430c, jVar.f18430c) && z.a(this.f18429b, jVar.f18429b) && z.a(this.f18431d, jVar.f18431d);
    }

    public final int hashCode() {
        String str = this.f18429b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f18430c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18431d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18441a);
        parcel.writeString(this.f18429b);
        parcel.writeString(this.f18431d);
    }
}
