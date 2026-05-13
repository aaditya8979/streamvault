package com.apm.insight.l;

import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSONWriter.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f7388b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: JSONWriter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7389a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7390b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7391c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f7392d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f7393e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f7394f = new a("NULL", 5);

        private a(String str, int i10) {
        }
    }

    private h(Writer writer) {
        this.f7387a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f7389a, C3978d4.j.f31383d);
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f7388b.add(aVar);
        this.f7387a.write(str);
        return this;
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj == null || obj == JSONObject.NULL) {
            this.f7387a.write("null");
        } else if (obj instanceof Boolean) {
            this.f7387a.write(String.valueOf(obj));
        } else if (obj instanceof Number) {
            this.f7387a.write(JSONObject.numberToString((Number) obj));
        } else {
            b(obj.toString());
        }
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f7388b.remove(r0.size() - 1);
        this.f7387a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f7388b.set(r0.size() - 1, aVar);
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f7389a;
        return a(C3978d4.j.f31385e);
    }

    private void b(String str) throws IOException {
        this.f7387a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f7387a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f7387a.write("\\b");
                            continue;
                        case '\t':
                            this.f7387a.write("\\t");
                            continue;
                        case '\n':
                            this.f7387a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f7387a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f7387a.write(92);
                }
                this.f7387a.write(cCharAt);
            } else {
                this.f7387a.write("\\r");
            }
        }
        this.f7387a.write("\"");
    }

    private h c() throws JSONException, IOException {
        return a(a.f7391c, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d);
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f7393e) {
            this.f7387a.write(44);
        } else if (aVarE != a.f7391c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f7392d);
        b(str);
        return this;
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f7389a;
        return a(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
    }

    private a e() throws JSONException {
        return this.f7388b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f7388b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f7389a) {
            a(a.f7390b);
            return;
        }
        if (aVarE == a.f7390b) {
            this.f7387a.write(44);
        } else if (aVarE == a.f7392d) {
            this.f7387a.write(StringUtils.PROCESS_POSTFIX_DELIMITER);
            a(a.f7393e);
        } else if (aVarE != a.f7394f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }
}
