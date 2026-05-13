package e4;

import com.google.android.exoplayer.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes3.dex */
public class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.i f60108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f60112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f60113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f60114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f60115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f60116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f60118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f60120m;

    public h() {
        this(new y5.i(true, 65536));
    }

    @Deprecated
    public h(y5.i iVar) {
        this(iVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    public h(y5.i iVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, boolean z11) {
        b(i13, 0, "bufferForPlaybackMs", "0");
        b(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i13, "minBufferAudioMs", "bufferForPlaybackMs");
        b(i11, i13, "minBufferVideoMs", "bufferForPlaybackMs");
        b(i10, i14, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i14, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        b(i12, i10, "maxBufferMs", "minBufferAudioMs");
        b(i12, i11, "maxBufferMs", "minBufferVideoMs");
        b(i16, 0, "backBufferDurationMs", "0");
        this.f60108a = iVar;
        this.f60109b = k.a(i10);
        this.f60110c = k.a(i11);
        this.f60111d = k.a(i12);
        this.f60112e = k.a(i13);
        this.f60113f = k.a(i14);
        this.f60114g = i15;
        this.f60115h = z10;
        this.f60116i = k.a(i16);
        this.f60117j = z11;
    }

    public static void b(int i10, int i11, String str, String str2) {
        a6.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    public static int d(int i10) {
        switch (i10) {
            case 0:
                return 36438016;
            case 1:
                return C.DEFAULT_AUDIO_BUFFER_SIZE;
            case 2:
                return 32768000;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean e(p0[] p0VarArr, w5.c cVar) {
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (p0VarArr[i10].getTrackType() == 2 && cVar.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.g0
    public void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, w5.c cVar) {
        this.f60120m = e(p0VarArr, cVar);
        int iC = this.f60114g;
        if (iC == -1) {
            iC = c(p0VarArr, cVar);
        }
        this.f60118k = iC;
        this.f60108a.e(iC);
    }

    public int c(p0[] p0VarArr, w5.c cVar) {
        int iD = 0;
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (cVar.a(i10) != null) {
                iD += d(p0VarArr[i10].getTrackType());
            }
        }
        return iD;
    }

    public final void f(boolean z10) {
        this.f60118k = 0;
        this.f60119l = false;
        if (z10) {
            this.f60108a.d();
        }
    }

    @Override // e4.g0
    public y5.b getAllocator() {
        return this.f60108a;
    }

    @Override // e4.g0
    public long getBackBufferDurationUs() {
        return this.f60116i;
    }

    @Override // e4.g0
    public void onPrepared() {
        f(false);
    }

    @Override // e4.g0
    public void onReleased() {
        f(true);
    }

    @Override // e4.g0
    public void onStopped() {
        f(true);
    }

    @Override // e4.g0
    public boolean retainBackBufferFromKeyframe() {
        return this.f60117j;
    }

    @Override // e4.g0
    public boolean shouldContinueLoading(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f60108a.c() >= this.f60118k;
        long jMin = this.f60120m ? this.f60110c : this.f60109b;
        if (f10 > 1.0f) {
            jMin = Math.min(a6.k0.O(jMin, f10), this.f60111d);
        }
        if (j10 < jMin) {
            if (!this.f60115h && z11) {
                z10 = false;
            }
            this.f60119l = z10;
        } else if (j10 >= this.f60111d || z11) {
            this.f60119l = false;
        }
        return this.f60119l;
    }

    @Override // e4.g0
    public boolean shouldStartPlayback(long j10, float f10, boolean z10) {
        long jT = a6.k0.T(j10, f10);
        long j11 = z10 ? this.f60113f : this.f60112e;
        return j11 <= 0 || jT >= j11 || (!this.f60115h && this.f60108a.c() >= this.f60118k);
    }
}
