package jc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import e4.l0;
import e4.n0;
import e4.u0;
import e5.r;
import java.util.Map;
import xyz.doikki.videoplayer.player.a;

/* JADX INFO: compiled from: ExoMediaPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends xyz.doikki.videoplayer.player.a implements n0.b, b6.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f72380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f72381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f72382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f72383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f72384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f72385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w5.d f72386h;

    public a(Context context) {
        this.f72380b = context.getApplicationContext();
        this.f72383e = c.d(context);
    }

    @Override // e4.n0.b
    public void b(ExoPlaybackException exoPlaybackException) {
        a.InterfaceC1104a interfaceC1104a = this.mPlayerEventListener;
        if (interfaceC1104a != null) {
            interfaceC1104a.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public int getBufferedPercentage() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.g();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getCurrentPosition() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getDuration() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public float getSpeed() {
        l0 l0Var = this.f72384f;
        if (l0Var != null) {
            return l0Var.f60187a;
        }
        return 1.0f;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getTcpSpeed() {
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void initPlayer() {
        e4.j jVar = new e4.j(this.f72380b);
        jVar.j(0);
        jVar.i(0L);
        this.f72381c = new u0.b(this.f72380b, jVar).b(new DefaultTrackSelector(this.f72380b)).a();
        setOptions();
        if (ys.f.a().f98105d && (this.f72386h instanceof com.google.android.exoplayer.trackselection.b)) {
            this.f72381c.J(new a6.i((com.google.android.exoplayer.trackselection.b) this.f72386h, "ExoPlayer"));
        }
        this.f72381c.e(this);
        this.f72381c.f(this);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public boolean isPlaying() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return false;
        }
        int playbackState = u0Var.getPlaybackState();
        if (playbackState == 2 || playbackState == 3) {
            return this.f72381c.getPlayWhenReady();
        }
        return false;
    }

    @Override // e4.n0.b
    public void onPlayerStateChanged(boolean z10, int i10) {
        a.InterfaceC1104a interfaceC1104a = this.mPlayerEventListener;
        if (interfaceC1104a == null) {
            return;
        }
        if (this.f72385g) {
            if (i10 == 3) {
                interfaceC1104a.onPrepared();
                this.mPlayerEventListener.onInfo(3, 0);
                this.f72385g = false;
                return;
            }
            return;
        }
        if (i10 == 2) {
            interfaceC1104a.onInfo(701, getBufferedPercentage());
        } else if (i10 == 3) {
            interfaceC1104a.onInfo(702, getBufferedPercentage());
        } else {
            if (i10 != 4) {
                return;
            }
            interfaceC1104a.onCompletion();
        }
    }

    @Override // b6.i
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        a.InterfaceC1104a interfaceC1104a = this.mPlayerEventListener;
        if (interfaceC1104a != null) {
            interfaceC1104a.onVideoSizeChanged(i10, i11);
            if (i12 > 0) {
                this.mPlayerEventListener.onInfo(10001, i12);
            }
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void pause() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return;
        }
        u0Var.setPlayWhenReady(false);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void prepareAsync() {
        u0 u0Var = this.f72381c;
        if (u0Var == null || this.f72382d == null) {
            return;
        }
        l0 l0Var = this.f72384f;
        if (l0Var != null) {
            u0Var.X(l0Var);
        }
        this.f72385g = true;
        this.f72381c.S(this.f72382d);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void release() {
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.c(this);
            this.f72381c.U();
            this.f72381c = null;
        }
        this.f72385g = false;
        this.f72384f = null;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void reset() {
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.m();
            this.f72381c.Z(null);
            this.f72385g = false;
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void seekTo(long j10) {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return;
        }
        u0Var.k(j10);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(String str, Map<String, String> map) {
        this.f72382d = this.f72383e.e(str, map);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            setSurface(null);
        } else {
            setSurface(surfaceHolder.getSurface());
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setLooping(boolean z10) {
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.setRepeatMode(z10 ? 2 : 0);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setOptions() {
        this.f72381c.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSpeed(float f10) {
        l0 l0Var = new l0(f10);
        this.f72384f = l0Var;
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.X(l0Var);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSurface(Surface surface) {
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.Z(surface);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setVolume(float f10, float f11) {
        u0 u0Var = this.f72381c;
        if (u0Var != null) {
            u0Var.c0((f10 + f11) / 2.0f);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void start() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return;
        }
        u0Var.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void stop() {
        u0 u0Var = this.f72381c;
        if (u0Var == null) {
            return;
        }
        u0Var.m();
    }
}
