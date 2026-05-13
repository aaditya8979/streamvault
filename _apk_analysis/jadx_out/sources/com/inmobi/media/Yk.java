package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.inmobi.Omid;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes10.dex */
public final class Yk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f26662b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Yk f26661a = new Yk();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Sk f26663c = new Sk();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r7.b(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            if (b(context)) {
                T6.a(context);
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea.a(Da.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = Ji.f25747a;
                Context applicationContext = context.getApplicationContext();
                tn.p.j(applicationContext, "getApplicationContext(...)");
                Ji.a(applicationContext);
            }
        } catch (Exception e10) {
            Log.d("Yk", "Error in cleaning cache directory", e10);
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public static boolean a() {
        int i10;
        try {
            tn.t.b(OkHttpClient.class).getSimpleName();
            i10 = 0;
        } catch (NoClassDefFoundError e10) {
            Log.d("Yk", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e10);
            i10 = 1;
        }
        try {
            tn.t.b(BufferedSource.class).getSimpleName();
        } catch (NoClassDefFoundError e11) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e11);
        }
        try {
            tn.t.b(p000do.l0.class).getSimpleName();
        } catch (NoClassDefFoundError e12) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e12);
        }
        try {
            tn.t.b(p000do.w0.class).getSimpleName();
        } catch (NoClassDefFoundError e13) {
            i10++;
            Log.d("Yk", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e13);
        }
        try {
            tn.t.b(AdvertisingIdClient.class).getSimpleName();
        } catch (NoClassDefFoundError e14) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e14);
        }
        try {
            tn.t.b(ContextCompat.class).getSimpleName();
        } catch (NoClassDefFoundError e15) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e15);
        }
        try {
            tn.t.b(kn.a.class).getSimpleName();
        } catch (NoClassDefFoundError e16) {
            i10++;
            Log.d("Yk", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e16);
        }
        try {
            tn.t.b(CustomTabsClient.class).getSimpleName();
        } catch (NoClassDefFoundError e17) {
            i10++;
            Log.d("Yk", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e17);
        }
        try {
            tn.t.b(Omid.class).getSimpleName();
        } catch (NoClassDefFoundError e18) {
            i10++;
            Log.d("Yk", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e18);
        }
        if (i10 > 0) {
            Log.d("Yk", "Total no missing dependencies = " + i10);
        }
        return i10 > 0;
    }

    public static boolean b(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "sdk_version_store");
        tn.p.k("sdk_version", "key");
        if (eaA.f25373a.getString("sdk_version", null) == null) {
            return true;
        }
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Ea eaA2 = Da.a(context, "sdk_version_store");
        tn.p.k("sdk_version", "key");
        return !tn.p.f(eaA2.f25373a.getString("sdk_version", null), "11.1.0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r8.a(r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
