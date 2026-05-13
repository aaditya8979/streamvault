package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class yx2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<yx2> CREATOR = new xx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97323b;

    public yx2(String str) {
        this.f97323b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx2) && tn.p.f(this.f97323b, ((yx2) obj).f97323b);
    }

    public final int hashCode() {
        return this.f97323b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.f97323b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f97323b);
    }
}
