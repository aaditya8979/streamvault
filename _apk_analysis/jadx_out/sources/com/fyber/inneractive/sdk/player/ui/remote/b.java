package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f19037a;

    public b(d dVar) {
        this.f19037a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        d dVar = this.f19037a;
        dVar.f19045g = true;
        IAlog.a("%s : UI load timed out", "RemoteUIWebviewController");
        r.f19556b.post(dVar.f19050l);
    }
}
