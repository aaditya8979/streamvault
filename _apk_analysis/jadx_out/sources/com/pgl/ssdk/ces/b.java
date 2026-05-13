package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.Q6;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f51366a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f51367b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f51368c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f51369d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static aw.a f51370e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f51372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f51375j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f51379n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51371f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f51376k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51377l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f51378m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f51380o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51381p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f51382q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51383r = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0700b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51385a;

        public RunnableC0700b(String str) {
            this.f51385a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f51385a) && this.f51385a.equals("AdShow")) {
                ab.b(b.this.f51372g);
            }
            al.a(b.this.f51372g).a();
            aa.b(b.this.f51372g);
        }
    }

    private b(Context context, String str) {
        this.f51372g = context;
        this.f51373h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f51366a == null) {
            synchronized (b.class) {
                if (f51366a == null) {
                    if (context == null) {
                        context = ab.a().getApplicationContext();
                    }
                    if (context == null) {
                        f51369d = 4;
                        return null;
                    }
                    a(i10);
                    aw.a aVarB = aw.b(context, "nms");
                    if (aVarB != null) {
                        f51369d = aVarB.f51363a;
                        f51370e = aVarB;
                        return null;
                    }
                    b bVar = new b(context, str);
                    f51366a = bVar;
                    bVar.f51374i = i11;
                    f51366a.f51375j = str2;
                    f51366a.b(context);
                    f51366a.e(a(context));
                    z.a(context);
                    f51369d = 0;
                }
            }
        }
        return f51366a;
    }

    public static String a() {
        if (e() != null) {
            return e().f51373h;
        }
        return null;
    }

    private static String a(Context context) {
        String strA = ax.a(context, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f52266e);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f52266e, string);
        return string;
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f51368c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f51368c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String b() {
        if (e() != null) {
            return e().f51376k;
        }
        return null;
    }

    private void b(Context context) {
        if (context == null || f51367b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f51373h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f51374i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f51375j);
            f51367b = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) {
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                byte b10 = -1;
                switch (next.hashCode()) {
                    case -417749689:
                        if (next.equals("touch_trace_enabled")) {
                            b10 = 4;
                        }
                        break;
                    case -257777372:
                        if (next.equals("init_prob")) {
                            b10 = 5;
                        }
                        break;
                    case -93508180:
                        if (next.equals("autoctl_detect_enable")) {
                            b10 = 0;
                        }
                        break;
                    case 449342513:
                        if (next.equals("craw_ratio")) {
                            b10 = 3;
                        }
                        break;
                    case 944591168:
                        if (next.equals("report_ratio")) {
                            b10 = 1;
                        }
                        break;
                    case 1286849298:
                        if (next.equals("app_switch")) {
                            b10 = 2;
                        }
                        break;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5 && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                                        this.f51382q = iIntValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    y.f51443g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                f.f51406b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.f51383r = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.f51381p = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    ak.f51314b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f51378m || TextUtils.isEmpty(bVarE.f51377l)) {
            return null;
        }
        return bVarE.f51377l;
    }

    public static int d() {
        return f51369d;
    }

    public static b e() {
        return f51366a;
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f51379n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public static aw.a f() {
        return f51370e;
    }

    public Object a(int i10, Object obj) {
        Object objB;
        if (i10 == 123) {
            objB = af.a(this.f51372g);
        } else if (i10 == 121) {
            objB = ad.a();
        } else if (i10 == 122) {
            objB = ad.b();
        } else if (i10 == 126) {
            objB = ad.b(this.f51372g);
        } else if (i10 == 128) {
            objB = ad.c(this.f51372g);
        } else if (i10 == 120) {
            objB = ac.c();
        } else if (i10 == 124) {
            objB = ag.c(this.f51372g);
        } else if (i10 == 130) {
            objB = ag.a(this.f51372g);
        } else if (i10 == 145) {
            objB = ah.c(this.f51372g);
        } else if (i10 == 125) {
            objB = ag.b(this.f51372g);
        } else if (i10 == 129) {
            objB = ae.f(this.f51372g);
        } else if (i10 == 141) {
            objB = ae.e(this.f51372g);
        } else if (i10 == 134) {
            objB = ak.a(this.f51372g).b();
        } else if (i10 == 140) {
            objB = al.a(this.f51372g).e();
        } else if (i10 == 144) {
            objB = al.a(this.f51372g).d();
        } else if (i10 == 133) {
            objB = a(obj);
        } else {
            if (i10 == 135) {
                return v.e();
            }
            if (i10 == 201) {
                objB = ad.a(this.f51372g);
            } else if (i10 == 202) {
                objB = ad.c();
            } else {
                if (i10 == 236) {
                    return ay.a((String) obj);
                }
                if (i10 == 142) {
                    objB = ab.g(this.f51372g);
                } else if (i10 == 143) {
                    objB = ah.a(this.f51372g);
                } else {
                    if (i10 == 146) {
                        try {
                            return v.b();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return null;
                        }
                    }
                    if (i10 == 147) {
                        objB = Boolean.valueOf(ab.j(this.f51372g));
                    } else if (i10 == 148) {
                        objB = u.b(this.f51372g);
                    } else if (i10 == 149) {
                        objB = w.a(this.f51372g);
                    } else if (i10 == 150) {
                        objB = Integer.valueOf(x.a());
                    } else if (i10 == 151) {
                        objB = w.c();
                    } else if (i10 == 161) {
                        objB = Boolean.valueOf(v.f());
                    } else if (i10 == 163) {
                        objB = aj.a();
                    } else if (i10 == 169) {
                        objB = Boolean.valueOf(aa.a(this.f51372g));
                    } else if (i10 == 170) {
                        objB = Integer.valueOf(y.b((String) obj));
                    } else if (i10 == 203) {
                        objB = ab.b();
                    } else if (i10 == 205) {
                        objB = Integer.valueOf(ab.k(this.f51372g));
                    } else if (i10 == 204) {
                        objB = Integer.valueOf(ae.a(this.f51372g));
                    } else {
                        if (i10 != 206) {
                            return null;
                        }
                        objB = ah.b(this.f51372g);
                    }
                }
            }
        }
        return objB;
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        Object[] objArr = new Object[2];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (bArr == null) {
            bArr = new byte[0];
        }
        objArr[1] = bArr;
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f51372g, objArr);
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f51372g);
    }

    public void a(String str) {
        ar.b(new RunnableC0700b(str));
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f51372g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            byte b10 = -1;
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        b10 = 2;
                                    }
                                    break;
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        b10 = 5;
                                    }
                                    break;
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        b10 = 3;
                                    }
                                    break;
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        b10 = 0;
                                    }
                                    break;
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        b10 = 4;
                                    }
                                    break;
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        b10 = 1;
                                    }
                                    break;
                            }
                            if (b10 != 0) {
                                if (b10 != 1) {
                                    if (b10 != 2) {
                                        if (b10 != 3) {
                                            if (b10 != 4) {
                                                if (b10 != 5) {
                                                    continue;
                                                } else if (obj instanceof String) {
                                                    b((String) obj);
                                                }
                                            } else if (obj instanceof String) {
                                                an.b((String) obj);
                                            }
                                        } else if (obj instanceof Set) {
                                            try {
                                                Set set = (Set) obj;
                                                com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                                com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                                com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                                com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains(Q6.V0)));
                                                this.f51378m = set.contains(Q6.V0);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } else if (obj instanceof String) {
                                        an.a((String) obj);
                                    }
                                } else if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    if (!TextUtils.isEmpty(str2)) {
                                        am.a(str2);
                                    }
                                }
                            } else if (obj instanceof String) {
                                String strA = ai.a((String) obj);
                                if (!TextUtils.isEmpty(strA)) {
                                    com.pgl.ssdk.ces.a.meta(159, null, strA);
                                }
                            }
                        }
                    }
                    if (f51368c == null) {
                        f51368c = new HashMap();
                    }
                    f51368c.putAll(map);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f51376k)) {
            this.f51376k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f51377l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f51377l = str;
            a5.b();
        }
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f51380o = true;
        a5.a(this.f51372g, this.f51373h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f51372g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f51366a.f51382q;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f51372g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f51383r) {
            ar.a(new a(), 20000L);
        }
    }
}
