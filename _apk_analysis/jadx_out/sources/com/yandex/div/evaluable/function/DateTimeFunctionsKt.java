package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFunctionsKt {
    @NotNull
    public static final Calendar toCalendar(@NotNull DateTime dateTime) {
        p.k(dateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone$div_evaluable());
        calendar.setTimeInMillis(dateTime.getTimestampMillis$div_evaluable());
        p.j(calendar, "calendar");
        return calendar;
    }

    @NotNull
    public static final Date toDate(@NotNull DateTime dateTime) {
        p.k(dateTime, "<this>");
        return new Date(dateTime.getTimestampMillis$div_evaluable() - ((long) dateTime.getTimezone$div_evaluable().getRawOffset()));
    }
}
