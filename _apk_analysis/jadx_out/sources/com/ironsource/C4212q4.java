package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4212q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f33335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33337c;

    public C4212q4(@NotNull Throwable th2) {
        tn.p.k(th2, "throwable");
        this.f33335a = th2;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        tn.p.j(stackTrace, "throwable.stackTrace");
        sb2.append(th2.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            tn.p.j(string, "elem.toString()");
            String strE = C4228r4.d().e();
            tn.p.j(strE, "getInstance().keyword");
            if (bo.d0.c0(string, strE, false, 2, null)) {
                z10 = true;
            }
        }
        Throwable cause = this.f33335a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            tn.p.j(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                tn.p.j(string2, "elem.toString()");
                String strE2 = C4228r4.d().e();
                tn.p.j(strE2, "getInstance().keyword");
                if (bo.d0.c0(string2, strE2, false, 2, null)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        tn.p.j(string3, "builder.toString()");
        this.f33336b = string3;
        this.f33337c = z10;
    }

    public static /* synthetic */ C4212q4 a(C4212q4 c4212q4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c4212q4.f33335a;
        }
        return c4212q4.a(th2);
    }

    @NotNull
    public final C4212q4 a(@NotNull Throwable th2) {
        tn.p.k(th2, "throwable");
        return new C4212q4(th2);
    }

    @NotNull
    public final Throwable a() {
        return this.f33335a;
    }

    @NotNull
    public final String b() {
        return this.f33336b;
    }

    @NotNull
    public final Throwable c() {
        return this.f33335a;
    }

    public final boolean d() {
        return this.f33337c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4212q4) && tn.p.f(this.f33335a, ((C4212q4) obj).f33335a);
    }

    public int hashCode() {
        return this.f33335a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f33335a + ")";
    }
}
