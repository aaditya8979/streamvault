package com.moloco.sdk.internal.utils;

import bo.a0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull String str, int i10) {
        p.k(str, "$this$substituteCountDownTimeLeftMacro");
        return a0.S(str, "[SECONDS_LEFT]", Long.toString(((long) i10) & 4294967295L, 10), false, 4, null);
    }

    @NotNull
    public static final String b(@NotNull String str, long j10) {
        p.k(str, "<this>");
        return a0.S(str, "[HAPPENED_AT_TS]", String.valueOf(j10), false, 4, null);
    }

    @NotNull
    public static final String c(@NotNull String str, @NotNull String str2) {
        p.k(str, "<this>");
        p.k(str2, IronSourceConstants.EVENTS_ERROR_CODE);
        return a0.S(str, "[ERROR_CODE]", str2, false, 4, null);
    }

    @NotNull
    public static final String d(@NotNull String str, @NotNull String str2, long j10) {
        p.k(str, "<this>");
        p.k(str2, IronSourceConstants.EVENTS_ERROR_CODE);
        return b(c(str, str2), j10);
    }

    @NotNull
    public static final String e(@NotNull String str, @Nullable String str2) {
        String strS;
        p.k(str, "<this>");
        return (str2 == null || (strS = a0.S(str, "[MTID]", str2, false, 4, null)) == null) ? str : strS;
    }
}
