package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class Jd implements InterfaceC3878y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nm f25721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f25724d;

    public Jd(Nm nm2) {
        tn.p.k(nm2, "videoMRC50Model");
        this.f25721a = nm2;
        this.f25722b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final void a() {
    }

    @Override // com.inmobi.media.InterfaceC3878y8
    public final go.d b() {
        return go.f.j(new Id(this, null));
    }
}
