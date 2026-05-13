package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.p;
import s7.m0;

/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f21575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f21583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f21584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f21585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21587s;

    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f21588a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f21589b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f21590c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f21591d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f21592e = m0.w0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f21593f = m0.w0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f21594g = 0.999f;

        public g a() {
            return new g(this.f21588a, this.f21589b, this.f21590c, this.f21591d, this.f21592e, this.f21593f, this.f21594g);
        }
    }

    public g(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f21569a = f10;
        this.f21570b = f11;
        this.f21571c = j10;
        this.f21572d = f12;
        this.f21573e = j11;
        this.f21574f = j12;
        this.f21575g = f13;
        this.f21576h = -9223372036854775807L;
        this.f21577i = -9223372036854775807L;
        this.f21579k = -9223372036854775807L;
        this.f21580l = -9223372036854775807L;
        this.f21583o = f10;
        this.f21582n = f11;
        this.f21584p = 1.0f;
        this.f21585q = -9223372036854775807L;
        this.f21578j = -9223372036854775807L;
        this.f21581m = -9223372036854775807L;
        this.f21586r = -9223372036854775807L;
        this.f21587s = -9223372036854775807L;
    }

    public static long d(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    @Override // com.google.android.exoplayer2.o
    public void a(p.g gVar) {
        this.f21576h = m0.w0(gVar.f22086b);
        this.f21579k = m0.w0(gVar.f22087c);
        this.f21580l = m0.w0(gVar.f22088d);
        float f10 = gVar.f22089e;
        if (f10 == -3.4028235E38f) {
            f10 = this.f21569a;
        }
        this.f21583o = f10;
        float f11 = gVar.f22090f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f21570b;
        }
        this.f21582n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f21576h = -9223372036854775807L;
        }
        c();
    }

    public final void b(long j10) {
        long j11 = this.f21586r + (this.f21587s * 3);
        if (this.f21581m > j11) {
            float fW0 = m0.w0(this.f21571c);
            this.f21581m = b8.f.c(j11, this.f21578j, this.f21581m - (((long) ((this.f21584p - 1.0f) * fW0)) + ((long) ((this.f21582n - 1.0f) * fW0))));
            return;
        }
        long jQ = m0.q(j10 - ((long) (Math.max(0.0f, this.f21584p - 1.0f) / this.f21572d)), this.f21581m, j11);
        this.f21581m = jQ;
        long j12 = this.f21580l;
        if (j12 == -9223372036854775807L || jQ <= j12) {
            return;
        }
        this.f21581m = j12;
    }

    public final void c() {
        long j10 = this.f21576h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f21577i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f21579k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f21580l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f21578j == j10) {
            return;
        }
        this.f21578j = j10;
        this.f21581m = j10;
        this.f21586r = -9223372036854775807L;
        this.f21587s = -9223372036854775807L;
        this.f21585q = -9223372036854775807L;
    }

    public final void e(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f21586r;
        if (j13 == -9223372036854775807L) {
            this.f21586r = j12;
            this.f21587s = 0L;
        } else {
            long jMax = Math.max(j12, d(j13, j12, this.f21575g));
            this.f21586r = jMax;
            this.f21587s = d(this.f21587s, Math.abs(j12 - jMax), this.f21575g);
        }
    }

    @Override // com.google.android.exoplayer2.o
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.f21576h == -9223372036854775807L) {
            return 1.0f;
        }
        e(j10, j11);
        if (this.f21585q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f21585q < this.f21571c) {
            return this.f21584p;
        }
        this.f21585q = SystemClock.elapsedRealtime();
        b(j10);
        long j12 = j10 - this.f21581m;
        if (Math.abs(j12) < this.f21573e) {
            this.f21584p = 1.0f;
        } else {
            this.f21584p = m0.o((this.f21572d * j12) + 1.0f, this.f21583o, this.f21582n);
        }
        return this.f21584p;
    }

    @Override // com.google.android.exoplayer2.o
    public long getTargetLiveOffsetUs() {
        return this.f21581m;
    }

    @Override // com.google.android.exoplayer2.o
    public void notifyRebuffer() {
        long j10 = this.f21581m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f21574f;
        this.f21581m = j11;
        long j12 = this.f21580l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f21581m = j12;
        }
        this.f21585q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.o
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.f21577i = j10;
        c();
    }
}
