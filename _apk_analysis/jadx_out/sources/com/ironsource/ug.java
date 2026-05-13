package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ug {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f34221c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Double f34222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f34223b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        @NotNull
        public final ug b() {
            return a().a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Double f34224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Double f34225b;

        @NotNull
        public final b a(double d10) {
            this.f34225b = Double.valueOf(d10);
            return this;
        }

        @NotNull
        public final ug a() {
            return new ug(this, null);
        }

        public final void a(@Nullable Double d10) {
            this.f34225b = d10;
        }

        @NotNull
        public final b b(double d10) {
            this.f34224a = Double.valueOf(d10);
            return this;
        }

        @Nullable
        public final Double b() {
            return this.f34225b;
        }

        public final void b(@Nullable Double d10) {
            this.f34224a = d10;
        }

        @Nullable
        public final Double c() {
            return this.f34224a;
        }
    }

    private ug(b bVar) {
        this.f34222a = bVar.c();
        this.f34223b = bVar.b();
    }

    public /* synthetic */ ug(b bVar, tn.i iVar) {
        this(bVar);
    }

    @NotNull
    public static final b a() {
        return f34221c.a();
    }

    @NotNull
    public static final ug b() {
        return f34221c.b();
    }

    @Nullable
    public final Double c() {
        return this.f34223b;
    }

    @Nullable
    public final Double d() {
        return this.f34222a;
    }

    @NotNull
    public final String e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("ceiling", this.f34223b);
            jSONObjectJsonObjectInit.put("floor", this.f34222a);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        tn.p.j(string, "json.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "WaterfallConfiguration" + e();
    }
}
