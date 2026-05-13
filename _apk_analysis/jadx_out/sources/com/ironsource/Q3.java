package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Q3 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f30203a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30204a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f30205b = false;

        private a() {
        }
    }

    public Q3(@Nullable JSONObject jSONObject) {
        this.f30203a = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f30203a.optBoolean("clickCheck", false);
    }
}
