package com.mbridge.msdk.thrid.okhttp;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CacheControl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f40184n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f40185o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f40186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f40190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f40194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f40195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f40196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f40197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f40198m;

    /* JADX INFO: compiled from: CacheControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f40199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f40200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40201c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40202d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40203e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f40206h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f40202d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public c a() {
            return new c(this);
        }

        public a b() {
            this.f40199a = true;
            return this;
        }

        public a c() {
            this.f40204f = true;
            return this;
        }
    }

    public c(a aVar) {
        this.f40186a = aVar.f40199a;
        this.f40187b = aVar.f40200b;
        this.f40188c = aVar.f40201c;
        this.f40189d = -1;
        this.f40190e = false;
        this.f40191f = false;
        this.f40192g = false;
        this.f40193h = aVar.f40202d;
        this.f40194i = aVar.f40203e;
        this.f40195j = aVar.f40204f;
        this.f40196k = aVar.f40205g;
        this.f40197l = aVar.f40206h;
    }

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f40186a = z10;
        this.f40187b = z11;
        this.f40188c = i10;
        this.f40189d = i11;
        this.f40190e = z12;
        this.f40191f = z13;
        this.f40192g = z14;
        this.f40193h = i12;
        this.f40194i = i13;
        this.f40195j = z15;
        this.f40196k = z16;
        this.f40197l = z17;
        this.f40198m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.thrid.okhttp.c a(com.mbridge.msdk.thrid.okhttp.r r22) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.c.a(com.mbridge.msdk.thrid.okhttp.r):com.mbridge.msdk.thrid.okhttp.c");
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f40186a) {
            sb2.append("no-cache, ");
        }
        if (this.f40187b) {
            sb2.append("no-store, ");
        }
        if (this.f40188c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f40188c);
            sb2.append(", ");
        }
        if (this.f40189d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f40189d);
            sb2.append(", ");
        }
        if (this.f40190e) {
            sb2.append("private, ");
        }
        if (this.f40191f) {
            sb2.append("public, ");
        }
        if (this.f40192g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f40193h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f40193h);
            sb2.append(", ");
        }
        if (this.f40194i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f40194i);
            sb2.append(", ");
        }
        if (this.f40195j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f40196k) {
            sb2.append("no-transform, ");
        }
        if (this.f40197l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    public boolean b() {
        return this.f40190e;
    }

    public boolean c() {
        return this.f40191f;
    }

    public int d() {
        return this.f40188c;
    }

    public int e() {
        return this.f40193h;
    }

    public int f() {
        return this.f40194i;
    }

    public boolean g() {
        return this.f40192g;
    }

    public boolean h() {
        return this.f40186a;
    }

    public boolean i() {
        return this.f40187b;
    }

    public boolean j() {
        return this.f40195j;
    }

    public String toString() {
        String str = this.f40198m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f40198m = strA;
        return strA;
    }
}
