package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5024p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f67476k = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f67478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f67480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f67481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f67482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G1 f67483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H1 f67484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC4974n0 f67485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC4999o0 f67486j;

    public C5024p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C4696c4.l().e(), new H1());
    }

    public C5024p0(Context context, ICommonExecutor iCommonExecutor, G1 g12, H1 h12) {
        this.f67480d = null;
        this.f67482f = new Object();
        this.f67485i = new RunnableC4974n0(this);
        this.f67486j = new ServiceConnectionC4999o0(this);
        this.f67477a = context.getApplicationContext();
        this.f67478b = iCommonExecutor;
        this.f67479c = false;
        this.f67483g = g12;
        this.f67484h = h12;
    }

    public final void a(Long l10) {
        try {
            synchronized (this) {
                CountDownLatch countDownLatch = this.f67481e;
                if (countDownLatch == null) {
                    return;
                }
                countDownLatch.await(l10.longValue(), TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final synchronized boolean a() {
        return this.f67480d != null;
    }

    public final void b() {
        synchronized (this.f67482f) {
            this.f67478b.remove(this.f67485i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f67478b;
        synchronized (this.f67482f) {
            iCommonExecutor.remove(this.f67485i);
            if (!this.f67479c) {
                iCommonExecutor.executeDelayed(this.f67485i, f67476k);
            }
        }
    }
}
