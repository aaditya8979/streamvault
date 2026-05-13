package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f30092a;

    /* JADX WARN: Multi-variable type inference failed */
    public Of() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Of(@Nullable String str) {
        this.f30092a = str;
    }

    public /* synthetic */ Of(String str, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Of a(Of of2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = of2.f30092a;
        }
        return of2.a(str);
    }

    @NotNull
    public final Of a(@Nullable String str) {
        return new Of(str);
    }

    @Nullable
    public final String a() {
        return this.f30092a;
    }

    @Nullable
    public final String b() {
        return this.f30092a;
    }

    public final void b(@Nullable String str) {
        this.f30092a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Of) && tn.p.f(this.f30092a, ((Of) obj).f30092a);
    }

    public int hashCode() {
        String str = this.f30092a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f30092a + ")";
    }
}
