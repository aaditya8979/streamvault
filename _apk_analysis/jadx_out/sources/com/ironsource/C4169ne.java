package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4169ne {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f33107c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f33108d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33109e = 2080;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33110f = 2090;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33111g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f33112h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33114b;

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public C4169ne(int i10, @NotNull String str) {
        tn.p.k(str, "errorMessage");
        this.f33113a = i10;
        this.f33114b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4169ne(@NotNull IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        int errorCode = ironSourceError.getErrorCode();
        String errorMessage = ironSourceError.getErrorMessage();
        tn.p.j(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public static /* synthetic */ C4169ne a(C4169ne c4169ne, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c4169ne.f33113a;
        }
        if ((i11 & 2) != 0) {
            str = c4169ne.f33114b;
        }
        return c4169ne.a(i10, str);
    }

    public final int a() {
        return this.f33113a;
    }

    @NotNull
    public final C4169ne a(int i10, @NotNull String str) {
        tn.p.k(str, "errorMessage");
        return new C4169ne(i10, str);
    }

    @NotNull
    public final String b() {
        return this.f33114b;
    }

    public final int c() {
        return this.f33113a;
    }

    @NotNull
    public final String d() {
        return this.f33114b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4169ne)) {
            return false;
        }
        C4169ne c4169ne = (C4169ne) obj;
        return this.f33113a == c4169ne.f33113a && tn.p.f(this.f33114b, c4169ne.f33114b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f33113a) * 31) + this.f33114b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.f33113a + ", errorMessage=" + this.f33114b + ")";
    }
}
