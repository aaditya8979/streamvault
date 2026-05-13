package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C3988de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4193p2 f31486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4006ee f31487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f31488c = null;

    /* JADX INFO: renamed from: com.ironsource.de$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3988de.this.f31487b.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.de$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3988de.this.f31487b.b();
        }
    }

    public C3988de(C4193p2 c4193p2, InterfaceC4006ee interfaceC4006ee) {
        this.f31486a = c4193p2;
        this.f31487b = interfaceC4006ee;
    }

    private void d() {
        Timer timer = this.f31488c;
        if (timer != null) {
            timer.cancel();
            this.f31488c = null;
        }
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f31488c = timer;
        timer.schedule(new b(), this.f31486a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f31487b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f31488c = timer;
        timer.schedule(new a(), this.f31486a.j());
    }
}
