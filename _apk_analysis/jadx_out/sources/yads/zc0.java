package yads;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import yads.ok0;

/* JADX INFO: loaded from: classes3.dex */
public final class zc0 implements mk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f97496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final on0 f97497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc0 f97498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc0 f97499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f97500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f97501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f97503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a00 f97504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f97505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ye2 f97506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w11 f97507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f97508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xc0 f97509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f97510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f97511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f97512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vc0 f97513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k20 f97514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lk0 f97515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f97516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f97517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public kn0 f97518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public nn0 f97519x;

    public zc0(UUID uuid, on0 on0Var, ed0 ed0Var, fd0 fd0Var, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, w11 w11Var, Looper looper, ae0 ae0Var, ye2 ye2Var) {
        if (i10 == 1 || i10 == 3) {
            ni.a(bArr);
        }
        this.f97508m = uuid;
        this.f97498c = ed0Var;
        this.f97499d = fd0Var;
        this.f97497b = on0Var;
        this.f97500e = i10;
        this.f97501f = z10;
        this.f97502g = z11;
        if (bArr != null) {
            this.f97517v = bArr;
            this.f97496a = null;
        } else {
            this.f97496a = Collections.unmodifiableList((List) ni.a(list));
        }
        this.f97503h = map;
        this.f97507l = w11Var;
        this.f97504i = new a00();
        this.f97505j = ae0Var;
        this.f97506k = ye2Var;
        this.f97510o = 2;
        this.f97509n = new xc0(this, looper);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6, final java.lang.Exception r7) {
        /*
            r5 = this;
            yads.lk0 r0 = new yads.lk0
            int r1 = yads.ib3.f90737a
            r2 = 1
            r3 = 21
            if (r1 < r3) goto L14
            boolean r3 = yads.uk0.a(r7)
            if (r3 == 0) goto L14
            int r6 = yads.uk0.b(r7)
            goto L5a
        L14:
            r3 = 23
            if (r1 < r3) goto L1f
            boolean r3 = yads.vk0.a(r7)
            if (r3 == 0) goto L1f
            goto L4c
        L1f:
            r3 = 18
            if (r1 < r3) goto L2a
            boolean r4 = yads.tk0.b(r7)
            if (r4 == 0) goto L2a
            goto L58
        L2a:
            if (r1 < r3) goto L35
            boolean r1 = yads.tk0.a(r7)
            if (r1 == 0) goto L35
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L35:
            boolean r1 = r7 instanceof yads.la3
            if (r1 == 0) goto L3c
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3c:
            boolean r1 = r7 instanceof yads.cd0
            if (r1 == 0) goto L43
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L43:
            boolean r1 = r7 instanceof yads.le1
            if (r1 == 0) goto L4a
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L4a:
            if (r6 != r2) goto L4f
        L4c:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L55:
            r1 = 3
            if (r6 != r1) goto L7a
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
        L5a:
            r0.<init>(r7, r6)
            r5.f97515t = r0
            java.lang.String r6 = "DRM session error"
            java.lang.String r6 = yads.ih1.a(r6, r7)
            java.lang.String r0 = "DefaultDrmSession"
            yads.ih1.b(r0, r6)
            bt.cd r6 = new bt.cd
            r6.<init>()
            r5.a(r6)
            int r6 = r5.f97510o
            r7 = 4
            if (r6 == r7) goto L79
            r5.f97510o = r2
        L79:
            return
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zc0.a(int, java.lang.Exception):void");
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.f97518w && e()) {
            this.f97518w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (!(exc instanceof NotProvisionedException)) {
                    a(2, exc);
                    return;
                }
                ed0 ed0Var = (ed0) this.f97498c;
                ed0Var.f89212a.add(this);
                if (ed0Var.f89213b != null) {
                    return;
                }
                ed0Var.f89213b = this;
                nn0 nn0VarA = this.f97497b.a();
                this.f97519x = nn0VarA;
                vc0 vc0Var = this.f97513r;
                int i10 = ib3.f90737a;
                nn0VarA.getClass();
                vc0Var.getClass();
                vc0Var.obtainMessage(0, new wc0(vf1.f96078a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f97500e == 3) {
                    on0 on0Var = this.f97497b;
                    byte[] bArr2 = this.f97517v;
                    int i11 = ib3.f90737a;
                    on0Var.b(bArr2, bArr);
                    a(new iz() { // from class: bt.yc
                        @Override // yads.iz
                        public final void accept(Object obj3) {
                            ((ok0) obj3).b();
                        }
                    });
                    return;
                }
                byte[] bArrB = this.f97497b.b(this.f97516u, bArr);
                int i12 = this.f97500e;
                if ((i12 == 2 || (i12 == 0 && this.f97517v != null)) && bArrB != null && bArrB.length != 0) {
                    this.f97517v = bArrB;
                }
                this.f97510o = 4;
                a(new iz() { // from class: bt.zc
                    @Override // yads.iz
                    public final void accept(Object obj3) {
                        ((ok0) obj3).a();
                    }
                });
            } catch (Exception e10) {
                if (!(e10 instanceof NotProvisionedException)) {
                    a(1, e10);
                    return;
                }
                ed0 ed0Var2 = (ed0) this.f97498c;
                ed0Var2.f89212a.add(this);
                if (ed0Var2.f89213b != null) {
                    return;
                }
                ed0Var2.f89213b = this;
                nn0 nn0VarA2 = this.f97497b.a();
                this.f97519x = nn0VarA2;
                vc0 vc0Var2 = this.f97513r;
                int i13 = ib3.f90737a;
                nn0VarA2.getClass();
                vc0Var2.getClass();
                vc0Var2.obtainMessage(0, new wc0(vf1.f96078a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA2)).sendToTarget();
            }
        }
    }

    public final void a(iz izVar) {
        Set set;
        a00 a00Var = this.f97504i;
        synchronized (a00Var.f87527b) {
            set = a00Var.f87529d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            izVar.accept((ok0) it.next());
        }
    }

    @Override // yads.mk0
    public final void a(ok0 ok0Var) {
        int i10 = this.f97511p;
        if (i10 <= 0) {
            ih1.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f97511p = i11;
        if (i11 == 0) {
            this.f97510o = 0;
            xc0 xc0Var = this.f97509n;
            int i12 = ib3.f90737a;
            xc0Var.removeCallbacksAndMessages(null);
            vc0 vc0Var = this.f97513r;
            synchronized (vc0Var) {
                vc0Var.removeCallbacksAndMessages(null);
                vc0Var.f96057a = true;
            }
            this.f97513r = null;
            this.f97512q.quit();
            this.f97512q = null;
            this.f97514s = null;
            this.f97515t = null;
            this.f97518w = null;
            this.f97519x = null;
            byte[] bArr = this.f97516u;
            if (bArr != null) {
                this.f97497b.b(bArr);
                this.f97516u = null;
            }
        }
        if (ok0Var != null) {
            this.f97504i.b(ok0Var);
            if (this.f97504i.a(ok0Var) == 0) {
                ok0Var.d();
            }
        }
        ((fd0) this.f97499d).a(this, this.f97511p);
    }

    public final void a(boolean z10) {
        Pair pair;
        String str;
        long jMin;
        if (this.f97502g) {
            return;
        }
        byte[] bArr = this.f97516u;
        int i10 = ib3.f90737a;
        int i11 = this.f97500e;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f97517v.getClass();
                this.f97516u.getClass();
                a(this.f97517v, 3, z10);
                return;
            }
            byte[] bArr2 = this.f97517v;
            if (bArr2 != null) {
                try {
                    this.f97497b.a(bArr, bArr2);
                } catch (Exception e10) {
                    a(1, e10);
                    return;
                }
            }
            a(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f97517v;
        if (bArr3 == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f97510o != 4) {
            try {
                this.f97497b.a(bArr, bArr3);
            } catch (Exception e11) {
                a(1, e11);
                return;
            }
        }
        if (jr.f91333d.equals(this.f97508m)) {
            Map mapG = g();
            if (mapG == null) {
                pair = null;
            } else {
                long j10 = -9223372036854775807L;
                try {
                    str = (String) mapG.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j11 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j11);
                try {
                    String str2 = (String) mapG.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j10 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j10));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f97500e == 0 && jMin <= 60) {
            ih1.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            a(2, new le1());
        } else {
            this.f97510o = 4;
            a(new iz() { // from class: bt.bd
                @Override // yads.iz
                public final void accept(Object obj) {
                    ((ok0) obj).c();
                }
            });
        }
    }

    public final void a(byte[] bArr, int i10, boolean z10) {
        try {
            kn0 kn0VarA = this.f97497b.a(bArr, this.f97496a, i10, this.f97503h);
            this.f97518w = kn0VarA;
            vc0 vc0Var = this.f97513r;
            int i11 = ib3.f90737a;
            kn0VarA.getClass();
            vc0Var.getClass();
            vc0Var.obtainMessage(1, new wc0(vf1.f96078a.getAndIncrement(), z10, SystemClock.elapsedRealtime(), kn0VarA)).sendToTarget();
        } catch (Exception e10) {
            if (!(e10 instanceof NotProvisionedException)) {
                a(1, e10);
                return;
            }
            ed0 ed0Var = (ed0) this.f97498c;
            ed0Var.f89212a.add(this);
            if (ed0Var.f89213b != null) {
                return;
            }
            ed0Var.f89213b = this;
            nn0 nn0VarA = this.f97497b.a();
            this.f97519x = nn0VarA;
            vc0 vc0Var2 = this.f97513r;
            int i12 = ib3.f90737a;
            nn0VarA.getClass();
            vc0Var2.getClass();
            vc0Var2.obtainMessage(0, new wc0(vf1.f96078a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
        }
    }

    @Override // yads.mk0
    public final boolean a() {
        return this.f97501f;
    }

    @Override // yads.mk0
    public final boolean a(String str) {
        on0 on0Var = this.f97497b;
        byte[] bArr = this.f97516u;
        if (bArr != null) {
            return on0Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    @Override // yads.mk0
    public final UUID b() {
        return this.f97508m;
    }

    @Override // yads.mk0
    public final void b(ok0 ok0Var) {
        if (this.f97511p < 0) {
            ih1.b("DefaultDrmSession", "Session reference count less than zero: " + this.f97511p);
            this.f97511p = 0;
        }
        if (ok0Var != null) {
            a00 a00Var = this.f97504i;
            synchronized (a00Var.f87527b) {
                ArrayList arrayList = new ArrayList(a00Var.f87530e);
                arrayList.add(ok0Var);
                a00Var.f87530e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) a00Var.f87528c.get(ok0Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(a00Var.f87529d);
                    hashSet.add(ok0Var);
                    a00Var.f87529d = Collections.unmodifiableSet(hashSet);
                }
                a00Var.f87528c.put(ok0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i10 = this.f97511p + 1;
        this.f97511p = i10;
        if (i10 == 1) {
            if (this.f97510o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f97512q = handlerThread;
            handlerThread.start();
            this.f97513r = new vc0(this, this.f97512q.getLooper());
            if (f()) {
                a(true);
            }
        } else if (ok0Var != null && e() && this.f97504i.a(ok0Var) == 1) {
            ok0Var.a(this.f97510o);
        }
        fd0 fd0Var = (fd0) this.f97499d;
        gd0 gd0Var = fd0Var.f89535a;
        if (gd0Var.f89932l != -9223372036854775807L) {
            gd0Var.f89935o.remove(this);
            Handler handler = fd0Var.f89535a.f89941u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // yads.mk0
    public final lk0 c() {
        if (this.f97510o == 1) {
            return this.f97515t;
        }
        return null;
    }

    @Override // yads.mk0
    public final k20 d() {
        return this.f97514s;
    }

    public final boolean e() {
        int i10 = this.f97510o;
        return i10 == 3 || i10 == 4;
    }

    public final boolean f() {
        if (e()) {
            return true;
        }
        try {
            byte[] bArrC = this.f97497b.c();
            this.f97516u = bArrC;
            this.f97497b.a(bArrC, this.f97506k);
            this.f97514s = this.f97497b.d(this.f97516u);
            final int i10 = 3;
            this.f97510o = 3;
            a(new iz() { // from class: bt.ad
                @Override // yads.iz
                public final void accept(Object obj) {
                    ((ok0) obj).a(i10);
                }
            });
            this.f97516u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ed0 ed0Var = (ed0) this.f97498c;
            ed0Var.f89212a.add(this);
            if (ed0Var.f89213b == null) {
                ed0Var.f89213b = this;
                nn0 nn0VarA = this.f97497b.a();
                this.f97519x = nn0VarA;
                vc0 vc0Var = this.f97513r;
                int i11 = ib3.f90737a;
                nn0VarA.getClass();
                vc0Var.getClass();
                vc0Var.obtainMessage(0, new wc0(vf1.f96078a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            a(1, e10);
            return false;
        }
    }

    public final Map g() {
        byte[] bArr = this.f97516u;
        if (bArr == null) {
            return null;
        }
        return this.f97497b.a(bArr);
    }

    @Override // yads.mk0
    public final int getState() {
        return this.f97510o;
    }
}
