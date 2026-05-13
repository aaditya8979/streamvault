package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: loaded from: classes9.dex */
public final class Wh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f66134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66135b;

    public Wh(C4839hi c4839hi, ModuleEvent moduleEvent) {
        this.f66135b = c4839hi;
        this.f66134a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66135b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportEvent(this.f66134a);
    }
}
