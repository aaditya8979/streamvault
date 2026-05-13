package com.ironsource;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4339xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Map<String, List<String>> f34393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<String, List<String>> f34394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, List<String>> f34395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Map<String, List<String>> f34396d;

    public C4339xd() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4339xd(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        this.f34393a = map;
        this.f34394b = map2;
        this.f34395c = map3;
        this.f34396d = map4;
    }

    public /* synthetic */ C4339xd(Map map, Map map2, Map map3, Map map4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2, (i10 & 4) != 0 ? null : map3, (i10 & 8) != 0 ? null : map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4339xd a(C4339xd c4339xd, Map map, Map map2, Map map3, Map map4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c4339xd.f34393a;
        }
        if ((i10 & 2) != 0) {
            map2 = c4339xd.f34394b;
        }
        if ((i10 & 4) != 0) {
            map3 = c4339xd.f34395c;
        }
        if ((i10 & 8) != 0) {
            map4 = c4339xd.f34396d;
        }
        return c4339xd.a(map, map2, map3, map4);
    }

    @NotNull
    public final C4339xd a(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        return new C4339xd(map, map2, map3, map4);
    }

    @Nullable
    public final Map<String, List<String>> a() {
        return this.f34393a;
    }

    @Nullable
    public final Map<String, List<String>> b() {
        return this.f34394b;
    }

    @Nullable
    public final Map<String, List<String>> c() {
        return this.f34395c;
    }

    @Nullable
    public final Map<String, List<String>> d() {
        return this.f34396d;
    }

    @Nullable
    public final Map<String, List<String>> e() {
        return this.f34395c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4339xd)) {
            return false;
        }
        C4339xd c4339xd = (C4339xd) obj;
        return tn.p.f(this.f34393a, c4339xd.f34393a) && tn.p.f(this.f34394b, c4339xd.f34394b) && tn.p.f(this.f34395c, c4339xd.f34395c) && tn.p.f(this.f34396d, c4339xd.f34396d);
    }

    @Nullable
    public final Map<String, List<String>> f() {
        return this.f34394b;
    }

    @Nullable
    public final Map<String, List<String>> g() {
        return this.f34396d;
    }

    @Nullable
    public final Map<String, List<String>> h() {
        return this.f34393a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f34393a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.f34394b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.f34395c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.f34396d;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f34393a + ", interstitial=" + this.f34394b + ", banner=" + this.f34395c + ", nativeAd=" + this.f34396d + ")";
    }
}
