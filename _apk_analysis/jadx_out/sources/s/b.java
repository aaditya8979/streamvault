package s;

import a6.k0;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e4.g0;
import e4.k;
import e4.p0;
import w5.c;
import y5.i;

/* JADX INFO: compiled from: MyDefaultLoadControl.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f78945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f78948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f78949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f78951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f78953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f78954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f78957m;

    public b() {
        this(new i(true, 65536));
    }

    @Deprecated
    public b(i iVar) {
        this(iVar, 10000, 20000, 20000, 2500, 5000, -1, true, 0, false);
    }

    public b(i iVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, boolean z11) {
        b(i13, 0, "bufferForPlaybackMs", "0");
        b(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i13, "minBufferAudioMs", "bufferForPlaybackMs");
        b(i11, i13, "minBufferVideoMs", "bufferForPlaybackMs");
        b(i10, i14, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i14, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        b(i12, i10, "maxBufferMs", "minBufferAudioMs");
        b(i12, i11, "maxBufferMs", "minBufferVideoMs");
        b(i16, 0, "backBufferDurationMs", "0");
        this.f78945a = iVar;
        this.f78946b = k.a(i10);
        this.f78947c = k.a(i11);
        this.f78948d = k.a(i12);
        this.f78949e = k.a(i13);
        this.f78950f = k.a(i14);
        this.f78951g = i15;
        this.f78952h = z10;
        this.f78953i = k.a(i16);
        this.f78954j = z11;
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

    public static boolean e(p0[] p0VarArr, c cVar) {
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (p0VarArr[i10].getTrackType() == 2 && cVar.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.g0
    public void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, c cVar) {
        this.f78957m = e(p0VarArr, cVar);
        int iC = this.f78951g;
        if (iC == -1) {
            iC = c(p0VarArr, cVar);
        }
        this.f78955k = iC;
        this.f78945a.e(iC);
    }

    public int c(p0[] p0VarArr, c cVar) {
        int iD = 0;
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (cVar.a(i10) != null) {
                iD += d(p0VarArr[i10].getTrackType());
            }
        }
        return iD;
    }

    public final void f(boolean z10) {
        this.f78955k = 0;
        this.f78956l = false;
        if (z10) {
            this.f78945a.d();
        }
    }

    @Override // e4.g0
    public y5.b getAllocator() {
        return this.f78945a;
    }

    @Override // e4.g0
    public long getBackBufferDurationUs() {
        return this.f78953i;
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
        return this.f78954j;
    }

    @Override // e4.g0
    public boolean shouldContinueLoading(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f78945a.c() >= this.f78955k;
        long jMin = this.f78957m ? this.f78947c : this.f78946b;
        if (f10 > 1.0f) {
            jMin = Math.min(k0.O(jMin, f10), this.f78948d);
        }
        if (j10 < jMin) {
            if (!this.f78952h && z11) {
                z10 = false;
            }
            this.f78956l = z10;
        } else if (j10 >= this.f78948d || z11) {
            this.f78956l = false;
        }
        return this.f78956l;
    }

    @Override // e4.g0
    public boolean shouldStartPlayback(long j10, float f10, boolean z10) {
        long jT = k0.T(j10, f10);
        long j11 = z10 ? this.f78950f : this.f78949e;
        return j11 <= 0 || jT >= j11 || (!this.f78952h && this.f78945a.c() >= this.f78955k);
    }
}
