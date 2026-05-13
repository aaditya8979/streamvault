package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3929a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f30944a;

    public C3929a9(E0 e02) {
        this.f30944a = e02;
    }

    public void a() {
        this.f30944a.a(B0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f30944a.a(B0.INIT_FAILED, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f30944a.a(B0.INIT_ENDED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + ImpressionLog.Q + str2);
        this.f30944a.a(B0.INIT_STARTED, map);
    }
}
