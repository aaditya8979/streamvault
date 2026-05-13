package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
@so.k
public final class cs1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f88594d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f88596c;

    @NotNull
    public static final as1 Companion = new as1();

    @NotNull
    public static final Parcelable.Creator<cs1> CREATOR = new bs1();

    static {
        w2 w2Var = w2.f86635a;
        f88594d = new KSerializer[]{null, new wo.a1(w2Var, to.a.t(w2Var))};
    }

    public /* synthetic */ cs1(int i10, String str, Map map) {
        if (3 != (i10 & 3)) {
            wo.c2.a(i10, 3, zr1.f97757a.getDescriptor());
        }
        this.f88595b = str;
        this.f88596c = map;
    }

    public cs1(String str, LinkedHashMap linkedHashMap) {
        this.f88595b = str;
        this.f88596c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return tn.p.f(this.f88595b, cs1Var.f88595b) && tn.p.f(this.f88596c, cs1Var.f88596c);
    }

    public final int hashCode() {
        return this.f88596c.hashCode() + (this.f88595b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f88595b + ", networkData=" + this.f88596c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f88595b);
        Map map = this.f88596c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
