package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4211q3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class K2 extends AbstractC4211q3<InterfaceC4241s0> implements BannerAdListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f29711t = "bannerLayout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f29712u = "bannerSize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.ironsource.mediationsdk.q f29713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f29714s;

    public class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f29715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f29716c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f29715b = view;
            this.f29716c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            K2.this.a(this.f29715b, this.f29716c);
        }
    }

    public class b extends AbstractRunnableC4078ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            K2.this.J();
        }
    }

    public K2(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.q qVar, C4041gd c4041gd, boolean z10, C4157n2 c4157n2, InterfaceC4241s0 interfaceC4241s0) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, new C3957c1(c4135m0.g(), c4135m0.g().getBannerSettings(), IronSource.a.BANNER), c4157n2, interfaceC4241s0);
        this.f29713r = qVar;
        this.f33304g = c4041gd;
        this.f29714s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else {
            if (this.f33302e == AbstractC4211q3.h.FAILED) {
                return;
            }
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.f33302e));
            if (this.f33301d != null) {
                this.f33301d.f29209j.q(String.format("unexpected onAdOpened, state - %s", this.f33302e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f33299b) == 0) {
            return;
        }
        ((InterfaceC4241s0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC4211q3
    public void G() {
        Object obj = this.f33300c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f33308k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f29713r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC4211q3
    public boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4211q3.h.NONE);
        Object obj = this.f33300c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f33308k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f33302e;
            IronLog.INTERNAL.error(a(str));
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29209j.g(str);
            }
        }
        E0 e03 = this.f33301d;
        if (e03 != null) {
            e03.f29205f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f33300c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f33308k);
        }
    }

    public void R() {
        Object obj = this.f33300c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f33308k);
        }
    }

    @Override // com.ironsource.AbstractC4211q3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.AbstractC4211q3, com.ironsource.D0
    public Map<String, Object> a(B0 b02) {
        Map<String, Object> mapA = super.a(b02);
        com.ironsource.mediationsdk.q qVar = this.f29713r;
        if (qVar != null && !qVar.b()) {
            com.ironsource.mediationsdk.l.a(mapA, this.f29713r.getSize());
        }
        if (this.f33304g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.ironsource.AbstractC4211q3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        C4135m0 c4135m0 = this.f33298a;
        if (c4135m0 != null && this.f29713r != null && TextUtils.isEmpty(c4135m0.g().getCustomNetwork())) {
            mapA.put(f29711t, this.f29713r);
        }
        return mapA;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        E0 e02;
        C4041gd c4041gd = this.f33304g;
        if (c4041gd != null && (e02 = this.f33301d) != null) {
            e02.f29208i.f(c4041gd.c());
        }
        Listener listener = this.f33299b;
        if (listener != 0) {
            ((InterfaceC4241s0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        if (u().e()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC4211q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        E0 e02;
        C4041gd c4041gd = this.f33304g;
        if (c4041gd != null && (e02 = this.f33301d) != null) {
            e02.f29208i.c(c4041gd.c());
        }
        Listener listener = this.f33299b;
        if (listener != 0) {
            ((InterfaceC4241s0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        E0 e02;
        C4041gd c4041gd = this.f33304g;
        if (c4041gd != null && (e02 = this.f33301d) != null) {
            e02.f29208i.h(c4041gd.c());
        }
        Listener listener = this.f33299b;
        if (listener != 0) {
            ((InterfaceC4241s0) listener).f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
    }

    @Override // com.ironsource.AbstractC4211q3
    public boolean v() {
        return this.f29714s;
    }
}
