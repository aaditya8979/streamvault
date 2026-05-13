package com.ironsource;

import com.ironsource.A3;
import com.ironsource.Q1;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f30191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f30192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, H> f30193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4012f2 f30194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<CallableC4329x3> f30195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f30196f;

    public static final class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3 f30197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q1 f30198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ A3.b f30199d;

        public a(A3 a32, Q1 q12, A3.b bVar) {
            this.f30197b = a32;
            this.f30198c = q12;
            this.f30199d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f30197b.a(this.f30198c.e(), this.f30199d, this.f30198c.f30192b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class b implements InterfaceC4346y3 {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4346y3
        public void a(@Nullable NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA = null;
            if (Q1.this.h()) {
                BaseAdAdapter baseAdAdapterB = Q1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = Q1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                Q1.this.f30191a.e().g().a(Q1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.ironsource.InterfaceC4346y3
        public void a(@Nullable String str) {
            Q1.this.f30191a.e().h().g(str);
        }
    }

    public static final class c implements A3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f30202b;

        public c(d dVar) {
            this.f30202b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q12, long j10, List list, List list2, d dVar) {
            tn.p.k(q12, "this$0");
            tn.p.k(list, "$biddingDataList");
            tn.p.k(list2, "$reachedTimeout");
            tn.p.k(dVar, "$biddingDataListener");
            q12.a(j10, list, list2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q12, String str, d dVar) {
            tn.p.k(q12, "this$0");
            tn.p.k(str, "$error");
            tn.p.k(dVar, "$biddingDataListener");
            q12.f30191a.e().g().a(str);
            dVar.a(q12, str);
        }

        @Override // com.ironsource.A3.b
        public void a(@NotNull final List<? extends B3> list, final long j10, @NotNull final List<String> list2) {
            tn.p.k(list, "biddingDataList");
            tn.p.k(list2, "reachedTimeout");
            W0 w02 = Q1.this.f30191a;
            final Q1 q12 = Q1.this;
            final d dVar = this.f30202b;
            w02.a(new Runnable() { // from class: com.ironsource.zi
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q12, j10, list, list2, dVar);
                }
            });
        }

        @Override // com.ironsource.A3.b
        public void onFailure(@NotNull final String str) {
            tn.p.k(str, "error");
            W0 w02 = Q1.this.f30191a;
            final Q1 q12 = Q1.this;
            final d dVar = this.f30202b;
            w02.a(new Runnable() { // from class: com.ironsource.yi
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q12, str, dVar);
                }
            });
        }
    }

    public interface d {
        void a(@NotNull Q1 q12);

        void a(@NotNull Q1 q12, @NotNull String str);
    }

    public Q1(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f30191a = w02;
        this.f30192b = abstractC4309w0;
        this.f30193c = a();
        this.f30194d = new C4012f2(abstractC4309w0);
        this.f30195e = new ArrayList();
        this.f30196f = abstractC4309w0.e().q();
        b bVarB = b();
        Hf hfG = abstractC4309w0.b().g();
        for (NetworkSettings networkSettings : abstractC4309w0.m()) {
            if (hfG == null || hfG.a(networkSettings, this.f30192b.b().a())) {
                AdData adDataA = this.f30192b.a(networkSettings);
                if (networkSettings.isBidder(this.f30192b.b().a())) {
                    Object objB = this.f30196f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof InterfaceC4363z3) {
                        this.f30195e.add(new CallableC4329x3(networkSettings.getInstanceType(this.f30192b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC4363z3) objB, bVarB, networkSettings));
                    } else {
                        this.f30191a.e().h().g(objB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else {
                    this.f30194d.a(networkSettings);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f30192b.b().a(), this.f30192b.b().b());
    }

    private final Map<String, H> a() {
        List<NetworkSettings> listM = this.f30192b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(listM, 10)), 16));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            H h10 = new H(this.f30191a, this.f30192b, (NetworkSettings) it.next());
            Pair pairA = bn.h.a(h10.c(), h10);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e10);
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f30192b.b().a())) : null);
        return map;
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.f30192b.a(str);
        if (this.f30196f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends B3> list, List<String> list2, d dVar) {
        this.f30191a.e().g().a(j10);
        for (B3 b32 : list) {
            String strC = b32.c();
            tn.p.j(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (b32.a() != null) {
                this.f30194d.a(b32);
                this.f30191a.e().g().a(mapA, b32.e());
            } else {
                this.f30191a.e().g().a(mapA, b32.e(), b32.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f30191a.e().g().b(a(it.next()), j10);
        }
        dVar.a(this);
    }

    private final A3.b b(d dVar) {
        return new c(dVar);
    }

    private final b b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        H h10 = this.f30193c.get(str);
        if (h10 != null) {
            return h10.b();
        }
        return null;
    }

    public final void a(@NotNull d dVar) {
        tn.p.k(dVar, "biddingDataListener");
        A3 a32 = new A3();
        A3.b bVarB = b(dVar);
        this.f30191a.e().g().a();
        this.f30191a.c((AbstractRunnableC4078ie) new a(a32, this, bVarB));
    }

    @NotNull
    public final Map<String, H> c() {
        return this.f30193c;
    }

    @NotNull
    public final C4012f2 d() {
        return this.f30194d;
    }

    @NotNull
    public final List<CallableC4329x3> e() {
        return this.f30195e;
    }

    public final boolean f() {
        return !this.f30195e.isEmpty();
    }

    public final boolean g() {
        return this.f30194d.d();
    }

    public final boolean h() {
        return this.f30196f;
    }
}
