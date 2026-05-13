package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4943lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f67237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f67238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5018oj f67239d;

    public C4943lj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C5018oj c5018oj) {
        this.f67236a = str;
        this.f67237b = context;
        int i10 = AbstractC4917kj.f67145a[counterConfigurationReporterType.ordinal()];
        if (i10 == 1) {
            this.f67238c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i10 != 2) {
            this.f67238c = null;
        } else {
            this.f67238c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f67239d = c5018oj;
    }
}
