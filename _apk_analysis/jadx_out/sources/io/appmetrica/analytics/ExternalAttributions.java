package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Bc;
import io.appmetrica.analytics.impl.C4780fb;
import io.appmetrica.analytics.impl.C4783fe;
import io.appmetrica.analytics.impl.C4886je;
import io.appmetrica.analytics.impl.K9;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        return obj == null ? new C4783fe(K9.ADJUST) : new C4886je(K9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        return map == null ? new C4783fe(K9.AIRBRIDGE) : new Bc(K9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        return map == null ? new C4783fe(K9.APPSFLYER) : new Bc(K9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        return jSONObject == null ? new C4783fe(K9.KOCHAVA) : new C4780fb(K9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        return map == null ? new C4783fe(K9.SINGULAR) : new Bc(K9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        return map == null ? new C4783fe(K9.TENJIN) : new Bc(K9.TENJIN, map);
    }
}
