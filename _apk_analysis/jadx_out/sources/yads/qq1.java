package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class qq1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qq1> CREATOR = new nq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f94112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f94113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f94114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f94115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j5 f94116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f94117h;

    public qq1(String str, Map map, List list, List list2, List list3, j5 j5Var, Map map2) {
        this.f94111b = str;
        this.f94112c = map;
        this.f94113d = list;
        this.f94114e = list2;
        this.f94115f = list3;
        this.f94116g = j5Var;
        this.f94117h = map2;
    }

    public final Map d() {
        return this.f94112c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        qq1 qq1Var = (qq1) obj;
        return tn.p.f(this.f94111b, qq1Var.f94111b) && tn.p.f(this.f94112c, qq1Var.f94112c) && tn.p.f(this.f94113d, qq1Var.f94113d) && tn.p.f(this.f94114e, qq1Var.f94114e) && tn.p.f(this.f94115f, qq1Var.f94115f) && tn.p.f(this.f94116g, qq1Var.f94116g) && tn.p.f(this.f94117h, qq1Var.f94117h);
    }

    public final int hashCode() {
        int iHashCode = (this.f94112c.hashCode() + (this.f94111b.hashCode() * 31)) * 31;
        List list = this.f94113d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f94114e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f94115f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j5 j5Var = this.f94116g;
        int iHashCode5 = (iHashCode4 + (j5Var == null ? 0 : j5Var.f91096b.hashCode())) * 31;
        Map map = this.f94117h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.f94111b + ", networkData=" + this.f94112c + ", impressionTrackingUrls=" + this.f94113d + ", clickTrackingUrls=" + this.f94114e + ", adResponseTrackingUrls=" + this.f94115f + ", adImpressionData=" + this.f94116g + ", biddingInfo=" + this.f94117h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f94111b);
        Map map = this.f94112c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f94113d);
        parcel.writeStringList(this.f94114e);
        parcel.writeStringList(this.f94115f);
        j5 j5Var = this.f94116g;
        if (j5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j5Var.f91096b);
        }
        Map map2 = this.f94117h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
