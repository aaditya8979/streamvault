package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class S5 implements Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30369a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f30370b = T5.f30475j;

    public static final class a implements InterfaceC4088j7 {
        @Override // com.ironsource.InterfaceC4088j7
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObjectJsonObjectInit.put("deviceType", IronSourceUtils.b(applicationContext));
            T9 t9D = IronSourceUtils.d(applicationContext);
            if (t9D != null) {
                jSONObjectJsonObjectInit.put("advId", t9D.c());
                jSONObjectJsonObjectInit.put("advIdType", t9D.d());
            }
        }
        String strN = com.ironsource.mediationsdk.r.m().n();
        if (strN != null) {
            jSONObjectJsonObjectInit.put(C3978d4.j.f31389g, strN);
        }
        return jSONObjectJsonObjectInit;
    }

    @Override // com.ironsource.Lc
    public void a() {
    }

    public final void a(@NotNull String str, @NotNull JSONObject jSONObject) {
        tn.p.k(str, "dataSource");
        tn.p.k(jSONObject, "impressionData");
        if (!this.f30369a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.putOpt("externalMediationSource", str);
            jSONObjectJsonObjectInit.putOpt("externalMediationData", jSONObject);
            jSONObjectJsonObjectInit.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObjectJsonObjectInit);
            C4071i7.a(this.f30370b, jSONObjectJsonObjectInit.toString(), new a());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.API.error("exception " + e10.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Lc
    public void a(@Nullable List<IronSource.a> list, boolean z10, @Nullable T3 t32) {
        if (t32 != null) {
            A1 a1B = t32.b();
            K1 k1F = a1B != null ? a1B.f() : null;
            tn.p.h(k1F);
            this.f30369a = k1F.l();
            this.f30370b = t32.b().f().d();
        }
    }

    @Override // com.ironsource.Lc
    public void h(@Nullable String str) {
    }
}
