package com.google.android.exoplayer.ui;

import a6.k0;
import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import b6.i;
import chuangyuan.ycj.videolibrary.R$color;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.ApicFrame;
import com.google.android.exoplayer.render.RenderSurfaceView;
import com.google.android.exoplayer.render.RenderTextureView;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.ui.PlayerControlView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import e4.f;
import e4.m0;
import e4.n0;
import java.util.List;
import n5.j;
import w5.c;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f20955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f20956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.render.a f20957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f20958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SubtitleView f20959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PlayerControlView f20960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f20961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FrameLayout f20962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n0 f20963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f20971r;

    public final class b extends n0.a implements j, i {
        public b() {
        }

        @Override // e4.n0.b
        public void e(TrackGroupArray trackGroupArray, c cVar) {
            PlayerView.this.s(false);
        }

        @Override // n5.j
        public void onCues(List<n5.b> list) {
            SubtitleView subtitleView = PlayerView.this.f20959f;
            if (subtitleView != null) {
                subtitleView.onCues(list);
            }
        }

        @Override // e4.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            if (PlayerView.this.l() && PlayerView.this.f20969p) {
                PlayerView.this.j();
            } else {
                PlayerView.this.m(false);
            }
        }

        @Override // e4.n0.b
        public void onPositionDiscontinuity(int i10) {
            if (PlayerView.this.l() && PlayerView.this.f20969p) {
                PlayerView.this.j();
            }
        }

        @Override // b6.i
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f20956c != null) {
                PlayerView.this.f20956c.setVisibility(4);
            }
        }

        @Override // b6.i
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            com.google.android.exoplayer.render.a aVar;
            if (PlayerView.this.f20955b == null || (aVar = PlayerView.this.f20957d) == null) {
                return;
            }
            aVar.setPixelWidthHeightRatio(f10);
            PlayerView.this.f20957d.a(i10, i11);
            PlayerView.this.f20957d.b(0, 0);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        int color;
        boolean zHasValue;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        int i12;
        super(context, attributeSet, i10);
        this.f20970q = false;
        if (isInEditMode()) {
            this.f20955b = null;
            this.f20956c = null;
            this.f20957d = null;
            this.f20958e = null;
            this.f20959f = null;
            this.f20960g = null;
            this.f20961h = null;
            this.f20962i = null;
            ImageView imageView = new ImageView(context);
            if (k0.f3574a >= 23) {
                g(getResources(), imageView);
            } else {
                f(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int resourceId = R$layout.simple_exo_view;
        int i13 = 4;
        int i14 = 5000;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PlayerView, 0, 0);
            try {
                int i15 = R$styleable.PlayerView_shutter_background_color_cine;
                zHasValue = typedArrayObtainStyledAttributes.hasValue(i15);
                color = typedArrayObtainStyledAttributes.getColor(i15, 0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerView_player_layout_id_cine, resourceId);
                z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_artwork_cine, true);
                z13 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_controller_cine, true);
                i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_surface_type_cine, 1);
                i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_resize_mode_cine, 4);
                i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_show_timeout_cine, 5000);
                z14 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_on_touch_cine, true);
                z10 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_auto_show_cine, true);
                this.f20966m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_keep_content_on_player_reset, this.f20966m);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_during_ads_cine, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z16;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            z11 = true;
            color = 0;
            zHasValue = false;
            z12 = true;
            z13 = true;
            i11 = 1;
            z14 = true;
        }
        this.f20971r = (FrameLayout) LayoutInflater.from(context).inflate(resourceId, this);
        this.f20961h = new b();
        setDescendantFocusability(262144);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.exo_content_frame);
        this.f20955b = frameLayout;
        View viewFindViewById = findViewById(R$id.exo_shutter);
        this.f20956c = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (frameLayout == null || i11 == 0) {
            z15 = true;
            this.f20957d = null;
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            com.google.android.exoplayer.render.a renderTextureView = i11 == 2 ? new RenderTextureView(context) : new RenderSurfaceView(context);
            this.f20957d = renderTextureView;
            if (i11 == 2) {
                z15 = true;
                ((RenderTextureView) renderTextureView).setTakeOverSurfaceTexture(true);
            } else {
                z15 = true;
            }
            renderTextureView.getRenderView().setLayoutParams(layoutParams);
            frameLayout.addView(renderTextureView.getRenderView(), 0);
            renderTextureView.c(i13);
        }
        this.f20962i = (FrameLayout) findViewById(R$id.exo_overlay);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R$id.exo_artwork);
        this.f20958e = appCompatImageView;
        this.f20965l = (!z12 || appCompatImageView == null) ? false : z15;
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.exo_subtitles);
        this.f20959f = subtitleView;
        if (subtitleView != null) {
            subtitleView.f();
            subtitleView.g();
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R$id.exo_controller);
        View viewFindViewById2 = findViewById(R$id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f20960g = playerControlView;
            i12 = 0;
        } else if (viewFindViewById2 != null) {
            i12 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f20960g = playerControlView2;
            playerControlView2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i12 = 0;
            this.f20960g = null;
        }
        PlayerControlView playerControlView3 = this.f20960g;
        this.f20967n = playerControlView3 == null ? i12 : i14;
        this.f20970q = z14;
        this.f20968o = z10;
        this.f20969p = z11;
        this.f20964k = (!z13 || playerControlView3 == null) ? i12 : z15;
        j();
    }

    public static void f(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    public static void g(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n0 n0Var = this.f20963j;
        if (n0Var != null && n0Var.isPlayingAd()) {
            this.f20962i.requestFocus();
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z10 = k(keyEvent.getKeyCode()) && this.f20964k && !this.f20960g.J();
        m(true);
        return z10 || h(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        View view = this.f20956c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean getControllerAutoShow() {
        return this.f20968o;
    }

    public boolean getControllerHideOnTouch() {
        return this.f20970q;
    }

    public int getControllerShowTimeoutMs() {
        return this.f20967n;
    }

    public n0 getPlayer() {
        return this.f20963j;
    }

    public int getResizeMode() {
        a6.a.f(this.f20955b != null);
        return this.f20957d.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f20959f;
    }

    public boolean getUseController() {
        return this.f20964k;
    }

    public com.google.android.exoplayer.render.a getVideoSurfaceView() {
        return this.f20957d;
    }

    public boolean h(KeyEvent keyEvent) {
        return this.f20964k && this.f20960g.B(keyEvent);
    }

    public void i() {
        AppCompatImageView appCompatImageView = this.f20958e;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(R.color.transparent);
            this.f20958e.setVisibility(4);
        }
    }

    public void j() {
        PlayerControlView playerControlView = this.f20960g;
        if (playerControlView != null) {
            playerControlView.E();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean k(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean l() {
        n0 n0Var = this.f20963j;
        return n0Var != null && n0Var.isPlayingAd() && this.f20963j.getPlayWhenReady();
    }

    public void m(boolean z10) {
        if (!(l() && this.f20969p) && this.f20964k) {
            boolean z11 = this.f20960g.J() && this.f20960g.getShowTimeoutMs() <= 0;
            boolean zP = p();
            if (z10 || z11 || zP) {
                r(zP);
            }
        }
    }

    public final boolean n(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                this.f20958e.setImageBitmap(bitmap);
                this.f20958e.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean o(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Metadata.Entry entryD = metadata.d(i10);
            if (entryD instanceof ApicFrame) {
                byte[] bArr = ((ApicFrame) entryD).f20259f;
                return n(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20964k || this.f20963j == null || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (!this.f20960g.J()) {
            m(true);
        } else if (this.f20970q) {
            this.f20960g.E();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f20964k || this.f20963j == null) {
            return false;
        }
        m(true);
        return true;
    }

    public boolean p() {
        n0 n0Var = this.f20963j;
        if (n0Var == null) {
            return true;
        }
        int playbackState = n0Var.getPlaybackState();
        return this.f20968o && (playbackState == 1 || playbackState == 4 || !this.f20963j.getPlayWhenReady());
    }

    public void q() {
        r(p());
    }

    public final void r(boolean z10) {
        if (this.f20964k) {
            this.f20960g.setShowTimeoutMs(z10 ? 0 : this.f20967n);
            this.f20960g.U();
        }
    }

    public void s(boolean z10) {
        n0 n0Var = this.f20963j;
        if (n0Var == null || n0Var.getCurrentTrackGroups().d()) {
            if (this.f20966m) {
                return;
            }
            i();
            e();
            return;
        }
        if (z10 && !this.f20966m) {
            e();
        }
        c currentTrackSelections = this.f20963j.getCurrentTrackSelections();
        for (int i10 = 0; i10 < currentTrackSelections.f86333a; i10++) {
            if (this.f20963j.getRendererType(i10) == 2 && currentTrackSelections.a(i10) != null) {
                i();
                return;
            }
        }
        e();
        this.f20965l = true;
        for (int i11 = 0; i11 < currentTrackSelections.f86333a; i11++) {
            com.google.android.exoplayer.trackselection.c cVarA = currentTrackSelections.a(i11);
            if (cVarA != null) {
                for (int i12 = 0; i12 < cVarA.length(); i12++) {
                    Metadata metadata = cVarA.getFormat(i12).f19925h;
                    if (metadata != null && o(metadata)) {
                        return;
                    }
                }
            }
        }
        i();
    }

    public void setControlDispatcher(@Nullable f fVar) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setControlDispatcher(fVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f20968o = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f20969p = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        a6.a.f(this.f20960g != null);
        this.f20970q = z10;
    }

    public void setControllerShowTimeoutMs(int i10) {
        a6.a.f(this.f20960g != null);
        this.f20967n = i10;
        if (this.f20960g.J()) {
            q();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.f fVar) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setVisibilityListener(fVar);
    }

    public void setFastForwardIncrementMs(int i10) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setFastForwardIncrementMs(i10);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f20966m != z10) {
            this.f20966m = z10;
            s(false);
        }
    }

    public void setPlaybackPreparer(@Nullable m0 m0Var) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setPlaybackPreparer(m0Var);
    }

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
                Object obj = this.f20957d;
                if (obj instanceof TextureView) {
                    videoComponent.clearVideoTextureView((TextureView) obj);
                } else if (obj instanceof SurfaceView) {
                    videoComponent.clearVideoSurfaceView((SurfaceView) obj);
                }
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
            Object obj2 = this.f20957d;
            if (obj2 instanceof TextureView) {
                videoComponent2.setVideoTextureView((TextureView) obj2);
            } else if (obj2 instanceof SurfaceView) {
                videoComponent2.setVideoSurfaceView((SurfaceView) obj2);
            }
            videoComponent2.f(this.f20961h);
        }
        n0.c textComponent2 = n0Var.getTextComponent();
        if (textComponent2 != null) {
            textComponent2.d(this.f20961h);
        }
        n0Var.e(this.f20961h);
        m(false);
        s(false);
    }

    public void setRepeatToggleModes(int i10) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        a6.a.f(this.f20955b != null);
        this.f20957d.c(i10);
    }

    public void setRewindIncrementMs(int i10) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setRewindIncrementMs(i10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setShowMultiWindowTimeBar(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        a6.a.f(this.f20960g != null);
        this.f20960g.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f20956c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseController(boolean z10) {
        a6.a.f((z10 && this.f20960g == null) ? false : true);
        if (this.f20964k == z10) {
            return;
        }
        this.f20964k = z10;
        if (z10) {
            this.f20960g.setPlayer(this.f20963j);
            return;
        }
        PlayerControlView playerControlView = this.f20960g;
        if (playerControlView != null) {
            playerControlView.E();
            this.f20960g.setPlayer(null);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        com.google.android.exoplayer.render.a aVar = this.f20957d;
        if (aVar instanceof SurfaceView) {
            aVar.getRenderView().setVisibility(i10);
        }
    }
}
