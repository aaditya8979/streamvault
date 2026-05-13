package com.google.android.exoplayer.audio;

import a6.k0;
import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import e4.k;
import g4.l;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public long A;
    public boolean B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f20001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AudioTrack f20002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public l f20005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Method f20011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f20023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f20024y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f20025z;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void onInvalidLatency(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public b(a aVar) {
        this.f20000a = (a) a6.a.e(aVar);
        if (k0.f3574a >= 18) {
            try {
                this.f20011l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f20001b = new long[10];
    }

    public static boolean o(int i10) {
        return k0.f3574a < 23 && (i10 == 5 || i10 == 6);
    }

    public final boolean a() {
        return this.f20007h && ((AudioTrack) a6.a.e(this.f20002c)).getPlayState() == 2 && e() == 0;
    }

    public final long b(long j10) {
        return (j10 * 1000000) / ((long) this.f20006g);
    }

    public int c(long j10) {
        return this.f20004e - ((int) (j10 - (e() * ((long) this.f20003d))));
    }

    public long d(boolean z10) {
        long jF;
        if (((AudioTrack) a6.a.e(this.f20002c)).getPlayState() == 3) {
            m();
        }
        long jNanoTime = System.nanoTime() / 1000;
        l lVar = (l) a6.a.e(this.f20005f);
        boolean zD = lVar.d();
        if (zD) {
            jF = b(lVar.b()) + (jNanoTime - lVar.c());
        } else {
            jF = this.f20020u == 0 ? f() : this.f20009j + jNanoTime;
            if (!z10) {
                jF = Math.max(0L, jF - this.f20012m);
            }
        }
        if (this.B != zD) {
            this.D = this.A;
            this.C = this.f20025z;
        }
        long j10 = jNanoTime - this.D;
        if (j10 < 1000000) {
            long j11 = this.C + j10;
            long j12 = (j10 * 1000) / 1000000;
            jF = ((jF * j12) + ((1000 - j12) * j11)) / 1000;
        }
        this.A = jNanoTime;
        this.f20025z = jF;
        this.B = zD;
        return jF;
    }

    public final long e() {
        AudioTrack audioTrack = (AudioTrack) a6.a.e(this.f20002c);
        if (this.f20021v != -9223372036854775807L) {
            return Math.min(this.f20024y, this.f20023x + ((((SystemClock.elapsedRealtime() * 1000) - this.f20021v) * ((long) this.f20006g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f20007h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f20018s = this.f20016q;
            }
            playbackHeadPosition += this.f20018s;
        }
        if (k0.f3574a <= 29) {
            if (playbackHeadPosition == 0 && this.f20016q > 0 && playState == 3) {
                if (this.f20022w == -9223372036854775807L) {
                    this.f20022w = SystemClock.elapsedRealtime();
                }
                return this.f20016q;
            }
            this.f20022w = -9223372036854775807L;
        }
        if (this.f20016q > playbackHeadPosition) {
            this.f20017r++;
        }
        this.f20016q = playbackHeadPosition;
        return playbackHeadPosition + (this.f20017r << 32);
    }

    public final long f() {
        return b(e());
    }

    public void g(long j10) {
        this.f20023x = e();
        this.f20021v = SystemClock.elapsedRealtime() * 1000;
        this.f20024y = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) a6.a.e(this.f20002c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f20022w != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f20022w >= 200;
    }

    public boolean k(long j10) {
        a aVar;
        int playState = ((AudioTrack) a6.a.e(this.f20002c)).getPlayState();
        if (this.f20007h) {
            if (playState == 2) {
                this.f20013n = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f20013n;
        boolean zH = h(j10);
        this.f20013n = zH;
        if (z10 && !zH && playState != 1 && (aVar = this.f20000a) != null) {
            aVar.onUnderrun(this.f20004e, k.b(this.f20008i));
        }
        return true;
    }

    public final void l(long j10, long j11) {
        l lVar = (l) a6.a.e(this.f20005f);
        if (lVar.e(j10)) {
            long jC = lVar.c();
            long jB = lVar.b();
            if (Math.abs(jC - j10) > 5000000) {
                this.f20000a.onSystemTimeUsMismatch(jB, jC, j10, j11);
                lVar.f();
            } else if (Math.abs(b(jB) - j11) <= 5000000) {
                lVar.a();
            } else {
                this.f20000a.onPositionFramesMismatch(jB, jC, j10, j11);
                lVar.f();
            }
        }
    }

    public final void m() {
        long jF = f();
        if (jF == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f20010k >= 30000) {
            long[] jArr = this.f20001b;
            int i10 = this.f20019t;
            jArr[i10] = jF - jNanoTime;
            this.f20019t = (i10 + 1) % 10;
            int i11 = this.f20020u;
            if (i11 < 10) {
                this.f20020u = i11 + 1;
            }
            this.f20010k = jNanoTime;
            this.f20009j = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f20020u;
                if (i12 >= i13) {
                    break;
                }
                this.f20009j += this.f20001b[i12] / ((long) i13);
                i12++;
            }
        }
        if (this.f20007h) {
            return;
        }
        l(jNanoTime, jF);
        n(jNanoTime);
    }

    public final void n(long j10) {
        Method method;
        if (!this.f20014o || (method = this.f20011l) == null || j10 - this.f20015p < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) k0.i((Integer) method.invoke(a6.a.e(this.f20002c), new Object[0]))).intValue()) * 1000) - this.f20008i;
            this.f20012m = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f20012m = jMax;
            if (jMax > 5000000) {
                this.f20000a.onInvalidLatency(jMax);
                this.f20012m = 0L;
            }
        } catch (Exception unused) {
            this.f20011l = null;
        }
        this.f20015p = j10;
    }

    public boolean p() {
        r();
        if (this.f20021v != -9223372036854775807L) {
            return false;
        }
        ((l) a6.a.e(this.f20005f)).g();
        return true;
    }

    public void q() {
        r();
        this.f20002c = null;
        this.f20005f = null;
    }

    public final void r() {
        this.f20009j = 0L;
        this.f20020u = 0;
        this.f20019t = 0;
        this.f20010k = 0L;
        this.A = 0L;
        this.D = 0L;
    }

    public void s(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f20002c = audioTrack;
        this.f20003d = i11;
        this.f20004e = i12;
        this.f20005f = new l(audioTrack);
        this.f20006g = audioTrack.getSampleRate();
        this.f20007h = o(i10);
        boolean zF0 = k0.f0(i10);
        this.f20014o = zF0;
        this.f20008i = zF0 ? b(i12 / i11) : -9223372036854775807L;
        this.f20016q = 0L;
        this.f20017r = 0L;
        this.f20018s = 0L;
        this.f20013n = false;
        this.f20021v = -9223372036854775807L;
        this.f20022w = -9223372036854775807L;
        this.f20015p = 0L;
        this.f20012m = 0L;
    }

    public void t() {
        ((l) a6.a.e(this.f20005f)).g();
    }
}
