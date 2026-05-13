package com.inmobi.media;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes9.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f25827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f25829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f25830d;

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f25827a = rectF;
        this.f25828b = rectF2;
        this.f25829c = rectF3;
        this.f25830d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return tn.p.f(this.f25827a, l10.f25827a) && tn.p.f(this.f25828b, l10.f25828b) && tn.p.f(this.f25829c, l10.f25829c) && tn.p.f(this.f25830d, l10.f25830d);
    }

    public final int hashCode() {
        RectF rectF = this.f25827a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f25828b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f25829c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f25830d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f25827a + ", topRight=" + this.f25828b + ", bottomLeft=" + this.f25829c + ", bottomRight=" + this.f25830d + ")";
    }
}
