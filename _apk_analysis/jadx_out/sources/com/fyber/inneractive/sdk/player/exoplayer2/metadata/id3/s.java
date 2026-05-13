package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18445c;

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f18444b = parcel.readString();
        this.f18445c = parcel.readString();
    }

    public s(String str, String str2, String str3) {
        super(str);
        this.f18444b = str2;
        this.f18445c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18441a.equals(sVar.f18441a) && z.a(this.f18444b, sVar.f18444b) && z.a(this.f18445c, sVar.f18445c);
    }

    public final int hashCode() {
        int iHashCode = (this.f18441a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f18444b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18445c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18441a);
        parcel.writeString(this.f18444b);
        parcel.writeString(this.f18445c);
    }
}
