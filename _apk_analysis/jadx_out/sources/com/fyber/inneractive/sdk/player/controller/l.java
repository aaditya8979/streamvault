package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17178b;

    public l(q qVar, int i10) {
        this.f17178b = qVar;
        this.f17177a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f17178b.f17184c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f17177a);
            }
        } catch (Exception e10) {
            if (IAlog.f19500a <= 3) {
                q qVar = this.f17178b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
