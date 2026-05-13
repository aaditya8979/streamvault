package yads;

import kotlin.Result;

/* JADX INFO: loaded from: classes12.dex */
public final class nw1 implements fw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sw1 f93022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj1 f93023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ow1 f93024c;

    public nw1(sw1 sw1Var, oj1 oj1Var, ow1 ow1Var) {
        this.f93022a = sw1Var;
        this.f93023b = oj1Var;
        this.f93024c = ow1Var;
    }

    @Override // yads.fw1
    public final void a() {
        sw1 sw1Var = this.f93022a;
        ow1 ow1Var = this.f93024c;
        if (ow1Var.f93349a && ow1Var.f93350b.isActive()) {
            p000do.k kVar = ow1Var.f93350b;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
        }
    }

    @Override // yads.fw1
    public final void b() {
        ow1 ow1Var = this.f93024c;
        if (ow1Var.f93349a && ow1Var.f93350b.isActive()) {
            p000do.k kVar = ow1Var.f93350b;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
        }
    }
}
