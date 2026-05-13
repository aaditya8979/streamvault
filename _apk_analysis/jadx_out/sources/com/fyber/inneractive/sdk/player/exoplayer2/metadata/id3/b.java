package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18416e;

    public b(Parcel parcel) {
        super("APIC");
        this.f18413b = parcel.readString();
        this.f18414c = parcel.readString();
        this.f18415d = parcel.readInt();
        this.f18416e = parcel.createByteArray();
    }

    public b(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f18413b = str;
        this.f18414c = str2;
        this.f18415d = i10;
        this.f18416e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18415d == bVar.f18415d && z.a(this.f18413b, bVar.f18413b) && z.a(this.f18414c, bVar.f18414c) && Arrays.equals(this.f18416e, bVar.f18416e);
    }

    public final int hashCode() {
        int i10 = (this.f18415d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f18413b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18414c;
        return Arrays.hashCode(this.f18416e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18413b);
        parcel.writeString(this.f18414c);
        parcel.writeInt(this.f18415d);
        parcel.writeByteArray(this.f18416e);
    }
}
