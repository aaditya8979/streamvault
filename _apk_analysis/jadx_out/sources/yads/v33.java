package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v33 implements Comparable, Parcelable {
    public static final Parcelable.Creator<v33> CREATOR = new u33();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95916d;

    public v33(int i10, int i11, int i12) {
        this.f95914b = i10;
        this.f95915c = i11;
        this.f95916d = i12;
    }

    public v33(Parcel parcel) {
        this.f95914b = parcel.readInt();
        this.f95915c = parcel.readInt();
        this.f95916d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v33 v33Var = (v33) obj;
        int i10 = this.f95914b - v33Var.f95914b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f95915c - v33Var.f95915c;
        return i11 == 0 ? this.f95916d - v33Var.f95916d : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v33.class != obj.getClass()) {
            return false;
        }
        v33 v33Var = (v33) obj;
        return this.f95914b == v33Var.f95914b && this.f95915c == v33Var.f95915c && this.f95916d == v33Var.f95916d;
    }

    public final int hashCode() {
        return (((this.f95914b * 31) + this.f95915c) * 31) + this.f95916d;
    }

    public final String toString() {
        return this.f95914b + "." + this.f95915c + "." + this.f95916d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f95914b);
        parcel.writeInt(this.f95915c);
        parcel.writeInt(this.f95916d);
    }
}
