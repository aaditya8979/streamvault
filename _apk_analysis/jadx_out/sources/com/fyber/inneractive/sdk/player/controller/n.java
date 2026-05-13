package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f17181a;

    public n(q qVar) {
        this.f17181a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f17181a.f17183b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e10) {
            if (IAlog.f19500a <= 3) {
                q qVar = this.f17181a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
