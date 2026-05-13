package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Ec extends wg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final W0 f29262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f29263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
        super(w02, abstractC4309w0);
        tn.p.k(w02, "tools");
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f29262e = w02;
        this.f29263f = abstractC4309w0;
    }

    private final void a(xg xgVar, C4101k2 c4101k2, D d10) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f29262e, (String) null, (String) null, 3, (Object) null));
        xgVar.a(a(d(), c(), c4101k2, d10));
    }

    private final C4101k2 b() {
        return new C4101k2("", IronSourceVideoBridge.jsonObjectInit(), null, 0, "");
    }

    private final Map<String, H> c() {
        Hf hfG = this.f29263f.b().g();
        List<NetworkSettings> listM = this.f29263f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f29263f.b().a())) {
                if (!networkSettings.isBidder(this.f29263f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pairA = bn.h.a(networkSettings2.getProviderInstanceName(), new H(this.f29262e, this.f29263f, networkSettings2));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C4157n2> d() {
        Hf hfG = this.f29263f.b().g();
        List<NetworkSettings> listM = this.f29263f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (hfG == null || hfG.a(networkSettings, this.f29263f.b().a())) {
                if (!networkSettings.isBidder(this.f29263f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4157n2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.wg
    public void a(@NotNull D d10, @NotNull xg xgVar) {
        tn.p.k(d10, "adInstanceFactory");
        tn.p.k(xgVar, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f29262e, "auction disabled", (String) null, 2, (Object) null));
        a(xgVar, b(), d10);
    }

    public final void a(@NotNull xg xgVar, int i10, @NotNull String str, @NotNull String str2, @NotNull D d10) {
        tn.p.k(xgVar, "waterfallFetcherListener");
        tn.p.k(str, IronSourceConstants.AUCTION_FALLBACK);
        tn.p.k(str2, "auctionId");
        tn.p.k(d10, "adInstanceFactory");
        a(xgVar, new C4101k2(str2, IronSourceVideoBridge.jsonObjectInit(), null, i10, str), d10);
    }
}
