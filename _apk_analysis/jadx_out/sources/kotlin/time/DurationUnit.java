package kotlin.time;

import java.util.concurrent.TimeUnit;
import kn.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DurationUnit {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DurationUnit[] f73244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73245c;

    @NotNull
    private final TimeUnit timeUnit;
    public static final DurationUnit NANOSECONDS = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final DurationUnit MICROSECONDS = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final DurationUnit MILLISECONDS = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final DurationUnit SECONDS = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
    public static final DurationUnit MINUTES = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
    public static final DurationUnit HOURS = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
    public static final DurationUnit DAYS = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    static {
        DurationUnit[] durationUnitArrD = d();
        f73244b = durationUnitArrD;
        f73245c = kotlin.enums.a.a(durationUnitArrD);
    }

    public DurationUnit(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static final /* synthetic */ DurationUnit[] d() {
        return new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    @NotNull
    public static a<DurationUnit> getEntries() {
        return f73245c;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f73244b.clone();
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
