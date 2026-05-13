package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4290uf extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4290uf f34217b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34218a;

    /* JADX INFO: renamed from: com.ironsource.uf$a */
    public class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f34219a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.f34219a;
        }

        public void b() {
            this.f34219a = new Handler(getLooper());
        }
    }

    private C4290uf() {
        a aVar = new a(getClass().getSimpleName());
        this.f34218a = aVar;
        aVar.start();
        this.f34218a.b();
    }

    public static synchronized C4290uf a() {
        if (f34217b == null) {
            f34217b = new C4290uf();
        }
        return f34217b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f34218a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
