package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4158n3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Zb extends AbstractC4158n3<C3986dc, AdapterAdListener> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zb(@Nullable List<? extends NetworkSettings> list, @NotNull Qb qb2, @Nullable String str, @NotNull C4201pa c4201pa, @Nullable C4002ea c4002ea) {
        super(new C3932ac(str, list, qb2), c4201pa, c4002ea);
        tn.p.k(qb2, C4089j8.f32059p);
        tn.p.k(c4201pa, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC4158n3
    public void G() {
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean H() {
        return false;
    }

    public final void M() {
        C3954bg c3954bg;
        int iIntValue;
        Ab ab2;
        IronLog.INTERNAL.verbose();
        try {
            C3986dc c3986dc = (C3986dc) this.f33032a.d();
            if (c3986dc != null) {
                Integer numR = c3986dc.r();
                if (numR == null) {
                    iIntValue = this.C.a(this.f33046o.b());
                } else {
                    tn.p.j(numR, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numR.intValue();
                }
                E0 e02 = this.f33050s;
                if (e02 != null && (ab2 = e02.f29205f) != null) {
                    ab2.a(iIntValue);
                }
                c3986dc.P();
                this.f33032a.a(null);
                this.f33032a.b(null);
            }
            this.f33040i = null;
            a(AbstractC4158n3.f.NONE);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            E0 e03 = this.f33050s;
            if (e03 == null || (c3954bg = e03.f29209j) == null) {
                return;
            }
            c3954bg.g(str);
        }
    }

    @Override // com.ironsource.AbstractC4158n3, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b02) {
        tn.p.k(b02, "event");
        Map<String, Object> mapA = super.a(b02);
        C4041gd c4041gd = this.f33040i;
        if (c4041gd != null) {
            tn.p.j(mapA, "data");
            mapA.put("placement", c4041gd.c());
        }
        UUID uuid = this.f33054w;
        if (uuid != null) {
            tn.p.j(mapA, "data");
            mapA.put("objectId", uuid);
        }
        tn.p.j(mapA, "data");
        return mapA;
    }

    public final void a(@Nullable C4041gd c4041gd) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + c4041gd);
        if (c4041gd == null || TextUtils.isEmpty(c4041gd.c())) {
            tn.x xVar = tn.x.f85368a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4041gd == null ? "placement is null" : "placement name is empty"}, 1));
            tn.p.j(str, "format(format, *args)");
            iB = A0.b(this.f33046o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4041gd, this.f33046o.b())) {
            tn.x xVar2 = tn.x.f85368a;
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4041gd.c()}, 1));
            tn.p.j(str, "format(format, *args)");
            iB = A0.f(this.f33046o.b());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f33040i = c4041gd;
            A();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    public final void a(@NotNull InternalNativeAdListener internalNativeAdListener) {
        tn.p.k(internalNativeAdListener, "nativeAdListener");
        a(new Yb(internalNativeAdListener));
    }

    @Override // com.ironsource.AbstractC4158n3
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f33051t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4158n3
    public void a(@Nullable AbstractC4211q3<?> abstractC4211q3, @Nullable AdInfo adInfo) {
        if (abstractC4211q3 instanceof C3986dc) {
            C3986dc c3986dc = (C3986dc) abstractC4211q3;
            this.f33051t.a(c3986dc.Q(), c3986dc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4158n3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3986dc a(@NotNull NetworkSettings networkSettings, @NotNull BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, int i10, @NotNull String str, @NotNull C4157n2 c4157n2) {
        tn.p.k(networkSettings, "providerSettings");
        tn.p.k(baseAdAdapter, Q6.G1);
        tn.p.k(str, "currentAuctionId");
        tn.p.k(c4157n2, "item");
        return new C3986dc(this, new C4135m0(IronSource.a.NATIVE_AD, this.f33046o.o(), i10, this.f33038g, str, this.f33036e, this.f33037f, networkSettings, this.f33046o.n()), baseAdAdapter, this.f33040i, c4157n2, this);
    }

    @Override // com.ironsource.AbstractC4158n3
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        tn.p.j(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.AbstractC4158n3
    @NotNull
    public L0 g() {
        return new C4140m5();
    }

    @Override // com.ironsource.AbstractC4158n3
    @NotNull
    public String l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4158n3
    @NotNull
    public String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean v() {
        return false;
    }
}
