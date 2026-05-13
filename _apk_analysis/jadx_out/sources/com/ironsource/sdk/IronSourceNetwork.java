package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.A8;
import com.ironsource.B8;
import com.ironsource.C3948ba;
import com.ironsource.C4228r4;
import com.ironsource.C4283u8;
import com.ironsource.I5;
import com.ironsource.Mc;
import com.ironsource.O9;
import com.ironsource.S9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f33530a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Y9 f33531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Mc> f33532c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C3948ba f33533d;

    private static synchronized void a() throws Exception {
        if (f33531b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            I5 i5A = B8.a(jSONObject);
            if (i5A.a()) {
                A8.a(i5A, B8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Mc mc2) {
        C3948ba c3948ba = f33533d;
        if (c3948ba == null) {
            f33532c.add(mc2);
        } else if (c3948ba.b()) {
            mc2.onSuccess();
        } else {
            mc2.onFail(f33533d.a());
        }
    }

    public static synchronized void destroyAd(O9 o92) throws Exception {
        a();
        f33531b.b(o92);
    }

    public static synchronized e getControllerManager() {
        return f33531b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f33530a, "applicationKey is NULL");
            return;
        }
        if (f33531b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                Logger.e(f33530a, "Failed to init event tracker: " + e10.getMessage());
            }
            f33531b = S9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(O9 o92) {
        Y9 y92 = f33531b;
        if (y92 == null) {
            return false;
        }
        return y92.a(o92);
    }

    public static synchronized void loadAd(O9 o92, Map<String, String> map) throws Exception {
        a();
        f33531b.a(o92, map);
    }

    public static synchronized void loadAdView(Activity activity, O9 o92, Map<String, String> map) throws Exception {
        a();
        f33531b.b(activity, o92, map);
    }

    public static void onPause(Activity activity) {
        Y9 y92 = f33531b;
        if (y92 == null) {
            return;
        }
        y92.onPause(activity);
    }

    public static void onResume(Activity activity) {
        Y9 y92 = f33531b;
        if (y92 == null) {
            return;
        }
        y92.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        Y9 y92 = f33531b;
        if (y92 == null) {
            return;
        }
        y92.a(activity);
    }

    public static synchronized void showAd(Activity activity, O9 o92, Map<String, String> map) throws Exception {
        a();
        f33531b.a(activity, o92, map);
    }

    public static synchronized void updateInitFailed(C4283u8 c4283u8) {
        f33533d = new C3948ba(c4283u8);
        Iterator<Mc> it = f33532c.iterator();
        while (it.hasNext()) {
            it.next().onFail(c4283u8);
        }
        f33532c.clear();
    }

    public static synchronized void updateInitSucceeded() {
        f33533d = new C3948ba();
        Iterator<Mc> it = f33532c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
        f33532c.clear();
    }
}
