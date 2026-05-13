package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import d6.u1;
import d6.v1;
import d6.z0;
import e6.s1;
import java.io.IOException;

/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements y, u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21545b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public v1 f21547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f21549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public e7.b0 f21551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public m[] f21552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21554k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21557n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f21546c = new z0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21555l = Long.MIN_VALUE;

    public e(int i10) {
        this.f21545b = i10;
    }

    @Override // com.google.android.exoplayer2.y
    public final void c(v1 v1Var, m[] mVarArr, e7.b0 b0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        s7.a.g(this.f21550g == 0);
        this.f21547d = v1Var;
        this.f21550g = 1;
        o(z10, z11);
        e(mVarArr, b0Var, j11, j12);
        v(j10, z10);
    }

    @Override // com.google.android.exoplayer2.y
    public final void d(int i10, s1 s1Var) {
        this.f21548e = i10;
        this.f21549f = s1Var;
    }

    @Override // com.google.android.exoplayer2.y
    public final void disable() {
        s7.a.g(this.f21550g == 1);
        this.f21546c.a();
        this.f21550g = 0;
        this.f21551h = null;
        this.f21552i = null;
        this.f21556m = false;
        n();
    }

    @Override // com.google.android.exoplayer2.y
    public final void e(m[] mVarArr, e7.b0 b0Var, long j10, long j11) throws ExoPlaybackException {
        s7.a.g(!this.f21556m);
        this.f21551h = b0Var;
        if (this.f21555l == Long.MIN_VALUE) {
            this.f21555l = j10;
        }
        this.f21552i = mVarArr;
        this.f21553j = j11;
        t(mVarArr, j10, j11);
    }

    public final ExoPlaybackException f(Throwable th2, @Nullable m mVar, int i10) {
        return g(th2, mVar, false, i10);
    }

    public final ExoPlaybackException g(Throwable th2, @Nullable m mVar, boolean z10, int i10) {
        int formatSupport;
        if (mVar == null || this.f21557n) {
            formatSupport = 4;
        } else {
            this.f21557n = true;
            try {
                formatSupport = u1.getFormatSupport(a(mVar));
            } catch (ExoPlaybackException unused) {
                formatSupport = 4;
            } finally {
                this.f21557n = false;
            }
        }
        return ExoPlaybackException.createForRenderer(th2, getName(), j(), mVar, formatSupport, z10, i10);
    }

    @Override // com.google.android.exoplayer2.y
    public final u1 getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.y
    @Nullable
    public s7.s getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.y
    public final long getReadingPositionUs() {
        return this.f21555l;
    }

    @Override // com.google.android.exoplayer2.y
    public final int getState() {
        return this.f21550g;
    }

    @Override // com.google.android.exoplayer2.y
    @Nullable
    public final e7.b0 getStream() {
        return this.f21551h;
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public final int getTrackType() {
        return this.f21545b;
    }

    public final v1 h() {
        return (v1) s7.a.e(this.f21547d);
    }

    @Override // com.google.android.exoplayer2.w.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.y
    public final boolean hasReadStreamToEnd() {
        return this.f21555l == Long.MIN_VALUE;
    }

    public final z0 i() {
        this.f21546c.a();
        return this.f21546c;
    }

    @Override // com.google.android.exoplayer2.y
    public final boolean isCurrentStreamFinal() {
        return this.f21556m;
    }

    public final int j() {
        return this.f21548e;
    }

    public final s1 k() {
        return (s1) s7.a.e(this.f21549f);
    }

    public final m[] l() {
        return (m[]) s7.a.e(this.f21552i);
    }

    public final boolean m() {
        return hasReadStreamToEnd() ? this.f21556m : ((e7.b0) s7.a.e(this.f21551h)).isReady();
    }

    @Override // com.google.android.exoplayer2.y
    public final void maybeThrowStreamError() throws IOException {
        ((e7.b0) s7.a.e(this.f21551h)).maybeThrowError();
    }

    public abstract void n();

    public void o(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    public abstract void p(long j10, boolean z10) throws ExoPlaybackException;

    public void q() {
    }

    public void r() throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.y
    public final void reset() {
        s7.a.g(this.f21550g == 0);
        this.f21546c.a();
        q();
    }

    @Override // com.google.android.exoplayer2.y
    public final void resetPosition(long j10) throws ExoPlaybackException {
        v(j10, false);
    }

    public void s() {
    }

    @Override // com.google.android.exoplayer2.y
    public final void setCurrentStreamFinal() {
        this.f21556m = true;
    }

    @Override // com.google.android.exoplayer2.y
    public final void start() throws ExoPlaybackException {
        s7.a.g(this.f21550g == 1);
        this.f21550g = 2;
        r();
    }

    @Override // com.google.android.exoplayer2.y
    public final void stop() {
        s7.a.g(this.f21550g == 2);
        this.f21550g = 1;
        s();
    }

    @Override // d6.u1
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public abstract void t(m[] mVarArr, long j10, long j11) throws ExoPlaybackException;

    public final int u(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iA = ((e7.b0) s7.a.e(this.f21551h)).a(z0Var, decoderInputBuffer, i10);
        if (iA == -4) {
            if (decoderInputBuffer.g()) {
                this.f21555l = Long.MIN_VALUE;
                return this.f21556m ? -4 : -3;
            }
            long j10 = decoderInputBuffer.f21432f + this.f21553j;
            decoderInputBuffer.f21432f = j10;
            this.f21555l = Math.max(this.f21555l, j10);
        } else if (iA == -5) {
            m mVar = (m) s7.a.e(z0Var.f59724b);
            if (mVar.f21755q != Long.MAX_VALUE) {
                z0Var.f59724b = mVar.b().i0(mVar.f21755q + this.f21553j).E();
            }
        }
        return iA;
    }

    public final void v(long j10, boolean z10) throws ExoPlaybackException {
        this.f21556m = false;
        this.f21554k = j10;
        this.f21555l = j10;
        p(j10, z10);
    }

    public int w(long j10) {
        return ((e7.b0) s7.a.e(this.f21551h)).skipData(j10 - this.f21553j);
    }
}
