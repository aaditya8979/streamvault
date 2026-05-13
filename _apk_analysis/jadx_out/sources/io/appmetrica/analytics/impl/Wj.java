package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes9.dex */
public final class Wj extends Y4 {
    public Wj(Context context, R4 r42, C4898k0 c4898k0, TimePassedChecker timePassedChecker, C4723d5 c4723d5, C5028p4 c5028p4) {
        super(context, r42, c4898k0, timePassedChecker, c4723d5, c5028p4);
    }

    public Wj(@NonNull Context context, @NonNull C4817gm c4817gm, @NonNull R4 r42, @NonNull C5028p4 c5028p4, @NonNull InterfaceC4863ih interfaceC4863ih, @NonNull W4 w42, @NonNull Q4 q42) {
        this(context, r42, new C4898k0(), new TimePassedChecker(), new C4723d5(context, r42, c5028p4, w42, c4817gm, interfaceC4863ih, C5009oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C5009oa.k().l(), q42), c5028p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }
}
