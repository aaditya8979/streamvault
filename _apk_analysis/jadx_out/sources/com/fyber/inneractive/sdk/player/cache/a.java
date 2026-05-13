package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f17097a;

    public a(g gVar) {
        this.f17097a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f17097a) {
            g gVar = this.f17097a;
            if (gVar.f17118i == null) {
                return null;
            }
            gVar.d();
            g gVar2 = this.f17097a;
            int i10 = gVar2.f17120k;
            if (i10 >= 2000 && i10 >= gVar2.f17119j.size()) {
                this.f17097a.c();
                this.f17097a.f17120k = 0;
            }
            return null;
        }
    }
}
