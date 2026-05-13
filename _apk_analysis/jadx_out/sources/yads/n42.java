package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q42 f92735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry1 f92736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(q42 q42Var, ry1 ry1Var, hn.c cVar) {
        super(2, cVar);
        this.f92735c = q42Var;
        this.f92736d = ry1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new n42(this.f92735c, this.f92736d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new n42(this.f92735c, this.f92736d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.n42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
