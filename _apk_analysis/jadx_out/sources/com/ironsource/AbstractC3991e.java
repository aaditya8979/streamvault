package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC3991e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31507a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31508b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31509c = "InterstitialEvents";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31510d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31511e = "events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JSONObject f31512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f31514h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C5> arrayList, JSONObject jSONObject);

    public String a(JSONArray jSONArray) {
        try {
            if (this.f31512f != null) {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(this.f31512f.toString());
                jSONObjectJsonObjectInit.put("timestamp", IronSourceUtils.e());
                jSONObjectJsonObjectInit.put(a(this.f31513g), jSONArray);
                return jSONObjectJsonObjectInit.toString();
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
        return "";
    }

    public JSONObject a(C5 c52) {
        try {
            String strA = c52.a();
            JSONObject jSONObjectJsonObjectInit = !TextUtils.isEmpty(strA) ? IronSourceVideoBridge.jsonObjectInit(strA) : IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("eventId", c52.c());
            jSONObjectJsonObjectInit.put("timestamp", c52.d());
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public void a(String str) {
        this.f31514h = str;
    }

    public String b() {
        return TextUtils.isEmpty(this.f31514h) ? a() : this.f31514h;
    }

    public abstract String c();
}
