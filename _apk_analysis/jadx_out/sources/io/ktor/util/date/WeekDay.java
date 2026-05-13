package io.ktor.util.date;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class WeekDay {

    @NotNull
    public static final a Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WeekDay[] f71224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f71225c;

    @NotNull
    private final String value;
    public static final WeekDay MONDAY = new WeekDay("MONDAY", 0, "Mon");
    public static final WeekDay TUESDAY = new WeekDay("TUESDAY", 1, "Tue");
    public static final WeekDay WEDNESDAY = new WeekDay("WEDNESDAY", 2, "Wed");
    public static final WeekDay THURSDAY = new WeekDay("THURSDAY", 3, "Thu");
    public static final WeekDay FRIDAY = new WeekDay("FRIDAY", 4, "Fri");
    public static final WeekDay SATURDAY = new WeekDay("SATURDAY", 5, "Sat");
    public static final WeekDay SUNDAY = new WeekDay("SUNDAY", 6, "Sun");

    /* JADX INFO: compiled from: Date.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final WeekDay a(int i10) {
            return WeekDay.getEntries().get(i10);
        }
    }

    static {
        WeekDay[] weekDayArrD = d();
        f71224b = weekDayArrD;
        f71225c = kotlin.enums.a.a(weekDayArrD);
        Companion = new a(null);
    }

    public WeekDay(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ WeekDay[] d() {
        return new WeekDay[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    @NotNull
    public static kn.a<WeekDay> getEntries() {
        return f71225c;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) f71224b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
