package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.ironsource.C3978d4;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ANRManager.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f7040z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f7041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f7043c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f7047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f7048h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONArray f7053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f7054n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONArray f7057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JSONArray f7058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private JSONObject f7059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7060t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f7062v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7044d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f7045e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7046f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7049i = "unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7050j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7051k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7052l = "npth_inner_default";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7055o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f7056p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f7061u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7063w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f7064x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f7065y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.f7042b = context;
    }

    private static String a(float f10) {
        return f10 <= 0.0f ? "0%" : f10 <= 0.1f ? "0% - 10%" : f10 <= 0.3f ? "10% - 30%" : f10 <= 0.6f ? "30% - 60%" : f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f10, float f11) {
        return f11 > 0.0f ? a(f10 / f11) : f10 > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f7055o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:
    
        if (r7 != 5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0263 A[PHI: r20 r28 r29
      0x0263: PHI (r20v3 char) = (r20v2 char), (r20v16 char) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r28v19 java.util.HashMap) = (r28v18 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r29v3 char) = (r29v2 char), (r29v9 char) binds: [B:125:0x025d, B:115:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0271 A[PHI: r20 r28 r29
      0x0271: PHI (r20v4 char) = (r20v3 char), (r20v17 char) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r28v20 java.util.HashMap) = (r28v19 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r29v4 char) = (r29v3 char), (r29v10 char) binds: [B:128:0x026b, B:114:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027d A[PHI: r28 r29
      0x027d: PHI (r28v23 java.util.HashMap) = (r28v20 java.util.HashMap), (r28v24 java.util.HashMap) binds: [B:131:0x0277, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r29v6 char) = (r29v4 char), (r29v11 char) binds: [B:131:0x0277, B:112:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e4 A[LOOP:2: B:99:0x0201->B:152:0x02e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0432 A[EDGE_INSN: B:234:0x0432->B:206:0x0432 BREAK  A[LOOP:0: B:3:0x0039->B:204:0x0415], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c5 A[EDGE_INSN: B:238:0x03c5->B:192:0x03c5 BREAK  A[LOOP:2: B:99:0x0201->B:152:0x02e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r31, org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 += entry.getValue().floatValue();
            }
        }
        float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(strConcat + "_total", b(f10));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f10));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f10));
    }

    private void a(JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.f7047g = null;
        this.f7054n = null;
        this.f7055o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f7049i = "unknown";
        this.f7050j = "unknown";
        this.f7051k = "unknown";
        int[] iArr = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String strTrim = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strTrim)) {
                    if (this.f7047g == null && C3978d4.i.Z.equals(strTrim)) {
                        this.f7047g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(strTrim, jSONArray5));
                    }
                    try {
                        if (!C3978d4.i.Z.equals(strTrim)) {
                            strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = strTrim;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e10) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e10, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i11 = iArrB2[0];
                            if (i11 > iArr[0]) {
                                iArr[0] = i11;
                                this.f7049i = str;
                            }
                            int i12 = iArrB2[1];
                            if (i12 > iArr[1]) {
                                iArr[1] = i12;
                                this.f7050j = str;
                            }
                            int i13 = iArrB2[2];
                            if (i13 > iArr[2]) {
                                iArr[2] = i13;
                                this.f7051k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                strTrim = null;
            } else if (!z10) {
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z10 = true;
                }
                jSONArray3.put(strOptString);
            } else if (z10) {
                if (strOptString.contains(" prio=")) {
                    if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strTrim)) {
                        if (this.f7047g == null && C3978d4.i.Z.equals(strTrim)) {
                            this.f7047g = c(jSONArray5);
                        } else {
                            jSONArray2.put(a(strTrim, jSONArray5));
                        }
                        try {
                            if (!C3978d4.i.Z.equals(strTrim)) {
                                strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                            }
                        } catch (Throwable unused3) {
                        }
                        String str2 = strTrim;
                        if (!a(str2)) {
                            try {
                                iArrB = b(jSONArray5);
                            } catch (IllegalArgumentException e11) {
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(e11, "NPTH_CATCH");
                                iArrB = null;
                            } catch (Throwable unused4) {
                                iArrB = null;
                            }
                            if (iArrB != null) {
                                int i14 = iArrB[0];
                                if (i14 > iArr[0]) {
                                    iArr[0] = i14;
                                    this.f7049i = str2;
                                }
                                int i15 = iArrB[1];
                                if (i15 > iArr[1]) {
                                    iArr[1] = i15;
                                    this.f7050j = str2;
                                }
                                int i16 = iArrB[2];
                                if (i16 > iArr[2]) {
                                    iArr[2] = i16;
                                    this.f7051k = str2;
                                }
                            }
                        }
                    }
                    String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                    strTrim = C3978d4.i.Z.equals(strSubstring) ? strSubstring : strSubstring + "  (" + strOptString.substring(strOptString.indexOf(34, 2) + 1) + " )";
                    if (jSONArray5.length() > 0) {
                        jSONArray5 = new JSONArray();
                    }
                    jSONArray5.put(strOptString);
                } else if (TextUtils.isEmpty(strTrim)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.f7053m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f7054n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f7054n.put("thread_stacks", jSONArray2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    private boolean a(long j10) {
        if (this.f7062v) {
            this.f7062v = false;
            b(j10);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new LinkedList();
                this.f7052l = jSONArrayB.optString(0);
                for (int i10 = 1; i10 < jSONArrayB.length(); i10++) {
                    try {
                        this.B.add(Pattern.compile(jSONArrayB.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private void b(long j10) {
        if (this.f7064x != this.f7063w) {
            try {
                this.f7056p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.f7058r = f.b().b();
                    this.f7057q = j.a(j10);
                    this.f7048h = f.b().a(j10).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.f7059s = jSONObject;
                com.apm.insight.l.a.a(this.f7042b, jSONObject);
                this.f7060t = h();
                this.f7046f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f7044d = this.f7056p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f7042b), strB), "trace_" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.f7053m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                if (this.f7047g == null) {
                    this.f7047g = d.a();
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.f7044d = this.f7056p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f7042b), strB2), "trace" + com.apm.insight.l.a.b().replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.f7053m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
                }
                if (this.f7047g == null) {
                    this.f7047g = d.a();
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th5, "NPTH_CATCH");
            }
        }
        long j11 = this.f7063w;
        this.f7064x = j11;
        this.f7063w = -1L;
        if (j11 == -1) {
            this.f7064x = (-1) - 1;
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
            }
        }
        return null;
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f7055o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static boolean h() {
        boolean z10 = !com.apm.insight.l.a.a();
        if (!z10 || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z10;
        }
        return false;
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.f7042b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(StringUtils.PROCESS_POSTFIX_DELIMITER, "_"));
        }
        return this.D;
    }

    public final void a() {
        if (this.f7043c) {
            return;
        }
        this.f7041a = new c(this);
        this.f7044d = com.apm.insight.e.j();
        this.f7043c = true;
    }

    public final void b() {
        if (this.f7043c) {
            this.f7043c = false;
            c cVar = this.f7041a;
            if (cVar != null) {
                cVar.b();
            }
            this.f7041a = null;
        }
    }

    public final void c() {
        c cVar = this.f7041a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.f7061u) {
        }
        this.f7065y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
        this.f7063w = SystemClock.uptimeMillis();
        this.f7062v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    public final boolean g() {
        String str;
        String str2;
        JSONArray jSONArrayB;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        boolean z10;
        JSONObject jSONObjectA;
        boolean z11;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j10;
        JSONObject jSONObjectA2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        boolean zB = com.apm.insight.runtime.i.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.f7042b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str5 = "normal";
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            str = "unknown";
            str2 = "unknown";
            jSONArrayB = null;
            jSONArrayA = null;
            jSONObject = null;
            z10 = false;
            jSONObjectA = null;
            z11 = false;
            str3 = "normal";
            str4 = "unknown";
            jSONArray = null;
            j10 = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.f7061u) {
            }
            if (this.f7047g == null || System.currentTimeMillis() - this.f7044d > 20000) {
                if (this.f7062v) {
                    this.f7062v = false;
                    str5 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str5 = "trace_last";
            }
            JSONObject jSONObject5 = this.f7047g;
            String str6 = this.f7049i;
            String str7 = this.f7050j;
            String str8 = this.f7051k;
            JSONArray jSONArray2 = this.f7053m;
            JSONArray jSONArray3 = this.f7058r;
            JSONArray jSONArray4 = this.f7057q;
            JSONObject jSONObject6 = this.f7059s;
            JSONObject jSONObject7 = this.f7048h;
            z11 = this.f7060t;
            long j11 = this.f7056p;
            this.f7047g = null;
            this.f7053m = null;
            this.f7057q = null;
            this.f7048h = null;
            this.f7058r = null;
            this.f7049i = "unknown";
            this.f7050j = "unknown";
            this.f7051k = "unknown";
            this.f7055o = 0;
            jSONArrayA = jSONArray4;
            str2 = str8;
            str4 = str6;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject7;
            jSONObject = jSONObject6;
            jSONArrayB = jSONArray3;
            str = str7;
            str3 = str5;
            j10 = j11;
            jSONObjectA2 = jSONObject5;
            z10 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.f7047g == null || System.currentTimeMillis() - this.f7044d <= 20000) {
                if (this.f7047g == null || System.currentTimeMillis() - this.f7044d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.f7047g = null;
            this.f7053m = null;
            this.f7057q = null;
            this.f7048h = null;
            this.f7058r = null;
            this.f7049i = "unknown";
            this.f7050j = "unknown";
            this.f7051k = "unknown";
            this.f7055o = 0;
            this.f7045e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    jSONObject3 = jSONObjectA2;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        jSONObject4 = new JSONObject();
                    } catch (Throwable unused) {
                    }
                    try {
                        com.apm.insight.l.a.a(this.f7042b, jSONObject4);
                        jSONObject = jSONObject4;
                    } catch (Throwable unused2) {
                        jSONObject = jSONObject4;
                        jSONObjectA2 = jSONObject3;
                    }
                } catch (Throwable unused3) {
                    jSONObject3 = jSONObjectA2;
                }
            } else {
                jSONObject3 = jSONObjectA2;
            }
            jSONObjectA2 = d.a();
        }
        JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
            try {
                jSONObjectA2.put("pid", Process.myPid());
                jSONObjectA2.put("package", this.f7042b.getPackageName());
                jSONObjectA2.put("is_remote_process", 0);
                jSONObjectA2.put("is_new_stack", 10);
                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                String str9 = str2;
                aVar.a("data", (Object) jSONObjectA2.toString());
                JSONObject jSONObject9 = jSONObjectA2;
                aVar.a("is_anr", (Object) 1);
                aVar.a("anrType", (Object) str3);
                if (com.apm.insight.e.x()) {
                    aVar.a("history_message", (Object) jSONArrayB);
                    aVar.a("current_message", jSONObject8);
                    aVar.a("pending_messages", (Object) jSONArrayA);
                }
                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                aVar.a("crash_time", Long.valueOf(j10));
                com.apm.insight.c.a.b();
                aVar.c(jSONObject);
                aVar.a("anr_info", (Object) strA);
                if (jSONArray != null) {
                    aVar.a("dump_trace", (Object) jSONArray);
                }
                JSONObject jSONObject10 = this.f7054n;
                aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? m.b((String) null) : this.f7054n);
                com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
                CrashType crashType = CrashType.ANR;
                com.apm.insight.entity.a aVarA = fVarA.a(crashType, aVar);
                aVarA.a("is_background", Boolean.valueOf(z11));
                aVarA.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                aVarA.a("has_dump", (Object) "true");
                aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j10, crashType, false, false));
                JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(aVarA.c());
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject2 = new JSONObject();
                        try {
                            aVarA.a("filters", jSONObject2);
                        } catch (Throwable unused4) {
                            jSONObjectOptJSONObject = jSONObject2;
                            jSONObject2 = jSONObjectOptJSONObject;
                        }
                    } catch (Throwable unused5) {
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } else {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
                jSONObject2.put("anrType", str3);
                jSONObject2.put("max_utm_thread", str4);
                jSONObject2.put("max_stm_thread", str);
                jSONObject2.put("max_utm_stm_thread", str9);
                jSONObject2.put("max_utm_thread_version", this.f7052l);
                long j12 = j10 - com.apm.insight.e.j();
                jSONObject2.put("crash_length", j12 < 30000 ? "0 - 30s" : j12 < 60000 ? "30s - 1min" : j12 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS ? "1min - 2min" : j12 < 300000 ? "2min - 5min" : j12 < 600000 ? "5min - 10min" : j12 < 1800000 ? "10min - 30min" : j12 < 3600000 ? "30min - 1h" : "1h - ");
                jSONObject2.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                jSONObject2.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                jSONObject2.put("sdk_version", "2008-20250701130429");
                jSONObject2.put("has_logcat", String.valueOf(aVarA.a()));
                jSONObject2.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                jSONObject2.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                jSONObject2.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                jSONObject2.put("is_64_devices", String.valueOf(Header.a()));
                jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                jSONObject2.put("is_x86_devices", String.valueOf(Header.b()));
                jSONObject2.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? "true" : com.ironsource.mediationsdk.metadata.a.f32683h);
                jSONObject2.put("anr_normal_trace", String.valueOf(!this.f7062v));
                jSONObject2.put("anr_no_run", String.valueOf(zB));
                jSONObject2.put("crash_after_crash", Npth.hasCrash() ? "true" : com.ironsource.mediationsdk.metadata.a.f32683h);
                jSONObject2.put("from_file", String.valueOf(d.b()));
                jSONObject2.put("has_dump", "true");
                jSONObject2.put("from_kill", com.ironsource.mediationsdk.metadata.a.f32683h);
                jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                int i10 = this.f7055o;
                if (i10 > 0) {
                    jSONObject2.put("may_have_stack_overflow", String.valueOf(i10));
                }
                try {
                    a(strA, jSONObject2);
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                com.apm.insight.a.a.a();
                CrashType crashType2 = CrashType.LAUNCH;
                com.apm.insight.e.e();
                try {
                    if (com.apm.insight.a.e().length() > 1024) {
                        aVarA.a("has_system_traces", "true");
                    }
                } catch (Throwable unused6) {
                }
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                    if (jSONArrayA2.length() > 0) {
                        com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                    }
                } catch (Throwable unused7) {
                }
                String strOptString = jSONObject9.optString("mainStackFromTrace");
                JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
                com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new b.a() { // from class: com.apm.insight.b.b.2
                    @Override // com.apm.insight.entity.b.a
                    public final void a(JSONObject jSONObject11) {
                        com.apm.insight.k.d.a().a(jSONObject11, j10, b.this.f7046f);
                    }
                });
                b(strOptString, jSONArrayA3);
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
        }
        return z10;
    }
}
