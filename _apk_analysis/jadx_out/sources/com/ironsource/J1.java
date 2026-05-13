package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f29647a;

    /* JADX WARN: Multi-variable type inference failed */
    public J1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public J1(@NotNull Map<String, String> map) {
        tn.p.k(map, Ne.f29959p0);
        this.f29647a = map;
    }

    public /* synthetic */ J1(Map map, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j12, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = j12.f29647a;
        }
        return j12.a(map);
    }

    @NotNull
    public final J1 a(@NotNull Map<String, String> map) {
        tn.p.k(map, Ne.f29959p0);
        return new J1(map);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f29647a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f29647a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && tn.p.f(this.f29647a, ((J1) obj).f29647a);
    }

    public int hashCode() {
        return this.f29647a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f29647a + ")";
    }
}
