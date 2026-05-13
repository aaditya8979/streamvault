package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f36501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceHolder f36509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaEvents f36515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f36516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AudioManager f36517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f36518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36521u;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    public class b implements SurfaceHolder.Callback {
        private b() {
        }

        public /* synthetic */ b(CusPlayerView cusPlayerView, a aVar) {
            this();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f36504d && !CusPlayerView.this.f36505e && !CusPlayerView.this.isComplete() && !CusPlayerView.this.f36507g && !com.mbridge.msdk.foundation.feedback.b.f37652f) {
                    if (CusPlayerView.this.f36501a.f()) {
                        q0.c("PlayerView", "surfaceChanged  start====");
                        CusPlayerView.this.resumeStart();
                    } else {
                        q0.c("PlayerView", "surfaceChanged  PLAY====");
                        CusPlayerView.this.playVideo(0);
                        CusPlayerView.this.resumeOMSDK();
                    }
                    if (CusPlayerView.this.f36507g) {
                        if (CusPlayerView.this.f36508h) {
                            CusPlayerView.this.f36501a.n();
                            CusPlayerView.this.resumeOMSDK();
                        } else {
                            CusPlayerView.this.pause();
                        }
                    }
                }
                CusPlayerView.this.f36504d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f36501a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f36509i = surfaceHolder;
                CusPlayerView.this.f36501a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f36504d = true;
                CusPlayerView.this.f36506f = true;
                CusPlayerView.this.f36501a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }
    }

    public interface c {
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36503c = false;
        this.f36504d = false;
        this.f36505e = false;
        this.f36506f = false;
        this.f36507g = false;
        this.f36508h = false;
        this.f36512l = 1;
        this.f36513m = false;
        this.f36514n = false;
        this.f36516p = "";
        this.f36519s = false;
        this.f36520t = false;
        this.f36521u = true;
        b();
    }

    private void a() {
        try {
            AudioManager audioManager = this.f36517q;
            if (audioManager == null || !this.f36519s) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f36518r);
            this.f36519s = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                }
            } else if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f36519s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f36501a;
                if (bVar2 != null && bVar2.h()) {
                    this.f36501a.m();
                }
            } else if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f36519s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f36501a;
                if (bVar3 != null && bVar3.h()) {
                    this.f36501a.m();
                }
            } else {
                if (i10 != 1) {
                    return;
                }
                q0.c("PlayerView", "Audio focus gained");
                this.f36519s = true;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f36501a;
                if (bVar4 != null) {
                    bVar4.a(1.0f, 1.0f);
                    if (!this.f36501a.h()) {
                        this.f36501a.n();
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void c() {
        try {
            this.f36517q = (AudioManager) getContext().getSystemService("audio");
            this.f36518r = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f36509i = holder;
        holder.setKeepScreenOn(true);
        this.f36509i.addCallback(new b(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f36501a = bVar;
        bVar.a(getContext(), this.f36509i);
        addView(surfaceView, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f36517q == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f36520t) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f36517q.requestAudioFocus(this.f36518r, 3, i10) != 1) {
                z10 = false;
            }
            this.f36519s = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f36501a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (!this.f36501a.f() || this.f36506f) {
                    playVideo(0);
                } else {
                    start(true);
                }
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurPosition() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.f36501a;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        long jC = bVar != null ? bVar.c() : 0L;
        return Math.toIntExact(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f36516p;
    }

    public MediaEvents getVideoEvents() {
        return this.f36515o;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f36502b = str;
        this.f36501a.a(aVar);
        this.f36501a.c(this.f36502b);
        this.f36503c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                return bVar.g();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f36520t;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f36521u;
    }

    public boolean isSilent() {
        return this.f36501a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f36510j = motionEvent.getRawX();
        this.f36511k = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f36501a != null && !this.f36504d && !isComplete() && !this.f36505e) {
                q0.c("PlayerView", "onresume========");
                if (this.f36501a.f()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        try {
            if (s0.a().a("i_l_s_t_r_i", false) && i10 == 0 && !this.f36513m) {
                this.f36513m = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f36515o == null || this.f36514n) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f36514n = true;
            this.f36515o.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f36501a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f36503c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f36501a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f36521u) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f36501a.j();
                }
            }
            this.f36501a.a(i10);
            this.f36506f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f36515o != null) {
                this.f36515o = null;
            }
            a();
            if (this.f36509i != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f36509i.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f36515o;
            if (mediaEvents != null) {
                this.f36514n = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f36501a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsBTVideo(boolean z10) {
        this.f36507g = z10;
    }

    public void setIsBTVideoPlaying(boolean z10) {
        this.f36508h = z10;
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f36505e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f36520t = i10 == 1;
    }

    public void setNotifyListener(c cVar) {
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f36521u = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36516p = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f36515o = mediaEvents;
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f36501a != null) {
                if (z10) {
                    if (e()) {
                        this.f36501a.t();
                    } else {
                        this.f36501a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
                if (bVar == null || this.f36505e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f36501a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f36515o != null) {
                this.f36515o = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }
}
