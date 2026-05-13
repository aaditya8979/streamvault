package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
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
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class PlayerView extends FrameLayout {
    public int A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f22562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final View f22563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final View f22564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ImageView f22566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final SubtitleView f22567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final View f22568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TextView f22569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final PlayerControlView f22570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final FrameLayout f22571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final FrameLayout f22572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.v f22573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public PlayerControlView.e f22575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Drawable f22577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public s7.j<? super PlaybackException> f22580u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public CharSequence f22581v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22584y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22585z;

    public final class a implements v.d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.b f22586b = new c0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f22587c;

        public a() {
        }

        @Override // com.google.android.exoplayer2.v.d
        public void E(com.google.android.exoplayer2.d0 d0Var) {
            com.google.android.exoplayer2.v vVar = (com.google.android.exoplayer2.v) s7.a.e(PlayerView.this.f22573n);
            com.google.android.exoplayer2.c0 currentTimeline = vVar.getCurrentTimeline();
            if (currentTimeline.u()) {
                this.f22587c = null;
            } else if (vVar.getCurrentTracks().c()) {
                Object obj = this.f22587c;
                if (obj != null) {
                    int iF = currentTimeline.f(obj);
                    if (iF != -1) {
                        if (vVar.getCurrentMediaItemIndex() == currentTimeline.j(iF, this.f22586b).f21389d) {
                            return;
                        }
                    }
                    this.f22587c = null;
                }
            } else {
                this.f22587c = currentTimeline.k(vVar.getCurrentPeriodIndex(), this.f22586b, true).f21388c;
            }
            PlayerView.this.L(false);
        }

        @Override // com.google.android.exoplayer2.v.d
        public void c(t7.x xVar) {
            PlayerView.this.G();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void g(g7.f fVar) {
            if (PlayerView.this.f22567h != null) {
                PlayerView.this.f22567h.setCues(fVar.f62173b);
            }
        }

        @Override // com.google.android.exoplayer2.v.d
        public void k(v.e eVar, v.e eVar2, int i10) {
            if (PlayerView.this.w() && PlayerView.this.f22584y) {
                PlayerView.this.u();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.o((TextureView) view, PlayerView.this.A);
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            PlayerView.this.H();
            PlayerView.this.J();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlaybackStateChanged(int i10) {
            PlayerView.this.H();
            PlayerView.this.K();
            PlayerView.this.J();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f22563d != null) {
                PlayerView.this.f22563d.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.e
        public void onVisibilityChange(int i10) {
            PlayerView.this.I();
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int integer;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        boolean z16;
        int i16;
        boolean z17;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f22561b = aVar;
        if (isInEditMode()) {
            this.f22562c = null;
            this.f22563d = null;
            this.f22564e = null;
            this.f22565f = false;
            this.f22566g = null;
            this.f22567h = null;
            this.f22568i = null;
            this.f22569j = null;
            this.f22570k = null;
            this.f22571l = null;
            this.f22572m = null;
            ImageView imageView = new ImageView(context);
            if (s7.m0.f79487a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R$layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PlayerView, i10, 0);
            try {
                int i18 = R$styleable.PlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
                int color = typedArrayObtainStyledAttributes.getColor(i18, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerView_player_layout_id, i17);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerView_default_artwork, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_use_controller, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_surface_type, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_resize_mode, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerView_show_timeout, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_on_touch, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.PlayerView_show_buffering, 0);
                this.f22579t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_keep_content_on_player_reset, this.f22579t);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z12 = z20;
                z10 = z21;
                i12 = i20;
                z15 = z19;
                i15 = resourceId2;
                z14 = z18;
                z13 = zHasValue;
                i14 = color;
                i13 = i19;
                i17 = resourceId;
                i11 = i21;
                z11 = z22;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            z11 = true;
            integer = 0;
            z12 = true;
            i13 = 1;
            i14 = 0;
            z13 = false;
            z14 = true;
            i15 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R$id.exo_content_frame);
        this.f22562c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            B(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(R$id.exo_shutter);
        this.f22563d = viewFindViewById;
        if (viewFindViewById != null && z13) {
            viewFindViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            this.f22564e = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 == 2) {
                this.f22564e = new TextureView(context);
            } else if (i13 == 3) {
                try {
                    this.f22564e = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f22564e.setLayoutParams(layoutParams);
                    this.f22564e.setOnClickListener(aVar);
                    this.f22564e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f22564e, 0);
                    z16 = z17;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i13 != 4) {
                this.f22564e = new SurfaceView(context);
            } else {
                try {
                    this.f22564e = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.f22564e.setLayoutParams(layoutParams);
            this.f22564e.setOnClickListener(aVar);
            this.f22564e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f22564e, 0);
            z16 = z17;
        }
        this.f22565f = z16;
        this.f22571l = (FrameLayout) findViewById(R$id.exo_ad_overlay);
        this.f22572m = (FrameLayout) findViewById(R$id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R$id.exo_artwork);
        this.f22566g = imageView2;
        this.f22576q = z14 && imageView2 != null;
        if (i15 != 0) {
            this.f22577r = ContextCompat.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.exo_subtitles);
        this.f22567h = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(R$id.exo_buffering);
        this.f22568i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f22578s = integer;
        TextView textView = (TextView) findViewById(R$id.exo_error_message);
        this.f22569j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i22 = R$id.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i22);
        View viewFindViewById3 = findViewById(R$id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f22570k = playerControlView;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f22570k = playerControlView2;
            playerControlView2.setId(i22);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f22570k = null;
        }
        PlayerControlView playerControlView3 = this.f22570k;
        this.f22582w = playerControlView3 != null ? i11 : i16;
        this.f22585z = z12;
        this.f22583x = z10;
        this.f22584y = z11;
        this.f22574o = (!z15 || playerControlView3 == null) ? i16 : 1;
        if (playerControlView3 != null) {
            playerControlView3.F();
            this.f22570k.y(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        I();
    }

    public static void B(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public static void o(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    public static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color, null));
    }

    public final boolean A(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                y(this.f22562c, intrinsicWidth / intrinsicHeight);
                this.f22566g.setImageDrawable(drawable);
                this.f22566g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        com.google.android.exoplayer2.v vVar = this.f22573n;
        if (vVar == null) {
            return true;
        }
        int playbackState = vVar.getPlaybackState();
        return this.f22583x && (playbackState == 1 || playbackState == 4 || !this.f22573n.getPlayWhenReady());
    }

    public void D() {
        E(C());
    }

    public final void E(boolean z10) {
        if (N()) {
            this.f22570k.setShowTimeoutMs(z10 ? 0 : this.f22582w);
            this.f22570k.P();
        }
    }

    public final void F() {
        if (!N() || this.f22573n == null) {
            return;
        }
        if (!this.f22570k.I()) {
            x(true);
        } else if (this.f22585z) {
            this.f22570k.F();
        }
    }

    public final void G() {
        com.google.android.exoplayer2.v vVar = this.f22573n;
        t7.x videoSize = vVar != null ? vVar.getVideoSize() : t7.x.f85194f;
        int i10 = videoSize.f85196b;
        int i11 = videoSize.f85197c;
        int i12 = videoSize.f85198d;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f85199e) / i11;
        View view = this.f22564e;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.A != 0) {
                view.removeOnLayoutChangeListener(this.f22561b);
            }
            this.A = i12;
            if (i12 != 0) {
                this.f22564e.addOnLayoutChangeListener(this.f22561b);
            }
            o((TextureView) this.f22564e, this.A);
        }
        y(this.f22562c, this.f22565f ? 0.0f : f10);
    }

    public final void H() {
        int i10;
        if (this.f22568i != null) {
            com.google.android.exoplayer2.v vVar = this.f22573n;
            boolean z10 = true;
            if (vVar == null || vVar.getPlaybackState() != 2 || ((i10 = this.f22578s) != 2 && (i10 != 1 || !this.f22573n.getPlayWhenReady()))) {
                z10 = false;
            }
            this.f22568i.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void I() {
        PlayerControlView playerControlView = this.f22570k;
        if (playerControlView == null || !this.f22574o) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f22585z ? getResources().getString(R$string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R$string.exo_controls_show));
        }
    }

    public final void J() {
        if (w() && this.f22584y) {
            u();
        } else {
            x(false);
        }
    }

    public final void K() {
        s7.j<? super PlaybackException> jVar;
        TextView textView = this.f22569j;
        if (textView != null) {
            CharSequence charSequence = this.f22581v;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22569j.setVisibility(0);
                return;
            }
            com.google.android.exoplayer2.v vVar = this.f22573n;
            PlaybackException playerError = vVar != null ? vVar.getPlayerError() : null;
            if (playerError == null || (jVar = this.f22580u) == null) {
                this.f22569j.setVisibility(8);
            } else {
                this.f22569j.setText((CharSequence) jVar.getErrorMessage(playerError).second);
                this.f22569j.setVisibility(0);
            }
        }
    }

    public final void L(boolean z10) {
        com.google.android.exoplayer2.v vVar = this.f22573n;
        if (vVar == null || !vVar.isCommandAvailable(30) || vVar.getCurrentTracks().c()) {
            if (this.f22579t) {
                return;
            }
            t();
            p();
            return;
        }
        if (z10 && !this.f22579t) {
            p();
        }
        if (vVar.getCurrentTracks().d(2)) {
            t();
            return;
        }
        p();
        if (M() && (z(vVar.getMediaMetadata()) || A(this.f22577r))) {
            return;
        }
        t();
    }

    public final boolean M() {
        if (!this.f22576q) {
            return false;
        }
        s7.a.i(this.f22566g);
        return true;
    }

    public final boolean N() {
        if (!this.f22574o) {
            return false;
        }
        s7.a.i(this.f22570k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.google.android.exoplayer2.v vVar = this.f22573n;
        if (vVar != null && vVar.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zV = v(keyEvent.getKeyCode());
        if ((zV && N() && !this.f22570k.I()) || s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            x(true);
            return true;
        }
        if (!zV || !N()) {
            return false;
        }
        x(true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22572m;
        if (frameLayout != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f22570k;
        if (playerControlView != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(playerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) s7.a.j(this.f22571l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f22583x;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22585z;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22582w;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f22577r;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f22572m;
    }

    @Nullable
    public com.google.android.exoplayer2.v getPlayer() {
        return this.f22573n;
    }

    public int getResizeMode() {
        s7.a.i(this.f22562c);
        return this.f22562c.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f22567h;
    }

    public boolean getUseArtwork() {
        return this.f22576q;
    }

    public boolean getUseController() {
        return this.f22574o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f22564e;
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
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!N() || this.f22573n == null) {
            return false;
        }
        x(true);
        return true;
    }

    public final void p() {
        View view = this.f22563d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        F();
        return super.performClick();
    }

    public boolean s(KeyEvent keyEvent) {
        return N() && this.f22570k.A(keyEvent);
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.b bVar) {
        s7.a.i(this.f22562c);
        this.f22562c.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f22583x = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f22584y = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22585z = z10;
        I();
    }

    public void setControllerShowTimeoutMs(int i10) {
        s7.a.i(this.f22570k);
        this.f22582w = i10;
        if (this.f22570k.I()) {
            D();
        }
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.e eVar) {
        s7.a.i(this.f22570k);
        PlayerControlView.e eVar2 = this.f22575p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f22570k.J(eVar2);
        }
        this.f22575p = eVar;
        if (eVar != null) {
            this.f22570k.y(eVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        s7.a.g(this.f22569j != null);
        this.f22581v = charSequence;
        K();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f22577r != drawable) {
            this.f22577r = drawable;
            L(false);
        }
    }

    public void setErrorMessageProvider(@Nullable s7.j<? super PlaybackException> jVar) {
        if (this.f22580u != jVar) {
            this.f22580u = jVar;
            K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f22579t != z10) {
            this.f22579t = z10;
            L(false);
        }
    }

    public void setPlayer(@Nullable com.google.android.exoplayer2.v vVar) {
        s7.a.g(Looper.myLooper() == Looper.getMainLooper());
        s7.a.a(vVar == null || vVar.getApplicationLooper() == Looper.getMainLooper());
        com.google.android.exoplayer2.v vVar2 = this.f22573n;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            vVar2.c(this.f22561b);
            if (vVar2.isCommandAvailable(27)) {
                View view = this.f22564e;
                if (view instanceof TextureView) {
                    vVar2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    vVar2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f22567h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22573n = vVar;
        if (N()) {
            this.f22570k.setPlayer(vVar);
        }
        H();
        K();
        L(true);
        if (vVar == null) {
            u();
            return;
        }
        if (vVar.isCommandAvailable(27)) {
            View view2 = this.f22564e;
            if (view2 instanceof TextureView) {
                vVar.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                vVar.setVideoSurfaceView((SurfaceView) view2);
            }
            G();
        }
        if (this.f22567h != null && vVar.isCommandAvailable(28)) {
            this.f22567h.setCues(vVar.getCurrentCues().f62173b);
        }
        vVar.f(this.f22561b);
        x(false);
    }

    public void setRepeatToggleModes(int i10) {
        s7.a.i(this.f22570k);
        this.f22570k.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        s7.a.i(this.f22562c);
        this.f22562c.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f22578s != i10) {
            this.f22578s = i10;
            H();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        s7.a.i(this.f22570k);
        this.f22570k.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f22563d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        s7.a.g((z10 && this.f22566g == null) ? false : true);
        if (this.f22576q != z10) {
            this.f22576q = z10;
            L(false);
        }
    }

    public void setUseController(boolean z10) {
        s7.a.g((z10 && this.f22570k == null) ? false : true);
        setClickable(z10 || hasOnClickListeners());
        if (this.f22574o == z10) {
            return;
        }
        this.f22574o = z10;
        if (N()) {
            this.f22570k.setPlayer(this.f22573n);
        } else {
            PlayerControlView playerControlView = this.f22570k;
            if (playerControlView != null) {
                playerControlView.F();
                this.f22570k.setPlayer(null);
            }
        }
        I();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f22564e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public final void t() {
        ImageView imageView = this.f22566g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f22566g.setVisibility(4);
        }
    }

    public void u() {
        PlayerControlView playerControlView = this.f22570k;
        if (playerControlView != null) {
            playerControlView.F();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean v(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean w() {
        com.google.android.exoplayer2.v vVar = this.f22573n;
        return vVar != null && vVar.isPlayingAd() && this.f22573n.getPlayWhenReady();
    }

    public final void x(boolean z10) {
        if (!(w() && this.f22584y) && N()) {
            boolean z11 = this.f22570k.I() && this.f22570k.getShowTimeoutMs() <= 0;
            boolean zC = C();
            if (z10 || z11 || zC) {
                E(zC);
            }
        }
    }

    public void y(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public final boolean z(com.google.android.exoplayer2.q qVar) {
        byte[] bArr = qVar.f22135k;
        if (bArr == null) {
            return false;
        }
        return A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }
}
