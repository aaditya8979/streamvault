package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kt1 extends v21 {
    public static final Parcelable.Creator<kt1> CREATOR = new jt1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f91744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f91745g;

    public kt1(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f91741c = i10;
        this.f91742d = i11;
        this.f91743e = i12;
        this.f91744f = iArr;
        this.f91745g = iArr2;
    }

    public kt1(Parcel parcel) {
        super("MLLT");
        this.f91741c = parcel.readInt();
        this.f91742d = parcel.readInt();
        this.f91743e = parcel.readInt();
        this.f91744f = (int[]) ib3.a(parcel.createIntArray());
        this.f91745g = (int[]) ib3.a(parcel.createIntArray());
    }

    @Override // yads.v21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kt1.class != obj.getClass()) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.f91741c == kt1Var.f91741c && this.f91742d == kt1Var.f91742d && this.f91743e == kt1Var.f91743e && Arrays.equals(this.f91744f, kt1Var.f91744f) && Arrays.equals(this.f91745g, kt1Var.f91745g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f91745g) + ((Arrays.hashCode(this.f91744f) + ((((((this.f91741c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f91742d) * 31) + this.f91743e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f91741c);
        parcel.writeInt(this.f91742d);
        parcel.writeInt(this.f91743e);
        parcel.writeIntArray(this.f91744f);
        parcel.writeIntArray(this.f91745g);
    }
}
