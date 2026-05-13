package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: loaded from: classes7.dex */
public final class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f65305a = new SafePackageManager();

    public final Intent a(Context context) {
        Bundle bundle;
        C4711cj c4711cj;
        C4696c4.l().f66471u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(H7.f65310b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Cf.f65117c).build());
        ApplicationInfo applicationInfo = this.f65305a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = data.putExtras(bundle);
        C4696c4 c4696c4L = C4696c4.l();
        synchronized (c4696c4L) {
            if (c4696c4L.f66465o == null) {
                C4711cj c4711cj2 = new C4711cj();
                c4696c4L.f66465o = c4711cj2;
                c4696c4L.f66458h.a(c4711cj2);
            }
            c4711cj = c4696c4L.f66465o;
        }
        ScreenInfo screenInfoB = c4711cj.b(context);
        return intentPutExtras.putExtra("screen_size", screenInfoB != null ? AbstractC4832hb.a(screenInfoB) : null);
    }
}
