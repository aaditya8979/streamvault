package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f30443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, b> f30444b;

    public static final class a extends Lambda implements sn.l<JSONObject, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30445a = new a();

        public a() {
            super(1);
        }

        @Override // sn.l
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "it");
            return new b(jSONObject);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f30446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f30448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f30449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f30450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f30451f;

        public b(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "features");
            JSONObject jSONObject2 = jSONObject.has(V2.f30580a) ? jSONObject : null;
            JSONObject jSONObjectOptJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(V2.f30580a) : null;
            this.f30446a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(V2.f30581b, 25000) : 25000;
            this.f30447b = iOptInt;
            this.f30448c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f30449d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(V2.f30583d) || jSONObjectOptJSONObject.isNull(V2.f30583d)) ? iOptInt : jSONObjectOptJSONObject.optLong(V2.f30583d);
            this.f30450e = jSONObject.has(V2.f30584e) ? jSONObject.optInt(V2.f30584e) / 100.0f : 0.15f;
            List<String> listB = jSONObject.has(V2.f30585f) ? C4127la.b(jSONObject.getJSONArray(V2.f30585f)) : cn.w.p("BANNER", com.ironsource.mediationsdk.l.f32638d);
            tn.p.j(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f30451f = listB;
        }

        @NotNull
        public final List<String> a() {
            return this.f30451f;
        }

        public final float b() {
            return this.f30450e;
        }

        public final int c() {
            return this.f30447b;
        }

        public final long d() {
            return this.f30449d;
        }

        public final boolean e() {
            return this.f30448c;
        }
    }

    public T2(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "bannerConfigurations");
        this.f30443a = new b(jSONObject);
        this.f30444b = new Y0(jSONObject).a(a.f30445a);
    }

    @NotNull
    public final Map<String, b> a() {
        return this.f30444b;
    }

    @NotNull
    public final b b() {
        return this.f30443a;
    }
}
