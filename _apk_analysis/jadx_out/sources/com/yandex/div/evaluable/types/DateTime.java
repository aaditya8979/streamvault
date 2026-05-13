package com.yandex.div.evaluable.types;

import bn.g;
import bo.d0;
import com.google.android.material.datepicker.UtcDates;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DateTime.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DateTime implements Comparable<DateTime> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, UtcDates.UTC);

    @NotNull
    private final g calendar$delegate;
    private final long timestampMillis;
    private final long timestampUtc;

    @NotNull
    private final TimeZone timezone;
    private final int timezoneMinutes;

    /* JADX INFO: compiled from: DateTime.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final String formatDate$div_evaluable(@NotNull Calendar calendar) {
            p.k(calendar, "c");
            return String.valueOf(calendar.get(1)) + '-' + d0.D0(String.valueOf(calendar.get(2) + 1), 2, '0') + '-' + d0.D0(String.valueOf(calendar.get(5)), 2, '0') + ' ' + d0.D0(String.valueOf(calendar.get(11)), 2, '0') + ':' + d0.D0(String.valueOf(calendar.get(12)), 2, '0') + ':' + d0.D0(String.valueOf(calendar.get(13)), 2, '0');
        }
    }

    public DateTime(long j10, @NotNull TimeZone timeZone) {
        p.k(timeZone, "timezone");
        this.timestampMillis = j10;
        this.timezone = timeZone;
        this.calendar$delegate = b.a(LazyThreadSafetyMode.NONE, new a<Calendar>() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
            {
                super(0);
            }

            @Override // sn.a
            public final Calendar invoke() {
                Calendar calendar = Calendar.getInstance(DateTime.utcTimezone);
                calendar.setTimeInMillis(this.this$0.getTimestampMillis$div_evaluable());
                return calendar;
            }
        });
        int rawOffset = timeZone.getRawOffset() / 60;
        this.timezoneMinutes = rawOffset;
        this.timestampUtc = j10 - ((long) (rawOffset * 60000));
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar$delegate.getValue();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DateTime dateTime) {
        p.k(dateTime, "other");
        return p.n(this.timestampUtc, dateTime.timestampUtc);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.timestampUtc == ((DateTime) obj).timestampUtc;
    }

    public final long getTimestampMillis$div_evaluable() {
        return this.timestampMillis;
    }

    @NotNull
    public final TimeZone getTimezone$div_evaluable() {
        return this.timezone;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampUtc);
    }

    @NotNull
    public String toString() {
        Companion companion = Companion;
        Calendar calendar = getCalendar();
        p.j(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }
}
