package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52062b = "MraidParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52063c = "markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52064d = "advDomain";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f52065e = "creativeId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52066f = "content";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JSONObject f52067a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f52069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f52072e;

        public a() {
        }
    }

    public b(JSONObject jSONObject) {
        this.f52067a = jSONObject;
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.ay().matcher(str);
        if (matcher.find()) {
            return c(matcher.group(0));
        }
        return null;
    }

    private String b(String str) {
        Matcher matcher = com.safedk.android.utils.f.az().matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String c(String str) {
        String strE = k.e(com.safedk.android.utils.f.aA(), str);
        Logger.d(f52062b, "found click url: " + strE);
        return strE;
    }

    public a a() {
        a aVar = new a();
        if (this.f52067a != null) {
            try {
                String string = this.f52067a.getString("content");
                aVar.f52068a = this.f52067a.getString("creativeId");
                aVar.f52070c = this.f52067a.optString(f52064d, null);
                aVar.f52071d = a(new JSONObject(string));
                Logger.d(f52062b, "mraid Markup (url encoded)=" + aVar.f52071d);
                aVar.f52069b = a(aVar.f52071d);
                Logger.d(f52062b, "mraid clickURL = " + aVar.f52069b);
                aVar.f52072e = b(aVar.f52071d);
                Logger.d(f52062b, "mraid videoUrl = " + aVar.f52072e);
            } catch (JSONException e10) {
                Logger.d(f52062b, "mraid error " + e10.getMessage() + " parsing" + this.f52067a.toString());
            }
        }
        return aVar;
    }

    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString("markup");
    }
}
