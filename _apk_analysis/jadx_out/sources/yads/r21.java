package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class r21 implements ss1 {
    public static final Parcelable.Creator<r21> CREATOR = new q21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f94260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94262d;

    public r21(Parcel parcel) {
        this.f94260b = (byte[]) ni.a(parcel.createByteArray());
        this.f94261c = parcel.readString();
        this.f94262d = parcel.readString();
    }

    public r21(byte[] bArr, String str, String str2) {
        this.f94260b = bArr;
        this.f94261c = str;
        this.f94262d = str2;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f94261c;
        if (str != null) {
            im1Var.f90879a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r21.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f94260b, ((r21) obj).f94260b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f94260b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f94261c + "\", url=\"" + this.f94262d + "\", rawMetadata.length=\"" + this.f94260b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f94260b);
        parcel.writeString(this.f94261c);
        parcel.writeString(this.f94262d);
    }
}
