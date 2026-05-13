package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class P3 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f30117a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30118a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f30119b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f30120c = "curlError";

        private a() {
        }
    }

    public P3(@Nullable JSONObject jSONObject) {
        this.f30117a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f30117a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f30117a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f30117a.optBoolean("reportController", true);
    }
}
