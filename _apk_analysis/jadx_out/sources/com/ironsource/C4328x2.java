package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4328x2 extends A implements BannerAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4362z2> f34364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private View f34365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private FrameLayout.LayoutParams f34366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4328x2(@NotNull W0 w02, @NotNull B b10, @NotNull H h10, @NotNull InterfaceC4362z2 interfaceC4362z2) {
        super(w02, b10, h10, interfaceC4362z2);
        tn.p.k(w02, "adTools");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        tn.p.k(interfaceC4362z2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34364x = new WeakReference<>(interfaceC4362z2);
    }

    private final ISBannerSize I() {
        W0 w0F = f();
        AbstractC4309w0 abstractC4309w0I = n().i();
        tn.p.i(abstractC4309w0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return w0F.a(((M2) abstractC4309w0I).b().h());
    }

    private final void J() {
        C4041gd c4041gdJ = j();
        if (c4041gdJ != null) {
            f().e().a().f(c4041gdJ.c());
        }
        InterfaceC4362z2 interfaceC4362z2 = this.f34364x.get();
        if (interfaceC4362z2 != null) {
            interfaceC4362z2.a(this);
        }
    }

    private final void K() {
        C4041gd c4041gdJ = j();
        if (c4041gdJ != null) {
            f().e().a().c(c4041gdJ.c());
        }
        InterfaceC4362z2 interfaceC4362z2 = this.f34364x.get();
        if (interfaceC4362z2 != null) {
            interfaceC4362z2.b(this);
        }
    }

    private final void L() {
        C4041gd c4041gdJ = j();
        if (c4041gdJ != null) {
            f().e().a().h(c4041gdJ.c());
        }
        InterfaceC4362z2 interfaceC4362z2 = this.f34364x.get();
        if (interfaceC4362z2 != null) {
            interfaceC4362z2.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4328x2 c4328x2) {
        tn.p.k(c4328x2, "this$0");
        c4328x2.f34365y = null;
        c4328x2.f34366z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4328x2 c4328x2, View view, FrameLayout.LayoutParams layoutParams) {
        tn.p.k(c4328x2, "this$0");
        tn.p.k(view, "$adView");
        tn.p.k(layoutParams, "$frameLayoutParams");
        c4328x2.f34365y = view;
        c4328x2.f34366z = layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C4328x2 c4328x2, InterfaceC4171ng interfaceC4171ng) {
        FrameLayout.LayoutParams layoutParams;
        tn.p.k(c4328x2, "this$0");
        tn.p.k(interfaceC4171ng, "$viewBinder");
        View view = c4328x2.f34365y;
        if (view == null || (layoutParams = c4328x2.f34366z) == null) {
            return;
        }
        interfaceC4171ng.a(view, layoutParams, c4328x2.f());
        IronLog.INTERNAL.verbose(C4173o0.a(c4328x2.f(), "Bind banner view", (String) null, 2, (Object) null));
        c4328x2.f().d(new Runnable() { // from class: com.ironsource.pm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.e(this.f33280b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4328x2 c4328x2, Map map) {
        tn.p.k(c4328x2, "this$0");
        tn.p.k(map, "$extraData");
        c4328x2.l().putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4328x2 c4328x2) {
        tn.p.k(c4328x2, "this$0");
        c4328x2.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4328x2 c4328x2) {
        tn.p.k(c4328x2, "this$0");
        c4328x2.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4328x2 c4328x2) {
        tn.p.k(c4328x2, "this$0");
        c4328x2.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4328x2 c4328x2) {
        String strC;
        tn.p.k(c4328x2, "this$0");
        N nA = c4328x2.f().e().a();
        C4041gd c4041gdJ = c4328x2.j();
        if (c4041gdJ == null || (strC = c4041gdJ.c()) == null) {
            strC = "";
        }
        nA.j(strC);
    }

    @Override // com.ironsource.A
    public void A() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataI = i();
        ISBannerSize iSBannerSizeI = I();
        Map<String, Object> adUnitData = adDataI.getAdUnitData();
        tn.p.j(adUnitData, "adData.adUnitData");
        adUnitData.put(K2.f29711t, new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeI));
        Object objG = g();
        tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeI, this);
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j10) {
        tn.p.k(j10, "adInstancePresenter");
        j10.a(this);
    }

    public final void a(@NotNull final InterfaceC4171ng interfaceC4171ng) {
        tn.p.k(interfaceC4171ng, "viewBinder");
        C4320wb.a(f(), new Runnable() { // from class: com.ironsource.um
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.a(this.f34234b, interfaceC4171ng);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C4320wb.a(f(), new Runnable() { // from class: com.ironsource.om
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.a(this.f33174b);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.A
    public void c() {
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object objG = g();
                tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objG).destroyAd(i());
            } else {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
    }

    @Override // com.ironsource.A
    @NotNull
    public LevelPlayAdInfo e() {
        String string = n().i().b().b().toString();
        tn.p.j(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().i().b().c();
        String string2 = n().h().toString();
        tn.p.j(string2, "instanceData.adFormat.toString()");
        C4157n2 c4157n2N = n().n();
        AbstractC4309w0 abstractC4309w0I = n().i();
        tn.p.i(abstractC4309w0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, c4157n2N, ((M2) abstractC4309w0I).b().h(), n().i().l(), kotlin.collections.a.z(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.rm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.b(this.f33437b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        tn.p.k(view, "adView");
        tn.p.k(layoutParams, "frameLayoutParams");
        onAdLoadSuccess(view, layoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull final View view, @NotNull final FrameLayout.LayoutParams layoutParams, @NotNull Map<String, Object> map) {
        tn.p.k(view, "adView");
        tn.p.k(layoutParams, "frameLayoutParams");
        tn.p.k(map, "extraData");
        C4320wb.a(f(), new Runnable() { // from class: com.ironsource.sm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.a(this.f34038b, view, layoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess(map);
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> map) {
        tn.p.k(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.qm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.a(this.f33376b, map);
            }
        });
        super.onAdOpened(map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.vm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.c(this.f34295b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.tm
            @Override // java.lang.Runnable
            public final void run() {
                C4328x2.d(this.f34135b);
            }
        });
    }
}
