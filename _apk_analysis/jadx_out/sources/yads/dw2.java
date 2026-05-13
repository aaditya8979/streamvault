package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class dw2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f89000j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile dw2 f89001k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile nt2 f89002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f89003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f89004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89007f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89008g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f89009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89010i;

    public final nt2 a(Context context) {
        nt2 nt2VarA;
        nt2 nt2Var = this.f89002a;
        if (nt2Var != null) {
            return nt2Var;
        }
        synchronized (f89000j) {
            nt2 nt2Var2 = this.f89002a;
            if (nt2Var2 == null) {
                zy.f97832a.getClass();
                nt2VarA = ((cz) yy.a(context)).a();
                this.f89002a = nt2VarA;
            } else {
                nt2VarA = nt2Var2;
            }
        }
        return nt2VarA;
    }

    public final void a(Context context, nt2 nt2Var) {
        synchronized (f89000j) {
            this.f89002a = nt2Var;
            zy.f97832a.getClass();
            ((cz) yy.a(context)).a(nt2Var);
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (f89000j) {
            z10 = this.f89010i;
        }
        return z10;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (f89000j) {
            bool = this.f89004c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z10;
        synchronized (f89000j) {
            z10 = this.f89006e;
        }
        return z10;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f89000j) {
            bool = this.f89003b;
        }
        return bool;
    }
}
