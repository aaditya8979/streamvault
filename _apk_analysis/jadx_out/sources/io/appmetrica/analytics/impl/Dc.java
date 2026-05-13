package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes4.dex */
public final class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ym f65148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ym f65149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4978n4 f65150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f65151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65152e;

    public Dc(C4978n4 c4978n4, Ym ym2, Ym ym3, String str, PublicLogger publicLogger) {
        this.f65150c = c4978n4;
        this.f65148a = ym2;
        this.f65149b = ym3;
        this.f65152e = str;
        this.f65151d = publicLogger;
    }

    public Dc(String str, PublicLogger publicLogger) {
        this(new C4978n4(30), new Ym(50, str.concat("map key"), publicLogger), new Ym(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }
}
