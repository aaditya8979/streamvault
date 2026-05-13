package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mx2 implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f92625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pb2 f92626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f92627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qr f92628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nr f92629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yr f92630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f92631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f92632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f92633i;

    public mx2(fm1 fm1Var, e30 e30Var, qr qrVar, Executor executor) {
        ni.a(fm1Var.f89625c);
        this.f92625a = a(fm1Var.f89625c.f97653a);
        this.f92626b = e30Var;
        this.f92627c = new ArrayList(fm1Var.f89625c.f97656d);
        this.f92628d = qrVar;
        this.f92631g = executor;
        this.f92629e = (nr) ni.a(qrVar.b());
        this.f92630f = qrVar.c();
        this.f92632h = new ArrayList();
    }

    public static u30 a(Uri uri) {
        Map mapEmptyMap = Collections.emptyMap();
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
    }

    private void a(int i10) {
        synchronized (this.f92632h) {
            this.f92632h.remove(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.util.ArrayList r16, yads.yr r17) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mx2.a(java.util.ArrayList, yads.yr):void");
    }

    private void a(as2 as2Var) {
        synchronized (this.f92632h) {
            if (this.f92633i) {
                throw new InterruptedException();
            }
            this.f92632h.add(as2Var);
        }
    }

    private void b(as2 as2Var) {
        synchronized (this.f92632h) {
            this.f92632h.remove(as2Var);
        }
    }

    public final Object a(as2 as2Var, boolean z10) throws ExecutionException, InterruptedException, IOException {
        if (z10) {
            as2Var.run();
            try {
                as2Var.f87795c.a();
                return as2Var.c();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i10 = ib3.f90737a;
                throw e10;
            }
        }
        if (this.f92633i) {
            throw new InterruptedException();
        }
        a(as2Var);
        this.f92631g.execute(as2Var);
        try {
            try {
                as2Var.f87795c.a();
                Object objC = as2Var.c();
                as2Var.f87795c.b();
                synchronized (this.f92632h) {
                    this.f92632h.remove(as2Var);
                }
                return objC;
            } catch (ExecutionException e11) {
                Throwable cause2 = e11.getCause();
                cause2.getClass();
                if (cause2 instanceof IOException) {
                    throw ((IOException) cause2);
                }
                int i11 = ib3.f90737a;
                throw e11;
            }
        } catch (Throwable th2) {
            as2Var.f87795c.b();
            b(as2Var);
            throw th2;
        }
    }

    public abstract ArrayList a(rr rrVar, dv0 dv0Var, boolean z10);

    /* JADX WARN: Removed duplicated region for block: B:75:0x018d A[LOOP:1: B:73:0x0185->B:75:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6 A[LOOP:2: B:77:0x01a4->B:78:0x01a6, LOOP_END] */
    @Override // yads.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.qj0 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mx2.a(yads.qj0):void");
    }

    @Override // yads.rj0
    public final void cancel() {
        synchronized (this.f92632h) {
            this.f92633i = true;
            for (int i10 = 0; i10 < this.f92632h.size(); i10++) {
                ((as2) this.f92632h.get(i10)).cancel(true);
            }
        }
    }

    @Override // yads.rj0
    public final void remove() {
        rr rrVarA = this.f92628d.a(null, 1, -1000);
        try {
            try {
                ArrayList arrayListA = a(rrVarA, (dv0) a((as2) new ix2(this, rrVarA, this.f92625a), true), true);
                for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                    ((vy2) this.f92629e).c(this.f92630f.a(((kx2) arrayListA.get(i10)).f91800c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((vy2) this.f92629e).c(this.f92630f.a(this.f92625a));
                return;
            } catch (Exception unused2) {
            }
            ((vy2) this.f92629e).c(this.f92630f.a(this.f92625a));
        } catch (Throwable th2) {
            ((vy2) this.f92629e).c(this.f92630f.a(this.f92625a));
            throw th2;
        }
    }
}
