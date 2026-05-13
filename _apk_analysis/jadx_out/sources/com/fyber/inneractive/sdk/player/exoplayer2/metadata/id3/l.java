package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18435e;

    public l(Parcel parcel) {
        super("GEOB");
        this.f18432b = parcel.readString();
        this.f18433c = parcel.readString();
        this.f18434d = parcel.readString();
        this.f18435e = parcel.createByteArray();
    }

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f18432b = str;
        this.f18433c = str2;
        this.f18434d = str3;
        this.f18435e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return z.a(this.f18432b, lVar.f18432b) && z.a(this.f18433c, lVar.f18433c) && z.a(this.f18434d, lVar.f18434d) && Arrays.equals(this.f18435e, lVar.f18435e);
    }

    public final int hashCode() {
        String str = this.f18432b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f18433c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18434d;
        return Arrays.hashCode(this.f18435e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18432b);
        parcel.writeString(this.f18433c);
        parcel.writeString(this.f18434d);
        parcel.writeByteArray(this.f18435e);
    }
}
