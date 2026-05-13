package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.b;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52074b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52075c = "dynamicMarkup";

    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.K().matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        return matcher.group(1);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    public b.a a() {
        b.a aVarA = super.a();
        if (this.f52067a.optString("bundleId", null) == null) {
            aVarA.f52069b = a(aVarA.f52071d);
        }
        return aVarA;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(f52075c);
    }
}
