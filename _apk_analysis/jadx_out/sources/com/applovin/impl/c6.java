package com.applovin.impl;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.d6;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class c6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7932g;

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f7932g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f7932g.D().a("license_validation", exc);
        }
        this.f7932g.q0().a(new s6(this.f7932g, p2Var, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7932g.S().a(this.f7932g.e().b());
    }

    private void f() {
        if (this.f7932g.S().c()) {
            return;
        }
        Activity activityU0 = this.f7932g.u0();
        if (activityU0 != null) {
            this.f7932g.S().a(activityU0);
            return;
        }
        this.f7932g.D().a(d2.D0, this.f8506b + ":maybeInitializeAdapters()");
        this.f7932g.q0().a(new r6(this.f7932g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.k9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8620b.e();
            }
        }), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    private void g() {
        String str;
        boolean zC = this.f7932g.o0().c();
        Map mapP = this.f7932g.A().p();
        Map mapM = this.f7932g.A().M();
        String strA = zC ? this.f7932g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f7932g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f7932g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a(IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str).a(ExifInterface.TAG_MODEL, mapP.get("model")).a("Locale", mapP.get(CommonUrlParts.LOCALE)).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f7932g.i0()).a("Mediation Provider", this.f7932g.V()).a("TG", m7.a(this.f7932g)).a("MD", this.f7932g.a(x4.f10837t)).a("Test Mode On", Boolean.valueOf(this.f7932g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.f7932g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f7932g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.f7932g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f7932g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.f7932g.a(x4.f10877y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f11044i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.f7932g.a(x4.f10885z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f7932g.N().a(l10.longValue()).a(this.f7932g.q0().a("lv_task"), new s4.b() { // from class: com.applovin.impl.j9
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f8570a.a(z10, (p2) obj, (Exception) obj2);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sb2;
        str = "succeeded";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f7932g.G().b(a());
            this.f7932g.G().e(a());
            this.f7932g.q0().a((i5) new j5(this.f7932g), d6.b.OTHER);
            this.f7932g.A().b0();
            this.f7932g.l0().c();
            this.f7932g.y().l();
            if (n7.c(this.f7932g)) {
                this.f7932g.a();
            }
            this.f7932g.X0();
            g();
            f();
            this.f7932g.a(true);
            h();
            this.f7932g.f0().b();
            this.f7932g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f7932g.a(x4.C2)).booleanValue()) {
                this.f7932g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f7932g.F().maybeTrackAppOpenEvent();
            this.f7932g.z().a();
            if (((Boolean) this.f7932g.a(x4.P2)).booleanValue()) {
                this.f7932g.x0().b();
            }
            if (((Boolean) this.f7932g.a(x4.X0)).booleanValue()) {
                this.f7932g.h().b();
            } else {
                this.f7932g.h().g();
            }
            if (this.f7932g.U().g() || (((Boolean) this.f7932g.a(r3.f9758u7)).booleanValue() && n7.c(this.f7932g) && this.f7932g.G0())) {
                this.f7932g.U().e();
            }
            this.f7932g.e0().i();
        } catch (Throwable th2) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th2);
                this.f7932g.a(false);
                a(th2);
                if (((Boolean) this.f7932g.a(x4.f10745i)).booleanValue()) {
                    this.f7932g.f0().a();
                }
                if (((Boolean) this.f7932g.a(x4.f10736h)).booleanValue()) {
                    this.f7932g.T0();
                }
                this.f7932g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f8507c;
                str2 = this.f8506b;
                sb2 = new StringBuilder();
                sb2.append("AppLovin SDK ");
                sb2.append(AppLovinSdk.VERSION);
                sb2.append(" initialization ");
                if (!this.f7932g.B0()) {
                }
            } catch (Throwable th3) {
                this.f7932g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f8507c;
                    String str3 = this.f8506b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AppLovin SDK ");
                    sb3.append(AppLovinSdk.VERSION);
                    sb3.append(" initialization ");
                    sb3.append(this.f7932g.B0() ? "succeeded" : C3978d4.i.f31363t);
                    sb3.append(" in ");
                    sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb3.append("ms");
                    oVar2.a(str3, sb3.toString());
                }
                throw th3;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f8507c;
            str2 = this.f8506b;
            sb2 = new StringBuilder();
            sb2.append("AppLovin SDK ");
            sb2.append(AppLovinSdk.VERSION);
            sb2.append(" initialization ");
            if (!this.f7932g.B0()) {
                str = C3978d4.i.f31363t;
            }
            sb2.append(str);
            sb2.append(" in ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append("ms");
            oVar.a(str2, sb2.toString());
        }
    }
}
