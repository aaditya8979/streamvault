package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f30349b;

    public Rc(@NotNull String str, @Nullable String str2) {
        tn.p.k(str, "url");
        this.f30348a = str;
        this.f30349b = str2;
    }

    public /* synthetic */ Rc(String str, String str2, int i10, tn.i iVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ Rc a(Rc rc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rc2.f30348a;
        }
        if ((i10 & 2) != 0) {
            str2 = rc2.f30349b;
        }
        return rc2.a(str, str2);
    }

    @NotNull
    public final Rc a(@NotNull String str, @Nullable String str2) {
        tn.p.k(str, "url");
        return new Rc(str, str2);
    }

    @NotNull
    public final String a() {
        return this.f30348a;
    }

    @Nullable
    public final String b() {
        return this.f30349b;
    }

    @Nullable
    public final String c() {
        return this.f30349b;
    }

    @NotNull
    public final String d() {
        return this.f30348a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc2 = (Rc) obj;
        return tn.p.f(this.f30348a, rc2.f30348a) && tn.p.f(this.f30349b, rc2.f30349b);
    }

    public int hashCode() {
        int iHashCode = this.f30348a.hashCode() * 31;
        String str = this.f30349b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "OpenUrl(url=" + this.f30348a + ", packageName=" + this.f30349b + ")";
    }
}
