package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f17173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17174b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f17174b = qVar;
        this.f17173a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f17174b;
        if (qVar.f17188g) {
            return;
        }
        try {
            Iterator it = qVar.f17183b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f17173a);
            }
        } catch (Exception e10) {
            if (IAlog.f19500a <= 3) {
                q qVar2 = this.f17174b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
