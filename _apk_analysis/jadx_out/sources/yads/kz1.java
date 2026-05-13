package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kz1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f91806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d12 f91807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xz1 f91808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hz1 f91809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z30 f91810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz1 f91811g;

    public kz1(mz1 mz1Var, v9 v9Var, d12 d12Var, xz1 xz1Var, hz1 hz1Var, aq2 aq2Var) {
        this.f91811g = mz1Var;
        this.f91806b = v9Var;
        this.f91807c = d12Var;
        this.f91808d = xz1Var;
        this.f91809e = hz1Var;
        this.f91810f = new a40(mz1Var.f92663e, mz1Var.f92659a, aq2Var.b(v9Var, mz1Var.f92660b)).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d12 d12Var = this.f91807c;
            if (d12Var == null) {
                this.f91809e.a(h9.f90284c);
            } else if (d12Var.f88690a.isEmpty()) {
                this.f91809e.a(h9.f90289h);
            } else {
                d12 d12Var2 = this.f91807c;
                v9 v9Var = this.f91806b;
                mz1 mz1Var = this.f91811g;
                ry1 ry1Var = new ry1(v9Var, mz1Var.f92660b, d12Var2);
                hz1 hz1Var = this.f91809e;
                w5 w5Var = mz1Var.f92661c;
                jz1 jz1Var = new jz1(this, hz1Var, w5Var);
                w5Var.a(v5.f95935n, null);
                mz1 mz1Var2 = this.f91811g;
                q42 q42Var = mz1Var2.f92665g;
                Context context = mz1Var2.f92663e;
                d4 d4Var = mz1Var2.f92660b;
                z30 z30Var = this.f91810f;
                hz1 hz1Var2 = this.f91809e;
                q42Var.getClass();
                p000do.i.d(q42Var.f93885a, new r42(hz1Var2), null, new p42(context, hz1Var2, jz1Var, q42Var, d4Var, ry1Var, z30Var, null), 2, null);
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            this.f91809e.a(h9.f90284c);
        }
    }
}
