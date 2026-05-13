package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import com.inmobi.media.Ji;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f25747a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f25748b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f25749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f25750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bn.g f25751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f25752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f25753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p000do.l0 f25754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f25755i;

    static {
        String simpleName = Ji.class.getSimpleName();
        f25750d = new AtomicBoolean();
        f25751e = kotlin.b.b(new sn.a() { // from class: n9.b2
            @Override // sn.a
            public final Object invoke() {
                return Ji.a();
            }
        });
        tn.p.j(simpleName, "TAG");
        tn.p.k(simpleName, "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9(simpleName, false));
        f25753g = executorServiceNewSingleThreadExecutor;
        tn.p.j(executorServiceNewSingleThreadExecutor, "COMPONENT_SERVICE");
        f25754h = kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor));
    }

    public static final C3857xc a() {
        return new C3857xc();
    }

    public static void a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            T6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e10) {
            tn.p.j("Ji", "TAG");
            e10.getMessage();
        }
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        tn.p.k(activityLifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = f25747a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "coppa_store");
        tn.p.k("im_accid", "key");
        return eaA.f25373a.getString("im_accid", null);
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e10) {
                try {
                    throw new Zk(e10.getMessage());
                } catch (Zk e11) {
                    tn.p.j("Ji", "TAG");
                    e11.getMessage();
                    bn.g gVar = P9.f26117a;
                    P9.a(new L2(e11));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        tn.p.j("Ji", "TAG");
                    } catch (Exception e12) {
                        tn.p.j("Ji", "TAG");
                        e12.getMessage();
                        tn.p.j("Ji", "TAG");
                        bn.g gVar2 = P9.f26117a;
                        AbstractC3481i9.a(e12);
                    }
                    return str;
                } catch (Exception e13) {
                    tn.p.j("Ji", "TAG");
                    e13.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        tn.p.h(defaultUserAgent);
        return defaultUserAgent;
    }

    public static final String c() {
        if (f25748b.length() == 0) {
            f25748b = b(f25747a);
        }
        return f25748b;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return f25755i == 2;
    }
}
