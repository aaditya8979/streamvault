package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4908ka implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    @Nullable
    public final C4649a9 a(@Nullable C4879j7 c4879j7) {
        C4649a9 c4649a9 = null;
        if ((c4879j7 != null ? c4879j7.f67011b : null) != null && c4879j7.f67012c != null) {
            c4649a9 = new C4649a9();
            c4649a9.f66351b = c4879j7.f67011b.doubleValue();
            c4649a9.f66350a = c4879j7.f67012c.doubleValue();
            Integer num = c4879j7.f67013d;
            if (num != null) {
                c4649a9.f66356g = num.intValue();
            }
            Integer num2 = c4879j7.f67014e;
            if (num2 != null) {
                c4649a9.f66354e = num2.intValue();
            }
            Integer num3 = c4879j7.f67015f;
            if (num3 != null) {
                c4649a9.f66353d = num3.intValue();
            }
            Integer num4 = c4879j7.f67016g;
            if (num4 != null) {
                c4649a9.f66355f = num4.intValue();
            }
            Long l10 = c4879j7.f67017h;
            if (l10 != null) {
                c4649a9.f66352c = TimeUnit.MILLISECONDS.toSeconds(l10.longValue());
            }
            String str = c4879j7.f67018i;
            if (str != null) {
                if (tn.p.f(str, "gps")) {
                    c4649a9.f66357h = 1;
                } else if (tn.p.f(str, "network")) {
                    c4649a9.f66357h = 2;
                }
            }
            String str2 = c4879j7.f67019j;
            if (str2 != null) {
                c4649a9.f66358i = str2;
            }
        }
        return c4649a9;
    }
}
