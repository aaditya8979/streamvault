package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o[] f18423g;

    public f(Parcel parcel) {
        super("CHAP");
        this.f18418b = parcel.readString();
        this.f18419c = parcel.readInt();
        this.f18420d = parcel.readInt();
        this.f18421e = parcel.readLong();
        this.f18422f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f18423g = new o[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18423g[i11] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }

    public f(String str, int i10, int i11, long j10, long j11, o[] oVarArr) {
        super("CHAP");
        this.f18418b = str;
        this.f18419c = i10;
        this.f18420d = i11;
        this.f18421e = j10;
        this.f18422f = j11;
        this.f18423g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18419c == fVar.f18419c && this.f18420d == fVar.f18420d && this.f18421e == fVar.f18421e && this.f18422f == fVar.f18422f && z.a(this.f18418b, fVar.f18418b) && Arrays.equals(this.f18423g, fVar.f18423g);
    }

    public final int hashCode() {
        int i10 = (((((((this.f18419c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f18420d) * 31) + ((int) this.f18421e)) * 31) + ((int) this.f18422f)) * 31;
        String str = this.f18418b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18418b);
        parcel.writeInt(this.f18419c);
        parcel.writeInt(this.f18420d);
        parcel.writeLong(this.f18421e);
        parcel.writeLong(this.f18422f);
        parcel.writeInt(this.f18423g.length);
        for (o oVar : this.f18423g) {
            parcel.writeParcelable(oVar, 0);
        }
    }
}
