package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3516jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f27423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fi f27424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3541kk f27425c;

    public C3516jk(Yj yj2, List list) {
        tn.p.k(yj2, "telemetryConfigMetaData");
        tn.p.k(list, "samplingEvents");
        this.f27423a = yj2;
        double dRandom = Math.random();
        this.f27424b = new Fi(yj2, dRandom, list);
        this.f27425c = new C3541kk(yj2, dRandom);
    }
}
