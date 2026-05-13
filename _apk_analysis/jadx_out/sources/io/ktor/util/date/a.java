package io.ktor.util.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import nl.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DateJvm.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f71226a = TimeZone.getTimeZone("GMT");

    @NotNull
    public static final c a(@Nullable Long l10) {
        Calendar calendar = Calendar.getInstance(f71226a, Locale.ROOT);
        p.h(calendar);
        return c(calendar, l10);
    }

    public static /* synthetic */ c b(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return a(l10);
    }

    @NotNull
    public static final c c(@NotNull Calendar calendar, @Nullable Long l10) {
        p.k(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(15) + calendar.get(16);
        return new c(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.Companion.a(((calendar.get(7) + 7) - 2) % 7), calendar.get(5), calendar.get(6), Month.Companion.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }
}
