package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4228r4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f33392k = "1.0.6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f33393l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f33394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContextProvider f33399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f33400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33403j;

    /* JADX INFO: renamed from: com.ironsource.r4$a */
    public class a implements InterfaceC3937b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3937b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(Z7.f30794r);
                    sb2.append("(");
                    sb2.append(thread.getState().toString());
                    sb2.append(")");
                    sb2.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(Z7.f30794r);
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            C4228r4.f33393l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC3937b
        public void b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33406b;

        public b(Context context, String str) {
            this.f33405a = context;
            this.f33406b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C4228r4.this.f33394a.I(this.f33405a);
                if (!TextUtils.isEmpty(strI)) {
                    C4228r4.this.f33396c = strI;
                }
                String strB = C4228r4.this.f33394a.b(this.f33405a);
                if (!TextUtils.isEmpty(strB)) {
                    C4228r4.this.f33398e = strB;
                }
                SharedPreferences.Editor editorEdit = this.f33405a.getSharedPreferences(Z7.f30783g, 0).edit();
                editorEdit.putString(Z7.f30784h, C4228r4.this.f33396c);
                editorEdit.putString(Z7.f30800x, this.f33406b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$c */
    public class c extends RunnableC4245s4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$d */
    @SuppressLint({"StaticFieldLeak"})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile C4228r4 f33409a = new C4228r4();

        private d() {
        }
    }

    private C4228r4() {
        this.f33403j = false;
        this.f33394a = Lb.U().i();
        this.f33399f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f33400g = defaultUncaughtExceptionHandler;
        this.f33402i = Z7.f30794r;
        this.f33401h = Z7.f30793q;
        Thread.setDefaultUncaughtExceptionHandler(new C4195p4(defaultUncaughtExceptionHandler));
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Z7.f30783g, 0);
        String string = sharedPreferences.getString(Z7.f30784h, this.f33396c);
        String string2 = sharedPreferences.getString(Z7.f30800x, this.f33397d);
        List<P5> listB = I4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (P5 p52 : listB) {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            String strB = p52.b();
            String strE = p52.e();
            String strD = p52.d();
            String packageName = context.getPackageName();
            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
            try {
                ActivityManager.MemoryInfo memoryInfoN = this.f33394a.n(context);
                if (memoryInfoN != null) {
                    jSONObjectJsonObjectInit2.put(Z7.O, this.f33394a.c(memoryInfoN));
                    jSONObjectJsonObjectInit2.put("lowM", this.f33394a.b(memoryInfoN));
                    jSONObjectJsonObjectInit2.put("mThreshold", this.f33394a.a(memoryInfoN));
                }
                String strT = this.f33394a.t();
                if (strT != null) {
                    jSONObjectJsonObjectInit2.put("osArch", strT);
                }
                jSONObjectJsonObjectInit2.put(Z7.f30788l, strB);
                jSONObjectJsonObjectInit2.put(Z7.f30789m, strE);
                jSONObjectJsonObjectInit2.put(Z7.f30790n, strD);
                jSONObjectJsonObjectInit2.put(Z7.f30802z, f33392k);
                jSONObjectJsonObjectInit2.put("SDKVersion", "9.2.0");
                jSONObjectJsonObjectInit2.put("deviceLanguage", this.f33394a.c(context));
                jSONObjectJsonObjectInit2.put("appVersion", C1.b(context, packageName));
                jSONObjectJsonObjectInit2.put("deviceOSVersion", this.f33394a.i());
                jSONObjectJsonObjectInit2.put("network", strA);
                jSONObjectJsonObjectInit2.put("deviceApiLevel", this.f33394a.e());
                jSONObjectJsonObjectInit2.put("deviceModel", this.f33394a.l());
                jSONObjectJsonObjectInit2.put(Z7.N, this.f33394a.q(context));
                jSONObjectJsonObjectInit2.put("deviceOS", this.f33394a.f());
                jSONObjectJsonObjectInit2.put(Z7.L, string);
                jSONObjectJsonObjectInit2.put("deviceOEM", this.f33394a.q());
                jSONObjectJsonObjectInit2.put(Z7.f30792p, System.getProperties());
                jSONObjectJsonObjectInit2.put("bundleId", packageName);
                jSONObjectJsonObjectInit2.put(Z7.f30800x, string2);
                if (!TextUtils.isEmpty(this.f33398e)) {
                    jSONObjectJsonObjectInit2.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(this.f33398e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObjectJsonObjectInit = jSONObjectJsonObjectInit2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObjectJsonObjectInit2.has(str)) {
                                jSONObjectJsonObjectInit.put(str, jSONObjectJsonObjectInit2.opt(str));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObjectJsonObjectInit.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObjectJsonObjectInit)).start();
            }
        }
        I4.a();
    }

    public static List<P5> c() {
        return null;
    }

    public static C4228r4 d() {
        return d.f33409a;
    }

    public Context a() {
        return this.f33399f.getApplicationContext();
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f33403j);
        if (!this.f33403j || th2 == null) {
            return;
        }
        new P5(new C4212q4(th2).b(), "" + System.currentTimeMillis(), Z7.f30786j).a();
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f33399f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f33402i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f33401h = str;
            }
            this.f33397d = str3;
            if (z10) {
                new C3919a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f33403j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f33392k;
    }

    public String e() {
        return this.f33402i;
    }
}
