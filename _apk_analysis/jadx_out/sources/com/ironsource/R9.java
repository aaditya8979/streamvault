package com.ironsource;

import android.content.Context;
import com.ironsource.Ne;
import com.ironsource.W;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final R9 f30343a = new R9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C4090j9 f30344b = new C4090j9();

    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NotNull IronSourceError ironSourceError) {
            tn.p.k(ironSourceError, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    public static final class b implements InterfaceC4238re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4122l5 f30346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InitListener f30347c;

        public b(Context context, C4122l5 c4122l5, InitListener initListener) {
            this.f30345a = context;
            this.f30346b = c4122l5;
            this.f30347c = initListener;
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull C4131le c4131le) {
            tn.p.k(c4131le, "sdkConfig");
            R9.f30343a.a(this.f30345a, c4131le.d(), this.f30346b, this.f30347c);
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull C4169ne c4169ne) {
            tn.p.k(c4169ne, "error");
            R9.f30343a.a(this.f30347c, this.f30346b, c4169ne);
        }
    }

    private R9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ne ne2, C4122l5 c4122l5, InitListener initListener) {
        String strT = com.ironsource.mediationsdk.r.m().t();
        C3947b9 c3947b9G = ne2.g();
        tn.p.j(c3947b9G, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = ne2.l().b("IronSource");
        tn.p.j(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        tn.p.j(interstitialSettings, "networkSettings.interstitialSettings");
        c3947b9G.a(new W.a(interstitialSettings));
        c3947b9G.a(ConfigFile.getConfigFile().getPluginType());
        c3947b9G.b(strT);
        new Y(new C4220qc()).a(context, c3947b9G, new a());
        a(ne2, c4122l5, initListener);
    }

    private final void a(Ne ne2, C4122l5 c4122l5, final InitListener initListener) {
        J1 j1E;
        A1 a1B = ne2.c().b();
        new Mb().a((a1B == null || (j1E = a1B.e()) == null) ? null : j1E.b(), true);
        String strT = com.ironsource.mediationsdk.r.m().t();
        C4093jc c4093jcA = C4093jc.f32072e.a();
        c4093jcA.a(ne2.l());
        c4093jcA.a(ne2.c());
        tn.p.j(strT, JsonStorageKeyNames.SESSION_ID_KEY);
        c4093jcA.a(strT);
        c4093jcA.g();
        long jA = C4122l5.a(c4122l5);
        C4090j9 c4090j9 = f30344b;
        Ne.a aVarI = ne2.i();
        tn.p.j(aVarI, "serverResponse.origin");
        c4090j9.a(jA, aVarI);
        c4090j9.b(new Runnable() { // from class: com.ironsource.hj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4169ne c4169ne, InitListener initListener, C4169ne c4169ne2) {
        tn.p.k(c4169ne, "$error");
        tn.p.k(c4169ne2, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + c4169ne);
        if (initListener != null) {
            initListener.onInitFailed(f30344b.a(c4169ne2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C4122l5 c4122l5, final C4169ne c4169ne) {
        long jA = C4122l5.a(c4122l5);
        C4090j9 c4090j9 = f30344b;
        final C4169ne c4169neB = c4090j9.b(c4169ne);
        c4090j9.a(c4169neB, jA);
        c4090j9.b(new Runnable() { // from class: com.ironsource.gj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(c4169ne, initListener, c4169neB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initListener) {
        tn.p.k(initRequest, "$initRequest");
        tn.p.k(context, "$context");
        tn.p.k(initListener, "$initializationListener");
        C4122l5 c4122l5 = new C4122l5();
        Ae.f28740a.c(context, new C4272te(initRequest.getAppKey(), null, cn.r.I0(f30344b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4122l5, initListener));
    }

    public final void a(@NotNull final Context context, @NotNull final InitRequest initRequest, @NotNull final InitListener initListener) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(initRequest, "initRequest");
        tn.p.k(initListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f30344b.a(new Runnable() { // from class: com.ironsource.fj
            @Override // java.lang.Runnable
            public final void run() {
                R9.a(initRequest, context, initListener);
            }
        });
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        com.ironsource.mediationsdk.r.m().a(str, arrayList);
    }
}
