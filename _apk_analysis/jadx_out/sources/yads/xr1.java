package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class xr1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96860c;

    @NotNull
    public static final vr1 Companion = new vr1();

    @NotNull
    public static final Parcelable.Creator<xr1> CREATOR = new wr1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f96858d = {null, new wo.f(zr1.f97757a)};

    public /* synthetic */ xr1(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, ur1.f95767a.getDescriptor());
        }
        this.f96859b = str;
        this.f96860c = list;
    }

    public xr1(String str, ArrayList arrayList) {
        this.f96859b = str;
        this.f96860c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr1)) {
            return false;
        }
        xr1 xr1Var = (xr1) obj;
        return tn.p.f(this.f96859b, xr1Var.f96859b) && tn.p.f(this.f96860c, xr1Var.f96860c);
    }

    public final int hashCode() {
        return this.f96860c.hashCode() + (this.f96859b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f96859b + ", networks=" + this.f96860c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f96859b);
        List list = this.f96860c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cs1) it.next()).writeToParcel(parcel, i10);
        }
    }
}
