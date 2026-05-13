package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class jy implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0[] f91418a;

    public jy(zf0... zf0VarArr) {
        this.f91418a = zf0VarArr;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        for (zf0 zf0Var : this.f91418a) {
            zf0Var.a(viewGroup);
        }
    }

    @Override // yads.zf0
    public final void c() {
        for (zf0 zf0Var : this.f91418a) {
            zf0Var.c();
        }
    }
}
