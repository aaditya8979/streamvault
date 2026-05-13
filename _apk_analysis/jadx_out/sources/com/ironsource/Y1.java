package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Y1 f30685a = new Y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f30686b = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f30687c = "parsing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f30688d = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f30689e = "disabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f30690f = "-1";

    private Y1() {
    }

    public static /* synthetic */ String a(Y1 y12, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return y12.a(z10, num);
    }

    @NotNull
    public final String a(boolean z10) {
        if (!z10) {
            return f30690f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    @NotNull
    public final String a(boolean z10, @Nullable Integer num) {
        return !z10 ? f30689e : ((num != null && num.intValue() == 1003) || (num != null && num.intValue() == 1008) || (num != null && num.intValue() == 1002)) ? f30687c : ((num != null && num.intValue() == 1006) || (num != null && num.intValue() == 1001)) ? f30686b : "other";
    }
}
