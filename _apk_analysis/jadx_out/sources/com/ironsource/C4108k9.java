package com.ironsource;

import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4108k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC4144m9 f32147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f32148d;

    public C4108k9(@NotNull String str, @NotNull String str2, @NotNull EnumC4144m9 enumC4144m9, @Nullable JSONObject jSONObject) {
        tn.p.k(str, "url");
        tn.p.k(str2, C3978d4.f.f31281c);
        tn.p.k(enumC4144m9, C3978d4.f.f31283e);
        this.f32145a = str;
        this.f32146b = str2;
        this.f32147c = enumC4144m9;
        this.f32148d = jSONObject;
    }

    public /* synthetic */ C4108k9(String str, String str2, EnumC4144m9 enumC4144m9, JSONObject jSONObject, int i10, tn.i iVar) {
        this(str, str2, (i10 & 4) != 0 ? EnumC4144m9.APP_ACTIVITY : enumC4144m9, (i10 & 8) != 0 ? null : jSONObject);
    }

    public static /* synthetic */ C4108k9 a(C4108k9 c4108k9, String str, String str2, EnumC4144m9 enumC4144m9, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4108k9.f32145a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4108k9.f32146b;
        }
        if ((i10 & 4) != 0) {
            enumC4144m9 = c4108k9.f32147c;
        }
        if ((i10 & 8) != 0) {
            jSONObject = c4108k9.f32148d;
        }
        return c4108k9.a(str, str2, enumC4144m9, jSONObject);
    }

    @NotNull
    public final C4108k9 a(@NotNull String str, @NotNull String str2, @NotNull EnumC4144m9 enumC4144m9, @Nullable JSONObject jSONObject) {
        tn.p.k(str, "url");
        tn.p.k(str2, C3978d4.f.f31281c);
        tn.p.k(enumC4144m9, C3978d4.f.f31283e);
        return new C4108k9(str, str2, enumC4144m9, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.f32145a;
    }

    @NotNull
    public final String b() {
        return this.f32146b;
    }

    @NotNull
    public final EnumC4144m9 c() {
        return this.f32147c;
    }

    @Nullable
    public final JSONObject d() {
        return this.f32148d;
    }

    @Nullable
    public final JSONObject e() {
        return this.f32148d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4108k9)) {
            return false;
        }
        C4108k9 c4108k9 = (C4108k9) obj;
        return tn.p.f(this.f32145a, c4108k9.f32145a) && tn.p.f(this.f32146b, c4108k9.f32146b) && this.f32147c == c4108k9.f32147c && tn.p.f(this.f32148d, c4108k9.f32148d);
    }

    @NotNull
    public final String f() {
        return this.f32146b;
    }

    @NotNull
    public final EnumC4144m9 g() {
        return this.f32147c;
    }

    @NotNull
    public final String h() {
        return this.f32145a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f32145a.hashCode() * 31) + this.f32146b.hashCode()) * 31) + this.f32147c.hashCode()) * 31;
        JSONObject jSONObject = this.f32148d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "InlineStoreRequest(url=" + this.f32145a + ", storePackage=" + this.f32146b + ", strategy=" + this.f32147c + ", extras=" + this.f32148d + ")";
    }
}
