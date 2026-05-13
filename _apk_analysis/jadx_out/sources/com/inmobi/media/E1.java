package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f25358a;

    public static void a(boolean z10) {
        LinkedHashSet linkedHashSet;
        if (Ji.f25747a == null || (linkedHashSet = f25358a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Sk) it.next()).getClass();
                Sk.a(z10);
            } catch (Exception e10) {
                tn.p.j("E1", "TAG");
                e10.getMessage();
            }
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            tn.p.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            tn.p.j("E1", "TAG");
            e10.getMessage();
            return false;
        }
    }

    public static void b(Context context) {
        Sk sk2 = Yk.f26663c;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(sk2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (f25358a == null) {
            f25358a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new D1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f25358a;
        if (linkedHashSet != null) {
            linkedHashSet.add(sk2);
        }
    }
}
