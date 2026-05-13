package yads;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ip2 {
    public static gp2 a(AdTheme adTheme) {
        int i10 = hp2.f90477a[adTheme.ordinal()];
        if (i10 == 1) {
            return gp2.f90083d;
        }
        if (i10 == 2) {
            return gp2.f90082c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
