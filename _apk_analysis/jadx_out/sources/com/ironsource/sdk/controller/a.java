package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4042ge;
import com.ironsource.C4216q8;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4125l8;
import com.ironsource.InterfaceC4218qa;
import com.ironsource.Ng;
import com.ironsource.sg;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a implements InterfaceC4125l8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33590d = "loadWithUrl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33591e = "sendMessage";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f33592f = "removeAdView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f33593g = "webviewAction";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f33594h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33595i = "functionName";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33596j = "functionParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f33597k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f33598l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f33599m = "errMsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f33600n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ng f33601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4216q8 f33602b = C4216q8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f33603c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C0398a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f33605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f33606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33607d;

        private C0398a() {
        }
    }

    public a(Context context) {
        this.f33603c = context;
    }

    private C0398a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
        C0398a c0398a = new C0398a();
        c0398a.f33604a = jSONObjectJsonObjectInit.optString("functionName");
        c0398a.f33605b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        c0398a.f33606c = jSONObjectJsonObjectInit.optString("success");
        c0398a.f33607d = jSONObjectJsonObjectInit.optString("fail");
        return c0398a;
    }

    public void a(Ng ng2) {
        this.f33601a = ng2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC4218qa interfaceC4218qa) throws Exception {
        C0398a c0398aA = a(str);
        C4042ge c4042ge = new C4042ge();
        try {
            String str2 = c0398aA.f33604a;
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f33592f)) {
                        b10 = 2;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        b10 = 1;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        b10 = 0;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        b10 = 3;
                    }
                    break;
                case 1491535759:
                    if (str2.equals(f33593g)) {
                        b10 = 4;
                    }
                    break;
            }
            if (b10 == 0) {
                this.f33602b.a(this, c0398aA.f33605b, this.f33603c, c0398aA.f33606c, c0398aA.f33607d);
                return;
            }
            if (b10 == 1) {
                this.f33602b.d(c0398aA.f33605b, c0398aA.f33606c, c0398aA.f33607d);
                return;
            }
            if (b10 == 2) {
                this.f33602b.c(c0398aA.f33605b, c0398aA.f33606c, c0398aA.f33607d);
            } else if (b10 == 3) {
                this.f33602b.a(c0398aA.f33605b, c0398aA.f33606c, c0398aA.f33607d);
            } else {
                if (b10 != 4) {
                    throw new IllegalArgumentException(String.format(f33600n, c0398aA.f33604a));
                }
                this.f33602b.b(c0398aA.f33605b, c0398aA.f33606c, c0398aA.f33607d);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            c4042ge.b("errMsg", e10.getMessage());
            String strC = this.f33602b.c(c0398aA.f33605b);
            if (!TextUtils.isEmpty(strC)) {
                c4042ge.b("adViewId", strC);
            }
            interfaceC4218qa.a(false, c0398aA.f33607d, c4042ge);
        }
    }

    @Override // com.ironsource.InterfaceC4125l8
    public void a(String str, String str2, String str3) {
        a(str, sg.a(str2, str3));
    }

    @Override // com.ironsource.InterfaceC4125l8
    public void a(String str, JSONObject jSONObject) {
        if (this.f33601a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f33601a.a(str, jSONObject);
    }
}
