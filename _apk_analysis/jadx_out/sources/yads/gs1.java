package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class gs1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90102c;

    @NotNull
    public static final es1 Companion = new es1();

    @NotNull
    public static final Parcelable.Creator<gs1> CREATOR = new fs1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f90100d = {null, new wo.f(ur1.f95767a)};

    public /* synthetic */ gs1(int i10, long j10, List list) {
        this.f90101b = (i10 & 1) == 0 ? 30000L : j10;
        if ((i10 & 2) == 0) {
            this.f90102c = cn.w.m();
        } else {
            this.f90102c = list;
        }
    }

    public gs1(long j10, ArrayList arrayList) {
        this.f90101b = j10;
        this.f90102c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        return this.f90101b == gs1Var.f90101b && tn.p.f(this.f90102c, gs1Var.f90102c);
    }

    public final int hashCode() {
        return this.f90102c.hashCode() + (Long.hashCode(this.f90101b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.f90101b + ", mediationPrefetchAdUnits=" + this.f90102c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f90101b);
        List list = this.f90102c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((xr1) it.next()).writeToParcel(parcel, i10);
        }
    }
}
