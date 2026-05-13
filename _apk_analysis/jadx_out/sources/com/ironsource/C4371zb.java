package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4371zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f34516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34517b;

    /* JADX INFO: renamed from: com.ironsource.zb$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f34518a;

        private a() {
        }

        public Handler a() {
            return this.f34518a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f34518a = new Handler();
            Looper.loop();
        }
    }

    public C4371zb() {
        a aVar = new a();
        this.f34516a = aVar;
        aVar.start();
        this.f34517b = new Date().getTime();
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f34516a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public boolean a(Object obj) {
        return (obj == null || this.f34516a == null) ? false : true;
    }
}
