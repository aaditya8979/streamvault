package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5239xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f67947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa f67948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ec f67949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f67950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f67951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f67952g;

    public /* synthetic */ C5239xg(Context context) {
        this(context, new SafePackageManager(), AbstractC5249y1.a());
    }

    public C5239xg(Context context, SafePackageManager safePackageManager, Sa sa2) {
        this.f67946a = context;
        this.f67947b = safePackageManager;
        this.f67948c = sa2;
        Ec ec2 = new Ec(0);
        ec2.a(EnumC4990ng.f67366d, 1);
        ec2.a(EnumC4990ng.f67365c, 2);
        this.f67949d = ec2;
        this.f67950e = TimeUnit.DAYS.toSeconds(1L);
        this.f67951f = "com.android.vending";
        this.f67952g = "com.huawei.appmarket";
    }

    public static final int a(C5239xg c5239xg, C5015og c5015og, C5015og c5015og2) {
        int iB = vn.c.b(c5015og.f67462c - c5015og2.f67462c);
        return iB == 0 ? ((Number) c5239xg.f67949d.a(c5015og.f67463d)).intValue() - ((Number) c5239xg.f67949d.a(c5015og2.f67463d)).intValue() : iB;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C5015og a(java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5239xg.a(java.util.List):io.appmetrica.analytics.impl.og");
    }
}
