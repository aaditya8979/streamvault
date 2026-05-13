package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rr implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr f94576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p30 f94577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q53 f94578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p30 f94579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yr f94580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f94584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f94585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u30 f94586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p30 f94587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f94588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f94589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f94590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public yy2 f94591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f94592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f94593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f94594s;

    public rr(nr nrVar, p30 p30Var, cv0 cv0Var, pr prVar, yr yrVar, int i10) {
        this.f94576a = nrVar;
        this.f94577b = cv0Var;
        this.f94580e = yrVar == null ? yr.f97274a : yrVar;
        this.f94581f = (i10 & 1) != 0;
        this.f94582g = false;
        this.f94583h = false;
        if (p30Var != null) {
            this.f94579d = p30Var;
            this.f94578c = prVar != null ? new q53(p30Var, prVar) : null;
        } else {
            this.f94579d = ed2.f89216a;
            this.f94578c = null;
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        try {
            String strA = this.f94580e.a(u30Var);
            u30Var.getClass();
            Uri uri = u30Var.f95522a;
            long j10 = u30Var.f95523b;
            int i10 = u30Var.f95524c;
            byte[] bArr = u30Var.f95525d;
            Map map = u30Var.f95526e;
            long j11 = u30Var.f95527f;
            long j12 = u30Var.f95528g;
            int i11 = u30Var.f95530i;
            Object obj = u30Var.f95531j;
            ni.a(uri, "The uri must be set.");
            u30 u30Var2 = new u30(uri, j10, i10, bArr, map, j11, j12, strA, i11, obj);
            this.f94585j = u30Var2;
            nr nrVar = this.f94576a;
            Uri uri2 = u30Var2.f95522a;
            String strA2 = ((vy2) nrVar).b(strA).a();
            Uri uri3 = strA2 == null ? null : Uri.parse(strA2);
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.f94584i = uri2;
            this.f94589n = u30Var.f95527f;
            boolean z10 = (this.f94582g && this.f94592q) || (this.f94583h && u30Var.f95528g == -1);
            this.f94593r = z10;
            if (z10) {
                this.f94590o = -1L;
            } else {
                long jA = qz.a(((vy2) this.f94576a).b(strA));
                this.f94590o = jA;
                if (jA != -1) {
                    long j13 = jA - u30Var.f95527f;
                    this.f94590o = j13;
                    if (j13 < 0) {
                        throw new q30(2008);
                    }
                }
            }
            long jMin = u30Var.f95528g;
            if (jMin != -1) {
                long j14 = this.f94590o;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f94590o = jMin;
            }
            long j15 = this.f94590o;
            if (j15 > 0 || j15 == -1) {
                a(u30Var2, false);
            }
            long j16 = u30Var.f95528g;
            return j16 != -1 ? j16 : this.f94590o;
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f94592q = true;
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f94577b.a(r83Var);
        this.f94579d.a(r83Var);
    }

    public final void a(u30 u30Var, boolean z10) throws InterruptedIOException {
        yy2 yy2VarC;
        String str;
        p30 p30Var;
        u30 u30Var2;
        String str2 = u30Var.f95529h;
        int i10 = ib3.f90737a;
        if (this.f94593r) {
            yy2VarC = null;
        } else if (this.f94581f) {
            try {
                nr nrVar = this.f94576a;
                long j10 = this.f94589n;
                long j11 = this.f94590o;
                vy2 vy2Var = (vy2) nrVar;
                synchronized (vy2Var) {
                    vy2Var.a();
                    while (true) {
                        yy2VarC = vy2Var.c(str2, j10, j11);
                        if (yy2VarC != null) {
                            break;
                        } else {
                            vy2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            yy2VarC = ((vy2) this.f94576a).c(str2, this.f94589n, this.f94590o);
        }
        if (yy2VarC == null) {
            p30 p30Var2 = this.f94579d;
            Uri uri = u30Var.f95522a;
            long j12 = u30Var.f95523b;
            int i11 = u30Var.f95524c;
            byte[] bArr = u30Var.f95525d;
            Map map = u30Var.f95526e;
            String str3 = u30Var.f95529h;
            int i12 = u30Var.f95530i;
            Object obj = u30Var.f95531j;
            long j13 = this.f94589n;
            str = str2;
            long j14 = this.f94590o;
            ni.a(uri, "The uri must be set.");
            u30Var2 = new u30(uri, j12, i11, bArr, map, j13, j14, str3, i12, obj);
            p30Var = p30Var2;
        } else {
            str = str2;
            if (yy2VarC.f97754e) {
                Uri uriFromFile = Uri.fromFile(yy2VarC.f97755f);
                long j15 = yy2VarC.f97752c;
                long j16 = this.f94589n - j15;
                long jMin = yy2VarC.f97753d - j16;
                long j17 = this.f94590o;
                if (j17 != -1) {
                    jMin = Math.min(jMin, j17);
                }
                long j18 = jMin;
                int i13 = u30Var.f95524c;
                byte[] bArr2 = u30Var.f95525d;
                Map map2 = u30Var.f95526e;
                String str4 = u30Var.f95529h;
                int i14 = u30Var.f95530i;
                Object obj2 = u30Var.f95531j;
                ni.a(uriFromFile, "The uri must be set.");
                u30 u30Var3 = new u30(uriFromFile, j15, i13, bArr2, map2, j16, j18, str4, i14, obj2);
                p30Var = this.f94577b;
                u30Var2 = u30Var3;
            } else {
                long jMin2 = yy2VarC.f97753d;
                if (jMin2 == -1) {
                    jMin2 = this.f94590o;
                } else {
                    long j19 = this.f94590o;
                    if (j19 != -1) {
                        jMin2 = Math.min(jMin2, j19);
                    }
                }
                long j20 = jMin2;
                Uri uri2 = u30Var.f95522a;
                long j21 = u30Var.f95523b;
                int i15 = u30Var.f95524c;
                byte[] bArr3 = u30Var.f95525d;
                Map map3 = u30Var.f95526e;
                String str5 = u30Var.f95529h;
                int i16 = u30Var.f95530i;
                Object obj3 = u30Var.f95531j;
                long j22 = this.f94589n;
                ni.a(uri2, "The uri must be set.");
                u30 u30Var4 = new u30(uri2, j21, i15, bArr3, map3, j22, j20, str5, i16, obj3);
                p30Var = this.f94578c;
                if (p30Var != null) {
                    u30Var2 = u30Var4;
                } else {
                    p30Var = this.f94579d;
                    ((vy2) this.f94576a).a((zr) yy2VarC);
                    u30Var2 = u30Var4;
                    yy2VarC = null;
                }
            }
        }
        this.f94594s = (this.f94593r || p30Var != this.f94579d) ? Long.MAX_VALUE : this.f94589n + 102400;
        if (z10) {
            p30 p30Var3 = this.f94587l;
            p30 p30Var4 = this.f94579d;
            if (p30Var3 != p30Var4) {
                throw new IllegalStateException();
            }
            if (p30Var == p30Var4) {
                return;
            }
            try {
                d();
            } finally {
            }
        }
        if (yy2VarC != null && (!yy2VarC.f97754e)) {
            this.f94591p = yy2VarC;
        }
        this.f94587l = p30Var;
        this.f94586k = u30Var2;
        this.f94588m = 0L;
        long jA = p30Var.a(u30Var2);
        rz rzVar = new rz();
        if (u30Var2.f95528g == -1 && jA != -1) {
            this.f94590o = jA;
            rzVar.f94650a.put("exo_len", Long.valueOf(this.f94589n + jA));
            rzVar.f94651b.remove("exo_len");
        }
        if (!g()) {
            Uri uri3 = p30Var.getUri();
            this.f94584i = uri3;
            Uri uri4 = u30Var.f95522a.equals(uri3) ^ true ? this.f94584i : null;
            if (uri4 == null) {
                rzVar.f94651b.add("exo_redir");
                rzVar.f94650a.remove("exo_redir");
            } else {
                String string = uri4.toString();
                HashMap map4 = rzVar.f94650a;
                string.getClass();
                map4.put("exo_redir", string);
                rzVar.f94651b.remove("exo_redir");
            }
        }
        if (this.f94587l == this.f94578c) {
            ((vy2) this.f94576a).a(str, rzVar);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f94585j = null;
        this.f94584i = null;
        this.f94589n = 0L;
        try {
            d();
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f94592q = true;
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        p30 p30Var = this.f94587l;
        if (p30Var == null) {
            return;
        }
        try {
            p30Var.close();
        } finally {
            this.f94586k = null;
            this.f94587l = null;
            yy2 yy2Var = this.f94591p;
            if (yy2Var != null) {
                ((vy2) this.f94576a).a((zr) yy2Var);
                this.f94591p = null;
            }
        }
    }

    public final nr e() {
        return this.f94576a;
    }

    public final yr f() {
        return this.f94580e;
    }

    public final boolean g() {
        return this.f94587l == this.f94577b;
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return g() ^ true ? this.f94579d.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f94584i;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        if (this.f94590o == 0) {
            return -1;
        }
        u30 u30Var = this.f94585j;
        u30Var.getClass();
        u30 u30Var2 = this.f94586k;
        u30Var2.getClass();
        try {
            if (this.f94589n >= this.f94594s) {
                a(u30Var, true);
            }
            p30 p30Var = this.f94587l;
            p30Var.getClass();
            int i13 = p30Var.read(bArr, i10, i11);
            if (i13 != -1) {
                long j10 = i13;
                this.f94589n += j10;
                this.f94588m += j10;
                long j11 = this.f94590o;
                if (j11 != -1) {
                    this.f94590o = j11 - j10;
                }
                return i13;
            }
            if (!g()) {
                long j12 = u30Var2.f95528g;
                if (j12 != -1) {
                    i12 = i13;
                    if (this.f94588m < j12) {
                    }
                } else {
                    i12 = i13;
                }
                String str = u30Var.f95529h;
                int i14 = ib3.f90737a;
                this.f94590o = 0L;
                if (this.f94587l != this.f94578c) {
                    return i12;
                }
                rz rzVar = new rz();
                rzVar.f94650a.put("exo_len", Long.valueOf(this.f94589n));
                rzVar.f94651b.remove("exo_len");
                ((vy2) this.f94576a).a(str, rzVar);
                return i12;
            }
            i12 = i13;
            long j13 = this.f94590o;
            if (j13 <= 0 && j13 != -1) {
                return i12;
            }
            d();
            a(u30Var, false);
            return read(bArr, i10, i11);
        } catch (Throwable th2) {
            if (g() || (th2 instanceof kr)) {
                this.f94592q = true;
            }
            throw th2;
        }
    }
}
