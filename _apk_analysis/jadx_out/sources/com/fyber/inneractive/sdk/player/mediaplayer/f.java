package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f18943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f18944b;

    public f(p pVar, Surface surface) {
        this.f18944b = pVar;
        this.f18943a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f18944b, this.f18943a);
    }
}
