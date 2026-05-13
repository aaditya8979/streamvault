package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18417b;

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f18417b = parcel.createByteArray();
    }

    public d(String str, byte[] bArr) {
        super(str);
        this.f18417b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18441a.equals(dVar.f18441a) && Arrays.equals(this.f18417b, dVar.f18417b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18417b) + ((this.f18441a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18441a);
        parcel.writeByteArray(this.f18417b);
    }
}
