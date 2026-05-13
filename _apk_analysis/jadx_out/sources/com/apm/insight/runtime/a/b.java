package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ActivityDataManager.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f7452a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f7453b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7454c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7455d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f7456e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f7457f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f7458z;
    private int B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f7459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f7460h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f7468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f7470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f7472t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f7474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7475w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f7461i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f7462j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f7463k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f7464l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f7465m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7476x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f7477y = -1;
    private int A = 50;

    /* JADX INFO: compiled from: ActivityDataManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7481c;

        public a(String str, String str2, long j10) {
            this.f7480b = str2;
            this.f7481c = j10;
            this.f7479a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f7481c)) + " : " + this.f7479a + ' ' + this.f7480b;
        }
    }

    private b(@NonNull Application application) {
        this.f7460h = application;
        this.f7459g = application;
        if (application != null) {
            try {
                this.f7459g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f7466n = activity.getClass().getName();
                        b.this.f7467o = System.currentTimeMillis();
                        boolean unused = b.f7453b = bundle != null;
                        boolean unused2 = b.f7454c = true;
                        b.this.f7461i.add(b.this.f7466n);
                        b.this.f7462j.add(Long.valueOf(b.this.f7467o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f7466n, b.this.f7467o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f7461i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f7461i.size()) {
                            b.this.f7461i.remove(iIndexOf);
                            b.this.f7462j.remove(iIndexOf);
                        }
                        b.this.f7463k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f7464l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f7472t = activity.getClass().getName();
                        b.this.f7473u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f7476x = false;
                            boolean unused = b.f7454c = false;
                            b.this.f7477y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f7476x = false;
                            boolean unused2 = b.f7454c = false;
                            b.this.f7477y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f7472t, b.this.f7473u, C3978d4.i.f31364t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f7470r = activity.getClass().getName();
                        b.this.f7471s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f7476x) {
                            if (b.f7452a) {
                                b.k();
                                int unused = b.f7455d = 1;
                                long unused2 = b.f7457f = b.this.f7471s;
                            }
                            if (!b.this.f7470r.equals(b.this.f7472t)) {
                                return;
                            }
                            if (b.f7454c && !b.f7453b) {
                                int unused3 = b.f7455d = 4;
                                long unused4 = b.f7457f = b.this.f7471s;
                                return;
                            } else if (!b.f7454c) {
                                int unused5 = b.f7455d = 3;
                                long unused6 = b.f7457f = b.this.f7471s;
                                return;
                            }
                        }
                        b.this.f7476x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f7470r, b.this.f7471s, C3978d4.i.f31366u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f7468p = activity.getClass().getName();
                        b.this.f7469q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f7468p, b.this.f7469q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f7474v = activity.getClass().getName();
                        b.this.f7475w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f7474v, b.this.f7475w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        f7456e = true;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        if (com.apm.insight.e.w()) {
            a aVar = null;
            try {
                if (bVar.f7465m.size() >= bVar.A && (aVar = bVar.f7465m.poll()) != null) {
                    bVar.f7465m.add(aVar);
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f7465m.add(aVar);
                }
                aVar.f7480b = str2;
                aVar.f7479a = str;
                aVar.f7481c = j10;
            } catch (Throwable unused) {
            }
        }
    }

    public static int b() {
        int i10 = f7455d;
        return i10 == 1 ? f7456e ? 2 : 1 : i10;
    }

    public static long c() {
        return f7457f;
    }

    public static b d() {
        if (f7458z == null) {
            synchronized (b.class) {
                if (f7458z == null) {
                    f7458z = new b(com.apm.insight.e.h());
                }
            }
        }
        return f7458z;
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ boolean k() {
        f7452a = false;
        return false;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f7461i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f7461i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f7461i.get(i10), this.f7462j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f7463k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f7463k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f7463k.get(i10), this.f7464l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f7477y;
    }

    public final boolean f() {
        return this.f7476x;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f7466n, this.f7467o));
                jSONObject.put("last_start_activity", a(this.f7468p, this.f7469q));
                jSONObject.put("last_resume_activity", a(this.f7470r, this.f7471s));
                jSONObject.put("last_pause_activity", a(this.f7472t, this.f7473u));
                jSONObject.put("last_stop_activity", a(this.f7474v, this.f7475w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f7470r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f7465m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }
}
