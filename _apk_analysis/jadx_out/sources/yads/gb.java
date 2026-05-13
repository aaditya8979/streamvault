package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class gb implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<gb> CREATOR = new fb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f89899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f89900d;

    public gb(String str, String str2, ArrayList arrayList) {
        this.f89898b = str;
        this.f89899c = arrayList;
        this.f89900d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return tn.p.f(this.f89898b, gbVar.f89898b) && tn.p.f(this.f89899c, gbVar.f89899c) && tn.p.f(this.f89900d, gbVar.f89900d);
    }

    public final int hashCode() {
        return this.f89900d.hashCode() + eb.a(this.f89899c, this.f89898b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.f89898b + ", mediationNetworks=" + this.f89899c + ", rawData=" + this.f89900d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f89898b);
        List list = this.f89899c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qq1) it.next()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f89900d);
    }
}
