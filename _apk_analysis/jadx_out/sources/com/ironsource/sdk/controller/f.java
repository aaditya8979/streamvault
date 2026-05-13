package com.ironsource.sdk.controller;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0401a f33711c = new C0401a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final JSONObject f33713b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0401a {
            private C0401a() {
            }

            public /* synthetic */ C0401a(tn.i iVar) {
                this();
            }

            @NotNull
            public final a a(@NotNull String str) throws JSONException {
                tn.p.k(str, "jsonStr");
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                String string = jSONObjectJsonObjectInit.getString(b.f33715b);
                JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
                tn.p.j(string, "id");
                return new a(string, jSONObjectOptJSONObject);
            }
        }

        public a(@NotNull String str, @Nullable JSONObject jSONObject) {
            tn.p.k(str, b.f33715b);
            this.f33712a = str;
            this.f33713b = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f33712a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f33713b;
            }
            return aVar.a(str, jSONObject);
        }

        @NotNull
        public static final a a(@NotNull String str) throws JSONException {
            return f33711c.a(str);
        }

        @NotNull
        public final a a(@NotNull String str, @Nullable JSONObject jSONObject) {
            tn.p.k(str, b.f33715b);
            return new a(str, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.f33712a;
        }

        @Nullable
        public final JSONObject b() {
            return this.f33713b;
        }

        @NotNull
        public final String c() {
            return this.f33712a;
        }

        @Nullable
        public final JSONObject d() {
            return this.f33713b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f33712a, aVar.f33712a) && tn.p.f(this.f33713b, aVar.f33713b);
        }

        public int hashCode() {
            int iHashCode = this.f33712a.hashCode() * 31;
            JSONObject jSONObject = this.f33713b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.f33712a + ", params=" + this.f33713b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f33714a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f33715b = "msgId";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f33716c = "adId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f33717d = "params";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f33718e = "success";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f33719f = "reason";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f33720g = "command";

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f33722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final JSONObject f33723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private String f33724d;

        public c(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            tn.p.k(str, b.f33716c);
            tn.p.k(str2, b.f33720g);
            tn.p.k(jSONObject, "params");
            this.f33721a = str;
            this.f33722b = str2;
            this.f33723c = jSONObject;
            String string = UUID.randomUUID().toString();
            tn.p.j(string, "randomUUID().toString()");
            this.f33724d = string;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f33721a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f33722b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f33723c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        @NotNull
        public final c a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            tn.p.k(str, b.f33716c);
            tn.p.k(str2, b.f33720g);
            tn.p.k(jSONObject, "params");
            return new c(str, str2, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.f33721a;
        }

        public final void a(@NotNull String str) {
            tn.p.k(str, "<set-?>");
            this.f33724d = str;
        }

        @NotNull
        public final String b() {
            return this.f33722b;
        }

        @NotNull
        public final JSONObject c() {
            return this.f33723c;
        }

        @NotNull
        public final String d() {
            return this.f33721a;
        }

        @NotNull
        public final String e() {
            return this.f33722b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return tn.p.f(this.f33724d, cVar.f33724d) && tn.p.f(this.f33721a, cVar.f33721a) && tn.p.f(this.f33722b, cVar.f33722b) && tn.p.f(this.f33723c.toString(), cVar.f33723c.toString());
        }

        @NotNull
        public final String f() {
            return this.f33724d;
        }

        @NotNull
        public final JSONObject g() {
            return this.f33723c;
        }

        @NotNull
        public final String h() {
            String string = IronSourceVideoBridge.jsonObjectInit().put(b.f33715b, this.f33724d).put(b.f33716c, this.f33721a).put("params", this.f33723c).toString();
            tn.p.j(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            return "MessageToController(adId=" + this.f33721a + ", command=" + this.f33722b + ", params=" + this.f33723c + ")";
        }
    }
}
