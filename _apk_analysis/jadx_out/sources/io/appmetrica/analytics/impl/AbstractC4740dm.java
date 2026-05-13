package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4740dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f66628a = cn.w0.j("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f66629b = new SystemTimeProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3 f66630c = new D3();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(io.appmetrica.analytics.impl.C4817gm r5, java.util.Collection r6, java.util.Map r7, sn.a r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.AbstractC4740dm.a(io.appmetrica.analytics.impl.gm, java.util.Collection, java.util.Map, sn.a):boolean");
    }

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }
}
