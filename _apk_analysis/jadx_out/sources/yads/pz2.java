package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pz2 extends s63 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f93842h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f93844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fm1 f93846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yl1 f93847g;

    static {
        vl1 vl1Var = new vl1();
        List listEmptyList = Collections.emptyList();
        sm2 sm2Var = sm2.f94878f;
        cm1 cm1Var = cm1.f88503d;
        Uri uri = Uri.EMPTY;
        if (vl1Var.f96127b != null && vl1Var.f96126a == null) {
            throw new IllegalStateException();
        }
        if (uri != null) {
            new am1(uri, null, vl1Var.f96126a != null ? new wl1(vl1Var) : null, listEmptyList, null, sm2Var, null);
        }
        jm1 jm1Var = jm1.H;
    }

    public pz2(long j10, long j11, boolean z10, fm1 fm1Var, yl1 yl1Var) {
        this.f93843c = j10;
        this.f93844d = j11;
        this.f93845e = z10;
        this.f93846f = (fm1) ni.a(fm1Var);
        this.f93847g = yl1Var;
    }

    public pz2(long j10, long j11, boolean z10, boolean z11, fm1 fm1Var) {
        this(j10, j11, z10, fm1Var, z11 ? fm1Var.f89626d : null);
    }

    @Override // yads.s63
    public final int a() {
        return 1;
    }

    @Override // yads.s63
    public final int a(Object obj) {
        return f93842h.equals(obj) ? 0 : -1;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        ni.a(i10, 1);
        return f93842h;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        ni.a(i10, 1);
        Object obj = z10 ? f93842h : null;
        long j10 = this.f93843c;
        p63Var.getClass();
        return p63Var.a(null, obj, 0, j10, 0L, e6.f89106h, false);
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        ni.a(i10, 1);
        return r63Var.a(r63.f94295s, this.f93846f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f93845e, false, this.f93847g, 0L, this.f93844d, 0, 0, 0L);
    }

    @Override // yads.s63
    public final int b() {
        return 1;
    }
}
