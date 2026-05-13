package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class kk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new hk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0[] f91616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91619e;

    public kk0(Parcel parcel) {
        this.f91618d = parcel.readString();
        jk0[] jk0VarArr = (jk0[]) ib3.a((jk0[]) parcel.createTypedArray(jk0.CREATOR));
        this.f91616b = jk0VarArr;
        this.f91619e = jk0VarArr.length;
    }

    public kk0(String str, boolean z10, jk0... jk0VarArr) {
        this.f91618d = str;
        jk0VarArr = z10 ? (jk0[]) jk0VarArr.clone() : jk0VarArr;
        this.f91616b = jk0VarArr;
        this.f91619e = jk0VarArr.length;
        Arrays.sort(jk0VarArr, this);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) obj;
        jk0 jk0Var2 = (jk0) obj2;
        UUID uuid = jr.f91330a;
        return uuid.equals(jk0Var.f91258c) ? uuid.equals(jk0Var2.f91258c) ? 0 : 1 : jk0Var.f91258c.compareTo(jk0Var2.f91258c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk0.class != obj.getClass()) {
            return false;
        }
        kk0 kk0Var = (kk0) obj;
        return ib3.a(this.f91618d, kk0Var.f91618d) && Arrays.equals(this.f91616b, kk0Var.f91616b);
    }

    public final int hashCode() {
        if (this.f91617c == 0) {
            String str = this.f91618d;
            this.f91617c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f91616b);
        }
        return this.f91617c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f91618d);
        parcel.writeTypedArray(this.f91616b, 0);
    }
}
