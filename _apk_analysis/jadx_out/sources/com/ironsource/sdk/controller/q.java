package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C4042ge;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33835b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33836c = "getPermissions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33837d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33838e = "permissions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f33839f = "permission";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f33840g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33841h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33842i = "functionParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33843j = "success";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f33844k = "fail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f33845l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33846a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f33848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33850d;

        private a() {
        }
    }

    public q(Context context) {
        this.f33846a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f33847a = jSONObjectJsonObjectInit.optString("functionName");
        aVar.f33848b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        aVar.f33849c = jSONObjectJsonObjectInit.optString("success");
        aVar.f33850d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        a aVarA = a(str);
        if (f33836c.equals(aVarA.f33847a)) {
            a(aVarA.f33848b, aVarA, interfaceC4218qa);
            return;
        }
        if (f33837d.equals(aVarA.f33847a)) {
            b(aVarA.f33848b, aVarA, interfaceC4218qa);
            return;
        }
        Logger.i(f33835b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4218qa interfaceC4218qa) {
        C4042ge c4042ge = new C4042ge();
        try {
            c4042ge.a(f33838e, C1.a(this.f33846a, jSONObject.getJSONArray(f33838e)));
            interfaceC4218qa.a(true, aVar.f33849c, c4042ge);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f33835b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            c4042ge.b("errMsg", e10.getMessage());
            interfaceC4218qa.a(false, aVar.f33850d, c4042ge);
        }
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC4218qa interfaceC4218qa) {
        C4042ge c4042ge = new C4042ge();
        try {
            String string = jSONObject.getString(f33839f);
            c4042ge.b(f33839f, string);
            if (C1.d(this.f33846a, string)) {
                c4042ge.b("status", String.valueOf(C1.c(this.f33846a, string)));
                interfaceC4218qa.a(true, aVar.f33849c, c4042ge);
            } else {
                c4042ge.b("status", f33845l);
                interfaceC4218qa.a(false, aVar.f33850d, c4042ge);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            c4042ge.b("errMsg", e10.getMessage());
            interfaceC4218qa.a(false, aVar.f33850d, c4042ge);
        }
    }
}
