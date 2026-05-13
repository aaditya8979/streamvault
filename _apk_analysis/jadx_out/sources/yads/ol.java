package yads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public final class ol {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl f93251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f93252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f93253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ml f93256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f93257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f93258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f93259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f93260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f93262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f93263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f93264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f93265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f93266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f93267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f93268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f93269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f93270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f93271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f93272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f93273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f93274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f93275y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f93276z;

    public ol(wb0 wb0Var) {
        this.f93251a = (nl) ni.a(wb0Var);
        if (ib3.f90737a >= 18) {
            try {
                this.f93264n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f93252b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f93253c;
        audioTrack.getClass();
        if (this.f93274x != -9223372036854775807L) {
            return Math.min(this.A, this.f93276z + ((((SystemClock.elapsedRealtime() * 1000) - this.f93274x) * ((long) this.f93257g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f93258h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f93271u = this.f93269s;
            }
            playbackHeadPosition += this.f93271u;
        }
        if (ib3.f90737a <= 29) {
            if (playbackHeadPosition == 0 && this.f93269s > 0 && playState == 3) {
                if (this.f93275y == -9223372036854775807L) {
                    this.f93275y = SystemClock.elapsedRealtime();
                }
                return this.f93269s;
            }
            this.f93275y = -9223372036854775807L;
        }
        if (this.f93269s > playbackHeadPosition) {
            this.f93270t++;
        }
        this.f93269s = playbackHeadPosition;
        return playbackHeadPosition + (this.f93270t << 32);
    }

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f93257g);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ol.a(boolean):long");
    }

    public final void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f93253c = audioTrack;
        this.f93254d = i11;
        this.f93255e = i12;
        this.f93256f = new ml(audioTrack);
        this.f93257g = audioTrack.getSampleRate();
        this.f93258h = z10 && ib3.f90737a < 23 && (i10 == 5 || i10 == 6);
        boolean zE = ib3.e(i10);
        this.f93267q = zE;
        this.f93259i = zE ? a(i12 / i11) : -9223372036854775807L;
        this.f93269s = 0L;
        this.f93270t = 0L;
        this.f93271u = 0L;
        this.f93266p = false;
        this.f93274x = -9223372036854775807L;
        this.f93275y = -9223372036854775807L;
        this.f93268r = 0L;
        this.f93265o = 0L;
        this.f93260j = 1.0f;
    }

    public final boolean b(long j10) {
        if (j10 <= a()) {
            if (this.f93258h) {
                AudioTrack audioTrack = this.f93253c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }
}
