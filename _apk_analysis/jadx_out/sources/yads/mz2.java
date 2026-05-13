package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class mz2 implements ic0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f92666b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f92667a;

    public mz2(v9 v9Var) {
        this.f92667a = v9Var;
    }

    @Override // yads.ic0
    public final long a() {
        Long l10 = this.f92667a.f96008s;
        return l10 != null ? l10.longValue() : f92666b;
    }
}
