package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Cf {
    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        tn.p.j(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(kotlin.collections.a.m(bn.h.a("deviceOS", C3978d4.f31183d), bn.h.a("appKey", str), bn.h.a("sdkVersion", str2), bn.h.a("bundleId", str3), bn.h.a("appName", str4), bn.h.a("appVersion", str5), bn.h.a("initResponse", jSONObject), bn.h.a("isRvManual", Boolean.valueOf(z10)), bn.h.a("generalProperties", jSONObject2), bn.h.a("adaptersVersion", jSONObject3), bn.h.a("metaData", jSONObject4), bn.h.a("gdprConsent", bool))).toString();
        tn.p.j(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, List<String>> entry : Kf.f29735a.d().entrySet()) {
            jSONObjectJsonObjectInit.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObjectJsonObjectInit;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        tn.p.j(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53132f);
        context.startActivity(intent);
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull String str2, @NotNull String str3, @Nullable Boolean bool, boolean z10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "appKey");
        tn.p.k(jSONObject, "initResponse");
        tn.p.k(str2, "sdkVersion");
        tn.p.k(str3, "testSuiteControllerUrl");
        Kf kf2 = Kf.f29735a;
        a(context, a(str, str2, kf2.c(context), kf2.a(context), kf2.b(context), bool, jSONObject, z10, kf2.b(), kf2.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", str3);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    @Nullable
    public final String b(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return a(context).getString("dataString", "");
    }
}
