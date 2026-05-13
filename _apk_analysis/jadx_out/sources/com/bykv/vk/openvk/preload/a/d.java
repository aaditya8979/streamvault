package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Interceptor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f11326d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f11327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IN f11328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OUT f11329c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f11330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f11331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f11332g;

    public abstract Object a(b<OUT> bVar, IN in2) throws Throwable;

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f11331f = new m(bVar);
        this.f11327a = dVar;
        this.f11328b = in2;
        this.f11330e = aVar;
        if (dVar != null) {
            this.f11332g = dVar.f11332g;
        } else {
            long andIncrement = f11326d.getAndIncrement();
            this.f11332g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f11332g;
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f11331f, this, th2);
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f11331f, this);
    }

    public final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f11331f, this, th2);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f11331f, this);
    }

    public final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f11331f, this, th2);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f11330e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f11331f, this);
    }

    public final OUT f() {
        return this.f11329c;
    }
}
