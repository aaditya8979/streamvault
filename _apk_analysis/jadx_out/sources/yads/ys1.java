package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ys1 extends ro implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vs1 f97279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xs1 f97280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f97281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ws1 f97282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public dz2 f97283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f97284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f97285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f97286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f97287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ts1 f97288w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(wn0 wn0Var, Looper looper) {
        super(5);
        us1 us1Var = vs1.f96182a;
        this.f97280o = (xs1) ni.a(wn0Var);
        this.f97281p = looper == null ? null : ib3.a(looper, (Handler.Callback) this);
        this.f97279n = (vs1) ni.a(us1Var);
        this.f97282q = new ws1();
        this.f97287v = -9223372036854775807L;
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        ((us1) this.f97279n).getClass();
        String str = mx0Var.f92610m;
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return ro.a(mx0Var.F == 0 ? 4 : 2, 0, 0);
        }
        return ro.a(0, 0, 0);
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f97284s && this.f97288w == null) {
                this.f97282q.b();
                nx0 nx0Var = this.f94536c;
                nx0Var.f93034a = null;
                nx0Var.f93035b = null;
                int iA = a(nx0Var, this.f97282q, 0);
                if (iA == -4) {
                    if (this.f97282q.b(4)) {
                        this.f97284s = true;
                    } else {
                        ws1 ws1Var = this.f97282q;
                        ws1Var.f96484j = this.f97286u;
                        ws1Var.c();
                        dz2 dz2Var = this.f97283r;
                        int i10 = ib3.f90737a;
                        ts1 ts1VarA = dz2Var.a(this.f97282q);
                        if (ts1VarA != null) {
                            ArrayList arrayList = new ArrayList(ts1VarA.f95344b.length);
                            a(ts1VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f97288w = new ts1(arrayList);
                                this.f97287v = this.f97282q.f94751f;
                            }
                        }
                    }
                } else if (iA == -5) {
                    mx0 mx0Var = nx0Var.f93035b;
                    mx0Var.getClass();
                    this.f97286u = mx0Var.f92614q;
                }
            }
            ts1 ts1Var = this.f97288w;
            if (ts1Var != null && this.f97287v <= j10) {
                Handler handler = this.f97281p;
                if (handler != null) {
                    handler.obtainMessage(0, ts1Var).sendToTarget();
                } else {
                    ((wn0) this.f97280o).a(ts1Var);
                }
                this.f97288w = null;
                this.f97287v = -9223372036854775807L;
                z10 = true;
            }
            if (this.f97284s && this.f97288w == null) {
                this.f97285t = true;
            }
        } while (z10);
    }

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        this.f97288w = null;
        this.f97287v = -9223372036854775807L;
        this.f97284s = false;
        this.f97285t = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.ts1 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            yads.ss1[] r1 = r6.f95344b
            int r2 = r1.length
            if (r0 >= r2) goto L7f
            r1 = r1[r0]
            yads.mx0 r1 = r1.a()
            if (r1 == 0) goto L75
            yads.vs1 r2 = r5.f97279n
            yads.us1 r2 = (yads.us1) r2
            r2.getClass()
            java.lang.String r2 = r1.f92610m
            java.lang.String r3 = "application/id3"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-emsg"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-scte35"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-icy"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/vnd.dvb.ait"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L75
        L3f:
            yads.vs1 r2 = r5.f97279n
            yads.us1 r2 = (yads.us1) r2
            yads.dz2 r1 = r2.a(r1)
            yads.ss1[] r2 = r6.f95344b
            r2 = r2[r0]
            byte[] r2 = r2.b()
            r2.getClass()
            yads.ws1 r3 = r5.f97282q
            r3.b()
            yads.ws1 r3 = r5.f97282q
            int r4 = r2.length
            r3.c(r4)
            yads.ws1 r3 = r5.f97282q
            java.nio.ByteBuffer r3 = r3.f94749d
            r3.put(r2)
            yads.ws1 r2 = r5.f97282q
            r2.c()
            yads.ws1 r2 = r5.f97282q
            yads.ts1 r1 = r1.a(r2)
            if (r1 == 0) goto L7c
            r5.a(r1, r7)
            goto L7c
        L75:
            yads.ss1[] r1 = r6.f95344b
            r1 = r1[r0]
            r7.add(r1)
        L7c:
            int r0 = r0 + 1
            goto L1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ys1.a(yads.ts1, java.util.ArrayList):void");
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f97283r = ((us1) this.f97279n).a(mx0VarArr[0]);
    }

    @Override // yads.ro
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f97285t;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f97288w = null;
        this.f97287v = -9223372036854775807L;
        this.f97283r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((wn0) this.f97280o).a((ts1) message.obj);
        return true;
    }
}
