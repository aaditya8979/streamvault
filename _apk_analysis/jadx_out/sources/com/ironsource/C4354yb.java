package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4354yb implements InterfaceC4145ma {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f34446b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f34450f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34445a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34447c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f34448d = null;

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4354yb.this.f34450f.run();
        }
    }

    public C4354yb(long j10, Runnable runnable, boolean z10) {
        this.f34449e = j10;
        this.f34450f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f34446b;
        if (timer != null) {
            timer.cancel();
            this.f34446b = null;
        }
    }

    private synchronized void h() {
        if (this.f34446b == null) {
            Timer timer = new Timer();
            this.f34446b = timer;
            timer.schedule(new a(), this.f34449e);
            Calendar.getInstance().setTimeInMillis(this.f34448d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void a() {
        if (this.f34446b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void b() {
        Long l10;
        if (this.f34446b == null && (l10 = this.f34448d) != null) {
            long jLongValue = l10.longValue() - System.currentTimeMillis();
            this.f34449e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f34450f.run();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4145ma
    public void d() {
    }

    public void e() {
        f();
        this.f34447c = false;
        this.f34448d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f34447c) {
            return;
        }
        this.f34447c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f34448d = Long.valueOf(System.currentTimeMillis() + this.f34449e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }
}
