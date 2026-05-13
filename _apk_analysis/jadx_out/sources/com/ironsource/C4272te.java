package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4272te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f34114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<IronSource.a> f34115c;

    public C4272te(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        tn.p.k(str, "appKey");
        tn.p.k(list, "legacyAdFormats");
        this.f34113a = str;
        this.f34114b = str2;
        this.f34115c = list;
    }

    public /* synthetic */ C4272te(String str, String str2, List list, int i10, tn.i iVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4272te a(C4272te c4272te, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4272te.f34113a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4272te.f34114b;
        }
        if ((i10 & 4) != 0) {
            list = c4272te.f34115c;
        }
        return c4272te.a(str, str2, list);
    }

    @NotNull
    public final C4272te a(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        tn.p.k(str, "appKey");
        tn.p.k(list, "legacyAdFormats");
        return new C4272te(str, str2, list);
    }

    @NotNull
    public final String a() {
        return this.f34113a;
    }

    public final void a(@NotNull List<? extends IronSource.a> list) {
        tn.p.k(list, "adFormats");
        this.f34115c.clear();
        this.f34115c.addAll(list);
    }

    @Nullable
    public final String b() {
        return this.f34114b;
    }

    @NotNull
    public final List<IronSource.a> c() {
        return this.f34115c;
    }

    @NotNull
    public final String d() {
        return this.f34113a;
    }

    @NotNull
    public final List<IronSource.a> e() {
        return this.f34115c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4272te)) {
            return false;
        }
        C4272te c4272te = (C4272te) obj;
        return tn.p.f(this.f34113a, c4272te.f34113a) && tn.p.f(this.f34114b, c4272te.f34114b) && tn.p.f(this.f34115c, c4272te.f34115c);
    }

    @Nullable
    public final String f() {
        return this.f34114b;
    }

    public int hashCode() {
        int iHashCode = this.f34113a.hashCode() * 31;
        String str = this.f34114b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f34115c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkInitRequest(appKey=" + this.f34113a + ", userId=" + this.f34114b + ", legacyAdFormats=" + this.f34115c + ")";
    }
}
