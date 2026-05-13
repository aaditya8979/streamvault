package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3279ac implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb f26768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26769b;

    public C3279ac(Zb zb2) {
        tn.p.k(zb2, "mediaChangeReceiver");
        this.f26768a = zb2;
        this.f26769b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        if (this.f26769b.getAndSet(false)) {
            this.f26768a.a();
        }
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        if (this.f26769b.getAndSet(true)) {
            return;
        }
        this.f26768a.b();
    }
}
