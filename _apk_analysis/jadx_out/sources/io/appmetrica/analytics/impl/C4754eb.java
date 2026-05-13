package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4754eb {
    public static final B9 a(C4754eb c4754eb, K9 k92, JSONObject jSONObject) {
        int i10;
        c4754eb.getClass();
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
        b92.f65029b = jSONObject.toString().getBytes(bo.c.f5639b);
        return b92;
    }
}
