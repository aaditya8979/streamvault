package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class j5 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91096b;

    @NotNull
    public static final h5 Companion = new h5();

    @NotNull
    public static final Parcelable.Creator<j5> CREATOR = new i5();

    public j5(String str) {
        this.f91096b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && tn.p.f(this.f91096b, ((j5) obj).f91096b);
    }

    public final int hashCode() {
        return this.f91096b.hashCode();
    }

    public final String toString() {
        return "AdImpressionData(rawData=" + this.f91096b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f91096b);
    }
}
