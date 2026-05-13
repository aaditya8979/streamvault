package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import f6.q;
import java.lang.reflect.Method;
import s7.m0;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f21282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AudioTrack f21283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public q f21286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f21290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Method f21294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f21299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f21301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f21304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f21305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f21306z;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void onInvalidLatency(long j10);

        void onPositionAdvancing(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public c(a aVar) {
        this.f21281a = (a) s7.a.e(aVar);
        if (m0.f79487a >= 18) {
            try {
                this.f21294n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f21282b = new long[10];
    }

    public static boolean o(int i10) {
        return m0.f79487a < 23 && (i10 == 5 || i10 == 6);
    }

    public final boolean a() {
        return this.f21288h && ((AudioTrack) s7.a.e(this.f21283c)).getPlayState() == 2 && e() == 0;
    }

    public final long b(long j10) {
        return (j10 * 1000000) / ((long) this.f21287g);
    }

    public int c(long j10) {
        return this.f21285e - ((int) (j10 - (e() * ((long) this.f21284d))));
    }

    public long d(boolean z10) {
        long jF;
        if (((AudioTrack) s7.a.e(this.f21283c)).getPlayState() == 3) {
            m();
        }
        long jNanoTime = System.nanoTime() / 1000;
        q qVar = (q) s7.a.e(this.f21286f);
        boolean zD = qVar.d();
        if (zD) {
            jF = b(qVar.b()) + m0.U(jNanoTime - qVar.c(), this.f21290j);
        } else {
            jF = this.f21303w == 0 ? f() : this.f21292l + jNanoTime;
            if (!z10) {
                jF = Math.max(0L, jF - this.f21295o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = jNanoTime - this.F;
        if (j10 < 1000000) {
            long jU = this.E + m0.U(j10, this.f21290j);
            long j11 = (j10 * 1000) / 1000000;
            jF = ((jF * j11) + ((1000 - j11) * jU)) / 1000;
        }
        if (!this.f21291k) {
            long j12 = this.B;
            if (jF > j12) {
                this.f21291k = true;
                this.f21281a.onPositionAdvancing(System.currentTimeMillis() - m0.Q0(m0.Z(m0.Q0(jF - j12), this.f21290j)));
            }
        }
        this.C = jNanoTime;
        this.B = jF;
        this.D = zD;
        return jF;
    }

    public final long e() {
        AudioTrack audioTrack = (AudioTrack) s7.a.e(this.f21283c);
        if (this.f21304x != -9223372036854775807L) {
            return Math.min(this.A, this.f21306z + ((((SystemClock.elapsedRealtime() * 1000) - this.f21304x) * ((long) this.f21287g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f21288h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f21301u = this.f21299s;
            }
            playbackHeadPosition += this.f21301u;
        }
        if (m0.f79487a <= 29) {
            if (playbackHeadPosition == 0 && this.f21299s > 0 && playState == 3) {
                if (this.f21305y == -9223372036854775807L) {
                    this.f21305y = SystemClock.elapsedRealtime();
                }
                return this.f21299s;
            }
            this.f21305y = -9223372036854775807L;
        }
        if (this.f21299s > playbackHeadPosition) {
            this.f21300t++;
        }
        this.f21299s = playbackHeadPosition;
        return playbackHeadPosition + (this.f21300t << 32);
    }

    public final long f() {
        return b(e());
    }

    public void g(long j10) {
        this.f21306z = e();
        this.f21304x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) s7.a.e(this.f21283c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f21305y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f21305y >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) s7.a.e(this.f21283c)).getPlayState();
        if (this.f21288h) {
            if (playState == 2) {
                this.f21296p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f21296p;
        boolean zH = h(j10);
        this.f21296p = zH;
        if (z10 && !zH && playState != 1) {
            this.f21281a.onUnderrun(this.f21285e, m0.Q0(this.f21289i));
        }
        return true;
    }

    public final void l(long j10, long j11) {
        q qVar = (q) s7.a.e(this.f21286f);
        if (qVar.e(j10)) {
            long jC = qVar.c();
            long jB = qVar.b();
            if (Math.abs(jC - j10) > 5000000) {
                this.f21281a.onSystemTimeUsMismatch(jB, jC, j10, j11);
                qVar.f();
            } else if (Math.abs(b(jB) - j11) <= 5000000) {
                qVar.a();
            } else {
                this.f21281a.onPositionFramesMismatch(jB, jC, j10, j11);
                qVar.f();
            }
        }
    }

    public final void m() {
        long jF = f();
        if (jF == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f21293m >= 30000) {
            long[] jArr = this.f21282b;
            int i10 = this.f21302v;
            jArr[i10] = jF - jNanoTime;
            this.f21302v = (i10 + 1) % 10;
            int i11 = this.f21303w;
            if (i11 < 10) {
                this.f21303w = i11 + 1;
            }
            this.f21293m = jNanoTime;
            this.f21292l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f21303w;
                if (i12 >= i13) {
                    break;
                }
                this.f21292l += this.f21282b[i12] / ((long) i13);
                i12++;
            }
        }
        if (this.f21288h) {
            return;
        }
        l(jNanoTime, jF);
        n(jNanoTime);
    }

    public final void n(long j10) {
        Method method;
        if (!this.f21297q || (method = this.f21294n) == null || j10 - this.f21298r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) m0.j((Integer) method.invoke(s7.a.e(this.f21283c), new Object[0]))).intValue()) * 1000) - this.f21289i;
            this.f21295o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f21295o = jMax;
            if (jMax > 5000000) {
                this.f21281a.onInvalidLatency(jMax);
                this.f21295o = 0L;
            }
        } catch (Exception unused) {
            this.f21294n = null;
        }
        this.f21298r = j10;
    }

    public boolean p() {
        r();
        if (this.f21304x != -9223372036854775807L) {
            return false;
        }
        ((q) s7.a.e(this.f21286f)).g();
        return true;
    }

    public void q() {
        r();
        this.f21283c = null;
        this.f21286f = null;
    }

    public final void r() {
        this.f21292l = 0L;
        this.f21303w = 0;
        this.f21302v = 0;
        this.f21293m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f21291k = false;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f21283c = audioTrack;
        this.f21284d = i11;
        this.f21285e = i12;
        this.f21286f = new q(audioTrack);
        this.f21287g = audioTrack.getSampleRate();
        this.f21288h = z10 && o(i10);
        boolean zO0 = m0.o0(i10);
        this.f21297q = zO0;
        this.f21289i = zO0 ? b(i12 / i11) : -9223372036854775807L;
        this.f21299s = 0L;
        this.f21300t = 0L;
        this.f21301u = 0L;
        this.f21296p = false;
        this.f21304x = -9223372036854775807L;
        this.f21305y = -9223372036854775807L;
        this.f21298r = 0L;
        this.f21295o = 0L;
        this.f21290j = 1.0f;
    }

    public void t(float f10) {
        this.f21290j = f10;
        q qVar = this.f21286f;
        if (qVar != null) {
            qVar.g();
        }
    }

    public void u() {
        ((q) s7.a.e(this.f21286f)).g();
    }
}
