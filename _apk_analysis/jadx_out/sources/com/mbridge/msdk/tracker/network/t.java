package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f41027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f41029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f41031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f41033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f41035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f41036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f41037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f41038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f41039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f41040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41044r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41045s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f41046t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f41047u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f41048v;

    /* JADX INFO: compiled from: Request.java */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public t(int i10, String str, int i11, String str2) {
        this.f41037k = new Object();
        this.f41041o = false;
        this.f41042p = false;
        this.f41043q = false;
        this.f41044r = false;
        this.f41045s = false;
        this.f41047u = null;
        this.f41048v = 0L;
        this.f41032f = i10;
        this.f41033g = str;
        this.f41034h = i11;
        this.f41035i = str2;
        a((x) new e());
        this.f41036j = b(str);
        this.f41030d = SystemClock.elapsedRealtime();
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(G5.T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f41045s;
    }

    public final boolean B() {
        return this.f41044r;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f41039m.intValue() - tVar.f41039m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f41040n = uVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f41046t = xVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f41041o = z10;
        return this;
    }

    public abstract v<T> a(q qVar);

    public void a(int i10) {
        u uVar = this.f41040n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    public void a(p pVar) {
        this.f41029c = pVar;
    }

    public void a(v.a aVar) {
        this.f41038l = aVar;
    }

    public void a(v<?> vVar) {
        synchronized (this.f41037k) {
        }
    }

    public abstract void a(T t10);

    public void a(String str) {
    }

    public void a(String str, String str2) {
        if (this.f41031e == null) {
            this.f41031e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f41031e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public boolean a() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f41039m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f41045s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f41037k) {
            aVar = this.f41038l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI == null || mapI.size() <= 0) {
            this.f41048v = 0L;
            return null;
        }
        byte[] bArrA = a(mapI, j());
        this.f41048v = bArrA.length;
        return bArrA;
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f41044r = z10;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public void c(String str) {
        u uVar = this.f41040n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public b.a d() {
        return this.f41047u;
    }

    public String d(String str) {
        if (this.f41031e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f41031e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f41028b)) {
            return this.f41028b;
        }
        if (this.f41027a == null) {
            this.f41027a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f41027a.a(this);
        this.f41028b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    public int g() {
        return this.f41032f;
    }

    public p h() {
        return this.f41029c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "UTF-8";
    }

    public int k() {
        return this.f41034h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f41048v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f41030d;
    }

    public x o() {
        return this.f41046t;
    }

    public String p() {
        return this.f41035i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f41036j;
    }

    public String t() {
        return this.f41033g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(Z7.f30794r);
        sb2.append(str);
        sb2.append(Z7.f30794r);
        sb2.append(l());
        sb2.append(Z7.f30794r);
        sb2.append(this.f41039m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f41037k) {
            z10 = this.f41043q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f41037k) {
            z10 = this.f41042p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f41037k) {
            this.f41043q = true;
        }
    }

    public void x() {
        synchronized (this.f41037k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f41041o;
    }
}
