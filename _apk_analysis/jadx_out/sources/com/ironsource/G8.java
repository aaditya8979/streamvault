package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f29421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f29422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Drawable f29423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final WebView f29424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final View f29425g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final X8 f29426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC3939b1 f29427b;

        public a(@NotNull X8 x82, @NotNull InterfaceC3939b1 interfaceC3939b1) {
            tn.p.k(x82, "imageLoader");
            tn.p.k(interfaceC3939b1, "adViewManagement");
            this.f29426a = x82;
            this.f29427b = interfaceC3939b1;
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            K8 k8A = this.f29427b.a(str);
            WebView presentingView = k8A != null ? k8A.getPresentingView() : null;
            if (presentingView != null) {
                return Result.m7533boximpl(Result.m7534constructorimpl(presentingView));
            }
            Result.a aVar = Result.Companion;
            return Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(new Exception("missing adview for id: '" + str + "'"))));
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m7533boximpl(this.f29426a.a(str));
        }

        @NotNull
        public final b a(@NotNull Context context, @NotNull JSONObject jSONObject) {
            tn.p.k(context, "activityContext");
            tn.p.k(jSONObject, "json");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? H8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C3978d4.i.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? H8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? H8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("cta");
            String strB4 = jSONObjectOptJSONObject4 != null ? H8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? H8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(C3978d4.i.I0);
            String strB6 = jSONObjectOptJSONObject6 != null ? H8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(C3978d4.i.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C4221qd.f33350a.a(context, jSONObjectOptJSONObject7 != null ? H8.b(jSONObjectOptJSONObject7, "url") : null, this.f29426a)));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f29428a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private final String f29429a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final String f29430b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private final String f29431c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            private final String f29432d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            private final Result<Drawable> f29433e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            private final Result<WebView> f29434f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            private final View f29435g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View view) {
                tn.p.k(view, C3978d4.i.J0);
                this.f29429a = str;
                this.f29430b = str2;
                this.f29431c = str3;
                this.f29432d = str4;
                this.f29433e = result;
                this.f29434f = result2;
                this.f29435g = view;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f29429a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f29430b;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    str3 = aVar.f29431c;
                }
                String str6 = str3;
                if ((i10 & 8) != 0) {
                    str4 = aVar.f29432d;
                }
                String str7 = str4;
                if ((i10 & 16) != 0) {
                    result = aVar.f29433e;
                }
                Result result3 = result;
                if ((i10 & 32) != 0) {
                    result2 = aVar.f29434f;
                }
                Result result4 = result2;
                if ((i10 & 64) != 0) {
                    view = aVar.f29435g;
                }
                return aVar.a(str, str5, str6, str7, result3, result4, view);
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View view) {
                tn.p.k(view, C3978d4.i.J0);
                return new a(str, str2, str3, str4, result, result2, view);
            }

            @Nullable
            public final String a() {
                return this.f29429a;
            }

            @Nullable
            public final String b() {
                return this.f29430b;
            }

            @Nullable
            public final String c() {
                return this.f29431c;
            }

            @Nullable
            public final String d() {
                return this.f29432d;
            }

            @Nullable
            public final Result<Drawable> e() {
                return this.f29433e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return tn.p.f(this.f29429a, aVar.f29429a) && tn.p.f(this.f29430b, aVar.f29430b) && tn.p.f(this.f29431c, aVar.f29431c) && tn.p.f(this.f29432d, aVar.f29432d) && tn.p.f(this.f29433e, aVar.f29433e) && tn.p.f(this.f29434f, aVar.f29434f) && tn.p.f(this.f29435g, aVar.f29435g);
            }

            @Nullable
            public final Result<WebView> f() {
                return this.f29434f;
            }

            @NotNull
            public final View g() {
                return this.f29435g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [android.webkit.WebView] */
            @NotNull
            public final G8 h() {
                Drawable drawable;
                String str = this.f29429a;
                String str2 = this.f29430b;
                String str3 = this.f29431c;
                String str4 = this.f29432d;
                Result<Drawable> result = this.f29433e;
                if (result != null) {
                    Object objM7542unboximpl = result.m7542unboximpl();
                    if (Result.m7539isFailureimpl(objM7542unboximpl)) {
                        objM7542unboximpl = null;
                    }
                    drawable = (Drawable) objM7542unboximpl;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f29434f;
                if (result2 != null) {
                    Object objM7542unboximpl2 = result2.m7542unboximpl();
                    obj = (WebView) (Result.m7539isFailureimpl(objM7542unboximpl2) ? null : objM7542unboximpl2);
                }
                return new G8(str, str2, str3, str4, drawable, obj, this.f29435g);
            }

            public int hashCode() {
                String str = this.f29429a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f29430b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f29431c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f29432d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.f29433e;
                int iM7538hashCodeimpl = (iHashCode4 + (result == null ? 0 : Result.m7538hashCodeimpl(result.m7542unboximpl()))) * 31;
                Result<WebView> result2 = this.f29434f;
                return ((iM7538hashCodeimpl + (result2 != null ? Result.m7538hashCodeimpl(result2.m7542unboximpl()) : 0)) * 31) + this.f29435g.hashCode();
            }

            @Nullable
            public final String i() {
                return this.f29430b;
            }

            @Nullable
            public final String j() {
                return this.f29431c;
            }

            @Nullable
            public final String k() {
                return this.f29432d;
            }

            @Nullable
            public final Result<Drawable> l() {
                return this.f29433e;
            }

            @Nullable
            public final Result<WebView> m() {
                return this.f29434f;
            }

            @NotNull
            public final View n() {
                return this.f29435g;
            }

            @Nullable
            public final String o() {
                return this.f29429a;
            }

            @NotNull
            public String toString() {
                return "Data(title=" + this.f29429a + ", advertiser=" + this.f29430b + ", body=" + this.f29431c + ", cta=" + this.f29432d + ", icon=" + this.f29433e + ", media=" + this.f29434f + ", privacyIcon=" + this.f29435g + ")";
            }
        }

        public b(@NotNull a aVar) {
            tn.p.k(aVar, "data");
            this.f29428a = aVar;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, IronSourceVideoBridge.jsonObjectInit().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("success", Result.m7540isSuccessimpl(obj));
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
            if (thM7537exceptionOrNullimpl != null) {
                String message = thM7537exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObjectJsonObjectInit.put("reason", message);
            }
            bn.r rVar = bn.r.f5635a;
            jSONObject.put(str, jSONObjectJsonObjectInit);
        }

        @NotNull
        public final a a() {
            return this.f29428a;
        }

        @NotNull
        public final JSONObject b() throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            if (this.f29428a.o() != null) {
                a(jSONObjectJsonObjectInit, "title");
            }
            if (this.f29428a.i() != null) {
                a(jSONObjectJsonObjectInit, C3978d4.i.F0);
            }
            if (this.f29428a.j() != null) {
                a(jSONObjectJsonObjectInit, "body");
            }
            if (this.f29428a.k() != null) {
                a(jSONObjectJsonObjectInit, "cta");
            }
            Result<Drawable> resultL = this.f29428a.l();
            if (resultL != null) {
                a(jSONObjectJsonObjectInit, "icon", resultL.m7542unboximpl());
            }
            Result<WebView> resultM = this.f29428a.m();
            if (resultM != null) {
                a(jSONObjectJsonObjectInit, C3978d4.i.I0, resultM.m7542unboximpl());
            }
            return jSONObjectJsonObjectInit;
        }
    }

    public G8(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        tn.p.k(view, C3978d4.i.J0);
        this.f29419a = str;
        this.f29420b = str2;
        this.f29421c = str3;
        this.f29422d = str4;
        this.f29423e = drawable;
        this.f29424f = webView;
        this.f29425g = view;
    }

    public static /* synthetic */ G8 a(G8 g82, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g82.f29419a;
        }
        if ((i10 & 2) != 0) {
            str2 = g82.f29420b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = g82.f29421c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = g82.f29422d;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            drawable = g82.f29423e;
        }
        Drawable drawable2 = drawable;
        if ((i10 & 32) != 0) {
            webView = g82.f29424f;
        }
        WebView webView2 = webView;
        if ((i10 & 64) != 0) {
            view = g82.f29425g;
        }
        return g82.a(str, str5, str6, str7, drawable2, webView2, view);
    }

    @NotNull
    public final G8 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View view) {
        tn.p.k(view, C3978d4.i.J0);
        return new G8(str, str2, str3, str4, drawable, webView, view);
    }

    @Nullable
    public final String a() {
        return this.f29419a;
    }

    @Nullable
    public final String b() {
        return this.f29420b;
    }

    @Nullable
    public final String c() {
        return this.f29421c;
    }

    @Nullable
    public final String d() {
        return this.f29422d;
    }

    @Nullable
    public final Drawable e() {
        return this.f29423e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g82 = (G8) obj;
        return tn.p.f(this.f29419a, g82.f29419a) && tn.p.f(this.f29420b, g82.f29420b) && tn.p.f(this.f29421c, g82.f29421c) && tn.p.f(this.f29422d, g82.f29422d) && tn.p.f(this.f29423e, g82.f29423e) && tn.p.f(this.f29424f, g82.f29424f) && tn.p.f(this.f29425g, g82.f29425g);
    }

    @Nullable
    public final WebView f() {
        return this.f29424f;
    }

    @NotNull
    public final View g() {
        return this.f29425g;
    }

    @Nullable
    public final String h() {
        return this.f29420b;
    }

    public int hashCode() {
        String str = this.f29419a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29420b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29421c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29422d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f29423e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f29424f;
        return ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f29425g.hashCode();
    }

    @Nullable
    public final String i() {
        return this.f29421c;
    }

    @Nullable
    public final String j() {
        return this.f29422d;
    }

    @Nullable
    public final Drawable k() {
        return this.f29423e;
    }

    @Nullable
    public final WebView l() {
        return this.f29424f;
    }

    @NotNull
    public final View m() {
        return this.f29425g;
    }

    @Nullable
    public final String n() {
        return this.f29419a;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdData(title=" + this.f29419a + ", advertiser=" + this.f29420b + ", body=" + this.f29421c + ", cta=" + this.f29422d + ", icon=" + this.f29423e + ", mediaView=" + this.f29424f + ", privacyIcon=" + this.f29425g + ")";
    }
}
