package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: MBCountDownTimer.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f41521a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f41523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f41524d;

    /* JADX INFO: compiled from: MBCountDownTimer.java */
    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f41525a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f41525a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f41525a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f41525a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f41522b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f41523c = aVar;
        return this;
    }

    public void a() {
        a aVar = this.f41524d;
        if (aVar != null) {
            aVar.cancel();
            this.f41524d = null;
        }
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f41521a = j10;
        this.f41523c = aVar;
        b();
        a aVar2 = this.f41524d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public b b(long j10) {
        this.f41521a = j10;
        return this;
    }

    public void b() {
        a aVar = this.f41524d;
        if (aVar != null) {
            aVar.cancel();
            this.f41524d = null;
        }
        if (this.f41522b <= 0) {
            this.f41522b = this.f41521a + 1000;
        }
        a aVar2 = new a(this.f41521a, this.f41522b);
        this.f41524d = aVar2;
        aVar2.a(this.f41523c);
    }

    public void c() {
        if (this.f41524d == null) {
            b();
        }
        this.f41524d.start();
    }
}
