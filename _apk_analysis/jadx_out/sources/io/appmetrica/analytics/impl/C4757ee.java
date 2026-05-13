package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4757ee {
    public static final B9 a(C4757ee c4757ee, K9 k92) {
        int i10;
        c4757ee.getClass();
        B9 b92 = new B9();
        switch (k92) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        b92.f65028a = i10;
        return b92;
    }
}
