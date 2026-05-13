package com.ironsource;

import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4273tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f34116a;

    public C4273tf(JSONObject jSONObject) {
        this.f34116a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    public boolean a() {
        return this.f34116a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f34116a.optBoolean(C3978d4.a.f31219o, false);
    }

    public boolean c() {
        return this.f34116a.optBoolean(C3978d4.a.f31220p, false);
    }

    public boolean d() {
        return this.f34116a.optBoolean(C3978d4.a.f31216l, false);
    }

    public boolean e() {
        return this.f34116a.optBoolean(C3978d4.a.f31218n, false);
    }
}
