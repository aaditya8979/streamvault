package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameOptimizedController.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f38169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile JSONObject f38170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f38172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f38173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, String> f38174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.setting.g f38175j;

    /* JADX INFO: compiled from: SameOptimizedController.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0 f38176a = new s0();
    }

    private s0() {
        this.f38166a = new Object();
        this.f38167b = new Object();
        this.f38168c = new Object();
        this.f38169d = new Object();
    }

    private int a(String str, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            return this.f38170e.optInt(str, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    private int a(String str, String str2, int i10) {
        if (a(true)) {
            return i10;
        }
        try {
            String strOptString = this.f38170e.optString(str, "");
            if (TextUtils.isEmpty(strOptString)) {
                return i10;
            }
            String strA = k0.a(strOptString);
            return TextUtils.isEmpty(strA) ? i10 : new JSONObject(strA).optInt(str2, i10);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static s0 a() {
        return b.f38176a;
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private String a(String str, String str2, boolean z10) {
        if (a(z10)) {
            return str2;
        }
        try {
            return this.f38170e.optString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    private boolean a(String str, boolean z10, boolean z11) {
        if (a(z11)) {
            return z10;
        }
        try {
            return this.f38170e.optInt(str, z10 ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x005d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:18:0x0043, B:20:0x0047, B:21:0x004f, B:9:0x000f, B:11:0x0017, B:13:0x0027, B:14:0x0033, B:17:0x0041), top: B:35:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(boolean r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f38169d
            monitor-enter(r0)
            com.mbridge.msdk.setting.g r1 = r2.f38175j     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto Lf
            boolean r1 = r2.e()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto Lf
            if (r3 != 0) goto L43
        Lf:
            java.lang.String r3 = r2.f38171f     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            if (r3 == 0) goto L33
            com.mbridge.msdk.foundation.controller.c r3 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            r2.f38171f = r3     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            if (r3 == 0) goto L33
            com.mbridge.msdk.foundation.buffer.sharedperference.a r3 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            java.lang.String r1 = "app_id"
            java.lang.String r3 = r3.a(r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            r2.f38171f = r3     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
        L33:
            com.mbridge.msdk.setting.h r3 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            java.lang.String r1 = r2.f38171f     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            com.mbridge.msdk.setting.g r3 = r3.b(r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            r2.f38175j = r3     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L5d
            goto L43
        L40:
            r3 = 0
            r2.f38175j = r3     // Catch: java.lang.Throwable -> L5d
        L43:
            com.mbridge.msdk.setting.g r3 = r2.f38175j     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L4f
            com.mbridge.msdk.setting.g r3 = r2.f38175j     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r3 = r3.k0()     // Catch: java.lang.Throwable -> L5d
            r2.f38170e = r3     // Catch: java.lang.Throwable -> L5d
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.setting.g r3 = r2.f38175j
            if (r3 == 0) goto L5b
            org.json.JSONObject r3 = r2.f38170e
            if (r3 != 0) goto L59
            goto L5b
        L59:
            r3 = 0
            goto L5c
        L5b:
            r3 = 1
        L5c:
            return r3
        L5d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.s0.a(boolean):boolean");
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.f38168c) {
            if (this.f38172g == null) {
                this.f38172g = new ConcurrentHashMap<>();
            }
        }
        return this.f38172g;
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f38166a) {
            if (this.f38173h == null) {
                this.f38173h = new ConcurrentHashMap<>();
            }
        }
        return this.f38173h;
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.f38167b) {
            if (this.f38174i == null) {
                this.f38174i = new ConcurrentHashMap<>();
            }
        }
        return this.f38174i;
    }

    private boolean e() {
        return this.f38175j.D() == 1;
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    public int b(String str, int i10) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i10;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
            Integer numB = b(str, concurrentHashMapC);
            if (numB != null) {
                return numB.intValue();
            }
            try {
                numValueOf = Integer.valueOf(a(str, i10));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i10);
            }
            concurrentHashMapC.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
            return i10;
        }
    }

    public int b(String str, String str2, int i10) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i10));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i10);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    public String b(String str, String str2, boolean z10) {
        String strA;
        String strC;
        try {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            ConcurrentHashMap<String, String> concurrentHashMapD = d();
            if (z10 && (strC = c(str, concurrentHashMapD)) != null) {
                return strC;
            }
            try {
                strA = a(str, str2, z10);
            } catch (Exception unused) {
                strA = str2;
            }
            concurrentHashMapD.put(str, strA);
            return strA;
        } catch (Exception unused2) {
            return str2;
        }
    }

    public boolean b(String str, boolean z10, boolean z11) {
        Boolean boolValueOf;
        Boolean boolA;
        try {
            if (TextUtils.isEmpty(str)) {
                return z10;
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
            if (z11 && (boolA = a(str, concurrentHashMapB)) != null) {
                return boolA.booleanValue();
            }
            try {
                boolValueOf = Boolean.valueOf(a(str, z10, z11));
            } catch (Exception unused) {
                boolValueOf = Boolean.valueOf(z10);
            }
            concurrentHashMapB.put(str, boolValueOf);
            return boolValueOf.booleanValue();
        } catch (Exception unused2) {
            return z10;
        }
    }
}
