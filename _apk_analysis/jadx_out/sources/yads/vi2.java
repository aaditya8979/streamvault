package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class vi2 extends v21 {
    public static final Parcelable.Creator<vi2> CREATOR = new ui2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f96117d;

    public vi2(Parcel parcel) {
        super("PRIV");
        this.f96116c = (String) ib3.a((Object) parcel.readString());
        this.f96117d = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public vi2(String str, byte[] bArr) {
        super("PRIV");
        this.f96116c = str;
        this.f96117d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vi2.class != obj.getClass()) {
            return false;
        }
        vi2 vi2Var = (vi2) obj;
        return ib3.a(this.f96116c, vi2Var.f96116c) && Arrays.equals(this.f96117d, vi2Var.f96117d);
    }

    public final int hashCode() {
        String str = this.f96116c;
        return Arrays.hashCode(this.f96117d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": owner=" + this.f96116c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f96116c);
        parcel.writeByteArray(this.f96117d);
    }
}
