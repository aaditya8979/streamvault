package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4009f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f31645a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f31646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f31648d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4009f.this.b();
        }
    }

    public AbstractC4009f() {
    }

    public AbstractC4009f(long j10) {
        this.f31647c = j10;
    }

    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f31648d = t10;
        c();
        synchronized (this.f31645a) {
            Timer timer = new Timer();
            this.f31646b = timer;
            timer.schedule(new a(), this.f31647c);
        }
    }

    public boolean a() {
        return this.f31647c <= 0;
    }

    public abstract void b();

    public void c() {
        synchronized (this.f31645a) {
            Timer timer = this.f31646b;
            if (timer != null) {
                timer.cancel();
                this.f31646b = null;
            }
        }
    }

    public void d() {
        this.f31648d = null;
    }
}
