package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4042ge;
import com.ironsource.C4185oc;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.Zf;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33857d = "u";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33858e = "updateToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f33859f = "getToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f33860g = "functionName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33861h = "functionParams";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33862i = "success";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33863j = "fail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33865b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4185oc f33864a = new C4185oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Zf f33866c = new Zf();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f33868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33870d;

        private a() {
        }
    }

    public u(Context context) {
        this.f33865b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f33867a = jSONObjectJsonObjectInit.optString("functionName");
        aVar.f33868b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        aVar.f33869c = jSONObjectJsonObjectInit.optString("success");
        aVar.f33870d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    private void a(a aVar, InterfaceC4218qa interfaceC4218qa) {
        try {
            JSONObject jSONObjectA = this.f33866c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC4218qa.a(true, aVar.f33869c, jSONObjectA);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            interfaceC4218qa.a(false, aVar.f33870d, e10.getMessage());
        }
    }

    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        a aVarA = a(str);
        if (f33858e.equals(aVarA.f33867a)) {
            a(aVarA.f33868b, aVarA, interfaceC4218qa);
            return;
        }
        if (f33859f.equals(aVarA.f33867a)) {
            a(aVarA, interfaceC4218qa);
            return;
        }
        Logger.i(f33857d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4218qa interfaceC4218qa) {
        C4042ge c4042ge = new C4042ge();
        try {
            this.f33864a.a(jSONObject);
            interfaceC4218qa.a(true, aVar.f33869c, c4042ge);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f33857d, "updateToken exception " + e10.getMessage());
            interfaceC4218qa.a(false, aVar.f33870d, c4042ge);
        }
    }
}
