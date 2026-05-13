package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4211q3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3986dc extends AbstractC4211q3<R0> implements NativeAdListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f31484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f31485s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3986dc(@NotNull InterfaceC4204pd interfaceC4204pd, @NotNull C4135m0 c4135m0, @Nullable BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, @Nullable C4041gd c4041gd, @NotNull C4157n2 c4157n2, @Nullable R0 r02) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, new C3957c1(c4135m0.g(), c4135m0.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), c4157n2, r02);
        tn.p.k(interfaceC4204pd, "threadInterface");
        tn.p.k(c4135m0, "adSmashData");
        tn.p.k(c4157n2, "item");
        this.f33304g = c4041gd;
    }

    private final void J() {
        C3954bg c3954bg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f33302e != AbstractC4211q3.h.FAILED) {
            tn.x xVar = tn.x.f85368a;
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f33302e}, 2));
            tn.p.j(str, "format(format, *args)");
            E0 e02 = this.f33301d;
            if (e02 == null || (c3954bg = e02.f29209j) == null) {
                return;
            }
            c3954bg.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3986dc c3986dc) {
        tn.p.k(c3986dc, "this$0");
        c3986dc.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3986dc c3986dc, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        tn.p.k(c3986dc, "this$0");
        tn.p.k(adapterNativeAdData, "$adapterNativeAdData");
        tn.p.k(adapterNativeAdViewBinder, "$nativeAdViewBinder");
        c3986dc.a(adapterNativeAdData, adapterNativeAdViewBinder);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f31484r = adapterNativeAdData;
        this.f31485s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.AbstractC4211q3
    public void G() {
        C3954bg c3954bg;
        if (!(this.f33300c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            E0 e02 = this.f33301d;
            if (e02 == null || (c3954bg = e02.f29209j) == null) {
                return;
            }
            c3954bg.g("activity must not be null");
            return;
        }
        Object obj = this.f33300c;
        tn.p.i(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData adData = this.f33308k;
        tn.p.j(adData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        tn.p.j(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(adData, currentActiveActivity, this);
    }

    public final void P() {
        C3954bg c3954bg;
        Ab ab2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4211q3.h.NONE);
        Object obj = this.f33300c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                tn.p.i(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData adData = this.f33308k;
                tn.p.j(adData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(adData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            E0 e02 = this.f33301d;
            if (e02 != null && (c3954bg = e02.f29209j) != null) {
                c3954bg.g(str);
            }
        }
        E0 e03 = this.f33301d;
        if (e03 == null || (ab2 = e03.f29205f) == null) {
            return;
        }
        Integer numR = r();
        tn.p.j(numR, "sessionDepth");
        ab2.a(numR.intValue());
    }

    @Nullable
    public final AdapterNativeAdData Q() {
        return this.f31484r;
    }

    @Nullable
    public final AdapterNativeAdViewBinder R() {
        return this.f31485s;
    }

    @Override // com.ironsource.AbstractC4211q3, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b02) {
        tn.p.k(b02, "event");
        Map<String, Object> mapA = super.a(b02);
        if (this.f33304g != null) {
            tn.p.j(mapA, "data");
            mapA.put("placement", j());
        }
        tn.p.j(mapA, "data");
        return mapA;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        tn.p.k(adapterNativeAdData, "adapterNativeAdData");
        tn.p.k(adapterNativeAdViewBinder, "nativeAdViewBinder");
        if (u().e()) {
            u().a(new Runnable() { // from class: com.ironsource.sk
                @Override // java.lang.Runnable
                public final void run() {
                    C3986dc.a(this.f34035b, adapterNativeAdData, adapterNativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, adapterNativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC4211q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new Runnable() { // from class: com.ironsource.tk
                @Override // java.lang.Runnable
                public final void run() {
                    C3986dc.a(this.f34133b);
                }
            });
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, @Nullable String str) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
