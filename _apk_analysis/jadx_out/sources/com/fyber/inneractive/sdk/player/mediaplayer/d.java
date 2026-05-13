package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f18939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f18940b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f18940b = pVar;
        this.f18939a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f18940b.f18961i;
        if (nVar != null) {
            ((q) nVar).a(this.f18939a);
        }
    }
}
