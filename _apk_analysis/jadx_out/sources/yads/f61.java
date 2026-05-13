package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class f61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e61 f89490a = new e61(co2.E, co2.D, co2.F, co2.G);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e61 f89491b = new e61(co2.f88546p, co2.f88545o, co2.f88547q, co2.f88548r);

    public static e61 a(va vaVar) {
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return f89490a;
        }
        if (iOrdinal == 2) {
            return f89491b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
