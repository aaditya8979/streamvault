package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5101s3 implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f67660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f67661b;

    public C5101s3(@Nullable Map<String, String> map, @NotNull T7 t72) {
        this.f67660a = map;
        this.f67661b = t72;
    }

    public static C5101s3 a(C5101s3 c5101s3, Map map, T7 t72, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = c5101s3.f67660a;
        }
        if ((i10 & 2) != 0) {
            t72 = c5101s3.f67661b;
        }
        c5101s3.getClass();
        return new C5101s3(map, t72);
    }

    @Override // io.appmetrica.analytics.impl.U7
    @NotNull
    public final T7 a() {
        return this.f67661b;
    }

    @NotNull
    public final C5101s3 a(@Nullable Map<String, String> map, @NotNull T7 t72) {
        return new C5101s3(map, t72);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f67660a;
    }

    @NotNull
    public final T7 c() {
        return this.f67661b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f67660a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5101s3)) {
            return false;
        }
        C5101s3 c5101s3 = (C5101s3) obj;
        return tn.p.f(this.f67660a, c5101s3.f67660a) && this.f67661b == c5101s3.f67661b;
    }

    public final int hashCode() {
        Map map = this.f67660a;
        return this.f67661b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f67660a + ", source=" + this.f67661b + ')';
    }
}
