package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.internal.http.d;
import com.mbridge.msdk.thrid.okhttp.internal.http.e;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.y;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CacheStrategy.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f40327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f40328b;

    /* JADX INFO: compiled from: CacheStrategy.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f40330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f40331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f40332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f40333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f40334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f40335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f40336h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f40337i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f40338j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f40339k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f40340l;

        public a(long j10, y yVar, a0 a0Var) {
            this.f40340l = -1;
            this.f40329a = j10;
            this.f40330b = yVar;
            this.f40331c = a0Var;
            if (a0Var != null) {
                this.f40337i = a0Var.t();
                this.f40338j = a0Var.r();
                r rVarM = a0Var.m();
                int iB = rVarM.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    String strA = rVarM.a(i10);
                    String strB = rVarM.b(i10);
                    if ("Date".equalsIgnoreCase(strA)) {
                        this.f40332d = d.a(strB);
                        this.f40333e = strB;
                    } else if ("Expires".equalsIgnoreCase(strA)) {
                        this.f40336h = d.a(strB);
                    } else if ("Last-Modified".equalsIgnoreCase(strA)) {
                        this.f40334f = d.a(strB);
                        this.f40335g = strB;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(strA)) {
                        this.f40339k = strB;
                    } else if ("Age".equalsIgnoreCase(strA)) {
                        this.f40340l = e.a(strB, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f40332d;
            long jMax = date != null ? Math.max(0L, this.f40338j - date.getTime()) : 0L;
            int i10 = this.f40340l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f40338j;
            return jMax + (j10 - this.f40337i) + (this.f40329a - j10);
        }

        private static boolean a(y yVar) {
            return (yVar.a("If-Modified-Since") == null && yVar.a("If-None-Match") == null) ? false : true;
        }

        private long b() {
            if (this.f40331c.h().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            if (this.f40336h != null) {
                Date date = this.f40332d;
                long time = this.f40336h.getTime() - (date != null ? date.getTime() : this.f40338j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f40334f == null || this.f40331c.s().g().k() != null) {
                return 0L;
            }
            Date date2 = this.f40332d;
            long time2 = (date2 != null ? date2.getTime() : this.f40337i) - this.f40334f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private b d() {
            if (this.f40331c == null) {
                return new b(this.f40330b, null);
            }
            if ((!this.f40330b.d() || this.f40331c.l() != null) && b.a(this.f40331c, this.f40330b)) {
                com.mbridge.msdk.thrid.okhttp.c cVarB = this.f40330b.b();
                if (cVarB.h() || a(this.f40330b)) {
                    return new b(this.f40330b, null);
                }
                com.mbridge.msdk.thrid.okhttp.c cVarH = this.f40331c.h();
                long jA = a();
                long jB = b();
                if (cVarB.d() != -1) {
                    jB = Math.min(jB, TimeUnit.SECONDS.toMillis(cVarB.d()));
                }
                long millis = 0;
                long millis2 = cVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(cVarB.f()) : 0L;
                if (!cVarH.g() && cVarB.e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cVarB.e());
                }
                if (!cVarH.h()) {
                    long j10 = millis2 + jA;
                    if (j10 < millis + jB) {
                        a0.a aVarP = this.f40331c.p();
                        if (j10 >= jB) {
                            aVarP.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > SignalManager.TWENTY_FOUR_HOURS_MILLIS && e()) {
                            aVarP.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new b(null, aVarP.a());
                    }
                }
                String str = this.f40339k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f40334f != null) {
                    str = this.f40335g;
                } else {
                    if (this.f40332d == null) {
                        return new b(this.f40330b, null);
                    }
                    str = this.f40333e;
                }
                r.a aVarA = this.f40330b.c().a();
                com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(aVarA, str2, str);
                return new b(this.f40330b.f().a(aVarA.a()).a(), this.f40331c);
            }
            return new b(this.f40330b, null);
        }

        private boolean e() {
            return this.f40331c.h().d() == -1 && this.f40336h == null;
        }

        public b c() {
            b bVarD = d();
            return (bVarD.f40327a == null || !this.f40330b.b().j()) ? bVarD : new b(null, null);
        }
    }

    public b(y yVar, a0 a0Var) {
        this.f40327a = yVar;
        this.f40328b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.h().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.mbridge.msdk.thrid.okhttp.a0 r3, com.mbridge.msdk.thrid.okhttp.y r4) {
        /*
            int r0 = r3.k()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.b(r0)
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            com.mbridge.msdk.thrid.okhttp.c r3 = r3.h()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            com.mbridge.msdk.thrid.okhttp.c r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.cache.b.a(com.mbridge.msdk.thrid.okhttp.a0, com.mbridge.msdk.thrid.okhttp.y):boolean");
    }
}
