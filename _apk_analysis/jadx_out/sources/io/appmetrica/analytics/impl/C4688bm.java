package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4688bm extends N5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3 f66443b;

    public C4688bm(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C5009oa.k().f());
    }

    public C4688bm(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull A3 a32) {
        super(context, str, safePackageManager);
        this.f66443b = a32;
    }

    @NonNull
    public final C4714cm a() {
        return new C4714cm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4714cm load(@NonNull M5 m52) {
        C4714cm c4714cm = (C4714cm) super.load(m52);
        C4817gm c4817gm = m52.f65562a;
        c4714cm.f66547d = c4817gm.f66851f;
        c4714cm.f66548e = c4817gm.f66852g;
        C4662am c4662am = (C4662am) m52.componentArguments;
        String str = c4662am.f66396a;
        if (str != null) {
            c4714cm.f66549f = str;
            c4714cm.f66550g = c4662am.f66397b;
        }
        Map<String, String> map = c4662am.f66398c;
        c4714cm.f66551h = map;
        c4714cm.f66552i = (C5101s3) this.f66443b.a(new C5101s3(map, T7.f65926c));
        C4662am c4662am2 = (C4662am) m52.componentArguments;
        c4714cm.f66554k = c4662am2.f66399d;
        c4714cm.f66553j = c4662am2.f66400e;
        C4817gm c4817gm2 = m52.f65562a;
        c4714cm.f66555l = c4817gm2.f66861p;
        c4714cm.f66556m = c4817gm2.f66863r;
        long j10 = c4817gm2.f66867v;
        if (c4714cm.f66557n == 0) {
            c4714cm.f66557n = j10;
        }
        return c4714cm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C4714cm();
    }
}
