package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class T9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30479b;

    public T9(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "advId");
        tn.p.k(str2, "advIdType");
        this.f30478a = str;
        this.f30479b = str2;
    }

    public static /* synthetic */ T9 a(T9 t92, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = t92.f30478a;
        }
        if ((i10 & 2) != 0) {
            str2 = t92.f30479b;
        }
        return t92.a(str, str2);
    }

    @NotNull
    public final T9 a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "advId");
        tn.p.k(str2, "advIdType");
        return new T9(str, str2);
    }

    @NotNull
    public final String a() {
        return this.f30478a;
    }

    @NotNull
    public final String b() {
        return this.f30479b;
    }

    @NotNull
    public final String c() {
        return this.f30478a;
    }

    @NotNull
    public final String d() {
        return this.f30479b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9)) {
            return false;
        }
        T9 t92 = (T9) obj;
        return tn.p.f(this.f30478a, t92.f30478a) && tn.p.f(this.f30479b, t92.f30479b);
    }

    public int hashCode() {
        return (this.f30478a.hashCode() * 31) + this.f30479b.hashCode();
    }

    @NotNull
    public String toString() {
        return "IronSourceAdvId(advId=" + this.f30478a + ", advIdType=" + this.f30479b + ")";
    }
}
