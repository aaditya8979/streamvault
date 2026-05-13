package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17176b;

    public k(f fVar, boolean z10) {
        this.f17176b = fVar;
        this.f17175a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f17176b;
        if (qVar.f17188g) {
            return;
        }
        try {
            Iterator it = qVar.f17183b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.f17175a);
            }
        } catch (Exception e10) {
            if (IAlog.f19500a <= 3) {
                q qVar2 = this.f17176b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
