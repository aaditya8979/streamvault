package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f16296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f16297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16298c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f16299d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f16297b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f16296a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f16296a;
            if (handler != null) {
                handler.removeCallbacks(this.f16299d);
            }
            this.f16296a.getLooper().quitSafely();
            this.f16296a = null;
        }
    }
}
