package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class Wg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f66133b;

    public Wg(Y4 y42) {
        this(y42, new SafePackageManager());
    }

    @VisibleForTesting
    public Wg(Y4 y42, @NonNull SafePackageManager safePackageManager) {
        super(y42);
        this.f66133b = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.Q5 r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Wg.a(io.appmetrica.analytics.impl.Q5):boolean");
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            Y4 y42 = this.f65880a;
            SafePackageManager safePackageManager = this.f66133b;
            Context context = y42.f66214a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            R9 p92 = AndroidUtils.isApiAchieved(24) ? new P9() : new Q9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(p92.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
