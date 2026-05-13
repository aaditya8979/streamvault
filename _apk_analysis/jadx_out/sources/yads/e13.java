package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import yads.e13;
import yads.hy;

/* JADX INFO: loaded from: classes2.dex */
public final class e13 implements Parcelable {
    public static final Parcelable.Creator<e13> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89066d;

    static {
        new Comparator() { // from class: bt.c1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                e13 e13Var = (e13) obj;
                e13 e13Var2 = (e13) obj2;
                return hy.f90591a.a(e13Var.f89064b, e13Var2.f89064b).a(e13Var.f89065c, e13Var2.f89065c).a(e13Var.f89066d, e13Var2.f89066d).a();
            }
        };
        CREATOR = new d13();
    }

    public e13(int i10, long j10, long j11) {
        ni.a(j10 < j11);
        this.f89064b = j10;
        this.f89065c = j11;
        this.f89066d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e13.class != obj.getClass()) {
            return false;
        }
        e13 e13Var = (e13) obj;
        return this.f89064b == e13Var.f89064b && this.f89065c == e13Var.f89065c && this.f89066d == e13Var.f89066d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f89064b), Long.valueOf(this.f89065c), Integer.valueOf(this.f89066d)});
    }

    public final String toString() {
        long j10 = this.f89064b;
        long j11 = this.f89065c;
        int i10 = this.f89066d;
        int i11 = ib3.f90737a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j10 + ", endTimeMs=" + j11 + ", speedDivisor=" + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f89064b);
        parcel.writeLong(this.f89065c);
        parcel.writeInt(this.f89066d);
    }
}
