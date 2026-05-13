package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a63 extends ro implements Handler.Callback {
    public int A;
    public long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f87595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z53 f87596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v43 f87597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nx0 f87598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f87599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f87600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f87601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f87602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public mx0 f87603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s43 f87604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public w43 f87605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x43 f87606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x43 f87607z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a63(wn0 wn0Var, Looper looper) {
        super(3);
        u43 u43Var = v43.f95923a;
        this.f87596o = (z53) ni.a(wn0Var);
        this.f87595n = looper == null ? null : ib3.a(looper, (Handler.Callback) this);
        this.f87597p = u43Var;
        this.f87598q = new nx0();
        this.B = -9223372036854775807L;
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        if (((u43) this.f87597p).b(mx0Var)) {
            return ro.a(mx0Var.F == 0 ? 4 : 2, 0, 0);
        }
        return ht1.e(mx0Var.f92610m) ? ro.a(1, 0, 0) : ro.a(0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    @Override // yads.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.a63.a(long, long):void");
    }

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f87595n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            ((wn0) this.f87596o).a(listEmptyList);
            ((wn0) this.f87596o).a(new q20(listEmptyList));
        }
        this.f87599r = false;
        this.f87600s = false;
        this.B = -9223372036854775807L;
        if (this.f87602u != 0) {
            p();
            n();
        } else {
            o();
            s43 s43Var = this.f87604w;
            s43Var.getClass();
            s43Var.flush();
        }
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f87603v = mx0VarArr[0];
        if (this.f87604w != null) {
            this.f87602u = 1;
        } else {
            n();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "TextRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f87600s;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f87603v = null;
        this.B = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f87595n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            ((wn0) this.f87596o).a(listEmptyList);
            ((wn0) this.f87596o).a(new q20(listEmptyList));
        }
        p();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        ((wn0) this.f87596o).a(list);
        ((wn0) this.f87596o).a(new q20(list));
        return true;
    }

    public final long m() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.f87606y.getClass();
        if (this.A >= this.f87606y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f87606y.a(this.A);
    }

    public final void n() {
        this.f87601t = true;
        v43 v43Var = this.f87597p;
        mx0 mx0Var = this.f87603v;
        mx0Var.getClass();
        this.f87604w = ((u43) v43Var).a(mx0Var);
    }

    public final void o() {
        this.f87605x = null;
        this.A = -1;
        x43 x43Var = this.f87606y;
        if (x43Var != null) {
            x43Var.b();
            this.f87606y = null;
        }
        x43 x43Var2 = this.f87607z;
        if (x43Var2 != null) {
            x43Var2.b();
            this.f87607z = null;
        }
    }

    public final void p() {
        o();
        s43 s43Var = this.f87604w;
        s43Var.getClass();
        s43Var.release();
        this.f87604w = null;
        this.f87602u = 0;
    }
}
