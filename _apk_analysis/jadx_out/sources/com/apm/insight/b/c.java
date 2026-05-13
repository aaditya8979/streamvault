package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: ANRThread.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f7069b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f7070a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7071c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f7072d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f7071c) {
                    return;
                }
                c.this.f7070a.d();
                long unused = c.f7069b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f7072d, 500L);
                } else {
                    m.a().a(c.this.f7072d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f7069b);
            }
        };
        this.f7072d = runnable;
        this.f7070a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f7069b <= 15000;
    }

    public final void a() {
        if (this.f7071c) {
            return;
        }
        m.a().a(this.f7072d, 5000L);
    }

    public final void b() {
        this.f7071c = true;
    }
}
