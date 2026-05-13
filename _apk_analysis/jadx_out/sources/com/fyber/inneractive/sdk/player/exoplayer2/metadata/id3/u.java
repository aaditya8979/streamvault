package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18447c;

    public u(Parcel parcel) {
        super(parcel.readString());
        this.f18446b = parcel.readString();
        this.f18447c = parcel.readString();
    }

    public u(String str, String str2, String str3) {
        super(str);
        this.f18446b = str2;
        this.f18447c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f18441a.equals(uVar.f18441a) && z.a(this.f18446b, uVar.f18446b) && z.a(this.f18447c, uVar.f18447c);
    }

    public final int hashCode() {
        int iHashCode = (this.f18441a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f18446b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18447c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18441a);
        parcel.writeString(this.f18446b);
        parcel.writeString(this.f18447c);
    }
}
