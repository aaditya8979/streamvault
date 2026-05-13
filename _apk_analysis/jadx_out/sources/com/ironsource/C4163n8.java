package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4163n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4125l8 f33080a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f33082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33084e = C4163n8.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f33085f = {"handleGetViewVisibility"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f33086g = {C4089j8.f32051h, C4089j8.f32052i, C4089j8.f32050g, "handleGetViewVisibility", C4089j8.f32053j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4189og f33081b = new C4189og();

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33090d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f33087a = str;
            this.f33088b = str2;
            this.f33089c = str3;
            this.f33090d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C4163n8.this.b(this.f33087a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f33087a;
                    Log.e(C4163n8.this.f33084e, str);
                    C4163n8.this.a(this.f33088b, str);
                    return;
                }
                if (this.f33087a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C4163n8.this.e(this.f33089c);
                } else if (this.f33087a.equalsIgnoreCase(C4089j8.f32053j) || this.f33087a.equalsIgnoreCase(C4089j8.f32052i)) {
                    C4163n8.this.a(this.f33090d.getString("params"), this.f33089c, this.f33088b);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f33087a;
                Log.e(C4163n8.this.f33084e, str2);
                C4163n8.this.a(this.f33088b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33093b;

        public b(String str, String str2) {
            this.f33092a = str;
            this.f33093b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4163n8.this.f33082c.evaluateJavascript(this.f33092a, null);
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                Log.e(C4163n8.this.f33084e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f33093b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private String a(String str) {
        return String.format(C4089j8.f32064u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("id", jSONObject.getString("id"));
            jSONObjectJsonObjectInit.put("data", this.f33081b.a());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Log.e(this.f33084e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f33086g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        if (this.f33080a == null || this.f33081b == null) {
            return;
        }
        a(C4089j8.f32044a, a());
    }

    private void d(String str) {
        V7.f30593a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    private boolean h(String str) {
        for (String str2 : this.f33085f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C4089j8.f32054k);
    }

    public JSONObject a() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit2.put(C4089j8.f32062s, this.f33081b.a());
            jSONObjectJsonObjectInit.put(C4089j8.f32059p, jSONObjectJsonObjectInit2);
            jSONObjectJsonObjectInit.put("adViewId", c());
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public void a(WebView webView) {
        this.f33082c = webView;
    }

    public void a(InterfaceC4125l8 interfaceC4125l8) {
        this.f33080a = interfaceC4125l8;
    }

    public void a(String str, int i10, boolean z10) {
        this.f33081b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        InterfaceC4125l8 interfaceC4125l8 = this.f33080a;
        if (interfaceC4125l8 != null) {
            interfaceC4125l8.a(str, str2, this.f33083d);
        }
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f33082c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f33084e, str4);
            this.f33080a.a(str3, str4, this.f33083d);
            return;
        }
        try {
            IronSourceVideoBridge.jsonObjectInit(str);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("adViewId", this.f33083d);
        a(str2, jSONObjectJsonObjectInit);
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC4125l8 interfaceC4125l8 = this.f33080a;
        if (interfaceC4125l8 != null) {
            interfaceC4125l8.a(str, jSONObject);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f33080a == null) {
            A8.a(C4024fe.f31725t, new C4300v8().a(G5.f29410y, "mDelegate is null").a());
        } else {
            V7.f30593a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void b() {
        this.f33080a = null;
        this.f33081b = null;
    }

    public String c() {
        return this.f33083d;
    }

    public void c(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("method");
            if (TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObjectJsonObjectInit.optString(C4089j8.f32065v, C4089j8.f32046c), jSONObjectJsonObjectInit);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObjectJsonObjectInit, (String) null, (String) null);
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            Log.e(this.f33084e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void e() {
        if (this.f33080a == null || this.f33081b == null) {
            return;
        }
        a(C4089j8.f32045b, a());
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f33081b.a();
        jSONObjectA.put("adViewId", this.f33083d);
        a(str, jSONObjectA);
    }

    public void f(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("adViewId", this.f33083d);
            a(str, jSONObjectJsonObjectInit);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void g(String str) {
        this.f33083d = str;
    }
}
