package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import s7.f0;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements s7.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f21595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f21596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public y f21597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public s7.s f21598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21599f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21600g;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
        void f(u uVar);
    }

    public h(a aVar, s7.d dVar) {
        this.f21596c = aVar;
        this.f21595b = new f0(dVar);
    }

    public void a(y yVar) {
        if (yVar == this.f21597d) {
            this.f21598e = null;
            this.f21597d = null;
            this.f21599f = true;
        }
    }

    @Override // s7.s
    public void b(u uVar) {
        s7.s sVar = this.f21598e;
        if (sVar != null) {
            sVar.b(uVar);
            uVar = this.f21598e.getPlaybackParameters();
        }
        this.f21595b.b(uVar);
    }

    public void c(y yVar) throws ExoPlaybackException {
        s7.s sVar;
        s7.s mediaClock = yVar.getMediaClock();
        if (mediaClock == null || mediaClock == (sVar = this.f21598e)) {
            return;
        }
        if (sVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f21598e = mediaClock;
        this.f21597d = yVar;
        mediaClock.b(this.f21595b.getPlaybackParameters());
    }

    public void d(long j10) {
        this.f21595b.a(j10);
    }

    public final boolean e(boolean z10) {
        y yVar = this.f21597d;
        return yVar == null || yVar.isEnded() || (!this.f21597d.isReady() && (z10 || this.f21597d.hasReadStreamToEnd()));
    }

    public void f() {
        this.f21600g = true;
        this.f21595b.c();
    }

    public void g() {
        this.f21600g = false;
        this.f21595b.d();
    }

    @Override // s7.s
    public u getPlaybackParameters() {
        s7.s sVar = this.f21598e;
        return sVar != null ? sVar.getPlaybackParameters() : this.f21595b.getPlaybackParameters();
    }

    @Override // s7.s
    public long getPositionUs() {
        return this.f21599f ? this.f21595b.getPositionUs() : ((s7.s) s7.a.e(this.f21598e)).getPositionUs();
    }

    public long h(boolean z10) {
        i(z10);
        return getPositionUs();
    }

    public final void i(boolean z10) {
        if (e(z10)) {
            this.f21599f = true;
            if (this.f21600g) {
                this.f21595b.c();
                return;
            }
            return;
        }
        s7.s sVar = (s7.s) s7.a.e(this.f21598e);
        long positionUs = sVar.getPositionUs();
        if (this.f21599f) {
            if (positionUs < this.f21595b.getPositionUs()) {
                this.f21595b.d();
                return;
            } else {
                this.f21599f = false;
                if (this.f21600g) {
                    this.f21595b.c();
                }
            }
        }
        this.f21595b.a(positionUs);
        u playbackParameters = sVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f21595b.getPlaybackParameters())) {
            return;
        }
        this.f21595b.b(playbackParameters);
        this.f21596c.f(playbackParameters);
    }
}
