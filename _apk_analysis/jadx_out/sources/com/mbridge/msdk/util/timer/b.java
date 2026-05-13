package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f41171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f41173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41174d = 0;

    /* JADX INFO: compiled from: MBCountDownTimer.java */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f41175a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f41175a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f41175a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f41175a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f41172b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f41171a = aVar;
        return this;
    }

    public void a() {
        a aVar = this.f41173c;
        if (aVar != null) {
            aVar.cancel();
            this.f41173c = null;
        }
    }

    public b b(long j10) {
        this.f41174d = j10;
        return this;
    }

    public void b() {
        a aVar = this.f41173c;
        if (aVar != null) {
            aVar.cancel();
            this.f41173c = null;
        }
        if (this.f41172b <= 0) {
            this.f41172b = this.f41174d + 1000;
        }
        a aVar2 = new a(this.f41174d, this.f41172b);
        this.f41173c = aVar2;
        aVar2.a(this.f41171a);
    }

    public void c() {
        if (this.f41173c == null) {
            b();
        }
        this.f41173c.start();
    }
}
