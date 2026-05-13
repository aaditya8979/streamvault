package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class jk0 implements Parcelable {
    public static final Parcelable.Creator<jk0> CREATOR = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f91258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f91260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f91261f;

    public jk0(Parcel parcel) {
        this.f91258c = new UUID(parcel.readLong(), parcel.readLong());
        this.f91259d = parcel.readString();
        this.f91260e = (String) ib3.a((Object) parcel.readString());
        this.f91261f = parcel.createByteArray();
    }

    public jk0(UUID uuid, String str, String str2, byte[] bArr) {
        this.f91258c = (UUID) ni.a(uuid);
        this.f91259d = str;
        this.f91260e = (String) ni.a((Object) str2);
        this.f91261f = bArr;
    }

    public final boolean a(UUID uuid) {
        return jr.f91330a.equals(this.f91258c) || uuid.equals(this.f91258c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        jk0 jk0Var = (jk0) obj;
        return ib3.a(this.f91259d, jk0Var.f91259d) && ib3.a(this.f91260e, jk0Var.f91260e) && ib3.a(this.f91258c, jk0Var.f91258c) && Arrays.equals(this.f91261f, jk0Var.f91261f);
    }

    public final int hashCode() {
        if (this.f91257b == 0) {
            int iHashCode = this.f91258c.hashCode() * 31;
            String str = this.f91259d;
            this.f91257b = Arrays.hashCode(this.f91261f) + k4.a(this.f91260e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f91257b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f91258c.getMostSignificantBits());
        parcel.writeLong(this.f91258c.getLeastSignificantBits());
        parcel.writeString(this.f91259d);
        parcel.writeString(this.f91260e);
        parcel.writeByteArray(this.f91261f);
    }
}
