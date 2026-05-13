package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wj1 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f96403b;

    public wj1(int i10, qj1 qj1Var) {
        this.f96402a = i10;
        this.f96403b = qj1Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        int iC = kl3.c(context);
        int i10 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f96403b.a();
        return i10 - (fA != null ? vn.c.d(fA.floatValue() * ((float) iC)) : 0) >= this.f96402a;
    }
}
