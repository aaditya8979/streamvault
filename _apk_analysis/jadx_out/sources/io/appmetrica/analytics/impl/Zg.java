package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes10.dex */
public final class Zg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C4655af c4655afY = C5009oa.I.y();
        if (timePassedChecker.didTimePassMillis(c4655afY.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlinVersion.getMajor());
            sb2.append('.');
            sb2.append(kotlinVersion.getMinor());
            sb2.append('.');
            sb2.append(kotlinVersion.getPatch());
            Map mapM = kotlin.collections.a.m(bn.h.a("major", Integer.valueOf(kotlinVersion.getMajor())), bn.h.a("minor", Integer.valueOf(kotlinVersion.getMinor())), bn.h.a("patch", Integer.valueOf(kotlinVersion.getPatch())), bn.h.a("version", sb2.toString()));
            Rj rj2 = AbstractC5043pj.f67535a;
            rj2.getClass();
            rj2.a(new Qj("kotlin_version", mapM));
            c4655afY.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
