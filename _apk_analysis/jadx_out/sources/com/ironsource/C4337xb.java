package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4337xb {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34381g = "xb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f34382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f34383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vf f34384c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f34386e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f34385d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4145ma f34387f = new a();

    /* JADX INFO: renamed from: com.ironsource.xb$a */
    public class a implements InterfaceC4145ma {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4145ma
        public void a() {
            C4337xb.this.f34384c.c(System.currentTimeMillis());
            C4337xb.this.c();
        }

        @Override // com.ironsource.InterfaceC4145ma
        public void b() {
            C4337xb.this.f34384c.b(System.currentTimeMillis());
            C4337xb c4337xb = C4337xb.this;
            c4337xb.b(c4337xb.f34384c.a());
        }

        @Override // com.ironsource.InterfaceC4145ma
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4145ma
        public void d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xb$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4337xb c4337xb = C4337xb.this;
            c4337xb.f34382a.b(c4337xb.f34387f);
            C4337xb.this.f34384c.b();
            C4337xb.this.f34383b.run();
        }
    }

    public C4337xb(Runnable runnable, com.ironsource.lifecycle.b bVar, Vf vf2) {
        this.f34383b = runnable;
        this.f34382a = bVar;
        this.f34384c = vf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f34385d) {
            c();
            Timer timer = new Timer();
            this.f34386e = timer;
            timer.schedule(new b(), j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f34385d) {
            Timer timer = this.f34386e;
            if (timer != null) {
                timer.cancel();
                this.f34386e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f34381g, "cannot start timer with delay < 0");
            return;
        }
        this.f34382a.a(this.f34387f);
        this.f34384c.a(j10);
        if (this.f34382a.e()) {
            this.f34384c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    public void b() {
        c();
        this.f34382a.b(this.f34387f);
        this.f34384c.b();
    }
}
