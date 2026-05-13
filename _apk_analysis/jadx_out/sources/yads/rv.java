package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class rv implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<rv> CREATOR = new qv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94619c;

    public rv(int i10, String str) {
        this.f94618b = i10;
        this.f94619c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.f94618b == rvVar.f94618b && tn.p.f(this.f94619c, rvVar.f94619c);
    }

    public final int hashCode() {
        return this.f94619c.hashCode() + (Integer.hashCode(this.f94618b) * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f94618b + ", rewardType=" + this.f94619c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f94618b);
        parcel.writeString(this.f94619c);
    }
}
