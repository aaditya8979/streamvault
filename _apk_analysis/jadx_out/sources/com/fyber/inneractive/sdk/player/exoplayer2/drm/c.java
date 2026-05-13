package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f17385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17388e;

    public c(Parcel parcel) {
        this.f17385b = new UUID(parcel.readLong(), parcel.readLong());
        this.f17386c = parcel.readString();
        this.f17387d = parcel.createByteArray();
        this.f17388e = parcel.readByte() != 0;
    }

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f17385b = uuid;
        this.f17386c = str;
        bArr.getClass();
        this.f17387d = bArr;
        this.f17388e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f17386c.equals(cVar.f17386c) && z.a(this.f17385b, cVar.f17385b) && Arrays.equals(this.f17387d, cVar.f17387d);
    }

    public final int hashCode() {
        if (this.f17384a == 0) {
            this.f17384a = Arrays.hashCode(this.f17387d) + ((this.f17386c.hashCode() + (this.f17385b.hashCode() * 31)) * 31);
        }
        return this.f17384a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f17385b.getMostSignificantBits());
        parcel.writeLong(this.f17385b.getLeastSignificantBits());
        parcel.writeString(this.f17386c);
        parcel.writeByteArray(this.f17387d);
        parcel.writeByte(this.f17388e ? (byte) 1 : (byte) 0);
    }
}
