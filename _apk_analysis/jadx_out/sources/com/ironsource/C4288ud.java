package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4288ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f34203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C4355yc> f34204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f34205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSource.a f34206d;

    /* JADX INFO: renamed from: com.ironsource.ud$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34207a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34207a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ud$b */
    public static final class b extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f34209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdapterBaseInterface f34210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdData f34211e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f34209c = networkSettings;
            this.f34210d = adapterBaseInterface;
            this.f34211e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            C4288ud c4288ud = C4288ud.this;
            NetworkSettings networkSettings = this.f34209c;
            AdapterBaseInterface adapterBaseInterface = this.f34210d;
            tn.p.j(adapterBaseInterface, "networkAdapter");
            c4288ud.a(networkSettings, adapterBaseInterface, this.f34211e);
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a(@NotNull Throwable th2) {
            tn.p.k(th2, "t");
            C4288ud.this.f34203a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.f34209c.getProviderName() + " - " + th2);
        }
    }

    public C4288ud(@NotNull W0 w02, @NotNull LevelPlay.AdFormat adFormat, @NotNull List<C4355yc> list, @NotNull AbstractC4309w0 abstractC4309w0) {
        tn.p.k(w02, "adUnitTools");
        tn.p.k(adFormat, "adFormat");
        tn.p.k(list, Ne.f29986y0);
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f34203a = w02;
        this.f34204b = list;
        this.f34205c = abstractC4309w0;
        this.f34206d = a(adFormat);
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f34207a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        W0 w02 = this.f34203a;
        tn.x xVar = tn.x.f85368a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        tn.p.j(str2, "format(format, *args)");
        ironLog.verbose(C4173o0.a(w02, str2, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        W0 w02 = this.f34203a;
        IronSource.a aVar = this.f34206d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        tn.p.j(providerInstanceName, "providerSettings.providerInstanceName");
        if (w02.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f34206d);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34203a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C4355yc> it = this.f34204b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.f34206d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                C4341xf.a(C4341xf.f34397a, new b(networkSettingsF, adapterBaseInterfaceB, this.f34205c.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }
}
