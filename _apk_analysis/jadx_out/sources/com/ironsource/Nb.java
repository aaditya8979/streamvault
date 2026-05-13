package com.ironsource;

import com.ironsource.sdk.controller.f;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Nb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f29896d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f29899c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final Nb a(@NotNull String str) throws JSONException {
            tn.p.k(str, "jsonStr");
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String string = jSONObjectJsonObjectInit.getString(f.b.f33716c);
            String string2 = jSONObjectJsonObjectInit.getString(f.b.f33720g);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            tn.p.j(string, f.b.f33716c);
            tn.p.j(string2, f.b.f33720g);
            return new Nb(string, string2, jSONObjectOptJSONObject);
        }
    }

    public Nb(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        tn.p.k(str, f.b.f33716c);
        tn.p.k(str2, f.b.f33720g);
        this.f29897a = str;
        this.f29898b = str2;
        this.f29899c = jSONObject;
    }

    public static /* synthetic */ Nb a(Nb nb2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nb2.f29897a;
        }
        if ((i10 & 2) != 0) {
            str2 = nb2.f29898b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = nb2.f29899c;
        }
        return nb2.a(str, str2, jSONObject);
    }

    @NotNull
    public static final Nb a(@NotNull String str) throws JSONException {
        return f29896d.a(str);
    }

    @NotNull
    public final Nb a(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        tn.p.k(str, f.b.f33716c);
        tn.p.k(str2, f.b.f33720g);
        return new Nb(str, str2, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.f29897a;
    }

    @NotNull
    public final String b() {
        return this.f29898b;
    }

    @Nullable
    public final JSONObject c() {
        return this.f29899c;
    }

    @NotNull
    public final String d() {
        return this.f29897a;
    }

    @NotNull
    public final String e() {
        return this.f29898b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb2 = (Nb) obj;
        return tn.p.f(this.f29897a, nb2.f29897a) && tn.p.f(this.f29898b, nb2.f29898b) && tn.p.f(this.f29899c, nb2.f29899c);
    }

    @Nullable
    public final JSONObject f() {
        return this.f29899c;
    }

    public int hashCode() {
        int iHashCode = ((this.f29897a.hashCode() * 31) + this.f29898b.hashCode()) * 31;
        JSONObject jSONObject = this.f29899c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessageToNative(adId=" + this.f29897a + ", command=" + this.f29898b + ", params=" + this.f29899c + ")";
    }
}
