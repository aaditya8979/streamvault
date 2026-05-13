package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5126t3 implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5101s3 f67715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67716b;

    public C5126t3(@NotNull C5101s3 c5101s3, @NotNull List<C5101s3> list) {
        this.f67715a = c5101s3;
        this.f67716b = list;
    }

    public static C5126t3 a(C5126t3 c5126t3, C5101s3 c5101s3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5101s3 = c5126t3.f67715a;
        }
        if ((i10 & 2) != 0) {
            list = c5126t3.f67716b;
        }
        c5126t3.getClass();
        return new C5126t3(c5101s3, list);
    }

    @NotNull
    public final C5126t3 a(@NotNull C5101s3 c5101s3, @NotNull List<C5101s3> list) {
        return new C5126t3(c5101s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    @NotNull
    public final List<C5101s3> a() {
        return this.f67716b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f67715a;
    }

    @NotNull
    public final C5101s3 c() {
        return this.f67715a;
    }

    @NotNull
    public final List<C5101s3> d() {
        return this.f67716b;
    }

    @NotNull
    public final C5101s3 e() {
        return this.f67715a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5126t3)) {
            return false;
        }
        C5126t3 c5126t3 = (C5126t3) obj;
        return tn.p.f(this.f67715a, c5126t3.f67715a) && tn.p.f(this.f67716b, c5126t3.f67716b);
    }

    public final int hashCode() {
        return this.f67716b.hashCode() + (this.f67715a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f67715a + ", candidates=" + this.f67716b + ')';
    }
}
