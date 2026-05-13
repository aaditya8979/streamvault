package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f18427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o[] f18428f;

    public h(Parcel parcel) {
        super("CTOC");
        this.f18424b = parcel.readString();
        this.f18425c = parcel.readByte() != 0;
        this.f18426d = parcel.readByte() != 0;
        this.f18427e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f18428f = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18428f[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }

    public h(String str, boolean z10, boolean z11, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f18424b = str;
        this.f18425c = z10;
        this.f18426d = z11;
        this.f18427e = strArr;
        this.f18428f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18425c == hVar.f18425c && this.f18426d == hVar.f18426d && z.a(this.f18424b, hVar.f18424b) && Arrays.equals(this.f18427e, hVar.f18427e) && Arrays.equals(this.f18428f, hVar.f18428f);
    }

    public final int hashCode() {
        int i10 = ((((this.f18425c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f18426d ? 1 : 0)) * 31;
        String str = this.f18424b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18424b);
        parcel.writeByte(this.f18425c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18426d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f18427e);
        parcel.writeInt(this.f18428f.length);
        int i11 = 0;
        while (true) {
            o[] oVarArr = this.f18428f;
            if (i11 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i11], 0);
            i11++;
        }
    }
}
