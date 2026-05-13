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
import android.opengl.GLSurfaceView;
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
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StyledPlayerView extends FrameLayout {
    public boolean A;
    public boolean B;
    public int C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f22663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final View f22664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final View f22665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ImageView f22667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final SubtitleView f22668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final View f22669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TextView f22670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final StyledPlayerControlView f22671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final FrameLayout f22672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final FrameLayout f22673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.v f22674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b f22676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public StyledPlayerControlView.m f22677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public c f22678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Drawable f22680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22681u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22682v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public s7.j<? super PlaybackException> f22683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public CharSequence f22684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22686z;

    public final class a implements v.d, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.m, StyledPlayerControlView.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.b f22687b = new c0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f22688c;

        public a() {
        }

        @Override // com.google.android.exoplayer2.v.d
        public void E(com.google.android.exoplayer2.d0 d0Var) {
            com.google.android.exoplayer2.v vVar = (com.google.android.exoplayer2.v) s7.a.e(StyledPlayerView.this.f22674n);
            com.google.android.exoplayer2.c0 currentTimeline = vVar.getCurrentTimeline();
            if (currentTimeline.u()) {
                this.f22688c = null;
            } else if (vVar.getCurrentTracks().c()) {
                Object obj = this.f22688c;
                if (obj != null) {
                    int iF = currentTimeline.f(obj);
                    if (iF != -1) {
                        if (vVar.getCurrentMediaItemIndex() == currentTimeline.j(iF, this.f22687b).f21389d) {
                            return;
                        }
                    }
                    this.f22688c = null;
                }
            } else {
                this.f22688c = currentTimeline.k(vVar.getCurrentPeriodIndex(), this.f22687b, true).f21388c;
            }
            StyledPlayerView.this.P(false);
        }

        @Override // com.google.android.exoplayer2.v.d
        public void c(t7.x xVar) {
            StyledPlayerView.this.K();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void g(g7.f fVar) {
            if (StyledPlayerView.this.f22668h != null) {
                StyledPlayerView.this.f22668h.setCues(fVar.f62173b);
            }
        }

        @Override // com.google.android.exoplayer2.v.d
        public void k(v.e eVar, v.e eVar2, int i10) {
            if (StyledPlayerView.this.y() && StyledPlayerView.this.A) {
                StyledPlayerView.this.w();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.J();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.d
        public void onFullScreenModeChanged(boolean z10) {
            if (StyledPlayerView.this.f22678r != null) {
                StyledPlayerView.this.f22678r.onFullscreenButtonClick(z10);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.q((TextureView) view, StyledPlayerView.this.C);
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.N();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onPlaybackStateChanged(int i10) {
            StyledPlayerView.this.L();
            StyledPlayerView.this.O();
            StyledPlayerView.this.N();
        }

        @Override // com.google.android.exoplayer2.v.d
        public void onRenderedFirstFrame() {
            if (StyledPlayerView.this.f22664d != null) {
                StyledPlayerView.this.f22664d.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.m
        public void onVisibilityChange(int i10) {
            StyledPlayerView.this.M();
            if (StyledPlayerView.this.f22676p != null) {
                StyledPlayerView.this.f22676p.onVisibilityChanged(i10);
            }
        }
    }

    public interface b {
        void onVisibilityChanged(int i10);
    }

    public interface c {
        void onFullscreenButtonClick(boolean z10);
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
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
        this.f22662b = aVar;
        if (isInEditMode()) {
            this.f22663c = null;
            this.f22664d = null;
            this.f22665e = null;
            this.f22666f = false;
            this.f22667g = null;
            this.f22668h = null;
            this.f22669i = null;
            this.f22670j = null;
            this.f22671k = null;
            this.f22672l = null;
            this.f22673m = null;
            ImageView imageView = new ImageView(context);
            if (s7.m0.f79487a >= 23) {
                t(getResources(), imageView);
            } else {
                s(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R$layout.exo_styled_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.StyledPlayerView, i10, 0);
            try {
                int i18 = R$styleable.StyledPlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
                int color = typedArrayObtainStyledAttributes.getColor(i18, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StyledPlayerView_player_layout_id, i17);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StyledPlayerView_default_artwork, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_use_controller, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(R$styleable.StyledPlayerView_surface_type, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(R$styleable.StyledPlayerView_resize_mode, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(R$styleable.StyledPlayerView_show_timeout, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_hide_on_touch, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.StyledPlayerView_show_buffering, 0);
                this.f22682v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_keep_content_on_player_reset, this.f22682v);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerView_hide_during_ads, true);
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
        this.f22663c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            F(aspectRatioFrameLayout, i12);
        }
        View viewFindViewById = findViewById(R$id.exo_shutter);
        this.f22664d = viewFindViewById;
        if (viewFindViewById != null && z13) {
            viewFindViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            this.f22665e = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 == 2) {
                this.f22665e = new TextureView(context);
            } else if (i13 == 3) {
                try {
                    this.f22665e = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f22665e.setLayoutParams(layoutParams);
                    this.f22665e.setOnClickListener(aVar);
                    this.f22665e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f22665e, 0);
                    z16 = z17;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i13 != 4) {
                this.f22665e = new SurfaceView(context);
            } else {
                try {
                    this.f22665e = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.f22665e.setLayoutParams(layoutParams);
            this.f22665e.setOnClickListener(aVar);
            this.f22665e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f22665e, 0);
            z16 = z17;
        }
        this.f22666f = z16;
        this.f22672l = (FrameLayout) findViewById(R$id.exo_ad_overlay);
        this.f22673m = (FrameLayout) findViewById(R$id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R$id.exo_artwork);
        this.f22667g = imageView2;
        this.f22679s = z14 && imageView2 != null;
        if (i15 != 0) {
            this.f22680t = ContextCompat.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.exo_subtitles);
        this.f22668h = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(R$id.exo_buffering);
        this.f22669i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f22681u = integer;
        TextView textView = (TextView) findViewById(R$id.exo_error_message);
        this.f22670j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i22 = R$id.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i22);
        View viewFindViewById3 = findViewById(R$id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.f22671k = styledPlayerControlView;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f22671k = styledPlayerControlView2;
            styledPlayerControlView2.setId(i22);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f22671k = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f22671k;
        this.f22685y = styledPlayerControlView3 != null ? i11 : i16;
        this.B = z12;
        this.f22686z = z10;
        this.A = z11;
        this.f22675o = (!z15 || styledPlayerControlView3 == null) ? i16 : 1;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.c0();
            this.f22671k.S(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        M();
    }

    public static void F(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public static void q(TextureView textureView, int i10) {
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

    public static void s(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    public static void t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R$drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R$color.exo_edit_mode_background_color, null));
    }

    public void A(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void B() {
        View view = this.f22665e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void C() {
        View view = this.f22665e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public final boolean D(com.google.android.exoplayer2.q qVar) {
        byte[] bArr = qVar.f22135k;
        if (bArr == null) {
            return false;
        }
        return E(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public final boolean E(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                A(this.f22663c, intrinsicWidth / intrinsicHeight);
                this.f22667g.setImageDrawable(drawable);
                this.f22667g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        com.google.android.exoplayer2.v vVar = this.f22674n;
        if (vVar == null) {
            return true;
        }
        int playbackState = vVar.getPlaybackState();
        return this.f22686z && !this.f22674n.getCurrentTimeline().u() && (playbackState == 1 || playbackState == 4 || !((com.google.android.exoplayer2.v) s7.a.e(this.f22674n)).getPlayWhenReady());
    }

    public void H() {
        I(G());
    }

    public final void I(boolean z10) {
        if (R()) {
            this.f22671k.setShowTimeoutMs(z10 ? 0 : this.f22685y);
            this.f22671k.r0();
        }
    }

    public final void J() {
        if (!R() || this.f22674n == null) {
            return;
        }
        if (!this.f22671k.f0()) {
            z(true);
        } else if (this.B) {
            this.f22671k.b0();
        }
    }

    public final void K() {
        com.google.android.exoplayer2.v vVar = this.f22674n;
        t7.x videoSize = vVar != null ? vVar.getVideoSize() : t7.x.f85194f;
        int i10 = videoSize.f85196b;
        int i11 = videoSize.f85197c;
        int i12 = videoSize.f85198d;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f85199e) / i11;
        View view = this.f22665e;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.C != 0) {
                view.removeOnLayoutChangeListener(this.f22662b);
            }
            this.C = i12;
            if (i12 != 0) {
                this.f22665e.addOnLayoutChangeListener(this.f22662b);
            }
            q((TextureView) this.f22665e, this.C);
        }
        A(this.f22663c, this.f22666f ? 0.0f : f10);
    }

    public final void L() {
        int i10;
        if (this.f22669i != null) {
            com.google.android.exoplayer2.v vVar = this.f22674n;
            boolean z10 = true;
            if (vVar == null || vVar.getPlaybackState() != 2 || ((i10 = this.f22681u) != 2 && (i10 != 1 || !this.f22674n.getPlayWhenReady()))) {
                z10 = false;
            }
            this.f22669i.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void M() {
        StyledPlayerControlView styledPlayerControlView = this.f22671k;
        if (styledPlayerControlView == null || !this.f22675o) {
            setContentDescription(null);
        } else if (styledPlayerControlView.f0()) {
            setContentDescription(this.B ? getResources().getString(R$string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R$string.exo_controls_show));
        }
    }

    public final void N() {
        if (y() && this.A) {
            w();
        } else {
            z(false);
        }
    }

    public final void O() {
        s7.j<? super PlaybackException> jVar;
        TextView textView = this.f22670j;
        if (textView != null) {
            CharSequence charSequence = this.f22684x;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22670j.setVisibility(0);
                return;
            }
            com.google.android.exoplayer2.v vVar = this.f22674n;
            PlaybackException playerError = vVar != null ? vVar.getPlayerError() : null;
            if (playerError == null || (jVar = this.f22683w) == null) {
                this.f22670j.setVisibility(8);
            } else {
                this.f22670j.setText((CharSequence) jVar.getErrorMessage(playerError).second);
                this.f22670j.setVisibility(0);
            }
        }
    }

    public final void P(boolean z10) {
        com.google.android.exoplayer2.v vVar = this.f22674n;
        if (vVar == null || vVar.getCurrentTracks().c()) {
            if (this.f22682v) {
                return;
            }
            v();
            r();
            return;
        }
        if (z10 && !this.f22682v) {
            r();
        }
        if (vVar.getCurrentTracks().d(2)) {
            v();
            return;
        }
        r();
        if (Q() && (D(vVar.getMediaMetadata()) || E(this.f22680t))) {
            return;
        }
        v();
    }

    public final boolean Q() {
        if (!this.f22679s) {
            return false;
        }
        s7.a.i(this.f22667g);
        return true;
    }

    public final boolean R() {
        if (!this.f22675o) {
            return false;
        }
        s7.a.i(this.f22671k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.google.android.exoplayer2.v vVar = this.f22674n;
        if (vVar != null && vVar.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX = x(keyEvent.getKeyCode());
        if ((zX && R() && !this.f22671k.f0()) || u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            z(true);
            return true;
        }
        if (!zX || !R()) {
            return false;
        }
        z(true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22673m;
        if (frameLayout != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.f22671k;
        if (styledPlayerControlView != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(styledPlayerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) s7.a.j(this.f22672l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f22686z;
    }

    public boolean getControllerHideOnTouch() {
        return this.B;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22685y;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f22680t;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f22673m;
    }

    @Nullable
    public com.google.android.exoplayer2.v getPlayer() {
        return this.f22674n;
    }

    public int getResizeMode() {
        s7.a.i(this.f22663c);
        return this.f22663c.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f22668h;
    }

    public boolean getUseArtwork() {
        return this.f22679s;
    }

    public boolean getUseController() {
        return this.f22675o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f22665e;
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
        if (!R() || this.f22674n == null) {
            return false;
        }
        z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        J();
        return super.performClick();
    }

    public final void r() {
        View view = this.f22664d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.b bVar) {
        s7.a.i(this.f22663c);
        this.f22663c.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f22686z = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.A = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        s7.a.i(this.f22671k);
        this.B = z10;
        M();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.d dVar) {
        s7.a.i(this.f22671k);
        this.f22678r = null;
        this.f22671k.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        s7.a.i(this.f22671k);
        this.f22685y = i10;
        if (this.f22671k.f0()) {
            H();
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.m mVar) {
        s7.a.i(this.f22671k);
        StyledPlayerControlView.m mVar2 = this.f22677q;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f22671k.m0(mVar2);
        }
        this.f22677q = mVar;
        if (mVar != null) {
            this.f22671k.S(mVar);
        }
        setControllerVisibilityListener((b) null);
    }

    public void setControllerVisibilityListener(@Nullable b bVar) {
        this.f22676p = bVar;
        setControllerVisibilityListener((StyledPlayerControlView.m) null);
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        s7.a.g(this.f22670j != null);
        this.f22684x = charSequence;
        O();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f22680t != drawable) {
            this.f22680t = drawable;
            P(false);
        }
    }

    public void setErrorMessageProvider(@Nullable s7.j<? super PlaybackException> jVar) {
        if (this.f22683w != jVar) {
            this.f22683w = jVar;
            O();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable c cVar) {
        s7.a.i(this.f22671k);
        this.f22678r = cVar;
        this.f22671k.setOnFullScreenModeChangedListener(this.f22662b);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f22682v != z10) {
            this.f22682v = z10;
            P(false);
        }
    }

    public void setPlayer(@Nullable com.google.android.exoplayer2.v vVar) {
        s7.a.g(Looper.myLooper() == Looper.getMainLooper());
        s7.a.a(vVar == null || vVar.getApplicationLooper() == Looper.getMainLooper());
        com.google.android.exoplayer2.v vVar2 = this.f22674n;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            vVar2.c(this.f22662b);
            View view = this.f22665e;
            if (view instanceof TextureView) {
                vVar2.clearVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                vVar2.clearVideoSurfaceView((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f22668h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22674n = vVar;
        if (R()) {
            this.f22671k.setPlayer(vVar);
        }
        L();
        O();
        P(true);
        if (vVar == null) {
            w();
            return;
        }
        if (vVar.isCommandAvailable(27)) {
            View view2 = this.f22665e;
            if (view2 instanceof TextureView) {
                vVar.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                vVar.setVideoSurfaceView((SurfaceView) view2);
            }
            K();
        }
        if (this.f22668h != null && vVar.isCommandAvailable(28)) {
            this.f22668h.setCues(vVar.getCurrentCues().f62173b);
        }
        vVar.f(this.f22662b);
        z(false);
    }

    public void setRepeatToggleModes(int i10) {
        s7.a.i(this.f22671k);
        this.f22671k.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        s7.a.i(this.f22663c);
        this.f22663c.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f22681u != i10) {
            this.f22681u = i10;
            L();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        s7.a.i(this.f22671k);
        this.f22671k.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(@ColorInt int i10) {
        View view = this.f22664d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        s7.a.g((z10 && this.f22667g == null) ? false : true);
        if (this.f22679s != z10) {
            this.f22679s = z10;
            P(false);
        }
    }

    public void setUseController(boolean z10) {
        s7.a.g((z10 && this.f22671k == null) ? false : true);
        setClickable(z10 || hasOnClickListeners());
        if (this.f22675o == z10) {
            return;
        }
        this.f22675o = z10;
        if (R()) {
            this.f22671k.setPlayer(this.f22674n);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.f22671k;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.b0();
                this.f22671k.setPlayer(null);
            }
        }
        M();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f22665e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        return R() && this.f22671k.U(keyEvent);
    }

    public final void v() {
        ImageView imageView = this.f22667g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f22667g.setVisibility(4);
        }
    }

    public void w() {
        StyledPlayerControlView styledPlayerControlView = this.f22671k;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.b0();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean x(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean y() {
        com.google.android.exoplayer2.v vVar = this.f22674n;
        return vVar != null && vVar.isPlayingAd() && this.f22674n.getPlayWhenReady();
    }

    public final void z(boolean z10) {
        if (!(y() && this.A) && R()) {
            boolean z11 = this.f22671k.f0() && this.f22671k.getShowTimeoutMs() <= 0;
            boolean zG = G();
            if (z10 || z11 || zG) {
                I(zG);
            }
        }
    }
}
