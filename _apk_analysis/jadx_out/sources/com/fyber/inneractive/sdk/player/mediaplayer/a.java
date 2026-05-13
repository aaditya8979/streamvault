package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f18936c;

    public a(p pVar, int i10, int i11) {
        this.f18936c = pVar;
        this.f18934a = i10;
        this.f18935b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18936c.f18961i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f18934a + ", " + this.f18935b;
            n nVar = this.f18936c.f18961i;
            o oVar = new o(str);
            q qVar = (q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(qVar), oVar);
            qVar.f17190i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}
