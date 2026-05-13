package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3966ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3966ca f31135a = new C3966ca();

    private C3966ca() {
    }

    public static final <T> T a(@Nullable T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str) {
        tn.p.k(str, "errorMessage");
        return a(obj, str, false, 4, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str, boolean z10) {
        tn.p.k(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(str);
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        IronLog.API.error(str);
        return false;
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }
}
