package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Wb extends A implements NativeAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f30632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f30633y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wb(@NotNull W0 w02, @NotNull B b10, @NotNull H h10, @NotNull E e10) {
        super(w02, b10, h10, e10);
        tn.p.k(w02, "adTools");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        tn.p.k(e10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.ironsource.A
    public void A() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataI = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        Object objG = g();
        tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        tn.p.j(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
    }

    @Nullable
    public final AdapterNativeAdData I() {
        return this.f30632x;
    }

    @Nullable
    public final AdapterNativeAdViewBinder J() {
        return this.f30633y;
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j10) {
        tn.p.k(j10, "adInstancePresenter");
        j10.a(this);
    }

    public final void a(@NotNull Pb pb2) {
        tn.p.k(pb2, "nativeAdBinder");
        pb2.a(this.f30632x);
        pb2.a(this.f30633y);
    }

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object objG = g();
                tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        tn.p.k(adapterNativeAdData, "adapterNativeAdData");
        tn.p.k(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f30632x = adapterNativeAdData;
        this.f30633y = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }
}
