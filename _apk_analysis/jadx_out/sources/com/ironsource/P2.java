package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class P2 implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final O9 f30105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4107k8 f30106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final W1 f30107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f30108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4129lc f30109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Tf f30110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final P8 f30111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final P8.a f30112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private BannerAdInfo f30113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private WeakReference<Q2> f30114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private WeakReference<FrameLayout> f30115k;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            tn.p.k(view, "v");
            C4072i8 size = P2.this.d().getSize();
            ((FrameLayout) view).addView(P2.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            tn.p.k(view, "v");
            ((FrameLayout) view).removeAllViews();
        }
    }

    public P2(@NotNull O9 o92, @NotNull C4107k8 c4107k8, @NotNull W1 w12, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull InterfaceC4129lc interfaceC4129lc, @NotNull Tf tf2, @NotNull P8 p82, @NotNull P8.a aVar) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(c4107k8, "container");
        tn.p.k(w12, "auctionDataReporter");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(interfaceC4129lc, "networkDestroyAPI");
        tn.p.k(tf2, "threadManager");
        tn.p.k(p82, "sessionDepthService");
        tn.p.k(aVar, "sessionDepthServiceEditor");
        this.f30105a = o92;
        this.f30106b = c4107k8;
        this.f30107c = w12;
        this.f30108d = interfaceC4209q1;
        this.f30109e = interfaceC4129lc;
        this.f30110f = tf2;
        this.f30111g = p82;
        this.f30112h = aVar;
        String strF = o92.f();
        tn.p.j(strF, "adInstance.instanceId");
        String strE = o92.e();
        tn.p.j(strE, "adInstance.id");
        this.f30113i = new BannerAdInfo(strF, strE);
        this.f30114j = new WeakReference<>(null);
        this.f30115k = new WeakReference<>(null);
        Jc jc2 = new Jc();
        o92.a(jc2);
        jc2.a(this);
    }

    public /* synthetic */ P2(O9 o92, C4107k8 c4107k8, W1 w12, InterfaceC4209q1 interfaceC4209q1, InterfaceC4129lc interfaceC4129lc, Tf tf2, P8 p82, P8.a aVar, int i10, tn.i iVar) {
        this(o92, c4107k8, w12, interfaceC4209q1, (i10 & 16) != 0 ? new C4147mc() : interfaceC4129lc, (i10 & 32) != 0 ? V7.f30593a : tf2, (i10 & 64) != 0 ? Lb.f29764s.d().s() : p82, (i10 & 128) != 0 ? Lb.f29764s.a().h() : aVar);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(P2 p22) {
        tn.p.k(p22, "this$0");
        InterfaceC4082j1.d.f32003a.b().a(p22.f30108d);
        p22.f30109e.a(p22.f30105a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 p22) {
        tn.p.k(p22, "this$0");
        Q2 q22 = p22.f30114j.get();
        if (q22 != null) {
            q22.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 p22) {
        tn.p.k(p22, "this$0");
        Q2 q22 = p22.f30114j.get();
        if (q22 != null) {
            q22.onBannerAdShown();
        }
    }

    public final void a(@NotNull BannerAdInfo bannerAdInfo) {
        tn.p.k(bannerAdInfo, "<set-?>");
        this.f30113i = bannerAdInfo;
    }

    public final void a(@NotNull WeakReference<Q2> weakReference) {
        tn.p.k(weakReference, "<set-?>");
        this.f30114j = weakReference;
    }

    public final void b() {
        Tf.a(this.f30110f, new Runnable() { // from class: com.ironsource.ti
            @Override // java.lang.Runnable
            public final void run() {
                P2.a(this.f34130b);
            }
        }, 0L, 2, null);
    }

    public final void b(@NotNull WeakReference<FrameLayout> weakReference) {
        tn.p.k(weakReference, "value");
        this.f30115k = weakReference;
        FrameLayout frameLayout = weakReference.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    @NotNull
    public final BannerAdInfo c() {
        return this.f30113i;
    }

    @NotNull
    public final C4107k8 d() {
        return this.f30106b;
    }

    @NotNull
    public final WeakReference<Q2> e() {
        return this.f30114j;
    }

    @NotNull
    public final WeakReference<FrameLayout> f() {
        return this.f30115k;
    }

    public final void finalize() {
        b();
    }

    @Override // com.ironsource.C2
    public void onBannerClick() {
        InterfaceC4082j1.a.f31980a.a().a(this.f30108d);
        this.f30110f.a(new Runnable() { // from class: com.ironsource.ui
            @Override // java.lang.Runnable
            public final void run() {
                P2.b(this.f34227b);
            }
        });
    }

    @Override // com.ironsource.C2
    public void onBannerShowSuccess() {
        P8 p82 = this.f30111g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4082j1.a.f31980a.f(new C4136m1.w(p82.a(aVar))).a(this.f30108d);
        this.f30112h.b(aVar);
        this.f30107c.b("onBannerShowSuccess");
        this.f30110f.a(new Runnable() { // from class: com.ironsource.vi
            @Override // java.lang.Runnable
            public final void run() {
                P2.c(this.f34289b);
            }
        });
    }
}
