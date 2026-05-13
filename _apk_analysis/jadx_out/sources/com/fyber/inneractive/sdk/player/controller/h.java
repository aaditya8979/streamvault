package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f17171a;

    public h(i iVar) {
        this.f17171a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f17171a.f17172a.f17185d;
        if (xVar != null) {
            z zVar = xVar.f17204a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}
