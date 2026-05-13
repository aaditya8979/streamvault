package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f89479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry1 f89480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi2 f89481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(j42 j42Var, ry1 ry1Var, mi2 mi2Var, hn.c cVar) {
        super(2, cVar);
        this.f89479c = j42Var;
        this.f89480d = ry1Var;
        this.f89481e = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new f42(this.f89479c, this.f89480d, this.f89481e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((f42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
