package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f40692h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f40695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f40696d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40693a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40694b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f40697e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f40698f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Deque<x> f40699g = new ArrayDeque();

    public m() {
    }

    public m(ExecutorService executorService) {
        this.f40696d = executorService;
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f40695c;
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f40692h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<x.b> it = this.f40697e.iterator();
            while (it.hasNext()) {
                x.b next = it.next();
                if (this.f40698f.size() >= this.f40693a) {
                    break;
                }
                if (c(next) < this.f40694b) {
                    it.remove();
                    arrayList.add(next);
                    this.f40698f.add(next);
                }
            }
            z10 = c() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f40698f) {
            if (!bVar2.c().f40803f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        if (this.f40696d == null) {
            this.f40696d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
        }
        return this.f40696d;
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f40693a = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.f40697e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.f40699g.add(xVar);
    }

    public void b(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f40694b = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    public void b(x.b bVar) {
        a(this.f40698f, bVar);
    }

    public void b(x xVar) {
        a(this.f40699g, xVar);
    }

    public synchronized int c() {
        return this.f40698f.size() + this.f40699g.size();
    }
}
