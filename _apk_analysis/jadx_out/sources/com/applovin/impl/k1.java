package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8597c;

    public k1(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f8595a = JsonUtils.getString(jSONObject, "name", "");
        this.f8596b = JsonUtils.getString(jSONObject, UnifiedMediationParams.KEY_DESCRIPTION, "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f8597c = n7.a(list);
        } else {
            this.f8597c = n7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || n7.a(str2, str) != 1) {
            return str3 == null || n7.a(str3, str) != -1;
        }
        return false;
    }

    public String a() {
        return this.f8596b;
    }

    public String b() {
        return this.f8595a;
    }

    public boolean c() {
        return this.f8597c;
    }
}
