package yads;

import yads.ov2;

/* JADX INFO: loaded from: classes3.dex */
public final class ov2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv2 f93344a;

    public ov2(qv2 qv2Var) {
        this.f93344a = qv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(yads.qv2 r28) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ov2.a(yads.qv2):void");
    }

    @Override // yads.s42
    public final void a(l4 l4Var) {
        qv2 qv2Var = this.f93344a;
        if (qv2Var.f94179o) {
            return;
        }
        qv2Var.f94177m = null;
        qv2Var.f94178n = null;
        qv2Var.f94165a.b(l4Var);
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        final qv2 qv2Var = this.f93344a;
        if (qv2Var.f94179o) {
            return;
        }
        qv2Var.f94178n = w02Var;
        qv2Var.f94171g.post(new Runnable() { // from class: bt.y7
            @Override // java.lang.Runnable
            public final void run() {
                ov2.a(qv2Var);
            }
        });
    }
}
