package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll2 f95195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj2 f95196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc3 f95197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc3 f95198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ql3 f95199e;

    public tf3(Context context, je3 je3Var, ek3 ek3Var, jg3 jg3Var, zj3 zj3Var, hf3 hf3Var, af3 af3Var) {
        this.f95195a = new ll2(zj3Var);
        this.f95196b = new rj2(context, je3Var);
        this.f95197c = new jc3(je3Var, ek3Var, zj3Var, af3Var);
        this.f95198d = new uc3(ek3Var, zj3Var, hf3Var);
        this.f95199e = new ql3(je3Var, ek3Var, jg3Var, zj3Var, af3Var);
    }

    public final void a(rf3 rf3Var, boolean z10) {
        if (!z10) {
            cn.b0.G(rf3Var.f94432a, new qf3[]{this.f95197c});
        } else {
            cn.b0.G(rf3Var.f94432a, new qf3[]{this.f95195a, this.f95196b, this.f95198d, this.f95197c, this.f95199e});
            cn.b0.G(rf3Var.f94433b, new sf3[]{this.f95199e});
        }
    }
}
