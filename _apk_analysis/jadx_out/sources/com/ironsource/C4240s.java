package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4240s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f33438d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f33439e = "capping";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f33440f = "pacing";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f33441g = "delivery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f33442h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f33443i = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f33444j = "reward";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f33445k = "name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f33446l = "amount";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f33447m = "virtualItemName";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f33448n = "virtualItemCount";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f33449o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f33450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f33451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f33452c;

    /* JADX INFO: renamed from: com.ironsource.s$a */
    public static final class a extends Lambda implements sn.l<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33453a = new a();

        public a() {
            super(1);
        }

        @Override // sn.l
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "it");
            return new d(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b */
    public static final class b extends Lambda implements sn.l<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33454a = new b();

        public b() {
            super(1);
        }

        @Override // sn.l
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "it");
            return new d(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final I3 f33455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final C3933ad f33456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final R4 f33457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Long f33458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Hd f33459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final Hd f33460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final C4254sd f33461g;

        public d(@NotNull JSONObject jSONObject) throws JSONException {
            I3 i32;
            C3933ad c3933ad;
            tn.p.k(jSONObject, "features");
            C4254sd c4254sd = null;
            if (jSONObject.has("capping")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("capping");
                tn.p.j(jSONObject2, "features.getJSONObject(key)");
                i32 = new I3(jSONObject2);
            } else {
                i32 = null;
            }
            this.f33455a = i32;
            if (jSONObject.has("pacing")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("pacing");
                tn.p.j(jSONObject3, "features.getJSONObject(key)");
                c3933ad = new C3933ad(jSONObject3);
            } else {
                c3933ad = null;
            }
            this.f33456b = c3933ad;
            this.f33457c = jSONObject.has("delivery") ? new R4(jSONObject.getBoolean("delivery")) : null;
            this.f33458d = jSONObject.has("expiredDurationInMinutes") ? Long.valueOf(jSONObject.getLong("expiredDurationInMinutes")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("reward");
            this.f33459e = jSONObjectOptJSONObject != null ? new Hd(jSONObjectOptJSONObject, "name", "amount") : null;
            Hd hd2 = new Hd(jSONObject, "virtualItemName", "virtualItemCount");
            String strB = hd2.b();
            this.f33460f = (strB == null || strB.length() == 0 || hd2.a() == null) ? null : hd2;
            if (jSONObject.has(C4240s.f33442h)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C4240s.f33442h);
                tn.p.j(jSONObject4, "features.getJSONObject(key)");
                c4254sd = new C4254sd(jSONObject4);
            }
            this.f33461g = c4254sd;
        }

        @Nullable
        public final Hd a() {
            return this.f33459e;
        }

        @Nullable
        public final I3 b() {
            return this.f33455a;
        }

        @Nullable
        public final R4 c() {
            return this.f33457c;
        }

        @Nullable
        public final Long d() {
            return this.f33458d;
        }

        @Nullable
        public final C3933ad e() {
            return this.f33456b;
        }

        @Nullable
        public final Hd f() {
            return this.f33460f;
        }

        @Nullable
        public final C4254sd g() {
            return this.f33461g;
        }
    }

    public C4240s(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "configurations");
        this.f33450a = new C4186od(jSONObject).a(b.f33454a);
        this.f33451b = new d(jSONObject);
        this.f33452c = new Y0(jSONObject).a(a.f33453a);
    }

    @NotNull
    public final Map<String, d> a() {
        return this.f33452c;
    }

    @NotNull
    public final d b() {
        return this.f33451b;
    }

    @NotNull
    public final Map<String, d> c() {
        return this.f33450a;
    }
}
