package e6;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import e6.b;
import e6.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements r1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y7.p<String> f60739h = new y7.p() { // from class: e6.o1
        @Override // y7.p
        public final Object get() {
            return p1.j();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f60740i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.d f60741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.b f60742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f60743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7.p<String> f60744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r1.a f60745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.c0 f60746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f60747g;

    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f60749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f60750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i.b f60751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f60752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f60753f;

        public a(String str, int i10, @Nullable i.b bVar) {
            this.f60748a = str;
            this.f60749b = i10;
            this.f60750c = bVar == null ? -1L : bVar.f60902d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f60751d = bVar;
        }

        public boolean i(int i10, @Nullable i.b bVar) {
            if (bVar == null) {
                return i10 == this.f60749b;
            }
            i.b bVar2 = this.f60751d;
            return bVar2 == null ? !bVar.b() && bVar.f60902d == this.f60750c : bVar.f60902d == bVar2.f60902d && bVar.f60900b == bVar2.f60900b && bVar.f60901c == bVar2.f60901c;
        }

        public boolean j(b.a aVar) {
            i.b bVar = aVar.f60625d;
            if (bVar == null) {
                return this.f60749b != aVar.f60624c;
            }
            long j10 = this.f60750c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f60902d > j10) {
                return true;
            }
            if (this.f60751d == null) {
                return false;
            }
            int iF = aVar.f60623b.f(bVar.f60899a);
            int iF2 = aVar.f60623b.f(this.f60751d.f60899a);
            i.b bVar2 = aVar.f60625d;
            if (bVar2.f60902d < this.f60751d.f60902d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f60625d.f60903e;
                return i10 == -1 || i10 > this.f60751d.f60900b;
            }
            i.b bVar3 = aVar.f60625d;
            int i11 = bVar3.f60900b;
            int i12 = bVar3.f60901c;
            i.b bVar4 = this.f60751d;
            int i13 = bVar4.f60900b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f60901c;
            }
            return true;
        }

        public void k(int i10, @Nullable i.b bVar) {
            if (this.f60750c == -1 && i10 == this.f60749b && bVar != null) {
                this.f60750c = bVar.f60902d;
            }
        }

        public final int l(com.google.android.exoplayer2.c0 c0Var, com.google.android.exoplayer2.c0 c0Var2, int i10) {
            if (i10 >= c0Var.t()) {
                if (i10 < c0Var2.t()) {
                    return i10;
                }
                return -1;
            }
            c0Var.r(i10, p1.this.f60741a);
            for (int i11 = p1.this.f60741a.f21416p; i11 <= p1.this.f60741a.f21417q; i11++) {
                int iF = c0Var2.f(c0Var.q(i11));
                if (iF != -1) {
                    return c0Var2.j(iF, p1.this.f60742b).f21389d;
                }
            }
            return -1;
        }

        public boolean m(com.google.android.exoplayer2.c0 c0Var, com.google.android.exoplayer2.c0 c0Var2) {
            int iL = l(c0Var, c0Var2, this.f60749b);
            this.f60749b = iL;
            if (iL == -1) {
                return false;
            }
            i.b bVar = this.f60751d;
            return bVar == null || c0Var2.f(bVar.f60899a) != -1;
        }
    }

    public p1() {
        this(f60739h);
    }

    public p1(y7.p<String> pVar) {
        this.f60744d = pVar;
        this.f60741a = new c0.d();
        this.f60742b = new c0.b();
        this.f60743c = new HashMap<>();
        this.f60746f = com.google.android.exoplayer2.c0.f21384b;
    }

    public static String j() {
        byte[] bArr = new byte[12];
        f60740i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // e6.r1
    public synchronized void a(b.a aVar) {
        r1.a aVar2;
        this.f60747g = null;
        Iterator<a> it = this.f60743c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f60752e && (aVar2 = this.f60745e) != null) {
                aVar2.u(aVar, next.f60748a, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:11:0x0025, B:13:0x0030, B:16:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:34:0x00db, B:36:0x00e1, B:38:0x00f7, B:40:0x0103, B:42:0x0109), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // e6.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(e6.b.a r25) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.p1.b(e6.b$a):void");
    }

    @Override // e6.r1
    public synchronized void c(b.a aVar) {
        s7.a.e(this.f60745e);
        com.google.android.exoplayer2.c0 c0Var = this.f60746f;
        this.f60746f = aVar.f60623b;
        Iterator<a> it = this.f60743c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(c0Var, this.f60746f) || next.j(aVar)) {
                it.remove();
                if (next.f60752e) {
                    if (next.f60748a.equals(this.f60747g)) {
                        this.f60747g = null;
                    }
                    this.f60745e.u(aVar, next.f60748a, false);
                }
            }
        }
        l(aVar);
    }

    @Override // e6.r1
    public synchronized void d(b.a aVar, int i10) {
        s7.a.e(this.f60745e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f60743c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f60752e) {
                    boolean zEquals = next.f60748a.equals(this.f60747g);
                    boolean z11 = z10 && zEquals && next.f60753f;
                    if (zEquals) {
                        this.f60747g = null;
                    }
                    this.f60745e.u(aVar, next.f60748a, z11);
                }
            }
        }
        l(aVar);
    }

    @Override // e6.r1
    public void e(r1.a aVar) {
        this.f60745e = aVar;
    }

    @Override // e6.r1
    public synchronized String f(com.google.android.exoplayer2.c0 c0Var, i.b bVar) {
        return k(c0Var.l(bVar.f60899a, this.f60742b).f21389d, bVar).f60748a;
    }

    @Override // e6.r1
    @Nullable
    public synchronized String getActiveSessionId() {
        return this.f60747g;
    }

    public final a k(int i10, @Nullable i.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f60743c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f60750c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) s7.m0.j(aVar)).f60751d != null && aVar2.f60751d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f60744d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f60743c.put(str, aVar3);
        return aVar3;
    }

    public final void l(b.a aVar) {
        if (aVar.f60623b.u()) {
            this.f60747g = null;
            return;
        }
        a aVar2 = this.f60743c.get(this.f60747g);
        a aVarK = k(aVar.f60624c, aVar.f60625d);
        this.f60747g = aVarK.f60748a;
        b(aVar);
        i.b bVar = aVar.f60625d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f60750c == aVar.f60625d.f60902d && aVar2.f60751d != null && aVar2.f60751d.f60900b == aVar.f60625d.f60900b && aVar2.f60751d.f60901c == aVar.f60625d.f60901c) {
            return;
        }
        i.b bVar2 = aVar.f60625d;
        this.f60745e.J(aVar, k(aVar.f60624c, new i.b(bVar2.f60899a, bVar2.f60902d)).f60748a, aVarK.f60748a);
    }
}
