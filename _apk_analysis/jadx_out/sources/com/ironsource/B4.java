package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class B4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28827c = "B4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28828d = "setSharedSignal";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28829e = "getSharedSignal";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f28830f = "functionName";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f28831g = "functionParams";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f28832h = "success";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f28833i = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A4 f28835b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f28837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f28838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f28839d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f28836a = jSONObject.optString("functionName");
            aVar.f28837b = jSONObject.optJSONObject("functionParams");
            aVar.f28838c = jSONObject.optString("success");
            aVar.f28839d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public B4(Context context, A4 a42) {
        this.f28834a = context;
        this.f28835b = a42;
    }

    private a a(String str) throws JSONException {
        return a.a(IronSourceVideoBridge.jsonObjectInit(str));
    }

    private void a(Context context, a aVar, InterfaceC4218qa interfaceC4218qa) {
        C4042ge c4042ge = new C4042ge();
        JSONObject jSONObject = aVar.f28837b;
        c4042ge.b("data", this.f28835b.a(context, EnumC4364z4.a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC4218qa.a(true, aVar.f28838c, c4042ge);
    }

    private void a(a aVar, InterfaceC4218qa interfaceC4218qa, Exception exc) {
        C4228r4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f28827c, aVar.f28836a + " exception " + message);
        C4042ge c4042ge = new C4042ge();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c4042ge.b("error", message);
        interfaceC4218qa.a(false, aVar.f28839d, c4042ge);
    }

    private void b(Context context, a aVar, InterfaceC4218qa interfaceC4218qa) {
        C4042ge c4042ge = new C4042ge();
        JSONObject jSONObject = aVar.f28837b;
        this.f28835b.a(context, EnumC4364z4.a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC4218qa.a(true, aVar.f28838c, c4042ge);
    }

    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        a aVarA = a(str);
        try {
            String str2 = aVarA.f28836a;
            byte b10 = -1;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(f28828d)) {
                    b10 = 0;
                }
            } else if (str2.equals(f28829e)) {
                b10 = 1;
            }
            if (b10 == 0) {
                b(this.f28834a, aVarA, interfaceC4218qa);
            } else {
                if (b10 == 1) {
                    a(this.f28834a, aVarA, interfaceC4218qa);
                    return;
                }
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e10) {
            a(aVarA, interfaceC4218qa, e10);
        }
    }
}
