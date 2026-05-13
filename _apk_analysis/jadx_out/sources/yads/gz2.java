package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class gz2 implements u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f90168b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f90169a;

    public gz2(v9 v9Var) {
        this.f90169a = v9Var;
    }

    @Override // yads.u2
    public final long a() {
        Long l10 = this.f90169a.f96008s;
        return l10 != null ? l10.longValue() : f90168b;
    }

    @Override // yads.u2
    public final long a(long j10) {
        Long l10 = this.f90169a.f96008s;
        return l10 != null ? Math.min(j10, l10.longValue()) : j10;
    }
}
