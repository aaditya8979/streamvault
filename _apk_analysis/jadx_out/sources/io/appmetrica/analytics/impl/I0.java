package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class I0 {
    public static H0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), bo.c.f5639b));
            return new H0(jSONObject.getString("apiKey"), jSONObject.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(H0 h02) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", h02.f65299a).put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, h02.f65300b).put("reporterType", h02.f65301c.getStringValue()).put("processID", h02.f65302d).put("processSessionID", h02.f65303e).put("errorEnvironment", h02.f65304f).toString().getBytes(bo.c.f5639b), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
