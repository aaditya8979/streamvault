package sg.bigo.ads.core.player.b;

import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f84303h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public MediaPlayer f84304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f84306c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84309f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Surface f84312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f84313k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f84316n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84307d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f84310g = new Runnable() { // from class: sg.bigo.ads.core.player.b.c.1
        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f84306c != null) {
                c.this.f84306c.i();
            }
            if (c.this.f84307d == 3 || c.this.f84307d == 4 || c.this.f84307d == 5) {
                return;
            }
            sg.bigo.ads.common.n.d.a(2, c.this.f84310g, 500L);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f84314l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f84315m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84311i = 0;

    public interface a {
        void a(int i10, String str, int i11);

        void a(MediaPlayer mediaPlayer, int i10);

        boolean a(int i10);

        boolean a(int i10, int i11);

        void f();

        void g();

        void h();

        void i();

        void j();

        void j_();

        void k();
    }

    public c() {
        this.f84316n = false;
        this.f84316n = i.f81802a.n().a(3);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(@NonNull String str) {
        try {
            if (!this.f84309f) {
                sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available, setDataSource cancel");
                return false;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player setDataSource, path = ".concat(String.valueOf(str)));
            this.f84304a.reset();
            this.f84304a.setDataSource(str);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player setDataSource failed");
            if (this.f84306c != null) {
                if (i()) {
                    sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "setDataSource called onError");
                    this.f84306c.a(1, -1004);
                }
                this.f84306c.a(9, Log.getStackTraceString(e10), this.f84311i);
            }
            b(9);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f84304a = new MediaPlayer();
        f84303h.set(false);
        this.f84304a.setOnCompletionListener(this);
        this.f84304a.setOnErrorListener(this);
        this.f84304a.setOnInfoListener(this);
        this.f84304a.setOnPreparedListener(this);
        this.f84304a.setOnVideoSizeChangedListener(this);
        this.f84304a.setOnBufferingUpdateListener(this);
    }

    private boolean i() {
        return !this.f84316n || this.f84311i >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "prepareAsync");
            this.f84313k = SystemClock.elapsedRealtime();
            this.f84304a.prepareAsync();
            return true;
        } catch (Exception e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(10, Log.getStackTraceString(e10), this.f84311i);
            }
            b(10);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "Player prepareAsync failed");
            return false;
        }
    }

    public final void a(Surface surface) {
        try {
            this.f84312j = surface;
            this.f84304a.setSurface(surface);
            this.f84309f = true;
        } catch (Exception e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(12, Log.getStackTraceString(e10), this.f84311i);
            }
            b(12);
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "setSurface IllegalStateException");
        }
    }

    public final void a(final String str) {
        if (q.a((CharSequence) str)) {
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            this.f84305b = str;
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.b(str)) {
                        c.this.j();
                    }
                }
            });
        }
    }

    public final boolean a() {
        try {
            if (this.f84308e && this.f84309f) {
                if (this.f84304a.isPlaying()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd but is playing, return.");
                    return true;
                }
                this.f84304a.start();
                if (!this.f84314l) {
                    this.f84314l = true;
                    a aVar = this.f84306c;
                    if (aVar != null) {
                        aVar.j_();
                    }
                }
                this.f84307d = 2;
                sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "startAd play called ");
                sg.bigo.ads.common.n.d.a(this.f84310g);
                sg.bigo.ads.common.n.d.a(2, this.f84310g);
                a aVar2 = this.f84306c;
                if (aVar2 != null) {
                    aVar2.f();
                }
                return true;
            }
            sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", "Surface is not available or player unprepared, do start play cancel");
            return false;
        } catch (IllegalStateException e10) {
            a aVar3 = this.f84306c;
            if (aVar3 != null) {
                aVar3.a(3, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to play video: " + e10.getMessage());
            return false;
        }
    }

    public final boolean a(int i10) {
        try {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "seekTo : ".concat(String.valueOf(i10)));
            this.f84304a.seekTo(i10);
            return true;
        } catch (IllegalStateException e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(1, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to seek:" + e10.getMessage());
            return false;
        }
    }

    public final boolean a(boolean z10) {
        try {
            if (z10) {
                this.f84304a.setVolume(0.0f, 0.0f);
            } else {
                this.f84304a.setVolume(1.0f, 1.0f);
            }
        } catch (IllegalStateException e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(14, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "The video failed to set volume: " + e10.getMessage());
        }
        return z10;
    }

    public final void b(final int i10) {
        if (!this.f84316n) {
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayerWhenException switch is off");
            return;
        }
        int i11 = this.f84311i;
        if (i11 >= 3) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(i10, "retry times has reached limit", i11);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "createMediaPlayer times reach the limit(3 times), stop creating");
            return;
        }
        this.f84311i = i11 + 1;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "start to create mediaPlayer, retry time: " + this.f84311i);
        e();
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.player.b.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c.this.h();
                int i12 = i10;
                if (i12 != 9 && i12 != 10) {
                    if (i12 == 12) {
                        c cVar = c.this;
                        cVar.a(cVar.f84312j);
                        return;
                    } else if (i12 != 15) {
                        return;
                    }
                }
                c cVar2 = c.this;
                cVar2.a(cVar2.f84312j);
                c cVar3 = c.this;
                cVar3.a(cVar3.f84305b);
            }
        });
    }

    public final boolean b() {
        try {
            this.f84304a.pause();
            sg.bigo.ads.common.n.d.a(this.f84310g);
            this.f84307d = 3;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "pauseAd play");
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.g();
            }
            return true;
        } catch (IllegalStateException e10) {
            a aVar2 = this.f84306c;
            if (aVar2 != null) {
                aVar2.a(4, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to pause video: " + e10.getMessage());
            return false;
        }
    }

    public final int c() {
        try {
            if (this.f84308e) {
                return this.f84304a.getCurrentPosition();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(5, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getCurrentPosition IllegalStateException");
            return 0;
        }
    }

    public final boolean d() {
        try {
            this.f84304a.stop();
            sg.bigo.ads.common.n.d.a(this.f84310g);
            this.f84307d = 4;
            sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "stop play");
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.h();
            }
            return true;
        } catch (IllegalStateException e10) {
            a aVar2 = this.f84306c;
            if (aVar2 != null) {
                aVar2.a(6, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(1, "MediaPlayerWrapper", "Failed to stop video: " + e10.getMessage());
            return false;
        }
    }

    public final void e() {
        try {
            this.f84304a.release();
            f84303h.set(true);
            sg.bigo.ads.common.n.d.a(this.f84310g);
        } catch (IllegalStateException e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(7, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "player release IllegalStateException");
        }
        this.f84307d = 0;
        this.f84308e = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "player release called");
    }

    public final int f() {
        try {
            if (this.f84308e) {
                return this.f84304a.getDuration();
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration failed，not initialize or release already");
            return 0;
        } catch (IllegalStateException e10) {
            a aVar = this.f84306c;
            if (aVar != null) {
                aVar.a(8, Log.getStackTraceString(e10), this.f84311i);
            }
            sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "getDuration IllegalStateException");
            return 0;
        }
    }

    public final void g() {
        this.f84315m.set(true);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onBufferingUpdate percent = ".concat(String.valueOf(i10)));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        sg.bigo.ads.common.n.d.a(this.f84310g);
        a aVar = this.f84306c;
        if (aVar != null) {
            this.f84307d = 5;
            aVar.j();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar;
        if (i() && (aVar = this.f84306c) != null) {
            return aVar.a(i10, i11);
        }
        sg.bigo.ads.common.n.d.a(this.f84310g);
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar = this.f84306c;
        if (aVar != null) {
            return aVar.a(i10);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        String str;
        if (!this.f84309f) {
            str = "Surface is not available, do prepare cancel";
        } else {
            if (!this.f84315m.get()) {
                this.f84307d = 1;
                this.f84308e = true;
                sg.bigo.ads.common.t.a.a(0, 3, "MediaPlayerWrapper", "onPrepared called cost = " + (SystemClock.elapsedRealtime() - this.f84313k));
                a aVar = this.f84306c;
                if (aVar != null) {
                    aVar.a(mediaPlayer, this.f84311i);
                    return;
                }
                return;
            }
            str = "Destroy Has Called";
        }
        sg.bigo.ads.common.t.a.b("MediaPlayerWrapper", str);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        a aVar = this.f84306c;
        if (aVar != null) {
            aVar.k();
        }
    }
}
