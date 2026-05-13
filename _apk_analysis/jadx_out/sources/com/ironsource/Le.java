package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f29804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4339xd f29805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, C4271td> f29806c;

    public Le(@NotNull JSONObject jSONObject, @NotNull C4339xd c4339xd, @NotNull Map<String, C4271td> map) {
        tn.p.k(jSONObject, "configurations");
        tn.p.k(c4339xd, "providerOrder");
        tn.p.k(map, "providerSettings");
        this.f29804a = jSONObject;
        this.f29805b = c4339xd;
        this.f29806c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Le a(Le le2, JSONObject jSONObject, C4339xd c4339xd, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = le2.f29804a;
        }
        if ((i10 & 2) != 0) {
            c4339xd = le2.f29805b;
        }
        if ((i10 & 4) != 0) {
            map = le2.f29806c;
        }
        return le2.a(jSONObject, c4339xd, map);
    }

    @NotNull
    public final Le a(@NotNull JSONObject jSONObject, @NotNull C4339xd c4339xd, @NotNull Map<String, C4271td> map) {
        tn.p.k(jSONObject, "configurations");
        tn.p.k(c4339xd, "providerOrder");
        tn.p.k(map, "providerSettings");
        return new Le(jSONObject, c4339xd, map);
    }

    @NotNull
    public final JSONObject a() {
        return this.f29804a;
    }

    @NotNull
    public final C4339xd b() {
        return this.f29805b;
    }

    @NotNull
    public final Map<String, C4271td> c() {
        return this.f29806c;
    }

    @NotNull
    public final JSONObject d() {
        return this.f29804a;
    }

    @NotNull
    public final C4339xd e() {
        return this.f29805b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return tn.p.f(this.f29804a, le2.f29804a) && tn.p.f(this.f29805b, le2.f29805b) && tn.p.f(this.f29806c, le2.f29806c);
    }

    @NotNull
    public final Map<String, C4271td> f() {
        return this.f29806c;
    }

    public int hashCode() {
        return (((this.f29804a.hashCode() * 31) + this.f29805b.hashCode()) * 31) + this.f29806c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ServerResponse2(configurations=" + this.f29804a + ", providerOrder=" + this.f29805b + ", providerSettings=" + this.f29806c + ")";
    }
}
