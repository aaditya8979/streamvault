package com.caverock.androidsvg;

import com.ironsource.Z7;

/* JADX INFO: loaded from: classes12.dex */
public class PreserveAspectRatio {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PreserveAspectRatio f14651c = new PreserveAspectRatio(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PreserveAspectRatio f14652d = new PreserveAspectRatio(Alignment.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PreserveAspectRatio f14653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PreserveAspectRatio f14654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PreserveAspectRatio f14655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PreserveAspectRatio f14656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final PreserveAspectRatio f14657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PreserveAspectRatio f14658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PreserveAspectRatio f14659k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Alignment f14660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scale f14661b;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        f14653e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f14654f = new PreserveAspectRatio(alignment2, scale);
        f14655g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f14656h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f14657i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f14658j = new PreserveAspectRatio(alignment, scale2);
        f14659k = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f14660a = alignment;
        this.f14661b = scale;
    }

    public Alignment a() {
        return this.f14660a;
    }

    public Scale b() {
        return this.f14661b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f14660a == preserveAspectRatio.f14660a && this.f14661b == preserveAspectRatio.f14661b;
    }

    public String toString() {
        return this.f14660a + Z7.f30794r + this.f14661b;
    }
}
