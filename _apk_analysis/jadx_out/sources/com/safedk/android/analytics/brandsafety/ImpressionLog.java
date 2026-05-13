package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public class ImpressionLog implements Serializable {
    public static final String A = "fgr";
    public static final String B = "vst";
    public static final String C = "adr";
    public static final String D = "url";
    public static final String E = "cuo";
    public static final String F = "typ";
    public static final String G = "vad";
    public static final String H = "mth";
    public static final String I = "ntw";
    public static final String J = "api";
    public static final String K = "org";
    public static final String L = "dec";
    public static final String M = "cnt";
    public static final String N = "can";
    public static final String O = "fin";
    public static final String P = "||";
    public static final String Q = "|";
    public static final String R = "=";
    public static final String S = "[...]";
    private static final String T = "ImpressionLog";
    private static final int U = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51731a = "pre";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51732b = "pr2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51733c = "prd";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51734d = "mwl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51735e = "mdl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51736f = "mwd";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51737g = "mdd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51738h = "mck";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51739i = "mdh";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51740j = "mfd";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f51741k = "mrv";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f51742l = "add";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f51743m = "cim";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f51744n = "clk";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f51745o = "vib";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f51746p = "vie";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f51747q = "ppl";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f51748r = "lad";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f51749s = "lar";
    private static final long serialVersionUID = -1926507337766691667L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f51750t = "img";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f51751u = "jsm";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f51752v = "wnr";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f51753w = "int";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f51754x = "rid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f51755y = "exp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f51756z = "bgr";
    private long V = Long.MAX_VALUE;
    private long W = Long.MAX_VALUE;
    private final Map<Long, List<String>> X = new TreeMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f51757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f51758b;

        public a(String str, String str2) {
            this.f51757a = str;
            this.f51758b = str2;
        }
    }

    public ImpressionLog() {
    }

    public ImpressionLog(ImpressionLog impressionLog) {
        a(impressionLog);
    }

    private String a(String str, int i10) {
        if (str == null || str.length() <= i10) {
            return str;
        }
        return str.substring(0, ((i10 * 2) / 3) - 3) + S + str.substring((str.length() - (i10 / 3)) + 2);
    }

    private int b(String str) {
        try {
            String[] strArrSplit = str.split("cnt=");
            if (strArrSplit.length > 1) {
                return Integer.parseInt(strArrSplit[1]);
            }
        } catch (Exception e10) {
            Logger.d(T, "get cumulative event counter, failed to parse event count from: " + str);
        }
        return 0;
    }

    private StringBuilder c(String str, a[] aVarArr) {
        StringBuilder sb2 = new StringBuilder(str);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String strA = aVar.f51758b;
                if (aVar.f51757a.equals("url")) {
                    strA = a(aVar.f51758b, 60);
                }
                sb2.append(Q).append(aVar.f51757a).append("=").append(strA);
            }
        }
        return sb2;
    }

    public int a() {
        return this.X.size();
    }

    public synchronized void a(ImpressionLog impressionLog) {
        if (impressionLog != null) {
            this.V = Math.min(this.V, impressionLog.V);
            this.W = Math.min(this.W, impressionLog.W);
            synchronized (impressionLog) {
                for (Map.Entry<Long, List<String>> entry : impressionLog.X.entrySet()) {
                    List<String> arrayList = this.X.get(entry.getKey());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.X.put(entry.getKey(), arrayList);
                    }
                    arrayList.addAll(entry.getValue());
                }
            }
        }
    }

    public synchronized void a(Long l10, Long l11, String str, a... aVarArr) {
        this.V = Math.min(this.V, l10.longValue());
        this.W = Math.min(this.W, l11.longValue());
        try {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbC = c(str, aVarArr);
                List<String> arrayList = this.X.get(l11);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.X.put(l11, arrayList);
                } else if (!arrayList.contains(sbC.toString())) {
                }
                arrayList.add(sbC.toString());
                Logger.d(T, "add event: " + ((Object) sbC) + " at: " + l10 + ", count: " + arrayList.size());
            }
        } catch (NullPointerException e10) {
            Logger.d(T, "add event failed: type=" + str + ", logEvents=" + this.X + ", timeElapsed=" + l11);
        }
    }

    public void a(String str, a... aVarArr) {
        a(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized boolean a(String str) {
        boolean z10;
        Iterator<List<String>> it = this.X.values().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(str)) {
                    z10 = true;
                    break loop0;
                }
            }
        }
        return z10;
    }

    public synchronized void b(Long l10, Long l11, String str, a... aVarArr) {
        this.V = Math.min(this.V, l10.longValue());
        this.W = Math.min(this.W, l11.longValue());
        if (!TextUtils.isEmpty(str)) {
            int iB = 0;
            StringBuilder sbC = c(str, aVarArr);
            for (List<String> list : this.X.values()) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (next.contains(sbC.toString())) {
                            iB = b(next);
                            list.remove(next);
                            break;
                        }
                    }
                }
                iB = iB;
            }
            sbC.append(Q).append(M).append("=").append(iB + 1);
            List<String> arrayList = this.X.get(l11);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.X.put(l11, arrayList);
            }
            arrayList.add(sbC.toString());
            Logger.d(T, "add cumulative event: " + ((Object) sbC) + " at: " + l10 + ", count: " + arrayList.size());
        }
    }

    public void b(String str, a... aVarArr) {
        b(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized String toString() {
        StringBuilder sb2;
        boolean z10;
        boolean z11 = true;
        sb2 = new StringBuilder();
        for (Map.Entry<Long, List<String>> entry : this.X.entrySet()) {
            for (String str : entry.getValue()) {
                if (z11) {
                    sb2.append(this.V);
                    z10 = false;
                } else {
                    sb2.append(P).append(entry.getKey().longValue() - this.W);
                    z10 = z11;
                }
                sb2.append(Q).append(str);
                z11 = z10;
            }
        }
        return sb2.toString();
    }
}
