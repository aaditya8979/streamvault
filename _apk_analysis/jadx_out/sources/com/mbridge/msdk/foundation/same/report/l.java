package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameCommonReporter.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f37930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37931b;

    /* JADX INFO: compiled from: SameCommonReporter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f37932a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37933b;

        public b(String str) {
            this.f37933b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private l(b bVar) {
        this.f37931b = bVar.f37933b;
        this.f37930a = bVar.f37932a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, G5.N);
        } catch (Exception unused) {
            return str;
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f37931b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", this.f37931b);
            a(this.f37930a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("SameCommonReporter", th2.getMessage());
        }
    }
}
