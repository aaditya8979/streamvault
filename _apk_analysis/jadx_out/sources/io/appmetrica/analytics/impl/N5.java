package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes7.dex */
public abstract class N5 extends BaseRequestConfig.ComponentLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f65623a;

    public N5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    public N5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f65623a = safePackageManager;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: a */
    public O5 load(@NonNull M5 m52) {
        O5 o52 = (O5) super.load(m52);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f65623a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i10 = applicationInfo.flags;
            o52.f65684a = (i10 & 2) != 0 ? "1" : "0";
            o52.f65685b = (i10 & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            o52.f65684a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            o52.f65685b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            o52.f65684a = "0";
            o52.f65685b = "0";
        }
        C4817gm c4817gm = m52.f65562a;
        o52.f65686c = c4817gm;
        o52.setRetryPolicyConfig(c4817gm.f66865t);
        return o52;
    }
}
