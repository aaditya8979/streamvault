package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18945a;

    public g(p pVar) {
        this.f18945a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f18945a);
        Handler handler = this.f18945a.f18967o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f18945a.f18967o = null;
        }
        this.f18945a.f18966n = null;
        Looper.myLooper().quit();
    }
}
