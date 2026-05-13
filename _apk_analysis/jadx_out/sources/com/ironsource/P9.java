package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class P9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30126a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f30131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Hc f30132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30133h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30127b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30128c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4072i8 f30129d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30134i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30135j = null;

    public P9(String str, Hc hc2) throws NullPointerException {
        this.f30126a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f30132g = (Hc) SDKUtils.requireNonNull(hc2, "AdListener name can't be null");
    }

    public O9 a() {
        return new O9(b(), this.f30126a, this.f30127b, this.f30128c, this.f30133h, this.f30134i, this.f30135j, this.f30131f, this.f30132g, this.f30129d);
    }

    public P9 a(C4072i8 c4072i8) {
        this.f30129d = c4072i8;
        return this;
    }

    public P9 a(String str) {
        this.f30130e = str;
        return this;
    }

    public P9 a(Map<String, String> map) {
        this.f30131f = map;
        return this;
    }

    public P9 a(boolean z10) {
        this.f30128c = z10;
        return this;
    }

    public P9 b(@Nullable String str) {
        this.f30135j = str;
        return this;
    }

    public P9 b(boolean z10) {
        this.f30134i = z10;
        return this;
    }

    public String b() {
        String str = this.f30130e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("name", this.f30126a);
            jSONObjectJsonObjectInit.put("rewarded", this.f30127b);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return (this.f30128c || this.f30133h) ? Z9.a() : Z9.a(jSONObjectJsonObjectInit);
    }

    public P9 c() {
        this.f30127b = true;
        return this;
    }

    public P9 c(boolean z10) {
        this.f30133h = z10;
        return this;
    }
}
