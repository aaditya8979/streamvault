package yads;

import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class rp0 implements p52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExoPlayer f94555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kn1 f94556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi3 f94557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o52 f94558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ej3 f94559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pp0 f94560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oo0 f94561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n62 f94562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n62 f94563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cf3 f94564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kf3 f94565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f94566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f94567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f94568n;

    public rp0(ExoPlayer exoPlayer, kn1 kn1Var, qi3 qi3Var, o52 o52Var, ej3 ej3Var) {
        this.f94555a = exoPlayer;
        this.f94556b = kn1Var;
        this.f94557c = qi3Var;
        this.f94558d = o52Var;
        this.f94559e = ej3Var;
        pp0 pp0Var = new pp0(this);
        this.f94560f = pp0Var;
        this.f94561g = new oo0(pp0Var);
        this.f94566l = new HashSet();
        exoPlayer.addListener(pp0Var);
        exoPlayer.addListener(ej3Var);
        z6.a(this);
    }

    @Override // yads.p52
    public final void a() {
        if (this.f94567m) {
            return;
        }
        kf3 kf3Var = this.f94565k;
        cf3 cf3Var = this.f94564j;
        if (kf3Var != null && cf3Var != null) {
            kf3Var.e();
        }
        this.f94567m = true;
        this.f94568n = false;
        ((zb2) this.f94561g.f93296b).a();
        this.f94555a.setVideoTextureView(null);
        ej3 ej3Var = this.f94559e;
        ej3Var.f89280c = null;
        ej3Var.b();
        this.f94555a.removeListener(this.f94560f);
        this.f94555a.removeListener(this.f94559e);
        this.f94555a.release();
    }

    @Override // yads.p52
    public final void a(TextureView textureView) {
        if (this.f94567m) {
            return;
        }
        ej3 ej3Var = this.f94559e;
        ej3Var.f89280c = textureView;
        ej3Var.b();
        this.f94555a.setVideoTextureView(textureView);
    }

    public final void a(cf3 cf3Var) {
        if (this.f94567m) {
            return;
        }
        this.f94564j = cf3Var;
        kn1 kn1Var = this.f94556b;
        kn1Var.getClass();
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(kn1Var.f91666b, new mu2(((l53) ne.a().f89523a).a(), cs2.a().a(kn1Var.f91666b)));
        Object obj = cp0.f88559c;
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(new CacheDataSource.Factory().setCache(ap0.a().a(kn1Var.f91666b)).setUpstreamDataSourceFactory(factory));
        kn1Var.f91665a.getClass();
        MediaSource mediaSourceCreateMediaSource = defaultMediaSourceFactory.createMediaSource(MediaItem.fromUri(cf3Var.getUrl()));
        this.f94555a.setPlayWhenReady(false);
        this.f94555a.setMediaSource(mediaSourceCreateMediaSource);
        this.f94555a.prepare();
        oo0 oo0Var = this.f94561g;
        oo0Var.getClass();
        mo0 mo0Var = new mo0(oo0Var);
        ((zb2) oo0Var.f93296b).a(oo0.f93294c, mo0Var);
    }

    @Override // yads.p52
    public final void a(kf3 kf3Var) {
        this.f94565k = kf3Var;
    }

    @Override // yads.p52
    public final void a(kj3 kj3Var) {
        if (this.f94567m) {
            return;
        }
        ej3 ej3Var = this.f94559e;
        ej3Var.f89281d = kj3Var;
        ej3Var.b();
    }

    @Override // yads.p52
    public final void a(n62 n62Var, n62 n62Var2) {
        this.f94562h = n62Var;
        this.f94563i = n62Var2;
        Pair pairA = n62Var2 != null ? bn.h.a(n62Var, n62Var2) : null;
        if (pairA == null || !this.f94566l.contains(pairA)) {
            a(n62Var);
        } else {
            a(n62Var2);
        }
    }

    @Override // yads.p52
    public final long b() {
        return this.f94555a.getDuration();
    }

    @Override // yads.p52
    public final void c() {
        if (!this.f94567m) {
            this.f94555a.setPlayWhenReady(true);
        }
        if (this.f94568n) {
            pauseAd();
        }
    }

    @Override // yads.p52
    public final void e() {
        if (this.f94567m) {
            return;
        }
        this.f94567m = true;
        this.f94568n = false;
        ((zb2) this.f94561g.f93296b).a();
        this.f94555a.setVideoTextureView(null);
        ej3 ej3Var = this.f94559e;
        ej3Var.f89280c = null;
        ej3Var.b();
        this.f94555a.removeListener(this.f94560f);
        this.f94555a.removeListener(this.f94559e);
        this.f94555a.release();
    }

    @Override // yads.p52
    public final boolean f() {
        return this.f94567m;
    }

    @Override // yads.kx0
    public final void g() {
        this.f94568n = true;
        pauseAd();
    }

    @Override // yads.p52
    public final long getAdPosition() {
        return this.f94555a.getCurrentPosition();
    }

    @Override // yads.p52
    public final float getVolume() {
        return this.f94555a.getVolume();
    }

    @Override // yads.p52
    public final boolean isPlayingAd() {
        return this.f94555a.isPlaying();
    }

    @Override // yads.p52
    public final void pauseAd() {
        if (this.f94567m) {
            return;
        }
        this.f94555a.setPlayWhenReady(false);
    }

    @Override // yads.p52
    public final void resumeAd() {
        if (this.f94567m || this.f94568n) {
            return;
        }
        this.f94555a.setPlayWhenReady(true);
    }

    @Override // yads.p52
    public final void setVolume(float f10) {
        if (this.f94567m) {
            return;
        }
        this.f94555a.setVolume(f10);
        kf3 kf3Var = this.f94565k;
        cf3 cf3Var = this.f94564j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        kf3Var.onVolumeChanged(f10);
    }
}
