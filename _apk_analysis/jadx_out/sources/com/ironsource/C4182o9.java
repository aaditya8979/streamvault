package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4182o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f33151c;

    public C4182o9() {
        this(null, 0, null, 7, null);
    }

    public C4182o9(@NotNull String str, int i10, @Nullable String str2) {
        tn.p.k(str, "instanceId");
        this.f33149a = str;
        this.f33150b = i10;
        this.f33151c = str2;
    }

    public /* synthetic */ C4182o9(String str, int i10, String str2, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ C4182o9 a(C4182o9 c4182o9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4182o9.f33149a;
        }
        if ((i11 & 2) != 0) {
            i10 = c4182o9.f33150b;
        }
        if ((i11 & 4) != 0) {
            str2 = c4182o9.f33151c;
        }
        return c4182o9.a(str, i10, str2);
    }

    @NotNull
    public final C4182o9 a(@NotNull String str, int i10, @Nullable String str2) {
        tn.p.k(str, "instanceId");
        return new C4182o9(str, i10, str2);
    }

    @NotNull
    public final String a() {
        return this.f33149a;
    }

    public final int b() {
        return this.f33150b;
    }

    @Nullable
    public final String c() {
        return this.f33151c;
    }

    @Nullable
    public final String d() {
        return this.f33151c;
    }

    @NotNull
    public final String e() {
        return this.f33149a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4182o9)) {
            return false;
        }
        C4182o9 c4182o9 = (C4182o9) obj;
        return tn.p.f(this.f33149a, c4182o9.f33149a) && this.f33150b == c4182o9.f33150b && tn.p.f(this.f33151c, c4182o9.f33151c);
    }

    public final int f() {
        return this.f33150b;
    }

    public int hashCode() {
        int iHashCode = ((this.f33149a.hashCode() * 31) + Integer.hashCode(this.f33150b)) * 31;
        String str = this.f33151c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InstanceInformation(instanceId=" + this.f33149a + ", instanceType=" + this.f33150b + ", dynamicDemandSourceId=" + this.f33151c + ")";
    }
}
