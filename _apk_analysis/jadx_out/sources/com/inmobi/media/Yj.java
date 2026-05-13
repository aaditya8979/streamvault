package com.inmobi.media;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f26659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f26660g;

    public Yj(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List list, double d10) {
        tn.p.k(list, "priorityEventsList");
        this.f26654a = z10;
        this.f26655b = z11;
        this.f26656c = z12;
        this.f26657d = z13;
        this.f26658e = z14;
        this.f26659f = list;
        this.f26660g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yj)) {
            return false;
        }
        Yj yj2 = (Yj) obj;
        return this.f26654a == yj2.f26654a && this.f26655b == yj2.f26655b && this.f26656c == yj2.f26656c && this.f26657d == yj2.f26657d && this.f26658e == yj2.f26658e && tn.p.f(this.f26659f, yj2.f26659f) && Double.compare(this.f26660g, yj2.f26660g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f26660g) + ((this.f26659f.hashCode() + ((Boolean.hashCode(this.f26658e) + ((Boolean.hashCode(this.f26657d) + ((Boolean.hashCode(this.f26656c) + ((Boolean.hashCode(this.f26655b) + (Boolean.hashCode(this.f26654a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f26654a + ", isImageEnabled=" + this.f26655b + ", isGIFEnabled=" + this.f26656c + ", isVideoEnabled=" + this.f26657d + ", isGeneralEventsDisabled=" + this.f26658e + ", priorityEventsList=" + this.f26659f + ", samplingFactor=" + this.f26660g + ")";
    }
}
