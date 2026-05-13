package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.C3978d4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8558b = com.applovin.impl.sdk.k.o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8559c;

    public j4(com.applovin.impl.sdk.k kVar) {
        this.f8557a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f8559c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f8558b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f8559c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb2.append(line);
                    }
                } catch (Throwable th2) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th2);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
            }
        } catch (Throwable th4) {
            this.f8557a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8557a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f8558b);
        this.f8557a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f8557a.O();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Init ");
            sb2.append(d() ? "succeeded" : C3978d4.i.f31363t);
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append("ms");
            oVarO.a("OpenMeasurementService", sb2.toString());
        }
        h();
    }

    private void h() {
        this.f8557a.q0().a((i5) new r6(this.f8557a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.eb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8249b.f();
            }
        }), d6.b.OTHER);
    }

    public String a() {
        return this.f8559c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L17
            com.applovin.impl.sdk.k r0 = r3.f8557a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = com.applovin.impl.k4.a(r0, r5)     // Catch: java.lang.Throwable -> L1f
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L17
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r5, r4)     // Catch: java.lang.Throwable -> L1f
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.String r0 = r3.f8559c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L1f
            return r4
        L1f:
            r5 = move-exception
            com.applovin.impl.sdk.k r0 = r3.f8557a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L38
            com.applovin.impl.sdk.k r0 = r3.f8557a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.String r1 = "OpenMeasurementService"
            java.lang.String r2 = "Failed to inject JavaScript SDK into HTML"
            r0.a(r1, r2, r5)
        L38:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j4.a(java.lang.String, java.util.Map):java.lang.String");
    }

    public Partner b() {
        return Partner.createPartner((String) this.f8557a.a(x4.f10683b0), AppLovinSdk.VERSION);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f8557a.n0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f8557a.a(x4.f10675a0)).booleanValue()) {
            this.f8557a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8557a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.db
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8121b.g();
                }
            });
        }
    }
}
