package com.google.android.exoplayer.ui;

import a6.k0;
import a6.x;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewPropertyAnimatorListener;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$string;
import chuangyuan.ycj.videolibrary.R$styleable;
import com.google.android.exoplayer.ui.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import e4.e0;
import e4.g;
import e4.k;
import e4.m0;
import e4.n0;
import e4.v0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import v.a;

/* JADX INFO: loaded from: classes5.dex */
public class PlayerControlView extends FrameLayout {
    public final String A;
    public final String B;
    public final String C;

    @DrawableRes
    public int D;
    public final AppCompatCheckBox E;
    public final TextView F;
    public final TextView G;
    public final View H;
    public final View I;
    public View J;
    public View K;
    public View L;
    public a.InterfaceC1074a M;
    public x5.b N;
    public final CopyOnWriteArraySet<a.b> O;
    public n0 P;
    public e4.f Q;
    public f R;

    @Nullable
    public m0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f20913a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20914b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f20915b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f20916c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f20917c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f20918d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f20919d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f20920e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f20921e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f20922f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f20923f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f20924g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long[] f20925g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f20926h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean[] f20927h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f20928i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long[] f20929i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f20930j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean[] f20931j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f20932k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Runnable f20933k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f20934l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Runnable f20935l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f20936m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public d f20937m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f20938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f20939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f20940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f20941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.exoplayer.ui.a f20942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.exoplayer.ui.a f20943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StringBuilder f20944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Formatter f20945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v0.b f20946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0.c f20947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f20948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Drawable f20949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Drawable f20950z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerControlView.this.Z();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerControlView.this.T();
        }
    }

    public class c implements ViewPropertyAnimatorListener {
        public c() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (view != null) {
                PlayerControlView.this.E();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
        }
    }

    public interface d {
        void a(int i10);
    }

    public final class e extends n0.a implements a.InterfaceC0295a, View.OnClickListener {
        public e() {
        }

        public /* synthetic */ e(PlayerControlView playerControlView, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer.ui.a.InterfaceC0295a
        public void c(com.google.android.exoplayer.ui.a aVar, long j10) {
            if (PlayerControlView.this.f20940p != null) {
                PlayerControlView.this.f20940p.setText(k0.V(PlayerControlView.this.f20944t, PlayerControlView.this.f20945u, j10));
            }
            if (PlayerControlView.this.f20941q != null) {
                PlayerControlView.this.f20941q.setText(k0.V(PlayerControlView.this.f20944t, PlayerControlView.this.f20945u, j10));
            }
        }

        @Override // com.google.android.exoplayer.ui.a.InterfaceC0295a
        public void d(com.google.android.exoplayer.ui.a aVar, long j10) {
            if (PlayerControlView.this.N != null) {
                PlayerControlView.this.N.a(j10);
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.removeCallbacks(playerControlView.f20935l0);
            PlayerControlView.this.W = true;
        }

        @Override // com.google.android.exoplayer.ui.a.InterfaceC0295a
        public void f(com.google.android.exoplayer.ui.a aVar, long j10, boolean z10) {
            PlayerControlView.this.W = false;
            if (!z10 && PlayerControlView.this.P != null && aVar.b()) {
                PlayerControlView.this.Q(j10);
            }
            PlayerControlView.this.F();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.P != null) {
                if (playerControlView.f20918d == view) {
                    PlayerControlView.this.P.next();
                } else if (PlayerControlView.this.f20916c == view) {
                    PlayerControlView.this.P.previous();
                } else if (PlayerControlView.this.f20930j == view) {
                    PlayerControlView.this.C();
                } else if (PlayerControlView.this.f20932k == view) {
                    PlayerControlView.this.N();
                } else {
                    PlayerControlView playerControlView2 = PlayerControlView.this;
                    if (playerControlView2.f20922f == view) {
                        if (playerControlView2.P.getPlaybackState() == 1) {
                            if (PlayerControlView.this.S != null) {
                                PlayerControlView.this.S.preparePlayback();
                            }
                        } else if (PlayerControlView.this.P.getPlaybackState() == 4) {
                            PlayerControlView playerControlView3 = PlayerControlView.this;
                            e4.f fVar = playerControlView3.Q;
                            n0 n0Var = playerControlView3.P;
                            fVar.d(n0Var, n0Var.getCurrentWindowIndex(), -9223372036854775807L);
                        }
                        PlayerControlView playerControlView4 = PlayerControlView.this;
                        playerControlView4.Q.a(playerControlView4.P, true);
                        PlayerControlView.this.z(2);
                    } else if (playerControlView2.f20924g == view) {
                        if (playerControlView2.P.getPlaybackState() == 1) {
                            if (PlayerControlView.this.S != null) {
                                PlayerControlView.this.S.preparePlayback();
                            }
                        } else if (PlayerControlView.this.P.getPlaybackState() == 4) {
                            PlayerControlView playerControlView5 = PlayerControlView.this;
                            e4.f fVar2 = playerControlView5.Q;
                            n0 n0Var2 = playerControlView5.P;
                            fVar2.d(n0Var2, n0Var2.getCurrentWindowIndex(), -9223372036854775807L);
                        }
                        PlayerControlView playerControlView6 = PlayerControlView.this;
                        playerControlView6.Q.a(playerControlView6.P, true);
                        PlayerControlView.this.z(2);
                    } else if (playerControlView2.f20926h == view) {
                        PlayerControlView playerControlView7 = PlayerControlView.this;
                        playerControlView7.Q.a(playerControlView7.P, false);
                        PlayerControlView.this.z(1);
                    } else if (PlayerControlView.this.f20928i == view) {
                        PlayerControlView playerControlView8 = PlayerControlView.this;
                        playerControlView8.Q.a(playerControlView8.P, false);
                        PlayerControlView.this.z(1);
                    } else if (PlayerControlView.this.f20934l == view) {
                        PlayerControlView playerControlView9 = PlayerControlView.this;
                        e4.f fVar3 = playerControlView9.Q;
                        n0 n0Var3 = playerControlView9.P;
                        fVar3.c(n0Var3, x.a(n0Var3.getRepeatMode(), PlayerControlView.this.f20919d0));
                    } else if (PlayerControlView.this.f20936m == view) {
                        PlayerControlView playerControlView10 = PlayerControlView.this;
                        playerControlView10.Q.b(playerControlView10.P, !r8.getShuffleModeEnabled());
                    }
                }
            }
            PlayerControlView.this.F();
        }

        @Override // e4.n0.b
        public void onPlayerStateChanged(boolean z10, int i10) {
            Activity activityN = v.e.n(PlayerControlView.this.getContext());
            if (activityN == null) {
                return;
            }
            if (z10) {
                activityN.getWindow().addFlags(128);
            } else {
                activityN.getWindow().clearFlags(128);
            }
            PlayerControlView.this.Y();
            PlayerControlView.this.Z();
        }

        @Override // e4.n0.b
        public void onPositionDiscontinuity(int i10) {
            PlayerControlView.this.X();
            PlayerControlView.this.Z();
        }

        @Override // e4.n0.b
        public void onRepeatModeChanged(int i10) {
            PlayerControlView.this.a0();
            PlayerControlView.this.X();
        }

        @Override // e4.n0.b
        public void onShuffleModeEnabledChanged(boolean z10) {
            PlayerControlView.this.b0();
            PlayerControlView.this.X();
        }

        @Override // e4.n0.a, e4.n0.b
        public void w(v0 v0Var, Object obj, int i10) {
            PlayerControlView.this.X();
            PlayerControlView.this.c0();
            PlayerControlView.this.Z();
        }
    }

    public interface f {
        void onVisibilityChange(int i10);
    }

    static {
        e0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        this.f20920e = Boolean.FALSE;
        this.D = R$drawable.ic_fullscreen_selector;
        this.f20933k0 = new a();
        this.f20935l0 = new b();
        this.O = new CopyOnWriteArraySet<>();
        int resourceId = R$layout.exo_player_control_view;
        this.f20913a0 = 5000;
        this.f20915b0 = 5000;
        this.f20917c0 = 5000;
        this.f20919d0 = 0;
        this.f20923f0 = -9223372036854775807L;
        this.f20921e0 = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.PlayerControlView, 0, 0);
            try {
                this.f20913a0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_rewind_increment_cine, this.f20913a0);
                this.f20915b0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_fastforward_increment_cine, this.f20915b0);
                this.f20917c0 = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_show_timeout_cine, this.f20917c0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerControlView_controller_layout_id_cine, resourceId);
                this.f20919d0 = D(typedArrayObtainStyledAttributes, this.f20919d0);
                this.f20921e0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_shuffle_button_cine, this.f20921e0);
                this.D = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerControlView_player_fullscreen_image_selector, this.D);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f20946v = new v0.b();
        this.f20947w = new v0.c();
        StringBuilder sb2 = new StringBuilder();
        this.f20944t = sb2;
        this.f20945u = new Formatter(sb2, Locale.getDefault());
        this.f20925g0 = new long[0];
        this.f20927h0 = new boolean[0];
        this.f20929i0 = new long[0];
        this.f20931j0 = new boolean[0];
        e eVar = new e(this, null);
        this.f20914b = eVar;
        this.Q = new g();
        LayoutInflater.from(context).inflate(resourceId, this).setVisibility(8);
        setDescendantFocusability(262144);
        this.f20938n = (TextView) findViewById(R$id.exo_duration);
        this.f20939o = (TextView) findViewById(R$id.exo_duration1);
        this.f20940p = (TextView) findViewById(R$id.exo_position);
        this.f20941q = (TextView) findViewById(R$id.exo_position1);
        com.google.android.exoplayer.ui.a aVar = (com.google.android.exoplayer.ui.a) findViewById(R$id.exo_progress);
        this.f20942r = aVar;
        com.google.android.exoplayer.ui.a aVar2 = (com.google.android.exoplayer.ui.a) findViewById(R$id.exo_progress1);
        this.f20943s = aVar2;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R$id.exo_video_fullscreen);
        this.E = appCompatCheckBox;
        this.F = (TextView) findViewById(R$id.exo_video_switch);
        TextView textView = (TextView) findViewById(R$id.exo_controls_title);
        this.G = textView;
        this.H = findViewById(R$id.exo_controller_bottom);
        this.I = findViewById(R$id.exo_controller_bottom1);
        this.J = findViewById(R$id.exo_controller_top);
        this.K = findViewById(R$id.exo_controller_center_view);
        this.L = findViewById(R$id.exo_controller_top_status);
        if (this.J == null) {
            this.J = textView;
        }
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setButtonDrawable(this.D);
            if (v.e.m(getContext())) {
                appCompatCheckBox.setVisibility(8);
            }
        }
        if (aVar != null) {
            aVar.a(eVar);
        }
        if (aVar2 != null) {
            aVar2.a(eVar);
        }
        View viewFindViewById = findViewById(R$id.exo_play);
        this.f20922f = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.exo_play1);
        this.f20924g = viewFindViewById2;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(eVar);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(eVar);
        }
        View viewFindViewById3 = findViewById(R$id.exo_pause);
        this.f20926h = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.exo_pause1);
        this.f20928i = viewFindViewById4;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(eVar);
        }
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(eVar);
        }
        View viewFindViewById5 = findViewById(R$id.exo_prev);
        this.f20916c = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(eVar);
        }
        View viewFindViewById6 = findViewById(R$id.exo_next);
        this.f20918d = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(eVar);
        }
        View viewFindViewById7 = findViewById(R$id.exo_rew);
        this.f20932k = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(eVar);
        }
        View viewFindViewById8 = findViewById(R$id.exo_ffwd);
        this.f20930j = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(eVar);
        }
        ImageView imageView = (ImageView) findViewById(R$id.exo_repeat_toggle);
        this.f20934l = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(eVar);
        }
        View viewFindViewById9 = findViewById(R$id.exo_shuffle);
        this.f20936m = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(eVar);
        }
        Resources resources = context.getResources();
        this.f20948x = resources.getDrawable(R$drawable.exo_controls_repeat_off);
        this.f20949y = resources.getDrawable(R$drawable.exo_controls_repeat_one);
        this.f20950z = resources.getDrawable(R$drawable.exo_controls_repeat_all);
        this.A = resources.getString(R$string.exo_controls_repeat_off_description);
        this.B = resources.getString(R$string.exo_controls_repeat_one_description);
        this.C = resources.getString(R$string.exo_controls_repeat_all_description);
    }

    public static boolean A(v0 v0Var, v0.c cVar) {
        if (v0Var.p() > 100) {
            return false;
        }
        int iP = v0Var.p();
        for (int i10 = 0; i10 < iP; i10++) {
            if (v0Var.n(i10, cVar).f60322l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int D(TypedArray typedArray, int i10) {
        return typedArray.getInt(R$styleable.PlayerControlView_repeat_toggle_modes_cine, i10);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    public boolean B(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.P == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                C();
            } else if (keyCode == 89) {
                N();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    this.Q.a(this.P, !r0.getPlayWhenReady());
                } else if (keyCode == 87) {
                    n0 n0Var = this.P;
                    if (n0Var != null) {
                        n0Var.next();
                    }
                } else if (keyCode == 88) {
                    n0 n0Var2 = this.P;
                    if (n0Var2 != null) {
                        n0Var2.previous();
                    }
                } else if (keyCode == 126) {
                    this.Q.a(this.P, true);
                } else if (keyCode == 127) {
                    this.Q.a(this.P, false);
                }
            }
        }
        return true;
    }

    public final void C() {
        if (this.f20915b0 <= 0) {
            return;
        }
        long duration = this.P.getDuration();
        long currentPosition = this.P.getCurrentPosition() + ((long) this.f20915b0);
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        P(currentPosition);
    }

    public void E() {
        if (J()) {
            setVisibility(8);
            f fVar = this.R;
            if (fVar != null) {
                fVar.onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f20935l0);
            this.f20923f0 = -9223372036854775807L;
        }
    }

    public final void F() {
        removeCallbacks(this.f20935l0);
        if (this.f20917c0 <= 0) {
            this.f20923f0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.f20917c0;
        this.f20923f0 = jUptimeMillis + ((long) i10);
        if (this.T) {
            postDelayed(this.f20935l0, i10);
        }
    }

    public void G() {
        if (J()) {
            setVisibility(8);
            removeCallbacks(this.f20933k0);
            removeCallbacks(this.f20935l0);
            this.f20923f0 = -9223372036854775807L;
        }
    }

    public boolean I() {
        n0 n0Var = this.P;
        return (n0Var == null || n0Var.getPlaybackState() == 4 || this.P.getPlaybackState() == 1 || !this.P.getPlayWhenReady()) ? false : true;
    }

    public boolean J() {
        return getVisibility() == 0;
    }

    public void K() {
        View view = this.J;
        if (view != null && view.animate() != null) {
            this.J.animate().cancel();
        }
        View view2 = this.L;
        if (view2 != null && view2.animate() != null) {
            this.L.animate().cancel();
        }
        View view3 = this.H;
        if (view3 != null && view3.animate() != null) {
            this.H.animate().cancel();
        }
        View view4 = this.I;
        if (view4 != null && view4.animate() != null) {
            this.I.animate().cancel();
        }
        View view5 = this.K;
        if (view5 == null || view5.animate() == null) {
            return;
        }
        this.K.animate().cancel();
    }

    public void L(@NonNull a.b bVar) {
        this.O.remove(bVar);
    }

    public void M() {
        View view;
        View view2;
        View view3;
        View view4;
        boolean zI = I();
        if (!zI && (view4 = this.f20922f) != null) {
            view4.requestFocus();
            return;
        }
        if (!zI && (view3 = this.f20924g) != null) {
            view3.requestFocus();
            return;
        }
        if (zI && (view2 = this.f20926h) != null) {
            view2.requestFocus();
        } else {
            if (!zI || (view = this.f20928i) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public void N() {
        if (this.f20913a0 <= 0) {
            return;
        }
        P(Math.max(this.P.getCurrentPosition() - ((long) this.f20913a0), 0L));
    }

    public final void O(int i10, long j10) {
        if (this.Q.d(this.P, i10, j10)) {
            return;
        }
        Z();
    }

    public final void P(long j10) {
        O(this.P.getCurrentWindowIndex(), j10);
    }

    public final void Q(long j10) {
        int currentWindowIndex;
        v0 currentTimeline = this.P.getCurrentTimeline();
        if (this.V && !currentTimeline.q()) {
            int iP = currentTimeline.p();
            currentWindowIndex = 0;
            while (true) {
                long jC = currentTimeline.n(currentWindowIndex, this.f20947w).c();
                if (j10 < jC) {
                    break;
                }
                if (currentWindowIndex == iP - 1) {
                    j10 = jC;
                    break;
                } else {
                    j10 -= jC;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = this.P.getCurrentWindowIndex();
        }
        O(currentWindowIndex, j10);
    }

    public final void R(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? 1.0f : 0.3f);
        view.setVisibility(0);
    }

    public void S() {
        if (this.G == null || this.H == null) {
            return;
        }
        a.InterfaceC1074a interfaceC1074a = this.M;
        if (interfaceC1074a != null) {
            interfaceC1074a.a(true);
        }
        z(3);
        v.a.a(this.J).setListener(null).start();
        v.a.a(this.H).start();
        if (this.f20920e.booleanValue()) {
            v.a.b(this.K).start();
        }
        View view = this.L;
        if (view != null) {
            v.a.a(view).start();
        }
        View view2 = this.I;
        if (view2 != null) {
            v.a.a(view2).setListener(null).start();
        }
    }

    public void T() {
        if (this.G == null || this.H == null) {
            E();
            return;
        }
        a.InterfaceC1074a interfaceC1074a = this.M;
        if (interfaceC1074a != null) {
            interfaceC1074a.a(false);
        }
        v.a.d(this.H, true).start();
        View view = this.K;
        if (view != null) {
            v.a.e(view).start();
        }
        View view2 = this.I;
        if (view2 != null) {
            v.a.d(view2, true).start();
        }
        View view3 = this.L;
        if (view3 != null) {
            v.a.d(view3, false).start();
        }
        z(3);
        v.a.d(this.J, false).setListener(new c()).start();
    }

    public void U() {
        if (!J()) {
            setVisibility(0);
            f fVar = this.R;
            if (fVar != null) {
                fVar.onVisibilityChange(getVisibility());
            }
            W();
            M();
        }
        F();
    }

    public void V() {
        W();
        M();
        this.Q.a(this.P, false);
        removeCallbacks(this.f20933k0);
        removeCallbacks(this.f20935l0);
        this.G.setAlpha(1.0f);
        this.G.setTranslationY(0.0f);
        if (J()) {
            return;
        }
        setVisibility(0);
    }

    public void W() {
        Y();
        X();
        a0();
        b0();
        Z();
    }

    public final void X() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (J() && this.T) {
            n0 n0Var = this.P;
            v0 currentTimeline = n0Var != null ? n0Var.getCurrentTimeline() : null;
            if (!((currentTimeline == null || currentTimeline.q()) ? false : true) || this.P.isPlayingAd()) {
                z10 = false;
                z11 = false;
                z12 = false;
            } else {
                currentTimeline.n(this.P.getCurrentWindowIndex(), this.f20947w);
                v0.c cVar = this.f20947w;
                z11 = cVar.f60316f;
                z10 = (!z11 && cVar.f60317g && this.P.getPreviousWindowIndex() == -1) ? false : true;
                z12 = this.f20947w.f60317g || this.P.getNextWindowIndex() != -1;
            }
            R(z10, this.f20916c);
            R(z12, this.f20918d);
            R(this.f20915b0 > 0 && z11, this.f20930j);
            R(this.f20913a0 > 0 && z11, this.f20932k);
            com.google.android.exoplayer.ui.a aVar = this.f20942r;
            if (aVar != null) {
                aVar.setEnabled(z11);
            }
            com.google.android.exoplayer.ui.a aVar2 = this.f20943s;
            if (aVar2 != null) {
                aVar2.setEnabled(z11);
            }
        }
    }

    public void Y() {
        boolean z10;
        if (J() && this.T) {
            boolean zI = I();
            View view = this.f20922f;
            if (view != null) {
                z10 = (zI && view.isFocused()) | false;
                this.f20922f.setVisibility(zI ? 8 : 0);
            } else {
                z10 = false;
            }
            View view2 = this.f20924g;
            if (view2 != null) {
                z10 |= zI && view2.isFocused();
                this.f20924g.setVisibility(zI ? 8 : 0);
            }
            View view3 = this.f20926h;
            if (view3 != null) {
                z10 |= !zI && view3.isFocused();
                this.f20926h.setVisibility(!zI ? 8 : 0);
            }
            View view4 = this.f20928i;
            if (view4 != null) {
                z10 |= !zI && view4.isFocused();
                this.f20928i.setVisibility(zI ? 0 : 8);
            }
            if (z10) {
                M();
            }
        }
    }

    public final void Z() {
        long j10;
        long bufferedPosition;
        long j11;
        int i10;
        long contentPosition;
        v0.c cVar;
        int i11;
        if (this.T) {
            n0 n0Var = this.P;
            long j12 = 0;
            boolean z10 = true;
            if (n0Var != null) {
                v0 currentTimeline = n0Var.getCurrentTimeline();
                if (currentTimeline.q()) {
                    j11 = 0;
                    i10 = 0;
                } else {
                    int currentWindowIndex = this.P.getCurrentWindowIndex();
                    boolean z11 = this.V;
                    int i12 = z11 ? 0 : currentWindowIndex;
                    int iP = z11 ? currentTimeline.p() - 1 : currentWindowIndex;
                    long j13 = 0;
                    j11 = 0;
                    i10 = 0;
                    while (true) {
                        if (i12 > iP) {
                            break;
                        }
                        if (i12 == currentWindowIndex) {
                            j11 = j13;
                        }
                        currentTimeline.n(i12, this.f20947w);
                        v0.c cVar2 = this.f20947w;
                        int i13 = iP;
                        if (cVar2.f60322l == -9223372036854775807L) {
                            a6.a.f(this.V ^ z10);
                            break;
                        }
                        int i14 = cVar2.f60319i;
                        while (true) {
                            cVar = this.f20947w;
                            if (i14 <= cVar.f60320j) {
                                currentTimeline.f(i14, this.f20946v);
                                int iC = this.f20946v.c();
                                int i15 = 0;
                                while (i15 < iC) {
                                    long jF = this.f20946v.f(i15);
                                    if (jF == Long.MIN_VALUE) {
                                        i11 = currentWindowIndex;
                                        long j14 = this.f20946v.f60307d;
                                        if (j14 == -9223372036854775807L) {
                                            i15++;
                                            currentWindowIndex = i11;
                                        } else {
                                            jF = j14;
                                        }
                                    } else {
                                        i11 = currentWindowIndex;
                                    }
                                    long jM = jF + this.f20946v.m();
                                    if (jM >= 0 && jM <= this.f20947w.f60322l) {
                                        long[] jArr = this.f20925g0;
                                        if (i10 == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.f20925g0 = Arrays.copyOf(jArr, length);
                                            this.f20927h0 = Arrays.copyOf(this.f20927h0, length);
                                        }
                                        this.f20925g0[i10] = k.b(j13 + jM);
                                        this.f20927h0[i10] = this.f20946v.n(i15);
                                        i10++;
                                    }
                                    i15++;
                                    currentWindowIndex = i11;
                                }
                                i14++;
                            }
                        }
                        j13 += cVar.f60322l;
                        i12++;
                        iP = i13;
                        currentWindowIndex = currentWindowIndex;
                        z10 = true;
                    }
                    j12 = j13;
                }
                long jB = k.b(j12);
                long jB2 = k.b(j11);
                if (this.P.isPlayingAd()) {
                    contentPosition = jB2 + this.P.getContentPosition();
                    bufferedPosition = contentPosition;
                } else {
                    long currentPosition = this.P.getCurrentPosition() + jB2;
                    bufferedPosition = jB2 + this.P.getBufferedPosition();
                    contentPosition = currentPosition;
                }
                Iterator<a.b> it = this.O.iterator();
                while (it.hasNext()) {
                    it.next().b(contentPosition, bufferedPosition, jB);
                }
                if (this.f20942r != null) {
                    int length2 = this.f20929i0.length;
                    int i16 = i10 + length2;
                    long[] jArr2 = this.f20925g0;
                    if (i16 > jArr2.length) {
                        this.f20925g0 = Arrays.copyOf(jArr2, i16);
                        this.f20927h0 = Arrays.copyOf(this.f20927h0, i16);
                    }
                    System.arraycopy(this.f20929i0, 0, this.f20925g0, i10, length2);
                    System.arraycopy(this.f20931j0, 0, this.f20927h0, i10, length2);
                    this.f20942r.setAdGroupTimesMs(this.f20925g0, this.f20927h0, i16);
                    com.google.android.exoplayer.ui.a aVar = this.f20943s;
                    if (aVar != null) {
                        aVar.setAdGroupTimesMs(this.f20925g0, this.f20927h0, i16);
                    }
                }
                j10 = jB;
                j12 = contentPosition;
            } else {
                j10 = 0;
                bufferedPosition = 0;
            }
            x5.b bVar = this.N;
            if (bVar != null) {
                bVar.a(j12);
            }
            TextView textView = this.f20938n;
            if (textView != null) {
                textView.setText(k0.V(this.f20944t, this.f20945u, j10));
            }
            TextView textView2 = this.f20939o;
            if (textView2 != null) {
                textView2.setText(k0.V(this.f20944t, this.f20945u, j10));
            }
            TextView textView3 = this.f20940p;
            if (textView3 != null && !this.W) {
                textView3.setText(k0.V(this.f20944t, this.f20945u, j12));
            }
            TextView textView4 = this.f20941q;
            if (textView4 != null && !this.W) {
                textView4.setText(k0.V(this.f20944t, this.f20945u, j12));
            }
            com.google.android.exoplayer.ui.a aVar2 = this.f20942r;
            if (aVar2 != null) {
                aVar2.setPosition(j12);
                this.f20942r.setBufferedPosition(bufferedPosition);
                this.f20942r.setDuration(j10);
            }
            com.google.android.exoplayer.ui.a aVar3 = this.f20943s;
            if (aVar3 != null) {
                aVar3.setPosition(j12);
                this.f20943s.setBufferedPosition(bufferedPosition);
                this.f20943s.setDuration(j10);
            }
            removeCallbacks(this.f20933k0);
            n0 n0Var2 = this.P;
            int playbackState = n0Var2 == null ? 1 : n0Var2.getPlaybackState();
            if (playbackState == 1 || playbackState == 4) {
                return;
            }
            postDelayed(this.f20933k0, 1000L);
        }
    }

    public final void a0() {
        ImageView imageView;
        if (J() && this.T && (imageView = this.f20934l) != null) {
            if (this.f20919d0 == 0) {
                imageView.setVisibility(8);
                return;
            }
            if (this.P == null) {
                R(false, imageView);
                return;
            }
            R(true, imageView);
            int repeatMode = this.P.getRepeatMode();
            if (repeatMode == 0) {
                this.f20934l.setImageDrawable(this.f20948x);
                this.f20934l.setContentDescription(this.A);
            } else if (repeatMode == 1) {
                this.f20934l.setImageDrawable(this.f20949y);
                this.f20934l.setContentDescription(this.B);
            } else if (repeatMode == 2) {
                this.f20934l.setImageDrawable(this.f20950z);
                this.f20934l.setContentDescription(this.C);
            }
            this.f20934l.setVisibility(0);
        }
    }

    public final void b0() {
        View view;
        if (J() && this.T && (view = this.f20936m) != null) {
            if (!this.f20921e0) {
                view.setVisibility(8);
                return;
            }
            n0 n0Var = this.P;
            if (n0Var == null) {
                R(false, view);
                return;
            }
            view.setAlpha(n0Var.getShuffleModeEnabled() ? 1.0f : 0.3f);
            this.f20936m.setEnabled(true);
            this.f20936m.setVisibility(0);
        }
    }

    public final void c0() {
        n0 n0Var = this.P;
        if (n0Var == null) {
            return;
        }
        this.V = this.U && A(n0Var.getCurrentTimeline(), this.f20947w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return B(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getExoControllerTop() {
        return this.J;
    }

    public AppCompatCheckBox getExoFullscreen() {
        return this.E;
    }

    public View getExo_controller_top_status() {
        return this.L;
    }

    public int getIcFullscreenSelector() {
        return this.D;
    }

    public View getPlayButton() {
        return this.f20922f;
    }

    public View getPlayButton1() {
        return this.f20924g;
    }

    public boolean getShowShuffleButton() {
        return this.f20921e0;
    }

    public int getShowTimeoutMs() {
        return this.f20917c0;
    }

    public TextView getSwitchText() {
        return this.F;
    }

    public com.google.android.exoplayer.ui.a getTimeBar() {
        return this.f20942r;
    }

    public com.google.android.exoplayer.ui.a getTimeBar1() {
        return this.f20943s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        long j10 = this.f20923f0;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                E();
            } else {
                postDelayed(this.f20935l0, jUptimeMillis);
            }
        } else if (J()) {
            F();
        }
        W();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        removeCallbacks(this.f20933k0);
        removeCallbacks(this.f20935l0);
        K();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimatorListener(a.InterfaceC1074a interfaceC1074a) {
        this.M = interfaceC1074a;
    }

    public void setCallBack(d dVar) {
        this.f20937m0 = dVar;
    }

    public void setControlDispatcher(@Nullable e4.f fVar) {
        if (fVar == null) {
            fVar = new g();
        }
        this.Q = fVar;
    }

    public void setFastForwardIncrementMs(int i10) {
        this.f20915b0 = i10;
        X();
    }

    public void setFull(boolean z10) {
        this.f20920e = Boolean.valueOf(z10);
    }

    public void setFullscreenStyle(@DrawableRes int i10) {
        this.D = i10;
        if (getExoFullscreen() != null) {
            getExoFullscreen().setButtonDrawable(i10);
        }
    }

    public void setPlayTimeListener(x5.b bVar) {
        this.N = bVar;
    }

    public void setPlaybackPreparer(@Nullable m0 m0Var) {
        this.S = m0Var;
    }

    public void setPlayer(n0 n0Var) {
        n0 n0Var2 = this.P;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.c(this.f20914b);
        }
        this.P = n0Var;
        if (n0Var != null) {
            n0Var.e(this.f20914b);
        }
        W();
    }

    public void setRepeatToggleModes(int i10) {
        this.f20919d0 = i10;
        n0 n0Var = this.P;
        if (n0Var != null) {
            int repeatMode = n0Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.Q.c(this.P, 0);
                return;
            }
            if (i10 == 1 && repeatMode == 2) {
                this.Q.c(this.P, 1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.Q.c(this.P, 2);
            }
        }
    }

    public void setRewindIncrementMs(int i10) {
        this.f20913a0 = i10;
        X();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.U = z10;
        c0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f20921e0 = z10;
        b0();
    }

    public void setShowTimeoutMs(int i10) {
        this.f20917c0 = i10;
        if (J()) {
            F();
        }
    }

    public void setTitle(@NonNull String str) {
        this.G.setText(str);
    }

    public void setVisibilityListener(f fVar) {
        this.R = fVar;
    }

    public void y(@NonNull a.b bVar) {
        this.O.add(bVar);
    }

    public void z(int i10) {
        d dVar = this.f20937m0;
        if (dVar != null) {
            dVar.a(i10);
        }
    }
}
