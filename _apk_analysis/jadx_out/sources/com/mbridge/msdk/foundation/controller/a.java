package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseMBSDKContext.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f37354q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f37355r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f37356s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f37359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f37361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37363g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f37367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37368l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f37370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f37371o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f37357a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f37364h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37365i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f37369m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37372p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class RunnableC0437a implements Runnable {
        public RunnableC0437a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f37359c).a();
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f37358b = (String) y0.a(aVar.f37359c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f37354q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f37366j = (String) y0.a(aVar.f37359c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f37354q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseMBSDKContext.java */
    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f37359c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f37359c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f37369m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f37369m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str2);
        j.a(str, i10, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : bitmapDrawableN != null ? "" : "str to bitmap failed", bitmapDrawableN == null ? 2 : 1, str2);
        return bitmapDrawableN;
    }

    public WeakReference<Activity> a() {
        return this.f37361e;
    }

    public void a(int i10) {
        this.f37363g = i10;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f37370n = new WeakReference<>(context);
        }
    }

    public abstract void a(e eVar);

    public void a(String str) {
        try {
            if (this.f37369m != null && !TextUtils.isEmpty(str) && this.f37369m.containsKey(str)) {
                this.f37369m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f37364h == null) {
                    this.f37364h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f37364h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f37364h.has("watermark")) {
                    if (this.f37369m == null) {
                        this.f37369m = new ConcurrentHashMap<>();
                    }
                    this.f37369m.put(str, this.f37364h.getString("watermark"));
                }
            } catch (Exception e10) {
                q0.b(f37354q, e10.getMessage());
            }
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f37361e = weakReference;
    }

    public void a(JSONObject jSONObject) {
        this.f37371o = jSONObject;
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f37358b)) {
                return this.f37358b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
            return "";
        }
    }

    public void b(int i10) {
        this.f37368l = i10;
    }

    public void b(Context context) {
        this.f37359c = context;
    }

    public void b(e eVar) {
        try {
            m0.C(this.f37359c);
            a(eVar);
            h.a(this.f37359c, this.f37358b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        m0.d(this.f37359c.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (Throwable th2) {
                        q0.b(f37354q, th2.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    m0.d(0);
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarD != null && gVarD.E() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0437a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f37354q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f37362f = str;
            if (TextUtils.isEmpty(str) || (context = this.f37359c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f37366j)) {
                return this.f37366j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f37354q, th2.getMessage());
            return "";
        }
    }

    public void c(int i10) {
        this.f37372p = i10;
    }

    public void c(e eVar) {
        if (this.f37365i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f37371o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f37354q, e10.getMessage());
        }
        b(eVar);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f37360d = str;
    }

    public Context d() {
        return this.f37359c;
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37367k = str;
            Context context = this.f37359c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public s e() {
        return this.f37357a;
    }

    public void e(String str) {
        Context context;
        try {
            this.f37358b = str;
            if (TextUtils.isEmpty(str) || (context = this.f37359c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f37370n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void f(String str) {
        Context context;
        try {
            this.f37366j = str;
            if (TextUtils.isEmpty(str) || (context = this.f37359c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f37354q, e10.getMessage());
        }
    }

    public int g() {
        return this.f37363g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f37367k) ? this.f37367k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f37360d)) {
                return this.f37360d;
            }
            Context context = this.f37359c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f37360d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f37367k)) {
            return this.f37367k;
        }
        Context context = this.f37359c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f37371o;
    }

    public int l() {
        return this.f37372p;
    }
}
