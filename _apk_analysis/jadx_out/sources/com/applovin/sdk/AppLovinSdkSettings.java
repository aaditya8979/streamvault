package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11229b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11234g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f11237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k f11238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f11239l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11231d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f11235h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f11236i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11230c = true;

    public AppLovinSdkSettings(Context context) {
        this.f11239l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f11228a = n7.m(contextE);
        this.f11237j = u0.a(contextE);
        this.f11239l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (k) null);
        this.f11235h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f11238k = kVar;
        if (StringUtils.isValidString(this.f11232e)) {
            kVar.s0().a(Arrays.asList(this.f11232e.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            this.f11232e = null;
        }
        if (this.f11233f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f11233f);
            }
            kVar.w0().a(this.f11233f);
            this.f11233f = null;
        }
        if (StringUtils.isValidString(this.f11234g)) {
            l.a(this.f11234g, kVar);
            this.f11234g = null;
        }
        for (Map.Entry entry : this.f11236i.entrySet()) {
            kVar.v0().a(d2.f8013k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.f11236i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f11235h) {
            map = CollectionUtils.map(this.f11235h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f11237j;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.f11238k;
        return kVar == null ? this.f11233f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f11230c;
    }

    public boolean isMuted() {
        return this.f11229b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f11228a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f11230c == z10) {
            return;
        }
        this.f11230c = z10;
        k kVar = this.f11238k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f11238k == null) {
                this.f11232e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f11238k.s0().a(Arrays.asList(strTrim.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            } else {
                this.f11238k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f11239l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f11238k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f11234g = strTrim;
            }
        }
        if (this.f11238k != null) {
            this.f11238k.v0().a(d2.f8013k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2));
        } else {
            this.f11236i.put(str, strTrim);
        }
        this.f11235h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f11229b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f11231d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.f11238k;
        if (kVar == null) {
            this.f11233f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            this.f11238k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f11238k.w0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!n7.l()) {
            this.f11228a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f11231d;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f11228a + ", muted=" + this.f11229b + ", creativeDebuggerEnabled=" + this.f11230c + '}';
    }
}
