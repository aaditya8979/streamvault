package io.bidmachine.util;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DateUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\t\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljava/util/Date;", "whenDate", "", "isOlderThanDate", "other", "", "daysBetween", "", "getBeginOfDayMs", "Ljava/util/Calendar;", "toCalendar", "Lbn/r;", "setupCalendarStartOfDay", "DAY_IN_MS", "J", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class DateUtilsKt {
    private static final long DAY_IN_MS = TimeUnit.DAYS.toMillis(1);

    public static final int daysBetween(@NotNull Date date, @NotNull Date date2) {
        p.k(date, "<this>");
        p.k(date2, "other");
        return (int) (Math.abs(getBeginOfDayMs(date2) - getBeginOfDayMs(date)) / DAY_IN_MS);
    }

    public static final long getBeginOfDayMs(@NotNull Date date) {
        p.k(date, "<this>");
        Calendar calendar = toCalendar(date);
        setupCalendarStartOfDay(calendar);
        return calendar.getTimeInMillis();
    }

    public static final boolean isOlderThanDate(@NotNull Date date, @NotNull Date date2) {
        p.k(date, "<this>");
        p.k(date2, "whenDate");
        return date.before(date2);
    }

    public static final void setupCalendarStartOfDay(@NotNull Calendar calendar) {
        p.k(calendar, "<this>");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @NotNull
    public static final Calendar toCalendar(@NotNull Date date) {
        p.k(date, "<this>");
        Calendar calendarCreateCalendar = DateUtils.createCalendar();
        calendarCreateCalendar.setTime(date);
        return calendarCreateCalendar;
    }
}
