package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0 f30185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gb f30186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4337xb f30187c = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f30188d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q0.this.f30186b.b();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Q0.this.f30186b.b();
        }
    }

    public Q0(O0 o02, @NotNull Gb gb2) {
        this.f30185a = o02;
        this.f30186b = gb2;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f30188d = timer;
        timer.schedule(new b(), j10);
    }

    private C4337xb c() {
        return new C4337xb(new a(), com.ironsource.lifecycle.b.d(), new Vf());
    }

    private synchronized void j() {
        Timer timer = this.f30188d;
        if (timer != null) {
            timer.cancel();
            this.f30188d = null;
        }
    }

    public void a() {
        if (this.f30185a.a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void a(long j10) {
        C4337xb c4337xb = this.f30187c;
        if (c4337xb != null) {
            c4337xb.a(j10);
        }
    }

    public O0 b() {
        return this.f30185a;
    }

    public boolean d() {
        return this.f30185a.c() > 0;
    }

    public void e() {
        if (this.f30185a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f30185a.c());
        }
    }

    public void f() {
        if (this.f30185a.a() == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f30185a.d());
        }
    }

    public void g() {
        if (this.f30185a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f30185a.a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f30185a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f30185a.d());
    }

    public void i() {
        C4337xb c4337xb = this.f30187c;
        if (c4337xb != null) {
            c4337xb.b();
        }
    }

    public void k() {
        if (this.f30185a.a() != O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f30185a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f30185a.b());
    }
}
