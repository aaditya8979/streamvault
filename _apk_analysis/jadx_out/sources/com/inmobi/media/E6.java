package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f25367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25368c;

    public E6(float f10, F6 f62, ArrayList arrayList) {
        this.f25366a = f10;
        this.f25367b = f62;
        this.f25368c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e62 = (E6) obj;
        return Float.compare(this.f25366a, e62.f25366a) == 0 && tn.p.f(this.f25367b, e62.f25367b) && tn.p.f(this.f25368c, e62.f25368c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f25366a) * 31;
        F6 f62 = this.f25367b;
        int iHashCode2 = (iHashCode + (f62 == null ? 0 : f62.hashCode())) * 31;
        ArrayList arrayList = this.f25368c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f25366a + ", visibleRectangle=" + this.f25367b + ", occlusionRectangles=" + this.f25368c + ")";
    }
}
