package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3920a0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4287uc f30859a;

    /* JADX INFO: renamed from: com.ironsource.a0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30860a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30861b = 1000;

        private a() {
        }
    }

    public C3920a0(@NotNull InterfaceC4287uc interfaceC4287uc) {
        tn.p.k(interfaceC4287uc, "networkLoadApi");
        this.f30859a = interfaceC4287uc;
    }

    @Override // com.ironsource.Z
    @NotNull
    public String a() {
        return this.f30859a.a();
    }

    @Override // com.ironsource.Z
    public void a(@NotNull O9 o92, @NotNull Map<String, String> map) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(map, "loadParams");
        try {
            this.f30859a.a(o92, new C4321wc(null, false, 3, null));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + o92.e() + " failed. error: " + e10.getMessage());
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1000: loadAd failed: ");
            sb2.append(message);
            String string = sb2.toString();
            Hc hcB = o92.b();
            if (hcB instanceof C3998e6) {
                Hc hcB2 = o92.b();
                tn.p.i(hcB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C3998e6) hcB2).onInterstitialLoadFailed(string);
            } else if (hcB instanceof Jc) {
                Hc hcB3 = o92.b();
                tn.p.i(hcB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Jc) hcB3).onBannerLoadFail(string);
            }
        }
    }
}
