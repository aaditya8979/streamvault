package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18861e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f18857a = i10;
        this.f18858b = i11;
        this.f18859c = i12;
        this.f18860d = bArr;
    }

    public c(Parcel parcel) {
        this.f18857a = parcel.readInt();
        this.f18858b = parcel.readInt();
        this.f18859c = parcel.readInt();
        this.f18860d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f18857a == cVar.f18857a && this.f18858b == cVar.f18858b && this.f18859c == cVar.f18859c && Arrays.equals(this.f18860d, cVar.f18860d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18861e == 0) {
            this.f18861e = Arrays.hashCode(this.f18860d) + ((((((this.f18857a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f18858b) * 31) + this.f18859c) * 31);
        }
        return this.f18861e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f18857a);
        sb2.append(", ");
        sb2.append(this.f18858b);
        sb2.append(", ");
        sb2.append(this.f18859c);
        sb2.append(", ");
        sb2.append(this.f18860d != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18857a);
        parcel.writeInt(this.f18858b);
        parcel.writeInt(this.f18859c);
        parcel.writeInt(this.f18860d != null ? 1 : 0);
        byte[] bArr = this.f18860d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
