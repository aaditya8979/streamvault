package e4;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSession;
import java.io.IOException;

/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements p0, q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60092b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f60094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e5.i0 f60097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Format[] f60098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f60099i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f60101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60102l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f60093c = new f0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f60100j = Long.MIN_VALUE;

    public e(int i10) {
        this.f60092b = i10;
    }

    public static boolean w(@Nullable com.google.android.exoplayer.drm.a<?> aVar, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (aVar == null) {
            return false;
        }
        return aVar.b(drmInitData);
    }

    @Override // e4.p0
    public final void d(Format[] formatArr, e5.i0 i0Var, long j10) throws ExoPlaybackException {
        a6.a.f(!this.f60101k);
        this.f60097g = i0Var;
        this.f60100j = j10;
        this.f60098h = formatArr;
        this.f60099i = j10;
        t(formatArr, j10);
    }

    @Override // e4.p0
    public final void disable() {
        a6.a.f(this.f60096f == 1);
        this.f60093c.a();
        this.f60096f = 0;
        this.f60097g = null;
        this.f60098h = null;
        this.f60101k = false;
        n();
    }

    @Override // e4.p0
    public final void e(r0 r0Var, Format[] formatArr, e5.i0 i0Var, long j10, boolean z10, long j11) throws ExoPlaybackException {
        a6.a.f(this.f60096f == 0);
        this.f60094d = r0Var;
        this.f60096f = 1;
        o(z10);
        d(formatArr, i0Var, j11);
        p(j10, z10);
    }

    public final ExoPlaybackException g(Exception exc, @Nullable Format format) {
        int formatSupport;
        if (format == null || this.f60102l) {
            formatSupport = 4;
        } else {
            this.f60102l = true;
            try {
                formatSupport = q0.getFormatSupport(a(format));
            } catch (ExoPlaybackException unused) {
                formatSupport = 4;
            } finally {
                this.f60102l = false;
            }
        }
        return ExoPlaybackException.createForRenderer(exc, j(), format, formatSupport);
    }

    @Override // e4.p0
    public final q0 getCapabilities() {
        return this;
    }

    @Override // e4.p0
    @Nullable
    public a6.o getMediaClock() {
        return null;
    }

    @Override // e4.p0
    public final long getReadingPositionUs() {
        return this.f60100j;
    }

    @Override // e4.p0
    public final int getState() {
        return this.f60096f;
    }

    @Override // e4.p0
    @Nullable
    public final e5.i0 getStream() {
        return this.f60097g;
    }

    @Override // e4.p0, e4.q0
    public final int getTrackType() {
        return this.f60092b;
    }

    public final r0 h() {
        return this.f60094d;
    }

    @Override // e4.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // e4.p0
    public final boolean hasReadStreamToEnd() {
        return this.f60100j == Long.MIN_VALUE;
    }

    public final f0 i() {
        this.f60093c.a();
        return this.f60093c;
    }

    @Override // e4.p0
    public final boolean isCurrentStreamFinal() {
        return this.f60101k;
    }

    public final int j() {
        return this.f60095e;
    }

    public final Format[] k() {
        return this.f60098h;
    }

    @Nullable
    public final <T extends j4.i> DrmSession<T> l(@Nullable Format format, Format format2, @Nullable com.google.android.exoplayer.drm.a<T> aVar, @Nullable DrmSession<T> drmSession) throws ExoPlaybackException {
        DrmSession<T> drmSessionC = null;
        if (!(!a6.k0.c(format2.f19930m, format == null ? null : format.f19930m))) {
            return drmSession;
        }
        if (format2.f19930m != null) {
            if (aVar == null) {
                throw g(new IllegalStateException("Media requires a DrmSessionManager"), format2);
            }
            drmSessionC = aVar.c((Looper) a6.a.e(Looper.myLooper()), format2.f19930m);
        }
        if (drmSession != null) {
            drmSession.release();
        }
        return drmSessionC;
    }

    public final boolean m() {
        return hasReadStreamToEnd() ? this.f60101k : this.f60097g.isReady();
    }

    @Override // e4.p0
    public final void maybeThrowStreamError() throws IOException {
        this.f60097g.maybeThrowError();
    }

    public abstract void n();

    public void o(boolean z10) throws ExoPlaybackException {
    }

    public abstract void p(long j10, boolean z10) throws ExoPlaybackException;

    public void q() {
    }

    public void r() throws ExoPlaybackException {
    }

    @Override // e4.p0
    public final void reset() {
        a6.a.f(this.f60096f == 0);
        this.f60093c.a();
        q();
    }

    @Override // e4.p0
    public final void resetPosition(long j10) throws ExoPlaybackException {
        this.f60101k = false;
        this.f60100j = j10;
        p(j10, false);
    }

    public void s() throws ExoPlaybackException {
    }

    @Override // e4.p0
    public final void setCurrentStreamFinal() {
        this.f60101k = true;
    }

    @Override // e4.p0
    public final void setIndex(int i10) {
        this.f60095e = i10;
    }

    @Override // e4.p0
    public final void start() throws ExoPlaybackException {
        a6.a.f(this.f60096f == 1);
        this.f60096f = 2;
        r();
    }

    @Override // e4.p0
    public final void stop() throws ExoPlaybackException {
        a6.a.f(this.f60096f == 2);
        this.f60096f = 1;
        s();
    }

    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
    }

    public final int u(f0 f0Var, i4.e eVar, boolean z10) {
        int iB = this.f60097g.b(f0Var, eVar, z10);
        if (iB == -4) {
            if (eVar.isEndOfStream()) {
                this.f60100j = Long.MIN_VALUE;
                return this.f60101k ? -4 : -3;
            }
            long j10 = eVar.f63713e + this.f60099i;
            eVar.f63713e = j10;
            this.f60100j = Math.max(this.f60100j, j10);
        } else if (iB == -5) {
            Format format = f0Var.f60107c;
            long j11 = format.f19931n;
            if (j11 != Long.MAX_VALUE) {
                f0Var.f60107c = format.m(j11 + this.f60099i);
            }
        }
        return iB;
    }

    public int v(long j10) {
        return this.f60097g.skipData(j10 - this.f60099i);
    }
}
