package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class dr0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<dr0> CREATOR = new cr0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88960c;

    public dr0(String str, long j10) {
        this.f88959b = str;
        this.f88960c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return tn.p.f(this.f88959b, dr0Var.f88959b) && this.f88960c == dr0Var.f88960c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88960c) + (this.f88959b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.f88959b + ", interval=" + this.f88960c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f88959b);
        parcel.writeLong(this.f88960c);
    }
}
