package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f17179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17180b;

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f17180b = qVar;
        this.f17179a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        try {
            try {
                Iterator it = this.f17180b.f17183b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f17179a);
                }
                bVar = this.f17179a;
            } catch (Exception e10) {
                if (IAlog.f19500a <= 3) {
                    q qVar2 = this.f17180b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e10, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f17179a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f17180b.f17191j);
                qVar = this.f17180b;
                qVar.f17191j = null;
            }
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f17180b.f17191j);
                qVar = this.f17180b;
                qVar.f17191j = null;
                qVar.f17192k = null;
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f17179a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f17180b.f17191j);
                q qVar3 = this.f17180b;
                qVar3.f17191j = null;
                qVar3.f17192k = null;
            }
            throw th2;
        }
    }
}
