package d6;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes7.dex */
public class d implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.l f59588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f59592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f59595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59598k;

    public d() {
        this(new r7.l(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public d(r7.l lVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        b(i12, 0, "bufferForPlaybackMs", "0");
        b(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        b(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i10, "maxBufferMs", "minBufferMs");
        b(i15, 0, "backBufferDurationMs", "0");
        this.f59588a = lVar;
        this.f59589b = s7.m0.w0(i10);
        this.f59590c = s7.m0.w0(i11);
        this.f59591d = s7.m0.w0(i12);
        this.f59592e = s7.m0.w0(i13);
        this.f59593f = i14;
        this.f59597j = i14 == -1 ? 13107200 : i14;
        this.f59594g = z10;
        this.f59595h = s7.m0.w0(i15);
        this.f59596i = z11;
    }

    public static void b(int i10, int i11, String str, String str2) {
        s7.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    public static int d(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // d6.b1
    public void a(com.google.android.exoplayer2.y[] yVarArr, e7.i0 i0Var, q7.r[] rVarArr) {
        int iC = this.f59593f;
        if (iC == -1) {
            iC = c(yVarArr, rVarArr);
        }
        this.f59597j = iC;
        this.f59588a.e(iC);
    }

    public int c(com.google.android.exoplayer2.y[] yVarArr, q7.r[] rVarArr) {
        int iD = 0;
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            if (rVarArr[i10] != null) {
                iD += d(yVarArr[i10].getTrackType());
            }
        }
        return Math.max(13107200, iD);
    }

    public final void e(boolean z10) {
        int i10 = this.f59593f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f59597j = i10;
        this.f59598k = false;
        if (z10) {
            this.f59588a.d();
        }
    }

    @Override // d6.b1
    public r7.b getAllocator() {
        return this.f59588a;
    }

    @Override // d6.b1
    public long getBackBufferDurationUs() {
        return this.f59595h;
    }

    @Override // d6.b1
    public void onPrepared() {
        e(false);
    }

    @Override // d6.b1
    public void onReleased() {
        e(true);
    }

    @Override // d6.b1
    public void onStopped() {
        e(true);
    }

    @Override // d6.b1
    public boolean retainBackBufferFromKeyframe() {
        return this.f59596i;
    }

    @Override // d6.b1
    public boolean shouldContinueLoading(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f59588a.c() >= this.f59597j;
        long jMin = this.f59589b;
        if (f10 > 1.0f) {
            jMin = Math.min(s7.m0.U(jMin, f10), this.f59590c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.f59594g && z11) {
                z10 = false;
            }
            this.f59598k = z10;
            if (!z10 && j11 < 500000) {
                s7.q.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f59590c || z11) {
            this.f59598k = false;
        }
        return this.f59598k;
    }

    @Override // d6.b1
    public boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        long jZ = s7.m0.Z(j10, f10);
        long jMin = z10 ? this.f59592e : this.f59591d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || jZ >= jMin || (!this.f59594g && this.f59588a.c() >= this.f59597j);
    }
}
