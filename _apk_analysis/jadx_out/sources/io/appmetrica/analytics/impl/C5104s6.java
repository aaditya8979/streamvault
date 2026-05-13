package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5104s6 implements Df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C5079r6 f67664b = new C5079r6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Df f67665a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5104s6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C5104s6(@NotNull Df df2) {
        this.f67665a = df2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5104s6(Df df2, int i10, tn.i iVar) {
        if ((i10 & 1) != 0) {
            f67664b.getClass();
            df2 = C5079r6.a();
        }
        this(df2);
    }

    @Override // io.appmetrica.analytics.impl.Df
    @Nullable
    public final String a() {
        return this.f67665a.a();
    }

    public final boolean a(@NotNull String str) {
        try {
            String strA = this.f67665a.a();
            if (strA == null || strA.length() <= 0) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str);
            return bo.a0.I(strA, sb2.toString(), false, 2, null);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b() {
        try {
            String strA = this.f67665a.a();
            if (strA != null && strA.length() > 0) {
                return !bo.d0.c0(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
