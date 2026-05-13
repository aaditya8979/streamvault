package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: compiled from: NamedRunnable.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40305a;

    public b(String str, Object... objArr) {
        this.f40305a = c.a(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f40305a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
