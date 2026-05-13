package com.google.android.exoplayer.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.exoplayer.render.RenderTextureView;
import com.google.android.exoplayer.render.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import e4.n0;
import e4.u0;

/* JADX INFO: loaded from: classes9.dex */
public class ExoPlayerView extends PlayerView {
    public static final String A = ExoPlayerView.class.getName();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a.b f20904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MotionEvent f20906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MotionEvent f20907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f20909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f20910y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a.InterfaceC0287a f20911z;

    public class a implements a.InterfaceC0287a {
        public a() {
        }

        @Override // com.google.android.exoplayer.render.a.InterfaceC0287a
        public void a(a.b bVar) {
            Log.d(ExoPlayerView.A, "onSurfaceDestroy..." + ExoPlayerView.this.f20957d.toString());
            ExoPlayerView.this.f20904s = null;
        }

        @Override // com.google.android.exoplayer.render.a.InterfaceC0287a
        public void b(a.b bVar, int i10, int i11, int i12) {
        }

        @Override // com.google.android.exoplayer.render.a.InterfaceC0287a
        public void c(a.b bVar, int i10, int i11) {
            Log.d(ExoPlayerView.A, "onSurfaceCreated : width = " + i10 + ", height = " + i11);
            if (ExoPlayerView.this.f20904s == null) {
                ExoPlayerView.this.f20904s = bVar;
                ExoPlayerView exoPlayerView = ExoPlayerView.this;
                exoPlayerView.x(exoPlayerView.f20904s);
            }
        }
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20905t = 200;
        this.f20908w = true;
        this.f20911z = new a();
    }

    @Override // com.google.android.exoplayer.ui.PlayerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FrameLayout getContentFrameLayout() {
        return this.f20971r;
    }

    public PlayerControlView getControllerView() {
        return this.f20960g;
    }

    @Override // com.google.android.exoplayer.ui.PlayerView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.google.android.exoplayer.ui.PlayerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        n0 n0Var;
        if (!this.f20970q) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20908w = true;
            MotionEvent motionEvent3 = this.f20907v;
            if (motionEvent3 != null && (motionEvent2 = this.f20906u) != null && y(motionEvent2, motionEvent3, motionEvent)) {
                this.f20908w = false;
                PlayerControlView playerControlView = this.f20960g;
                if (playerControlView != null && (n0Var = playerControlView.P) != null) {
                    if (n0Var.getPlayWhenReady()) {
                        PlayerControlView playerControlView2 = this.f20960g;
                        playerControlView2.Q.a(playerControlView2.P, false);
                        this.f20960g.z(1);
                    } else {
                        PlayerControlView playerControlView3 = this.f20960g;
                        playerControlView3.Q.a(playerControlView3.P, true);
                    }
                }
            }
            this.f20909x = motionEvent.getRawX();
            this.f20906u = MotionEvent.obtain(motionEvent);
        } else if (action == 1) {
            if (this.f20908w) {
                this.f20908w = false;
                if (!this.f20960g.J()) {
                    this.f20960g.S();
                    m(true);
                } else if (this.f20970q) {
                    this.f20960g.T();
                }
            }
            this.f20907v = MotionEvent.obtain(motionEvent);
        } else if (action != 2) {
            if (action == 3 && this.f20908w) {
                this.f20908w = false;
                if (!this.f20960g.J()) {
                    this.f20960g.S();
                    m(true);
                } else if (this.f20970q) {
                    this.f20960g.T();
                }
            }
        } else if (this.f20908w) {
            float rawX = motionEvent.getRawX();
            this.f20910y = rawX;
            if (Math.abs(rawX - this.f20909x) > 2.0f) {
                this.f20908w = false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer.ui.PlayerView
    public void setPlayer(n0 n0Var) {
        n0 n0Var2 = this.f20963j;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.c(this.f20961h);
            n0.d videoComponent = this.f20963j.getVideoComponent();
            if (videoComponent != null) {
                videoComponent.a(this.f20961h);
            }
            n0.c textComponent = this.f20963j.getTextComponent();
            if (textComponent != null) {
                textComponent.b(this.f20961h);
            }
        }
        this.f20963j = n0Var;
        if (this.f20964k) {
            this.f20960g.setPlayer(n0Var);
        }
        SubtitleView subtitleView = this.f20959f;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        s(true);
        if (n0Var == null) {
            j();
            i();
            return;
        }
        n0.d videoComponent2 = n0Var.getVideoComponent();
        if (videoComponent2 != null) {
            videoComponent2.f(this.f20961h);
        }
        n0.c textComponent2 = n0Var.getTextComponent();
        if (textComponent2 != null) {
            textComponent2.d(this.f20961h);
        }
        n0Var.e(this.f20961h);
        m(false);
        s(false);
        if (this.f20957d.getRenderView() instanceof RenderTextureView) {
            ((RenderTextureView) this.f20957d).setTakeOverSurfaceTexture(true);
        }
        a.b bVar = this.f20904s;
        if (bVar != null) {
            x(bVar);
        }
        this.f20957d.setRenderCallback(this.f20911z);
    }

    public final void x(a.b bVar) {
        if (bVar != null) {
            bVar.a((u0) this.f20963j);
        }
    }

    public final boolean y(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (motionEvent3.getEventTime() - motionEvent2.getEventTime() > 200) {
            return false;
        }
        int x10 = ((int) motionEvent2.getX()) - ((int) motionEvent3.getX());
        int y10 = ((int) motionEvent2.getY()) - ((int) motionEvent3.getY());
        return (x10 * x10) + (y10 * y10) < 10000;
    }
}
