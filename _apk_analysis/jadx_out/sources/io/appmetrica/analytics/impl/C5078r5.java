package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5078r5 implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67606a;

    public C5078r5(@NotNull String str) {
        this.f67606a = str;
    }

    public static C5078r5 a(C5078r5 c5078r5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c5078r5.f67606a;
        }
        c5078r5.getClass();
        return new C5078r5(str);
    }

    @NotNull
    public final C5078r5 a(@NotNull String str) {
        return new C5078r5(str);
    }

    @Override // io.appmetrica.analytics.impl.Sc
    @NotNull
    public final String a() {
        return this.f67606a;
    }

    @NotNull
    public final String b() {
        return this.f67606a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5078r5) && tn.p.f(this.f67606a, ((C5078r5) obj).f67606a);
    }

    public final int hashCode() {
        return this.f67606a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f67606a + ')';
    }
}
