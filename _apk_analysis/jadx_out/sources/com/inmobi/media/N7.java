package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class N7 {
    public final L7 A;
    public final F7 B;
    public final go.k C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f25992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f25993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p000do.l0 f25994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p000do.l0 f25995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f25996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f25999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f26000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f26001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f26002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f26003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final go.k f26004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G1 f26005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ProgressBar f26006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExoPlayer f26007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f26008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f26009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f26010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EnumC3736sg f26011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f26012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.g f26013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K2 f26014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3776u6 f26015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S7 f26016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3629o8 f26017z;

    public N7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, p000do.l0 l0Var, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(hybridNativeConfig, "hybridNativeConfig");
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f25992a = htmlVideoPlayerRequest;
        this.f25993b = interfaceC3580m9;
        this.f25994c = P4.a(l0Var, new K7(p000do.i0.D8, this));
        p000do.l0 l0VarA = P4.a(l0Var);
        this.f25995d = l0VarA;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.f25996e = config;
        this.f25997f = new AtomicBoolean(false);
        this.f25998g = new AtomicBoolean(false);
        this.f25999h = new AtomicBoolean(false);
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        tn.p.j(listSynchronizedList, "synchronizedList(...)");
        this.f26002k = listSynchronizedList;
        EnumC3736sg enumC3736sg = EnumC3736sg.f28122a;
        this.f26003l = new AtomicReference(enumC3736sg);
        go.k kVarB = go.q.b(0, 0, null, 7, null);
        this.f26004m = kVarB;
        G1 g12 = new G1(context);
        this.f26005n = g12;
        this.f26006o = new ProgressBar(context);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        tn.p.j(exoPlayerBuild, "build(...)");
        this.f26007p = exoPlayerBuild;
        List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
        tn.p.j(listSynchronizedList2, "synchronizedList(...)");
        this.f26010s = listSynchronizedList2;
        this.f26011t = enumC3736sg;
        K2 k22 = (K2) K2.f25774h.getValue();
        k22.f25780f.incrementAndGet();
        this.f26014w = k22;
        this.f26015x = new C3776u6(exoPlayerBuild, hybridNativeConfig, l0VarA, config.getPlaybackInterval(), kVarB, config.getTrackPercentages());
        Context context2 = g12.getContext();
        tn.p.j(context2, "getContext(...)");
        this.f26016y = new S7(context2, l0VarA, exoPlayerBuild, config.getMuted(), kVarB);
        this.f26017z = new C3629o8(l0VarA, exoPlayerBuild, g12, interfaceC3580m9);
        this.A = new L7(this);
        this.B = new F7(this);
        this.C = kVarB;
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int iOrdinal = b().ordinal();
        if (iOrdinal == 2) {
            EnumC3504j8[] enumC3504j8Arr = EnumC3504j8.f27392a;
            str = C3978d4.i.f31361s;
        } else if (iOrdinal == 3) {
            EnumC3504j8[] enumC3504j8Arr2 = EnumC3504j8.f27392a;
            str = "playing";
        } else if (iOrdinal == 4) {
            EnumC3504j8[] enumC3504j8Arr3 = EnumC3504j8.f27392a;
            str = "paused";
        } else if (iOrdinal == 5) {
            EnumC3504j8[] enumC3504j8Arr4 = EnumC3504j8.f27392a;
            str = C3978d4.i.f31340h0;
        } else if (iOrdinal != 6) {
            EnumC3504j8[] enumC3504j8Arr5 = EnumC3504j8.f27392a;
            str = "loading";
        } else {
            EnumC3504j8[] enumC3504j8Arr6 = EnumC3504j8.f27392a;
            str = C3978d4.i.f31363t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.f26007p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.f26007p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.f26016y.f26289e);
        return htmlVideoPlaybackState;
    }

    public final void a(RelativeLayout relativeLayout) {
        InterfaceC3580m9 interfaceC3580m9;
        tn.p.k(relativeLayout, "parentView");
        if (this.f25999h.get()) {
            return;
        }
        this.f26009r = new WeakReference(relativeLayout);
        C3629o8 c3629o8 = this.f26017z;
        L7 l72 = this.A;
        c3629o8.getClass();
        tn.p.k(l72, "surfaceViewabilityListener");
        P4.a(c3629o8.f27759a, new C3579m8(c3629o8, l72, null));
        G1 g12 = this.f26005n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.f25996e.getVideoViewPosition();
        if (this.f25996e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? videoViewPosition2.getX() : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? videoViewPosition2.getY() : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (J5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.f25996e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        this.f26005n.setOnPositionChangeListener(new B7(this));
        ViewParent parent = this.f26006o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f26006o);
        }
        ProgressBar progressBar = this.f26006o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
            this.f26005n.addView(this.f26006o, 0);
        } else {
            p000do.i.d(this.f25994c, null, null, new J7(null, this), 3, null);
        }
        G1 g13 = this.f26005n;
        if (ViewCompat.isAttachedToWindow(g13)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f25993b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C3679q8.f27952a);
        } else {
            g13.addOnAttachStateChangeListener(new A7(g13, this));
        }
        relativeLayout.addView(this.f26005n, 0);
        if (b() == EnumC3736sg.f28124c || (interfaceC3580m9 = this.f25993b) == null) {
            return;
        }
        ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final void a(Rl rl2) {
        p000do.i.d(this.f25994c, null, null, new G7(this, rl2, null), 3, null);
    }

    public final void a(AbstractC3378e8 abstractC3378e8) {
        Surface surface;
        if (!(abstractC3378e8 instanceof C3404f8)) {
            if (!(abstractC3378e8 instanceof C3327c8)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f26003l.set(EnumC3736sg.f28128g);
            this.f26013v = null;
            a(new C3301b8(this.f25992a, ((C3327c8) abstractC3378e8).f26921a.f25184a.f26623a));
            return;
        }
        C3404f8 c3404f8 = (C3404f8) abstractC3378e8;
        this.f26008q = c3404f8.f27151a;
        this.f26013v = null;
        if (!tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
            p000do.i.d(this.f25994c, null, null, new C3902z7(null, this, c3404f8), 3, null);
            return;
        }
        this.f26003l.set(EnumC3736sg.f28124c);
        this.f26007p.seekTo(0L);
        C3629o8 c3629o8 = this.f26017z;
        if (!c3629o8.f27765g && (surface = c3629o8.f27763e) != null) {
            c3629o8.f27765g = true;
            c3629o8.f27760b.setVideoSurface(surface);
        }
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(c3404f8.f27152b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(c3404f8.f27151a);
        htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.f26012u));
        htmlVideoPlaybackState.setMuted(this.f26016y.f26289e);
        EnumC3504j8[] enumC3504j8Arr = EnumC3504j8.f27392a;
        htmlVideoPlaybackState.setState(C3978d4.i.f31361s);
        htmlVideoPlaybackState.setTime(this.f26007p.getCurrentPosition() / 1000.0f);
        a(new C3430g8(htmlVideoPlaybackState, c3404f8.f27153c));
    }

    public final void a(VideoViewPosition videoViewPosition) {
        tn.p.k(videoViewPosition, "newVideoViewPosition");
        if (this.f25999h.get()) {
            return;
        }
        if (!tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
            p000do.i.d(this.f25994c, null, null, new M7(null, this, videoViewPosition), 3, null);
            return;
        }
        TransitionManager.beginDelayedTransition(this.f26005n);
        this.f25996e.setVideoViewPosition(videoViewPosition);
        int iB = (int) (J5.b() * videoViewPosition.getWidth());
        int iB2 = (int) (J5.b() * videoViewPosition.getHeight());
        G1 g12 = this.f26005n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f25996e.getVideoViewPosition() != null) {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        if (this.f26000i > 0 && this.f26001j > 0) {
            G1 g13 = this.f26005n;
            int i10 = this.f26000i;
            int i11 = this.f26001j;
            g13.getClass();
            if (i10 > 0 && i11 > 0) {
                g13.f25505a = i10 / i11;
                g13.requestLayout();
            }
        }
        this.f26005n.requestLayout();
    }

    public final EnumC3736sg b() {
        Object obj = this.f26003l.get();
        tn.p.j(obj, "get(...)");
        return (EnumC3736sg) obj;
    }

    public final void c() {
        if (!this.f25999h.get() && b() == EnumC3736sg.f28125d) {
            if (!tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                p000do.i.d(this.f25994c, null, null, new D7(null, this), 3, null);
                return;
            }
            this.f26007p.pause();
            this.f26015x.a();
            S7 s72 = this.f26016y;
            s72.f26286b.setVolume(0.0f);
            s72.f26288d.a();
            this.f26003l.set(EnumC3736sg.f28126e);
            a(new Om(this.f26007p.getCurrentPosition()));
        }
    }

    public final void d() {
        if (this.f25999h.get()) {
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f25993b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != EnumC3736sg.f28126e && b() != EnumC3736sg.f28124c && b() != EnumC3736sg.f28127f) {
            InterfaceC3580m9 interfaceC3580m92 = this.f25993b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
            p000do.i.d(this.f25994c, null, null, new E7(null, this), 3, null);
            return;
        }
        if (b() == EnumC3736sg.f28127f) {
            this.f26007p.seekTo(0L);
            this.f26003l.set(EnumC3736sg.f28124c);
        }
        S7 s72 = this.f26016y;
        if (s72.f26289e) {
            s72.a();
            s72.f26288d.a();
        } else {
            P4.a(s72.f26285a, new R7(s72, null));
        }
        C3776u6 c3776u6 = this.f26015x;
        if (!c3776u6.f28231d.getAndSet(true)) {
            p000do.l0 l0Var = c3776u6.f28229b;
            long j10 = c3776u6.f28238k;
            C3726s6 c3726s6 = new C3726s6(c3776u6, null);
            tn.p.k(l0Var, "<this>");
            tn.p.k(c3726s6, "action");
            c3776u6.f28232e = p000do.i.d(l0Var, p000do.w0.c().M(), null, new C3(j10, null, c3726s6), 2, null);
            p000do.l0 l0Var2 = c3776u6.f28229b;
            long j11 = c3776u6.f28239l;
            C3751t6 c3751t6 = new C3751t6(c3776u6, null);
            tn.p.k(l0Var2, "<this>");
            tn.p.k(c3751t6, "action");
            c3776u6.f28233f = p000do.i.d(l0Var2, p000do.w0.c().M(), null, new C3(j11, null, c3751t6), 2, null);
        }
        this.f26007p.play();
        this.f26003l.set(EnumC3736sg.f28125d);
        a(new C3470hn(this.f26007p.getCurrentPosition()));
    }

    public final void e() {
        if (this.f25999h.get()) {
            return;
        }
        String str = this.f26008q;
        if (str != null) {
            for (HtmlVideoFile htmlVideoFile : this.f26010s) {
                if (tn.p.f(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
            htmlVideoFile = null;
        } else {
            htmlVideoFile = null;
        }
        if (htmlVideoFile == null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f25993b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.f25998g.get()) {
            this.f25998g.set(true);
            kotlinx.coroutines.g gVarD = p000do.i.d(this.f25994c, null, null, new C3777u7(new C3852x7(this.C), null, this), 3, null);
            List list = this.f26002k;
            tn.p.k(gVarD, "<this>");
            tn.p.k(list, "activeJobs");
            list.add(gVarD);
        }
        if (!this.f25997f.get()) {
            this.f25997f.set(true);
            if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.f26007p.addListener(this.B);
            } else {
                p000do.i.d(this.f25994c, null, null, new C3727s7(null, this), 3, null);
            }
        }
        if (this.f25996e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.f25999h.get()) {
            return;
        }
        if (b() == EnumC3736sg.f28125d) {
            c();
        }
        if (this.f25997f.get()) {
            this.f25997f.set(false);
            if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                this.f26007p.removeListener(this.B);
            } else {
                p000do.i.d(this.f25994c, null, null, new I7(null, this), 3, null);
            }
        }
        this.f26015x.a();
        this.f25998g.set(false);
        P4.a(this.f26002k);
    }
}
