package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wm f65633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X2 f65634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f65635d;

    public N9(Context context) {
        this(context, new Wm(context, "io.appmetrica.analytics.build_id"), new X2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }

    public N9(Context context, Wm wm2, X2 x22, SafePackageManager safePackageManager) {
        this.f65632a = context;
        this.f65633b = wm2;
        this.f65634c = x22;
        this.f65635d = safePackageManager;
    }
}
