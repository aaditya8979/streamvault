package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4216q8 implements InterfaceC3939b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33340b = "q8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C4216q8 f33341c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, K8> f33342a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.q8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4199p8 f33343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f33344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33345c;

        public a(C4199p8 c4199p8, Context context, String str) {
            this.f33343a = c4199p8;
            this.f33344b = context;
            this.f33345c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4216q8.this.f33342a.put(this.f33345c, new C4107k8(this.f33343a, this.f33344b));
        }
    }

    private C4072i8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.getString(C3978d4.i.O));
            String string = jSONObjectJsonObjectInit.get("height").toString();
            String string2 = jSONObjectJsonObjectInit.get("width").toString();
            return new C4072i8(Integer.parseInt(string2), Integer.parseInt(string), jSONObjectJsonObjectInit.get("label").toString());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return new C4072i8();
        }
    }

    public static synchronized C4216q8 a() {
        if (f33341c == null) {
            f33341c = new C4216q8();
        }
        return f33341c;
    }

    private C4072i8 b(JSONObject jSONObject) {
        C4072i8 c4072i8 = new C4072i8();
        try {
            return a(jSONObject);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return c4072i8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C3978d4.i.f31362s0);
    }

    @Override // com.ironsource.InterfaceC3939b1
    @Nullable
    public K8 a(String str) {
        if (str.isEmpty() || !this.f33342a.containsKey(str)) {
            return null;
        }
        return this.f33342a.get(str);
    }

    public void a(InterfaceC4125l8 interfaceC4125l8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f33340b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        C4072i8 c4072i8B = b(jSONObject);
        if (this.f33342a.containsKey(string)) {
            Logger.i(f33340b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        C4199p8 c4199p8 = new C4199p8(interfaceC4125l8, context, string, c4072i8B);
        c4199p8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        c4199p8.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            V7.f30593a.d(new a(c4199p8, context, string));
        } else {
            this.f33342a.put(string, c4199p8);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f33340b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f33342a.containsKey(string)) {
            Logger.i(f33340b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k82 = this.f33342a.get(string);
        if (k82 != null) {
            k82.a(jSONObject, str, str2);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f33340b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f33342a.containsKey(string)) {
            Logger.i(f33340b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k82 = this.f33342a.get(string);
        String string2 = jSONObject.getString(C3978d4.i.f31368v0);
        if (k82 != null) {
            k82.a(string2, str, str2);
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : IronSourceVideoBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f33340b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f33342a.containsKey(string)) {
            Logger.i(f33340b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k82 = this.f33342a.get(string);
        this.f33342a.remove(string);
        if (k82 != null) {
            k82.a(str, str2);
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceVideoBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f33340b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f33342a.containsKey(string)) {
            Logger.i(f33340b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k82 = this.f33342a.get(string);
        if (k82 != null) {
            k82.c(jSONObject, str, str2);
        }
    }
}
