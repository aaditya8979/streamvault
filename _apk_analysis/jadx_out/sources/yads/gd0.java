package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class gd0 implements sk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f89922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn0 f89923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w11 f89924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f89925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f89926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f89927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f89928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ed0 f89929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f89930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fd0 f89931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f89932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f89933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f89934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f89935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f89936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public on0 f89937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zc0 f89938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zc0 f89939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f89940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f89941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f89942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f89943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ye2 f89944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile bd0 f89945y;

    public gd0(UUID uuid, mn0 mn0Var, w11 w11Var, HashMap map, boolean z10, int[] iArr, boolean z11, ae0 ae0Var, long j10) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f91331b.equals(uuid));
        this.f89922b = uuid;
        this.f89923c = mn0Var;
        this.f89924d = w11Var;
        this.f89925e = map;
        this.f89926f = z10;
        this.f89927g = iArr;
        this.f89928h = z11;
        this.f89930j = ae0Var;
        this.f89929i = new ed0();
        this.f89931k = new fd0(this);
        this.f89942v = 0;
        this.f89933m = new ArrayList();
        this.f89934n = ly2.a();
        this.f89935o = ly2.a();
        this.f89932l = j10;
    }

    public static ArrayList a(kk0 kk0Var, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(kk0Var.f91619e);
        for (int i10 = 0; i10 < kk0Var.f91619e; i10++) {
            jk0 jk0Var = kk0Var.f91616b[i10];
            if ((jk0Var.a(uuid) || (jr.f91332c.equals(uuid) && jk0Var.a(jr.f91331b))) && (jk0Var.f91261f != null || z10)) {
                arrayList.add(jk0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return 0;
     */
    @Override // yads.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.mx0 r6) {
        /*
            r5 = this;
            yads.on0 r0 = r5.f89937q
            r0.getClass()
            int r0 = r0.b()
            yads.kk0 r1 = r6.f92613p
            r2 = 0
            if (r1 != 0) goto L27
            java.lang.String r6 = r6.f92610m
            int r6 = yads.ht1.d(r6)
            int[] r1 = r5.f89927g
            r3 = r2
        L17:
            int r4 = r1.length
            if (r3 >= r4) goto L25
            r4 = r1[r3]
            if (r4 != r6) goto L22
            r6 = -1
            if (r3 == r6) goto L25
            goto L26
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            r0 = r2
        L26:
            return r0
        L27:
            byte[] r6 = r5.f89943w
            r3 = 1
            if (r6 == 0) goto L2d
            goto L8b
        L2d:
            java.util.UUID r6 = r5.f89922b
            java.util.ArrayList r6 = a(r1, r6, r3)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5e
            int r6 = r1.f91619e
            if (r6 != r3) goto L8a
            yads.jk0[] r6 = r1.f91616b
            r6 = r6[r2]
            java.util.UUID r2 = yads.jr.f91331b
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L8a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r6.<init>(r2)
            java.util.UUID r2 = r5.f89922b
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "DefaultDrmSessionMgr"
            yads.ih1.d(r2, r6)
        L5e:
            java.lang.String r6 = r1.f91618d
            if (r6 == 0) goto L8b
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6b
            goto L8b
        L6b:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L7a
            int r6 = yads.ib3.f90737a
            r1 = 25
            if (r6 < r1) goto L8a
            goto L8b
        L7a:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L8a
            java.lang.String r1 = "cens"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L8b
        L8a:
            r0 = r3
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gd0.a(yads.mx0):int");
    }

    public final mk0 a(Looper looper, ok0 ok0Var, mx0 mx0Var, boolean z10) {
        ArrayList arrayListA;
        if (this.f89945y == null) {
            this.f89945y = new bd0(this, looper);
        }
        kk0 kk0Var = mx0Var.f92613p;
        zc0 zc0VarA = null;
        if (kk0Var == null) {
            int iD = ht1.d(mx0Var.f92610m);
            on0 on0Var = this.f89937q;
            on0Var.getClass();
            if (on0Var.b() == 2 && ux0.f95862d) {
                return null;
            }
            int[] iArr = this.f89927g;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == iD) {
                    if (i10 == -1 || on0Var.b() == 1) {
                        return null;
                    }
                    zc0 zc0Var = this.f89938r;
                    if (zc0Var == null) {
                        m51 m51Var = p51.f93439c;
                        zc0 zc0VarA2 = a(sm2.f94878f, true, (ok0) null, z10);
                        this.f89933m.add(zc0VarA2);
                        this.f89938r = zc0VarA2;
                    } else {
                        zc0Var.b(null);
                    }
                    return this.f89938r;
                }
            }
            return null;
        }
        if (this.f89943w == null) {
            arrayListA = a(kk0Var, this.f89922b, false);
            if (arrayListA.isEmpty()) {
                cd0 cd0Var = new cd0(this.f89922b);
                ih1.b("DefaultDrmSessionMgr", ih1.a("DRM error", cd0Var));
                if (ok0Var != null) {
                    ok0Var.a(cd0Var);
                }
                return new sm0(new lk0(cd0Var, 6003));
            }
        } else {
            arrayListA = null;
        }
        if (this.f89926f) {
            Iterator it = this.f89933m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zc0 zc0Var2 = (zc0) it.next();
                if (ib3.a(zc0Var2.f97496a, arrayListA)) {
                    zc0VarA = zc0Var2;
                    break;
                }
            }
        } else {
            zc0VarA = this.f89939s;
        }
        if (zc0VarA == null) {
            zc0VarA = a((List) arrayListA, false, ok0Var, z10);
            if (!this.f89926f) {
                this.f89939s = zc0VarA;
            }
            this.f89933m.add(zc0VarA);
        } else {
            zc0VarA.b(ok0Var);
        }
        return zc0VarA;
    }

    @Override // yads.sk0
    public final rk0 a(ok0 ok0Var, mx0 mx0Var) {
        if (this.f89936p <= 0) {
            throw new IllegalStateException();
        }
        if (this.f89940t == null) {
            throw new IllegalStateException();
        }
        dd0 dd0Var = new dd0(this, ok0Var);
        dd0Var.a(mx0Var);
        return dd0Var;
    }

    public final zc0 a(List list, boolean z10, ok0 ok0Var) {
        this.f89937q.getClass();
        boolean z11 = this.f89928h | z10;
        UUID uuid = this.f89922b;
        on0 on0Var = this.f89937q;
        ed0 ed0Var = this.f89929i;
        fd0 fd0Var = this.f89931k;
        int i10 = this.f89942v;
        byte[] bArr = this.f89943w;
        HashMap map = this.f89925e;
        w11 w11Var = this.f89924d;
        Looper looper = this.f89940t;
        looper.getClass();
        ae0 ae0Var = this.f89930j;
        ye2 ye2Var = this.f89944x;
        ye2Var.getClass();
        zc0 zc0Var = new zc0(uuid, on0Var, ed0Var, fd0Var, list, i10, z11, z10, bArr, map, w11Var, looper, ae0Var, ye2Var);
        zc0Var.b(ok0Var);
        if (this.f89932l != -9223372036854775807L) {
            zc0Var.b(null);
        }
        return zc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.zc0 a(java.util.List r10, boolean r11, yads.ok0 r12, boolean r13) {
        /*
            r9 = this;
            yads.zc0 r0 = r9.a(r10, r11, r12)
            int r1 = r0.f97510o
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 19
            r5 = 1
            r6 = 0
            if (r1 != r5) goto L56
            int r1 = yads.ib3.f90737a
            if (r1 < r4) goto L24
            yads.lk0 r1 = r0.c()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto L56
        L24:
            java.util.Set r1 = r9.f89935o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            java.util.Set r1 = r9.f89935o
            yads.u51 r1 = yads.u51.a(r1)
            yads.ja3 r1 = r1.iterator()
        L36:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L46
            java.lang.Object r7 = r1.next()
            yads.mk0 r7 = (yads.mk0) r7
            r7.a(r6)
            goto L36
        L46:
            r0.a(r12)
            long r7 = r9.f89932l
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L52
            r0.a(r6)
        L52:
            yads.zc0 r0 = r9.a(r10, r11, r12)
        L56:
            int r1 = r0.f97510o
            if (r1 != r5) goto Lc3
            int r1 = yads.ib3.f90737a
            if (r1 < r4) goto L6d
            yads.lk0 r1 = r0.c()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto Lc3
        L6d:
            if (r13 == 0) goto Lc3
            java.util.Set r13 = r9.f89934n
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lc3
            java.util.Set r13 = r9.f89934n
            yads.u51 r13 = yads.u51.a(r13)
            yads.ja3 r13 = r13.iterator()
        L81:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r13.next()
            yads.dd0 r1 = (yads.dd0) r1
            r1.release()
            goto L81
        L91:
            java.util.Set r13 = r9.f89935o
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lb3
            java.util.Set r13 = r9.f89935o
            yads.u51 r13 = yads.u51.a(r13)
            yads.ja3 r13 = r13.iterator()
        La3:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r13.next()
            yads.mk0 r1 = (yads.mk0) r1
            r1.a(r6)
            goto La3
        Lb3:
            r0.a(r12)
            long r4 = r9.f89932l
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto Lbf
            r0.a(r6)
        Lbf:
            yads.zc0 r0 = r9.a(r10, r11, r12)
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gd0.a(java.util.List, boolean, yads.ok0, boolean):yads.zc0");
    }

    @Override // yads.sk0
    public final void a(Looper looper, ye2 ye2Var) {
        synchronized (this) {
            Looper looper2 = this.f89940t;
            if (looper2 == null) {
                this.f89940t = looper;
                this.f89941u = new Handler(looper);
            } else {
                if (looper2 != looper) {
                    throw new IllegalStateException();
                }
                this.f89941u.getClass();
            }
        }
        this.f89944x = ye2Var;
    }

    @Override // yads.sk0
    public final mk0 b(ok0 ok0Var, mx0 mx0Var) {
        if (this.f89936p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f89940t;
        if (looper != null) {
            return a(looper, ok0Var, mx0Var, true);
        }
        throw new IllegalStateException();
    }

    @Override // yads.sk0
    public final void prepare() {
        int i10 = this.f89936p;
        this.f89936p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f89937q == null) {
            on0 on0VarA = this.f89923c.a(this.f89922b);
            this.f89937q = on0VarA;
            on0VarA.a(new ad0(this));
        } else if (this.f89932l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f89933m.size(); i11++) {
                ((zc0) this.f89933m.get(i11)).b(null);
            }
        }
    }

    @Override // yads.sk0
    public final void release() {
        int i10 = this.f89936p - 1;
        this.f89936p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f89932l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f89933m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((zc0) arrayList.get(i11)).a((ok0) null);
            }
        }
        ja3 it = u51.a(this.f89934n).iterator();
        while (it.hasNext()) {
            ((dd0) it.next()).release();
        }
        if (this.f89937q != null && this.f89936p == 0 && this.f89933m.isEmpty() && this.f89934n.isEmpty()) {
            on0 on0Var = this.f89937q;
            on0Var.getClass();
            on0Var.release();
            this.f89937q = null;
        }
    }
}
