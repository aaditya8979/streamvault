package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class w {
    public static final long a() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final SimpleDateFormat b(@NotNull String str) {
        tn.p.k(str, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        return simpleDateFormat;
    }
}
