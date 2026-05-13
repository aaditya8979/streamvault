package yads;

import co.b;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f96593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f96594b;

    static {
        b.a aVar = co.b.f6773c;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jS = co.d.s(10, durationUnit);
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        f96593a = co.b.J(jS, durationUnit2);
        f96594b = co.b.J(co.d.s(30, durationUnit), durationUnit2);
        co.b.J(co.d.s(3, durationUnit), durationUnit2);
    }
}
