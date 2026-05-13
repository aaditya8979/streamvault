package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class wm0 implements ss1 {
    public static final Parcelable.Creator<wm0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mx0 f96444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mx0 f96445i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f96448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f96449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f96450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96451g;

    static {
        lx0 lx0Var = new lx0();
        lx0Var.f92148k = "application/id3";
        f96444h = new mx0(lx0Var);
        lx0 lx0Var2 = new lx0();
        lx0Var2.f92148k = "application/x-scte35";
        f96445i = new mx0(lx0Var2);
        CREATOR = new vm0();
    }

    public wm0(Parcel parcel) {
        this.f96446b = (String) ib3.a((Object) parcel.readString());
        this.f96447c = (String) ib3.a((Object) parcel.readString());
        this.f96448d = parcel.readLong();
        this.f96449e = parcel.readLong();
        this.f96450f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public wm0(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f96446b = str;
        this.f96447c = str2;
        this.f96448d = j10;
        this.f96449e = j11;
        this.f96450f = bArr;
    }

    @Override // yads.ss1
    public final mx0 a() {
        String str = this.f96446b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f96445i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f96444h;
            default:
                return null;
        }
    }

    @Override // yads.ss1
    public final byte[] b() {
        if (a() != null) {
            return this.f96450f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wm0.class != obj.getClass()) {
            return false;
        }
        wm0 wm0Var = (wm0) obj;
        return this.f96448d == wm0Var.f96448d && this.f96449e == wm0Var.f96449e && ib3.a(this.f96446b, wm0Var.f96446b) && ib3.a(this.f96447c, wm0Var.f96447c) && Arrays.equals(this.f96450f, wm0Var.f96450f);
    }

    public final int hashCode() {
        if (this.f96451g == 0) {
            String str = this.f96446b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f96447c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f96448d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f96449e;
            this.f96451g = Arrays.hashCode(this.f96450f) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f96451g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f96446b + ", id=" + this.f96449e + ", durationMs=" + this.f96448d + ", value=" + this.f96447c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f96446b);
        parcel.writeString(this.f96447c);
        parcel.writeLong(this.f96448d);
        parcel.writeLong(this.f96449e);
        parcel.writeByteArray(this.f96450f);
    }
}
