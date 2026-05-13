package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f25914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25917d;

    public M(RectF rectF, ArrayList arrayList, int i10, int i11) {
        tn.p.k(rectF, "visibleRect");
        tn.p.k(arrayList, "obstructions");
        this.f25914a = rectF;
        this.f25915b = arrayList;
        this.f25916c = i10;
        this.f25917d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return tn.p.f(this.f25914a, m10.f25914a) && tn.p.f(this.f25915b, m10.f25915b) && this.f25916c == m10.f25916c && this.f25917d == m10.f25917d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25917d) + AbstractC3414fi.a(this.f25916c, (this.f25915b.hashCode() + (this.f25914a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f25914a + ", obstructions=" + this.f25915b + ", screenWidth=" + this.f25916c + ", screenHeight=" + this.f25917d + ")";
    }
}
