package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4157n2 {
    public static final String A = "nurl";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f33006o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f33007p = "instance";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f33008q = "adData";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f33009r = "price";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f33010s = "serverData";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f33011t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f33012u = "order";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f33013v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f33014w = "price";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f33015x = "notifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f33016y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f33017z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f33020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f33022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f33026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f33027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f33028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f33029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bb f33030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33031n;

    public C4157n2(String str) {
        this.f33018a = null;
        this.f33019b = "";
        this.f33020c = null;
        this.f33021d = "";
        this.f33022e = null;
        this.f33023f = -1;
        this.f33024g = -1;
        this.f33025h = -1;
        this.f33026i = new ArrayList();
        this.f33027j = new ArrayList();
        this.f33028k = new ArrayList();
        this.f33029l = null;
        this.f33030m = null;
        this.f33031n = true;
        this.f33018a = str;
    }

    public C4157n2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C4157n2(JSONObject jSONObject, int i10, JSONObject jSONObject2) {
        this.f33018a = null;
        this.f33019b = "";
        this.f33020c = null;
        this.f33021d = "";
        this.f33022e = null;
        this.f33023f = -1;
        this.f33024g = -1;
        this.f33025h = -1;
        ArrayList arrayList = new ArrayList();
        this.f33026i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f33027j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f33028k = arrayList3;
        this.f33029l = null;
        this.f33030m = null;
        this.f33031n = true;
        try {
            if (jSONObject.has(f33007p)) {
                this.f33018a = jSONObject.getString(f33007p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f33019b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f33010s)) {
                this.f33019b = jSONObject.getJSONObject(f33010s).toString();
            }
            this.f33020c = jSONObject.optJSONObject("adData");
            this.f33021d = jSONObject.optString("price", "0");
            if (jSONObject.has(f33015x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f33015x);
                a(jSONObject3, f33016y, arrayList);
                a(jSONObject3, f33017z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.f33029l = C4127la.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f32389d));
            this.f33030m = jSONObject.has(com.ironsource.mediationsdk.d.f32390e) ? Bb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f32390e)) : null;
            this.f33022e = jSONObject.has(f33011t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f33011t))) : null;
            a(jSONObject.optJSONObject(f33012u), i10);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f33031n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }

    private void a(@Nullable JSONObject jSONObject, int i10) {
        this.f33023f = i10;
        this.f33024g = i10;
        this.f33025h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(f33013v, i10);
            this.f33024g = iOptInt;
            this.f33025h = jSONObject.optInt("price", iOptInt);
        }
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C4127la.b(jSONObject.getJSONArray(str)));
        }
    }

    public Z8 a(String str) {
        return null;
    }

    @Nullable
    public JSONObject a() {
        return this.f33020c;
    }

    public List<String> b() {
        return this.f33026i;
    }

    public String c() {
        return this.f33018a;
    }

    public Bb d() {
        return this.f33030m;
    }

    public int e() {
        return this.f33023f;
    }

    @Nullable
    public Integer f() {
        return this.f33022e;
    }

    public List<String> g() {
        return this.f33027j;
    }

    public List<String> h() {
        return this.f33028k;
    }

    public String i() {
        return this.f33021d;
    }

    public int j() {
        return this.f33025h;
    }

    public String k() {
        return this.f33019b;
    }

    public int l() {
        return this.f33024g;
    }

    public JSONObject m() {
        return this.f33029l;
    }

    public boolean n() {
        return this.f33031n;
    }
}
