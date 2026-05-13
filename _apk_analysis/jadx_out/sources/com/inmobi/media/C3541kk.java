package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3541kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f27490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f27491b;

    public C3541kk(Yj yj2, double d10) {
        tn.p.k(yj2, "telemetryConfigMetaData");
        this.f27490a = yj2;
        this.f27491b = d10;
    }

    public final int a(String str) {
        tn.p.k(str, "eventType");
        if (this.f27491b >= this.f27490a.f26660g) {
            return 0;
        }
        Wj wj2 = Wj.f26549a;
        return 2;
    }
}
