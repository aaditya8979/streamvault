package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: BaseTask.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f7281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7282b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7283c;

    public a(Handler handler, long j10) {
        this.f7281a = handler;
        this.f7283c = j10;
    }

    public final void a() {
        this.f7281a.post(this);
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f7281a.postDelayed(this, j10);
        } else {
            this.f7281a.post(this);
        }
    }

    public final long b() {
        return this.f7283c;
    }
}
