package e4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements a6.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.c0 f60135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f60136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public p0 f60137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a6.o f60138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60139f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f60140g;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
        void a(l0 l0Var);
    }

    public i(a aVar, a6.c cVar) {
        this.f60136c = aVar;
        this.f60135b = new a6.c0(cVar);
    }

    public void a(p0 p0Var) {
        if (p0Var == this.f60137d) {
            this.f60138e = null;
            this.f60137d = null;
            this.f60139f = true;
        }
    }

    @Override // a6.o
    public void b(l0 l0Var) {
        a6.o oVar = this.f60138e;
        if (oVar != null) {
            oVar.b(l0Var);
            l0Var = this.f60138e.getPlaybackParameters();
        }
        this.f60135b.b(l0Var);
    }

    public void c(p0 p0Var) throws ExoPlaybackException {
        a6.o oVar;
        a6.o mediaClock = p0Var.getMediaClock();
        if (mediaClock == null || mediaClock == (oVar = this.f60138e)) {
            return;
        }
        if (oVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f60138e = mediaClock;
        this.f60137d = p0Var;
        mediaClock.b(this.f60135b.getPlaybackParameters());
    }

    public void d(long j10) {
        this.f60135b.a(j10);
    }

    public final boolean e(boolean z10) {
        p0 p0Var = this.f60137d;
        return p0Var == null || p0Var.isEnded() || (!this.f60137d.isReady() && (z10 || this.f60137d.hasReadStreamToEnd()));
    }

    public void f() {
        this.f60140g = true;
        this.f60135b.c();
    }

    public void g() {
        this.f60140g = false;
        this.f60135b.d();
    }

    @Override // a6.o
    public l0 getPlaybackParameters() {
        a6.o oVar = this.f60138e;
        return oVar != null ? oVar.getPlaybackParameters() : this.f60135b.getPlaybackParameters();
    }

    @Override // a6.o
    public long getPositionUs() {
        return this.f60139f ? this.f60135b.getPositionUs() : this.f60138e.getPositionUs();
    }

    public long h(boolean z10) {
        i(z10);
        return getPositionUs();
    }

    public final void i(boolean z10) {
        if (e(z10)) {
            this.f60139f = true;
            if (this.f60140g) {
                this.f60135b.c();
                return;
            }
            return;
        }
        long positionUs = this.f60138e.getPositionUs();
        if (this.f60139f) {
            if (positionUs < this.f60135b.getPositionUs()) {
                this.f60135b.d();
                return;
            } else {
                this.f60139f = false;
                if (this.f60140g) {
                    this.f60135b.c();
                }
            }
        }
        this.f60135b.a(positionUs);
        l0 playbackParameters = this.f60138e.getPlaybackParameters();
        if (playbackParameters.equals(this.f60135b.getPlaybackParameters())) {
            return;
        }
        this.f60135b.b(playbackParameters);
        this.f60136c.a(playbackParameters);
    }
}
