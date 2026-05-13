package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4203pc f30679a;

    public static final class a implements Mc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3947b9 f30680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InitListener f30681b;

        public a(C3947b9 c3947b9, InitListener initListener) {
            this.f30680a = c3947b9;
            this.f30681b = initListener;
        }

        @Override // com.ironsource.Mc
        public void onFail(@NotNull C4283u8 c4283u8) {
            tn.p.k(c4283u8, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + c4283u8);
            this.f30681b.onInitFailed(C4365z5.f34494a.a(new IronSourceError(c4283u8.a(), c4283u8.b())));
        }

        @Override // com.ironsource.Mc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            W wE = this.f30680a.e();
            ironLog.verbose("controllerURL = " + (wE != null ? wE.c() : null));
            W wE2 = this.f30680a.e();
            ironLog.verbose("controllerConfig = " + (wE2 != null ? wE2.a() : null));
            W wE3 = this.f30680a.e();
            ironLog.verbose("debugMode = " + (wE3 != null ? Integer.valueOf(wE3.b()) : null));
            ironLog.verbose("applicationKey = " + this.f30680a.d());
            ironLog.verbose("userId = " + this.f30680a.h());
            this.f30681b.onInitSuccess();
        }
    }

    public Y(@NotNull InterfaceC4203pc interfaceC4203pc) {
        tn.p.k(interfaceC4203pc, "networkInitApi");
        this.f30679a = interfaceC4203pc;
    }

    @Override // com.ironsource.X
    public void a(@NotNull Context context, @NotNull C3947b9 c3947b9, @NotNull InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3947b9, "initConfig");
        tn.p.k(initListener, "initListener");
        InterfaceC4203pc interfaceC4203pc = this.f30679a;
        W wE = c3947b9.e();
        interfaceC4203pc.a(wE != null ? wE.b() : 0);
        W wE2 = c3947b9.e();
        if (wE2 != null && (strC = wE2.c()) != null) {
            this.f30679a.b(strC);
        }
        W wE3 = c3947b9.e();
        if (wE3 != null && (jSONObjectA = wE3.a()) != null) {
            InterfaceC4203pc interfaceC4203pc2 = this.f30679a;
            String string = jSONObjectA.toString();
            tn.p.j(string, "applicationConfig.toString()");
            interfaceC4203pc2.a(string);
        }
        Map<String, String> mapA = new C4167nc().a();
        this.f30679a.a(new a(c3947b9, initListener));
        this.f30679a.a(context, c3947b9.d(), c3947b9.h(), mapA);
    }
}
