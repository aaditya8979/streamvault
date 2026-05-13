package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.B7;
import com.ironsource.C3978d4;
import com.ironsource.C4042ge;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.Lb;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33740c = "i";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33741d = "getDeviceData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33742e = "deviceDataFunction";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f33743f = "deviceDataParams";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f33744g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33745h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f33747b = Lb.U().i();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f33749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33751d;

        private a() {
        }
    }

    public i(Context context) {
        this.f33746a = context;
    }

    private C4042ge a() {
        C4042ge c4042ge = new C4042ge();
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31394i0), SDKUtils.encodeString(String.valueOf(this.f33747b.j())));
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31396j0), SDKUtils.encodeString(String.valueOf(this.f33747b.q(this.f33746a))));
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31398k0), SDKUtils.encodeString(String.valueOf(this.f33747b.C(this.f33746a))));
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31400l0), SDKUtils.encodeString(String.valueOf(this.f33747b.D(this.f33746a))));
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31402m0), SDKUtils.encodeString(String.valueOf(this.f33747b.e(this.f33746a))));
        c4042ge.b(SDKUtils.encodeString(C3978d4.j.f31404n0), SDKUtils.encodeString(String.valueOf(this.f33747b.h(this.f33746a))));
        return c4042ge;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.f33748a = jSONObjectJsonObjectInit.optString(f33742e);
        aVar.f33749b = jSONObjectJsonObjectInit.optJSONObject(f33743f);
        aVar.f33750c = jSONObjectJsonObjectInit.optString("success");
        aVar.f33751d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }

    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        a aVarA = a(str);
        if (f33741d.equals(aVarA.f33748a)) {
            interfaceC4218qa.a(true, aVarA.f33750c, a());
            return;
        }
        Logger.i(f33740c, "unhandled API request " + str);
    }
}
