package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4083j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f32014h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f32015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a f32016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4157n2 f32017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f32018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final JSONObject f32019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final C3976d2 f32020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final C4175o2 f32021g;

    /* JADX INFO: renamed from: com.ironsource.j2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f32022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f32023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f32024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a f32025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final C4157n2 f32026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final JSONObject f32027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final JSONObject f32028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final C3976d2 f32029h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private final C4175o2 f32030i;

        public a(@NotNull JSONObject jSONObject, @NotNull String str) {
            tn.p.k(jSONObject, Ne.E1);
            tn.p.k(str, "instanceId");
            this.f32022a = jSONObject;
            this.f32023b = str;
            JSONObject jSONObjectA = a(jSONObject);
            this.f32024c = jSONObject.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(jSONObject, jSONObjectA);
            this.f32025d = aVarA;
            this.f32026e = c(jSONObjectA);
            this.f32027f = d(jSONObjectA);
            this.f32028g = b(jSONObjectA);
            this.f32029h = a(aVarA, str);
            this.f32030i = b(aVarA, str);
        }

        private final C3976d2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4157n2 c4157n2A = aVar.a(str);
            if (c4157n2A == null) {
                return null;
            }
            C3976d2 c3976d2 = new C3976d2();
            c3976d2.a(c4157n2A.b());
            c3976d2.c(c4157n2A.h());
            c3976d2.b(c4157n2A.g());
            return c3976d2;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f32389d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f32393h);
            if (jSONArrayOptJSONArray != null) {
                zn.i iVarV = zn.n.v(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = iVarV.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((cn.k0) it).nextInt();
                    C4157n2 c4157n2 = new C4157n2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c4157n2.n()) {
                        c4157n2 = null;
                    }
                    if (c4157n2 != null) {
                        arrayList2.add(c4157n2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0396a(arrayList);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        private final C4175o2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4157n2 c4157n2A = aVar.a(str);
            if (c4157n2A == null) {
                return null;
            }
            String strK = c4157n2A.k();
            tn.p.j(strK, "it.serverData");
            return new C4175o2(strK);
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C4157n2 c(JSONObject jSONObject) {
            return new C4157n2(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        public final C4083j2 a() {
            return new C4083j2(this.f32024c, this.f32025d, this.f32026e, this.f32027f, this.f32028g, this.f32029h, this.f32030i);
        }

        @NotNull
        public final JSONObject b() {
            return this.f32022a;
        }

        @NotNull
        public final String c() {
            return this.f32023b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j2$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        private final Object a(C4083j2 c4083j2, String str) {
            String strB = c4083j2.b();
            if (strB == null || strB.length() == 0) {
                Result.a aVar = Result.Companion;
                return Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.i())));
            }
            if (c4083j2.i()) {
                Result.a aVar2 = Result.Companion;
                return Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.f())));
            }
            C4157n2 c4157n2A = c4083j2.a(str);
            if (c4157n2A == null) {
                Result.a aVar3 = Result.Companion;
                return Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.j())));
            }
            String strK = c4157n2A.k();
            if (strK != null && strK.length() != 0) {
                return Result.m7534constructorimpl(c4083j2);
            }
            Result.a aVar4 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new C4018f8(C4365z5.f34494a.e())));
        }

        @NotNull
        public final Object a(@NotNull JSONObject jSONObject, @NotNull String str) {
            tn.p.k(jSONObject, Ne.E1);
            tn.p.k(str, "instanceId");
            return a(new a(jSONObject, str).a(), str);
        }
    }

    public C4083j2(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a aVar, @NotNull C4157n2 c4157n2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C3976d2 c3976d2, @Nullable C4175o2 c4175o2) {
        tn.p.k(aVar, com.ironsource.mediationsdk.d.f32393h);
        tn.p.k(c4157n2, "genericNotifications");
        this.f32015a = str;
        this.f32016b = aVar;
        this.f32017c = c4157n2;
        this.f32018d = jSONObject;
        this.f32019e = jSONObject2;
        this.f32020f = c3976d2;
        this.f32021g = c4175o2;
    }

    private final C4157n2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }

    @Nullable
    public final C4157n2 a(@NotNull String str) {
        tn.p.k(str, "providerName");
        return a(this.f32016b, str);
    }

    @Nullable
    public final String a() {
        C4175o2 c4175o2 = this.f32021g;
        if (c4175o2 != null) {
            return c4175o2.d();
        }
        return null;
    }

    @Nullable
    public final String b() {
        return this.f32015a;
    }

    @Nullable
    public final C3976d2 c() {
        return this.f32020f;
    }

    @Nullable
    public final JSONObject d() {
        return this.f32019e;
    }

    @NotNull
    public final C4157n2 e() {
        return this.f32017c;
    }

    @Nullable
    public final JSONObject f() {
        return this.f32018d;
    }

    @Nullable
    public final C4175o2 g() {
        return this.f32021g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f32016b;
    }

    public final boolean i() {
        return this.f32016b.isEmpty();
    }
}
