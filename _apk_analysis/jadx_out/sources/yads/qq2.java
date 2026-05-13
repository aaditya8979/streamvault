package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class qq2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qq2> CREATOR = new oq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rv f94119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yx2 f94120d;

    public qq2(boolean z10, rv rvVar, yx2 yx2Var) {
        this.f94118b = z10;
        this.f94119c = rvVar;
        this.f94120d = yx2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq2)) {
            return false;
        }
        qq2 qq2Var = (qq2) obj;
        return this.f94118b == qq2Var.f94118b && tn.p.f(this.f94119c, qq2Var.f94119c) && tn.p.f(this.f94120d, qq2Var.f94120d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f94118b) * 31;
        rv rvVar = this.f94119c;
        int iHashCode2 = (iHashCode + (rvVar == null ? 0 : rvVar.hashCode())) * 31;
        yx2 yx2Var = this.f94120d;
        return iHashCode2 + (yx2Var != null ? yx2Var.f97323b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f94118b + ", clientSideReward=" + this.f94119c + ", serverSideReward=" + this.f94120d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f94118b ? 1 : 0);
        rv rvVar = this.f94119c;
        if (rvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(rvVar.f94618b);
            parcel.writeString(rvVar.f94619c);
        }
        yx2 yx2Var = this.f94120d;
        if (yx2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(yx2Var.f97323b);
        }
    }
}
