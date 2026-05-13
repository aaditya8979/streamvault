package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class it2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v5 f90976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jt2 f90977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dp f90978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f90980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jt2 f90981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dp f90982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j00 f90983i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it2(jt2 jt2Var, dp dpVar, j00 j00Var, hn.c cVar) {
        super(2, cVar);
        this.f90981g = jt2Var;
        this.f90982h = dpVar;
        this.f90983i = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        it2 it2Var = new it2(this.f90981g, this.f90982h, this.f90983i, cVar);
        it2Var.f90980f = obj;
        return it2Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((it2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(1:(1:(3:10|73|74)(2:8|9))(1:11))(2:12|(1:14)(1:15))|16|79|17|(4:20|(4:23|(2:36|83)(3:27|28|(2:77|34)(2:33|84))|37|21)|82|18)|81|38|39|40|(1:42)(1:43)|(1:45)|(1:47)(1:48)|(1:50)|51|(1:53)(1:54)|55|(1:57)(1:58)|(1:60)|61|(4:63|(1:65)(1:66)|67|(1:69))(2:70|(1:72))|73|74) */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.it2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
