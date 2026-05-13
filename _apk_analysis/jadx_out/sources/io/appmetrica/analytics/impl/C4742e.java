package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4742e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f66632g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66633h = "WatchDog-" + Ad.f64974a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f66634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f66635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f66636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4717d f66637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f66638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f66639f;

    public C4742e(Eb eb2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f66634a = copyOnWriteArrayList;
        this.f66635b = new AtomicInteger();
        this.f66636c = new Handler(Looper.getMainLooper());
        this.f66638e = new AtomicBoolean();
        this.f66639f = new Runnable() { // from class: mh.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74261b.a();
            }
        };
        copyOnWriteArrayList.add(eb2);
    }

    public final /* synthetic */ void a() {
        this.f66638e.set(true);
    }

    public final synchronized void a(int i10) {
        AtomicInteger atomicInteger = this.f66635b;
        Integer numValueOf = Integer.valueOf(i10);
        int iIntValue = 5;
        if (numValueOf != null && numValueOf.intValue() >= 5) {
            iIntValue = numValueOf.intValue();
        }
        atomicInteger.set(iIntValue);
        if (this.f66637d == null) {
            C4717d c4717d = new C4717d(this);
            this.f66637d = c4717d;
            try {
                c4717d.setName(f66633h);
            } catch (SecurityException unused) {
            }
            this.f66637d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i10));
        }
    }

    public final synchronized void b() {
        C4717d c4717d = this.f66637d;
        if (c4717d != null) {
            c4717d.f66560a.set(false);
            this.f66637d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }
}
