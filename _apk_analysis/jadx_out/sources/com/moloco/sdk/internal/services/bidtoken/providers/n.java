package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.p0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f47238c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47239d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<j<?>> f47240b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull List<? extends j<?>> list) {
        tn.p.k(list, "signalProviders");
        this.f47240b = list;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        Iterator<j<?>> it = this.f47240b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        List<j<?>> list = this.f47240b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                boolean zB = jVar.b();
                if (zB) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "ClientBidTokenSignalProviderImpl", "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "ClientBidTokenSignalProviderImpl";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k d() {
        List<j<?>> list = this.f47240b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(p0.f(cn.x.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(tn.t.b(((j) obj).getClass()), obj);
        }
        Object obj2 = linkedHashMap.get(tn.t.b(x.class));
        tn.p.i(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.SDKInitStateSignalProvider");
        boolean zBooleanValue = ((x) obj2).d().booleanValue();
        Object obj3 = linkedHashMap.get(tn.t.b(w.class));
        tn.p.i(obj3, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.PrivacyStateSignalProvider");
        MolocoPrivacy.PrivacySettings privacySettingsD = ((w) obj3).d();
        Object obj4 = linkedHashMap.get(tn.t.b(t.class));
        tn.p.i(obj4, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.MemorySignalProvider");
        s sVarD = ((t) obj4).d();
        Object obj5 = linkedHashMap.get(tn.t.b(e.class));
        tn.p.i(obj5, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AppDirInfoSignalProvider");
        d dVarD = ((e) obj5).d();
        Object obj6 = linkedHashMap.get(tn.t.b(v.class));
        tn.p.i(obj6, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.NetworkInfoSignalProvider");
        u uVarD = ((v) obj6).d();
        Object obj7 = linkedHashMap.get(tn.t.b(i.class));
        tn.p.i(obj7, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.BatteryInfoSignalProvider");
        h hVarD = ((i) obj7).d();
        Object obj8 = linkedHashMap.get(tn.t.b(c.class));
        tn.p.i(obj8, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AdvertisingSignalProvider");
        com.moloco.sdk.internal.services.o oVarD = ((c) obj8).d();
        Object obj9 = linkedHashMap.get(tn.t.b(p.class));
        tn.p.i(obj9, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.DeviceSignalProvider");
        o oVarD2 = ((p) obj9).d();
        Object obj10 = linkedHashMap.get(tn.t.b(g.class));
        tn.p.i(obj10, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AudioSignalProvider");
        f fVarD = ((g) obj10).d();
        Object obj11 = linkedHashMap.get(tn.t.b(b.class));
        tn.p.i(obj11, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AccessibilitySignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarD = ((b) obj11).d();
        Object obj12 = linkedHashMap.get(tn.t.b(r.class));
        tn.p.i(obj12, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.IlrdSignalProvider");
        q qVarD = ((r) obj12).d();
        Object obj13 = linkedHashMap.get(tn.t.b(z.class));
        tn.p.i(obj13, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.TestConfigSignalProvider");
        return new k(zBooleanValue, privacySettingsD, sVarD, dVarD, uVarD, hVarD, oVarD, oVarD2, fVarD, aVarD, qVarD, ((z) obj13).d());
    }
}
