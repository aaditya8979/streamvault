package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4276u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f34144a = b.f34160a;

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    public interface a extends InterfaceC4276u1 {

        /* JADX INFO: renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public static final class C0406a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f34145b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f34146c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final C4266t8.e f34147d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f34148e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f34149f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            private final C0407a f34150g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f34151h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final int f34152i;

            /* JADX INFO: renamed from: com.ironsource.u1$a$a$a, reason: collision with other inner class name */
            public static final class C0407a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f34153a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f34154b;

                public C0407a(int i10, int i11) {
                    this.f34153a = i10;
                    this.f34154b = i11;
                }

                public static /* synthetic */ C0407a a(C0407a c0407a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0407a.f34153a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0407a.f34154b;
                    }
                    return c0407a.a(i10, i11);
                }

                public final int a() {
                    return this.f34153a;
                }

                @NotNull
                public final C0407a a(int i10, int i11) {
                    return new C0407a(i10, i11);
                }

                public final int b() {
                    return this.f34154b;
                }

                public final int c() {
                    return this.f34153a;
                }

                public final int d() {
                    return this.f34154b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0407a)) {
                        return false;
                    }
                    C0407a c0407a = (C0407a) obj;
                    return this.f34153a == c0407a.f34153a && this.f34154b == c0407a.f34154b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f34153a) * 31) + Integer.hashCode(this.f34154b);
                }

                @NotNull
                public String toString() {
                    return "Coordinates(x=" + this.f34153a + ", y=" + this.f34154b + ")";
                }
            }

            public C0406a(@NotNull String str, @NotNull String str2, @NotNull C4266t8.e eVar, @NotNull String str3, @NotNull String str4, @NotNull C0407a c0407a, int i10, int i11) {
                tn.p.k(str, "successCallback");
                tn.p.k(str2, "failCallback");
                tn.p.k(eVar, C3978d4.i.f31349m);
                tn.p.k(str3, "demandSourceName");
                tn.p.k(str4, "url");
                tn.p.k(c0407a, C3996e4.f31528f);
                this.f34145b = str;
                this.f34146c = str2;
                this.f34147d = eVar;
                this.f34148e = str3;
                this.f34149f = str4;
                this.f34150g = c0407a;
                this.f34151h = i10;
                this.f34152i = i11;
            }

            @NotNull
            public final C0406a a(@NotNull String str, @NotNull String str2, @NotNull C4266t8.e eVar, @NotNull String str3, @NotNull String str4, @NotNull C0407a c0407a, int i10, int i11) {
                tn.p.k(str, "successCallback");
                tn.p.k(str2, "failCallback");
                tn.p.k(eVar, C3978d4.i.f31349m);
                tn.p.k(str3, "demandSourceName");
                tn.p.k(str4, "url");
                tn.p.k(c0407a, C3996e4.f31528f);
                return new C0406a(str, str2, eVar, str3, str4, c0407a, i10, i11);
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String a() {
                return this.f34145b;
            }

            @Override // com.ironsource.InterfaceC4276u1.a
            @NotNull
            public String b() {
                return this.f34149f;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String c() {
                return this.f34146c;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public C4266t8.e d() {
                return this.f34147d;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String e() {
                return this.f34148e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0406a)) {
                    return false;
                }
                C0406a c0406a = (C0406a) obj;
                return tn.p.f(this.f34145b, c0406a.f34145b) && tn.p.f(this.f34146c, c0406a.f34146c) && this.f34147d == c0406a.f34147d && tn.p.f(this.f34148e, c0406a.f34148e) && tn.p.f(this.f34149f, c0406a.f34149f) && tn.p.f(this.f34150g, c0406a.f34150g) && this.f34151h == c0406a.f34151h && this.f34152i == c0406a.f34152i;
            }

            @NotNull
            public final String f() {
                return this.f34145b;
            }

            @NotNull
            public final String g() {
                return this.f34146c;
            }

            @NotNull
            public final C4266t8.e h() {
                return this.f34147d;
            }

            public int hashCode() {
                return (((((((((((((this.f34145b.hashCode() * 31) + this.f34146c.hashCode()) * 31) + this.f34147d.hashCode()) * 31) + this.f34148e.hashCode()) * 31) + this.f34149f.hashCode()) * 31) + this.f34150g.hashCode()) * 31) + Integer.hashCode(this.f34151h)) * 31) + Integer.hashCode(this.f34152i);
            }

            @NotNull
            public final String i() {
                return this.f34148e;
            }

            @NotNull
            public final String j() {
                return this.f34149f;
            }

            @NotNull
            public final C0407a k() {
                return this.f34150g;
            }

            public final int l() {
                return this.f34151h;
            }

            public final int m() {
                return this.f34152i;
            }

            public final int n() {
                return this.f34151h;
            }

            @NotNull
            public final C0407a o() {
                return this.f34150g;
            }

            public final int p() {
                return this.f34152i;
            }

            @NotNull
            public String toString() {
                return "Click(successCallback=" + this.f34145b + ", failCallback=" + this.f34146c + ", productType=" + this.f34147d + ", demandSourceName=" + this.f34148e + ", url=" + this.f34149f + ", coordinates=" + this.f34150g + ", action=" + this.f34151h + ", metaState=" + this.f34152i + ")";
            }
        }

        /* JADX INFO: renamed from: com.ironsource.u1$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f34155b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f34156c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final C4266t8.e f34157d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f34158e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f34159f;

            public b(@NotNull String str, @NotNull String str2, @NotNull C4266t8.e eVar, @NotNull String str3, @NotNull String str4) {
                tn.p.k(str, "successCallback");
                tn.p.k(str2, "failCallback");
                tn.p.k(eVar, C3978d4.i.f31349m);
                tn.p.k(str3, "demandSourceName");
                tn.p.k(str4, "url");
                this.f34155b = str;
                this.f34156c = str2;
                this.f34157d = eVar;
                this.f34158e = str3;
                this.f34159f = str4;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4266t8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f34155b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f34156c;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    eVar = bVar.f34157d;
                }
                C4266t8.e eVar2 = eVar;
                if ((i10 & 8) != 0) {
                    str3 = bVar.f34158e;
                }
                String str6 = str3;
                if ((i10 & 16) != 0) {
                    str4 = bVar.f34159f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            @NotNull
            public final b a(@NotNull String str, @NotNull String str2, @NotNull C4266t8.e eVar, @NotNull String str3, @NotNull String str4) {
                tn.p.k(str, "successCallback");
                tn.p.k(str2, "failCallback");
                tn.p.k(eVar, C3978d4.i.f31349m);
                tn.p.k(str3, "demandSourceName");
                tn.p.k(str4, "url");
                return new b(str, str2, eVar, str3, str4);
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String a() {
                return this.f34155b;
            }

            @Override // com.ironsource.InterfaceC4276u1.a
            @NotNull
            public String b() {
                return this.f34159f;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String c() {
                return this.f34156c;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public C4266t8.e d() {
                return this.f34157d;
            }

            @Override // com.ironsource.InterfaceC4276u1
            @NotNull
            public String e() {
                return this.f34158e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return tn.p.f(this.f34155b, bVar.f34155b) && tn.p.f(this.f34156c, bVar.f34156c) && this.f34157d == bVar.f34157d && tn.p.f(this.f34158e, bVar.f34158e) && tn.p.f(this.f34159f, bVar.f34159f);
            }

            @NotNull
            public final String f() {
                return this.f34155b;
            }

            @NotNull
            public final String g() {
                return this.f34156c;
            }

            @NotNull
            public final C4266t8.e h() {
                return this.f34157d;
            }

            public int hashCode() {
                return (((((((this.f34155b.hashCode() * 31) + this.f34156c.hashCode()) * 31) + this.f34157d.hashCode()) * 31) + this.f34158e.hashCode()) * 31) + this.f34159f.hashCode();
            }

            @NotNull
            public final String i() {
                return this.f34158e;
            }

            @NotNull
            public final String j() {
                return this.f34159f;
            }

            @NotNull
            public String toString() {
                return "Impression(successCallback=" + this.f34155b + ", failCallback=" + this.f34156c + ", productType=" + this.f34157d + ", demandSourceName=" + this.f34158e + ", url=" + this.f34159f + ")";
            }
        }

        @NotNull
        String b();
    }

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f34160a = new b();

        private b() {
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("success");
            String string2 = jSONObject.getString(C3978d4.g.f31293e);
            String string3 = jSONObject.getString("demandSourceName");
            String string4 = jSONObject.getString(C3978d4.i.f31349m);
            tn.p.j(string4, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C4266t8.e eVarValueOf = C4266t8.e.valueOf(string4);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String string5 = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (tn.p.f(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C3996e4.f31528f);
                int i10 = jSONObject3.getInt(C3996e4.f31529g);
                int i11 = jSONObject3.getInt(C3996e4.f31530h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C3996e4.f31532j, 0);
                tn.p.j(string, "successCallback");
                tn.p.j(string2, "failCallback");
                tn.p.j(string3, "demandSourceName");
                tn.p.j(string5, "url");
                return new a.C0406a(string, string2, eVarValueOf, string3, string5, new a.C0406a.C0407a(i10, i11), iOptInt, iOptInt2);
            }
            if (tn.p.f(strOptString, "impression")) {
                tn.p.j(string, "successCallback");
                tn.p.j(string2, "failCallback");
                tn.p.j(string3, "demandSourceName");
                tn.p.j(string5, "url");
                return new a.b(string, string2, eVarValueOf, string3, string5);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }

        @NotNull
        public final InterfaceC4276u1 a(@NotNull String str) throws JSONException {
            tn.p.k(str, "jsonString");
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("type", "none");
            if (tn.p.f(strOptString, C3996e4.f31525c)) {
                return a(jSONObjectJsonObjectInit);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }
    }

    @NotNull
    static InterfaceC4276u1 a(@NotNull String str) {
        return f34144a.a(str);
    }

    @NotNull
    String a();

    @NotNull
    String c();

    @NotNull
    C4266t8.e d();

    @NotNull
    String e();
}
