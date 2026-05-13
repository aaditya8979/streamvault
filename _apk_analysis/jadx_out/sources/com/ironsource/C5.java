package com.ironsource;

import com.ironsource.InterfaceC4262t4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class C5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28872e = "euid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28873f = "esat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28874g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f28875h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f28879d;

    public C5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, IronSourceVideoBridge.jsonObjectInit(str));
    }

    public C5(int i10, long j10, JSONObject jSONObject) {
        this.f28878c = 1;
        this.f28876a = i10;
        this.f28877b = j10;
        jSONObject = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
        this.f28879d = jSONObject;
        if (!jSONObject.has(f28872e)) {
            a(f28872e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f28873f)) {
            this.f28878c = jSONObject.optInt(f28873f, 1);
        } else {
            a(f28873f, Integer.valueOf(this.f28878c));
        }
    }

    public C5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC4262t4.a().a(), jSONObject);
    }

    public C5(D5 d52, long j10, JSONObject jSONObject) {
        this(d52.b(), j10, jSONObject);
    }

    public C5(D5 d52, JSONObject jSONObject) {
        this(d52.b(), jSONObject);
    }

    public String a() {
        return this.f28879d.toString();
    }

    public void a(int i10) {
        this.f28876a = i10;
    }

    public void a(String str) {
        a(f28874g, str);
        int i10 = this.f28878c + 1;
        this.f28878c = i10;
        a(f28873f, Integer.valueOf(i10));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f28879d.put(str, obj);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public JSONObject b() {
        return this.f28879d;
    }

    public int c() {
        return this.f28876a;
    }

    public long d() {
        return this.f28877b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c52 = (C5) obj;
        return this.f28876a == c52.f28876a && this.f28877b == c52.f28877b && this.f28878c == c52.f28878c && C4319wa.a(this.f28879d, c52.f28879d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f28876a) * 31) + Long.hashCode(this.f28877b)) * 31) + this.f28879d.toString().hashCode()) * 31) + this.f28878c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + StringUtils.COMMA + a().substring(1) + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e).replace(StringUtils.COMMA, "\n");
    }
}
