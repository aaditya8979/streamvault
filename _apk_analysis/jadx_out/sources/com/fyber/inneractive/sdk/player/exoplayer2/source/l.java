package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IOException f18515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f18516b;

    public l(p pVar, IOException iOException) {
        this.f18516b = pVar;
        this.f18515a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f18516b.f18536e;
        IOException iOException = this.f18515a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.f17145a.get()) != null) {
            iOException.getCause();
        }
    }
}
