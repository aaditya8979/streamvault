package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f34352d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f34353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f34354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Vc f34355c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final wg a(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
            tn.p.k(w02, "adTools");
            tn.p.k(abstractC4309w0, "adUnitData");
            return abstractC4309w0.t() ? new C4210q2(w02, abstractC4309w0) : new Ec(w02, abstractC4309w0);
        }
    }

    public static final class b implements Vc {
    }

    public wg(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f34353a = w02;
        this.f34354b = abstractC4309w0;
        this.f34355c = new b();
    }

    private final A a(C4157n2 c4157n2, C4101k2 c4101k2, D d10, H h10) {
        AbstractC4309w0 abstractC4309w0 = this.f34354b;
        String strC = c4157n2.c();
        tn.p.j(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC4309w0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c4157n2.c();
            tn.p.j(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (h10 == null) {
            String strC3 = c4157n2.c();
            tn.p.j(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f34354b.b().a(), this.f34354b.b().b());
        int iF = this.f34353a.f();
        AbstractC4309w0 abstractC4309w02 = this.f34354b;
        return d10.a(new B(abstractC4309w02, networkSettingsA, c4101k2, new C3957c1(networkSettingsA, abstractC4309w02.b(networkSettingsA), this.f34354b.b().a()), c4157n2, iF), h10);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C4173o0.a(this.f34353a, str3, (String) null, 2, (Object) null));
        this.f34353a.e().h().i(str3);
    }

    @NotNull
    public Vc a() {
        return this.f34355c;
    }

    @NotNull
    public final yg a(@NotNull List<? extends C4157n2> list, @NotNull Map<String, H> map, @NotNull C4101k2 c4101k2, @NotNull D d10) {
        tn.p.k(list, "waterfallItems");
        tn.p.k(map, "adInstancePayloads");
        tn.p.k(c4101k2, Ne.E1);
        tn.p.k(d10, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34353a, "waterfall.size() = " + list.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4157n2 c4157n2 = list.get(i10);
            A a10 = a(c4157n2, c4101k2, d10, map.get(c4157n2.c()));
            if (a10 != null && a10.g() != null) {
                arrayList.add(a10);
            }
        }
        yg ygVar = new yg(arrayList);
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34353a, "updateWaterfall() - next waterfall is " + ygVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return ygVar;
    }

    public abstract void a(@NotNull D d10, @NotNull xg xgVar);
}
