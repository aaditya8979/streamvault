package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.ui.l0;
import com.google.android.exoplayer2.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import d6.x0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class PlayerControlView extends FrameLayout {
    public final String A;
    public final Drawable B;
    public final Drawable C;
    public final float D;
    public final float E;
    public final String F;
    public final String G;

    @Nullable
    public com.google.android.exoplayer2.v H;

    @Nullable
    public d I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public long[] W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean[] f22529a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22530b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long[] f22531b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<e> f22532c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean[] f22533c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final View f22534d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f22535d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final View f22536e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f22537e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final View f22538f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f22539f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final View f22540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final View f22541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final View f22542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final ImageView f22543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final ImageView f22544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final View f22545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final TextView f22546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final TextView f22547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final l0 f22548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StringBuilder f22549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Formatter f22550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0.b f22551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0.d f22552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f22553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f22554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f22555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f22556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f22557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f22558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f22559z;

    @RequiresApi(21)
    public static final class b {
        @DoNotInline
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class c implements v.d, l0.a, View.OnClickListener {
        public c() {
        }

        @Override // com.google.android.exoplayer2.v.d
        public void G(com.google.android.exoplayer2.v vVar, v.c cVar) {
            if (cVar.b(4, 5)) {
                PlayerControlView.this.T();
            }
            if (cVar.b(4, 5, 7)) {
                PlayerControlView.this.U();
            }
            if (cVar.a(8)) {
                PlayerControlView.this.V();
            }
            if (cVar.a(9)) {
                PlayerControlView.this.W();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                PlayerControlView.this.S();
            }
            if (cVar.b(11, 0)) {
                PlayerControlView.this.X();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void o(l0 l0Var, long j10, boolean z10) {
            PlayerControlView.this.M = false;
            if (z10 || PlayerControlView.this.H == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.N(playerControlView.H, j10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.google.android.exoplayer2.v vVar = PlayerControlView.this.H;
            if (vVar == null) {
                return;
            }
            if (PlayerControlView.this.f22536e == view) {
                vVar.seekToNext();
                return;
            }
            if (PlayerControlView.this.f22534d == view) {
                vVar.seekToPrevious();
                return;
            }
            if (PlayerControlView.this.f22541h == view) {
                if (vVar.getPlaybackState() != 4) {
                    vVar.seekForward();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f22542i == view) {
                vVar.seekBack();
                return;
            }
            if (PlayerControlView.this.f22538f == view) {
                PlayerControlView.this.C(vVar);
                return;
            }
            if (PlayerControlView.this.f22540g == view) {
                PlayerControlView.this.B(vVar);
            } else if (PlayerControlView.this.f22543j == view) {
                vVar.setRepeatMode(s7.d0.a(vVar.getRepeatMode(), PlayerControlView.this.P));
            } else if (PlayerControlView.this.f22544k == view) {
                vVar.setShuffleModeEnabled(!vVar.getShuffleModeEnabled());
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void r(l0 l0Var, long j10) {
            if (PlayerControlView.this.f22547n != null) {
                PlayerControlView.this.f22547n.setText(s7.m0.b0(PlayerControlView.this.f22549p, PlayerControlView.this.f22550q, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void t(l0 l0Var, long j10) {
            PlayerControlView.this.M = true;
            if (PlayerControlView.this.f22547n != null) {
                PlayerControlView.this.f22547n.setText(s7.m0.b0(PlayerControlView.this.f22549p, PlayerControlView.this.f22550q, j10));
            }
        }
    }

    public interface d {
        void onProgressUpdate(long j10, long j11);
    }

    public interface e {
        void onVisibilityChange(int i10);
    }

    static {
        x0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = R$layout.exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = -9223372036854775807L;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.PlayerControlView, i10, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.PlayerControlView_controller_layout_id, resourceId);
                this.P = E(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PlayerControlView_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R$styleable.PlayerControlView_time_bar_min_update_interval, this.O));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f22532c = new CopyOnWriteArrayList<>();
        this.f22551r = new c0.b();
        this.f22552s = new c0.d();
        StringBuilder sb2 = new StringBuilder();
        this.f22549p = sb2;
        this.f22550q = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f22529a0 = new boolean[0];
        this.f22531b0 = new long[0];
        this.f22533c0 = new boolean[0];
        c cVar = new c();
        this.f22530b = cVar;
        this.f22553t = new Runnable() { // from class: com.google.android.exoplayer2.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f22744b.U();
            }
        };
        this.f22554u = new Runnable() { // from class: com.google.android.exoplayer2.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f22783b.F();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i11 = R$id.exo_progress;
        l0 l0Var = (l0) findViewById(i11);
        View viewFindViewById = findViewById(R$id.exo_progress_placeholder);
        if (l0Var != null) {
            this.f22548o = l0Var;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f22548o = defaultTimeBar;
        } else {
            this.f22548o = null;
        }
        this.f22546m = (TextView) findViewById(R$id.exo_duration);
        this.f22547n = (TextView) findViewById(R$id.exo_position);
        l0 l0Var2 = this.f22548o;
        if (l0Var2 != null) {
            l0Var2.a(cVar);
        }
        View viewFindViewById2 = findViewById(R$id.exo_play);
        this.f22538f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R$id.exo_pause);
        this.f22540g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        View viewFindViewById4 = findViewById(R$id.exo_prev);
        this.f22534d = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(cVar);
        }
        View viewFindViewById5 = findViewById(R$id.exo_next);
        this.f22536e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R$id.exo_rew);
        this.f22542i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R$id.exo_ffwd);
        this.f22541h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R$id.exo_repeat_toggle);
        this.f22543j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R$id.exo_shuffle);
        this.f22544k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View viewFindViewById8 = findViewById(R$id.exo_vr);
        this.f22545l = viewFindViewById8;
        setShowVrButton(false);
        R(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(R$integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(R$integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f22555v = resources.getDrawable(R$drawable.exo_controls_repeat_off);
        this.f22556w = resources.getDrawable(R$drawable.exo_controls_repeat_one);
        this.f22557x = resources.getDrawable(R$drawable.exo_controls_repeat_all);
        this.B = resources.getDrawable(R$drawable.exo_controls_shuffle_on);
        this.C = resources.getDrawable(R$drawable.exo_controls_shuffle_off);
        this.f22558y = resources.getString(R$string.exo_controls_repeat_off_description);
        this.f22559z = resources.getString(R$string.exo_controls_repeat_one_description);
        this.A = resources.getString(R$string.exo_controls_repeat_all_description);
        this.F = resources.getString(R$string.exo_controls_shuffle_on_description);
        this.G = resources.getString(R$string.exo_controls_shuffle_off_description);
        this.f22537e0 = -9223372036854775807L;
        this.f22539f0 = -9223372036854775807L;
    }

    public static int E(TypedArray typedArray, int i10) {
        return typedArray.getInt(R$styleable.PlayerControlView_repeat_toggle_modes, i10);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    public static boolean z(com.google.android.exoplayer2.c0 c0Var, c0.d dVar) {
        if (c0Var.t() > 100) {
            return false;
        }
        int iT = c0Var.t();
        for (int i10 = 0; i10 < iT; i10++) {
            if (c0Var.r(i10, dVar).f21415o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.google.android.exoplayer2.v vVar = this.H;
        if (vVar == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (vVar.getPlaybackState() == 4) {
                return true;
            }
            vVar.seekForward();
            return true;
        }
        if (keyCode == 89) {
            vVar.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            D(vVar);
            return true;
        }
        if (keyCode == 87) {
            vVar.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            vVar.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            C(vVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        B(vVar);
        return true;
    }

    public final void B(com.google.android.exoplayer2.v vVar) {
        vVar.pause();
    }

    public final void C(com.google.android.exoplayer2.v vVar) {
        int playbackState = vVar.getPlaybackState();
        if (playbackState == 1) {
            vVar.prepare();
        } else if (playbackState == 4) {
            M(vVar, vVar.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        vVar.play();
    }

    public final void D(com.google.android.exoplayer2.v vVar) {
        int playbackState = vVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !vVar.getPlayWhenReady()) {
            C(vVar);
        } else {
            B(vVar);
        }
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<e> it = this.f22532c.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f22553t);
            removeCallbacks(this.f22554u);
            this.V = -9223372036854775807L;
        }
    }

    public final void G() {
        removeCallbacks(this.f22554u);
        if (this.N <= 0) {
            this.V = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.N;
        this.V = jUptimeMillis + ((long) i10);
        if (this.J) {
            postDelayed(this.f22554u, i10);
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void J(e eVar) {
        this.f22532c.remove(eVar);
    }

    public final void K() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.f22538f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zO || (view = this.f22540g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public final void L() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.f22538f) != null) {
            view2.requestFocus();
        } else {
            if (!zO || (view = this.f22540g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final void M(com.google.android.exoplayer2.v vVar, int i10, long j10) {
        vVar.seekTo(i10, j10);
    }

    public final void N(com.google.android.exoplayer2.v vVar, long j10) {
        int currentMediaItemIndex;
        com.google.android.exoplayer2.c0 currentTimeline = vVar.getCurrentTimeline();
        if (this.L && !currentTimeline.u()) {
            int iT = currentTimeline.t();
            currentMediaItemIndex = 0;
            while (true) {
                long jG = currentTimeline.r(currentMediaItemIndex, this.f22552s).g();
                if (j10 < jG) {
                    break;
                }
                if (currentMediaItemIndex == iT - 1) {
                    j10 = jG;
                    break;
                } else {
                    j10 -= jG;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
        }
        M(vVar, currentMediaItemIndex, j10);
        U();
    }

    public final boolean O() {
        com.google.android.exoplayer2.v vVar = this.H;
        return (vVar == null || vVar.getPlaybackState() == 4 || this.H.getPlaybackState() == 1 || !this.H.getPlayWhenReady()) ? false : true;
    }

    public void P() {
        if (!I()) {
            setVisibility(0);
            Iterator<e> it = this.f22532c.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            Q();
            L();
            K();
        }
        G();
    }

    public final void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    public final void R(boolean z10, boolean z11, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.D : this.E);
        view.setVisibility(z10 ? 0 : 8);
    }

    public final void S() {
        boolean zIsCommandAvailable;
        boolean z10;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        if (I() && this.J) {
            com.google.android.exoplayer2.v vVar = this.H;
            boolean z11 = false;
            if (vVar != null) {
                boolean zIsCommandAvailable4 = vVar.isCommandAvailable(5);
                boolean zIsCommandAvailable5 = vVar.isCommandAvailable(7);
                zIsCommandAvailable2 = vVar.isCommandAvailable(11);
                zIsCommandAvailable3 = vVar.isCommandAvailable(12);
                zIsCommandAvailable = vVar.isCommandAvailable(9);
                z10 = zIsCommandAvailable4;
                z11 = zIsCommandAvailable5;
            } else {
                zIsCommandAvailable = false;
                z10 = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
            }
            R(this.S, z11, this.f22534d);
            R(this.Q, zIsCommandAvailable2, this.f22542i);
            R(this.R, zIsCommandAvailable3, this.f22541h);
            R(this.T, zIsCommandAvailable, this.f22536e);
            l0 l0Var = this.f22548o;
            if (l0Var != null) {
                l0Var.setEnabled(z10);
            }
        }
    }

    public final void T() {
        boolean z10;
        boolean z11;
        if (I() && this.J) {
            boolean zO = O();
            View view = this.f22538f;
            boolean z12 = true;
            if (view != null) {
                z10 = (zO && view.isFocused()) | false;
                z11 = (s7.m0.f79487a < 21 ? z10 : zO && b.a(this.f22538f)) | false;
                this.f22538f.setVisibility(zO ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f22540g;
            if (view2 != null) {
                z10 |= !zO && view2.isFocused();
                if (s7.m0.f79487a < 21) {
                    z12 = z10;
                } else if (zO || !b.a(this.f22540g)) {
                    z12 = false;
                }
                z11 |= z12;
                this.f22540g.setVisibility(zO ? 0 : 8);
            }
            if (z10) {
                L();
            }
            if (z11) {
                K();
            }
        }
    }

    public final void U() {
        long contentBufferedPosition;
        if (I() && this.J) {
            com.google.android.exoplayer2.v vVar = this.H;
            long contentPosition = 0;
            if (vVar != null) {
                contentPosition = this.f22535d0 + vVar.getContentPosition();
                contentBufferedPosition = this.f22535d0 + vVar.getContentBufferedPosition();
            } else {
                contentBufferedPosition = 0;
            }
            boolean z10 = contentPosition != this.f22537e0;
            boolean z11 = contentBufferedPosition != this.f22539f0;
            this.f22537e0 = contentPosition;
            this.f22539f0 = contentBufferedPosition;
            TextView textView = this.f22547n;
            if (textView != null && !this.M && z10) {
                textView.setText(s7.m0.b0(this.f22549p, this.f22550q, contentPosition));
            }
            l0 l0Var = this.f22548o;
            if (l0Var != null) {
                l0Var.setPosition(contentPosition);
                this.f22548o.setBufferedPosition(contentBufferedPosition);
            }
            d dVar = this.I;
            if (dVar != null && (z10 || z11)) {
                dVar.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.f22553t);
            int playbackState = vVar == null ? 1 : vVar.getPlaybackState();
            if (vVar == null || !vVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f22553t, 1000L);
                return;
            }
            l0 l0Var2 = this.f22548o;
            long jMin = Math.min(l0Var2 != null ? l0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = vVar.getPlaybackParameters().f22486b;
            postDelayed(this.f22553t, s7.m0.q(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.O, 1000L));
        }
    }

    public final void V() {
        ImageView imageView;
        if (I() && this.J && (imageView = this.f22543j) != null) {
            if (this.P == 0) {
                R(false, false, imageView);
                return;
            }
            com.google.android.exoplayer2.v vVar = this.H;
            if (vVar == null) {
                R(true, false, imageView);
                this.f22543j.setImageDrawable(this.f22555v);
                this.f22543j.setContentDescription(this.f22558y);
                return;
            }
            R(true, true, imageView);
            int repeatMode = vVar.getRepeatMode();
            if (repeatMode == 0) {
                this.f22543j.setImageDrawable(this.f22555v);
                this.f22543j.setContentDescription(this.f22558y);
            } else if (repeatMode == 1) {
                this.f22543j.setImageDrawable(this.f22556w);
                this.f22543j.setContentDescription(this.f22559z);
            } else if (repeatMode == 2) {
                this.f22543j.setImageDrawable(this.f22557x);
                this.f22543j.setContentDescription(this.A);
            }
            this.f22543j.setVisibility(0);
        }
    }

    public final void W() {
        ImageView imageView;
        if (I() && this.J && (imageView = this.f22544k) != null) {
            com.google.android.exoplayer2.v vVar = this.H;
            if (!this.U) {
                R(false, false, imageView);
                return;
            }
            if (vVar == null) {
                R(true, false, imageView);
                this.f22544k.setImageDrawable(this.C);
                this.f22544k.setContentDescription(this.G);
            } else {
                R(true, true, imageView);
                this.f22544k.setImageDrawable(vVar.getShuffleModeEnabled() ? this.B : this.C);
                this.f22544k.setContentDescription(vVar.getShuffleModeEnabled() ? this.F : this.G);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.X():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("ExoPlayer|SafeDK: Execution> Lcom/google/android/exoplayer2/ui/PlayerControlView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return safedk_PlayerControlView_dispatchTouchEvent_2f85cad8e32940e16dcbb1ea2f75685d(motionEvent);
    }

    @Nullable
    public com.google.android.exoplayer2.v getPlayer() {
        return this.H;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f22545l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j10 = this.V;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.f22554u, jUptimeMillis);
            }
        } else if (I()) {
            G();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f22553t);
        removeCallbacks(this.f22554u);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public boolean safedk_PlayerControlView_dispatchTouchEvent_2f85cad8e32940e16dcbb1ea2f75685d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f22554u);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setPlayer(@Nullable com.google.android.exoplayer2.v vVar) {
        boolean z10 = true;
        s7.a.g(Looper.myLooper() == Looper.getMainLooper());
        if (vVar != null && vVar.getApplicationLooper() != Looper.getMainLooper()) {
            z10 = false;
        }
        s7.a.a(z10);
        com.google.android.exoplayer2.v vVar2 = this.H;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            vVar2.c(this.f22530b);
        }
        this.H = vVar;
        if (vVar != null) {
            vVar.f(this.f22530b);
        }
        Q();
    }

    public void setProgressUpdateListener(@Nullable d dVar) {
        this.I = dVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        com.google.android.exoplayer2.v vVar = this.H;
        if (vVar != null) {
            int repeatMode = vVar.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.H.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.H.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.H.setRepeatMode(2);
            }
        }
        V();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        X();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        S();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        S();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        S();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        W();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f22545l;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = s7.m0.p(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f22545l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f22545l);
        }
    }

    public void y(e eVar) {
        s7.a.e(eVar);
        this.f22532c.add(eVar);
    }
}
