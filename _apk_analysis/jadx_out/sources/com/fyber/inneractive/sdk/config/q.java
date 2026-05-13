package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f16090a;

    public q(s sVar) {
        this.f16090a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f16090a;
        Iterator it = sVar.f16145c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f16144b);
        }
    }
}
