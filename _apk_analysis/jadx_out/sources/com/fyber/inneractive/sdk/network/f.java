package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f16967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16968e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f16964a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f16965b = new JSONArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16969f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16970g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f16966c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f16970g) {
            this.f16970g = true;
            this.f16966c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f16966c.getLooper(), this);
            this.f16967d = d1Var;
            this.f16969f = true;
            this.f16968e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f16967d.removeMessages(12312329);
            }
            long j10 = this.f16968e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f16967d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j10));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
