package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class N6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29890b = "userId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29891c = "appKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static N6 f29892d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f29893a = IronSourceVideoBridge.jsonObjectInit();

    private N6() {
    }

    public static synchronized N6 a() {
        if (f29892d == null) {
            f29892d = new N6();
        }
        return f29892d;
    }

    public synchronized String a(String str) {
        return this.f29893a.optString(str);
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f29893a.put(str, obj);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized JSONObject b() throws JSONException {
        if (Lb.U().g().g()) {
            return IronSourceVideoBridge.jsonObjectInit(this.f29893a.toString());
        }
        return this.f29893a;
    }
}
