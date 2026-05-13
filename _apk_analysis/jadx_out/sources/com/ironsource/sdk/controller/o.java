package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4042ge;
import com.ironsource.C4228r4;
import com.ironsource.Gc;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33803c = "o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33804d = "activate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33805e = "startSession";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f33806f = "finishSession";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f33807g = "impressionOccurred";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33808h = "getOmidData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33809i = "omidFunction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33810j = "omidParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f33811k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f33812l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f33813m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gc f33815b = new Gc();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f33817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33819d;

        private a() {
        }
    }

    public o(Context context) {
        this.f33814a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f33816a = jSONObjectJsonObjectInit.optString(f33809i);
        aVar.f33817b = jSONObjectJsonObjectInit.optJSONObject(f33810j);
        aVar.f33818c = jSONObjectJsonObjectInit.optString("success");
        aVar.f33819d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        a aVarA = a(str);
        C4042ge c4042ge = new C4042ge();
        JSONObject jSONObject = aVarA.f33817b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c4042ge.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.f33816a;
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f33804d)) {
                        b10 = 0;
                    }
                    break;
                case -984459207:
                    if (str2.equals(f33808h)) {
                        b10 = 4;
                    }
                    break;
                case 70701699:
                    if (str2.equals(f33806f)) {
                        b10 = 2;
                    }
                    break;
                case 1208109646:
                    if (str2.equals(f33807g)) {
                        b10 = 3;
                    }
                    break;
                case 1850541012:
                    if (str2.equals(f33805e)) {
                        b10 = 1;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f33815b.a(this.f33814a);
                c4042ge = this.f33815b.a();
            } else if (b10 == 1) {
                this.f33815b.d(aVarA.f33817b);
            } else if (b10 == 2) {
                this.f33815b.b(aVarA.f33817b);
            } else if (b10 == 3) {
                this.f33815b.c(aVarA.f33817b);
            } else {
                if (b10 != 4) {
                    throw new IllegalArgumentException(String.format(f33813m, aVarA.f33816a));
                }
                c4042ge = this.f33815b.a();
            }
            interfaceC4218qa.a(true, aVarA.f33818c, c4042ge);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            c4042ge.b("errMsg", e10.getMessage());
            Logger.i(f33803c, "OMIDJSAdapter " + aVarA.f33816a + " Exception: " + e10.getMessage());
            interfaceC4218qa.a(false, aVarA.f33819d, c4042ge);
        }
    }
}
