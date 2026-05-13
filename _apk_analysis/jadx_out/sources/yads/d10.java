package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class d10 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g10 f88686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g9 f88687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(g10 g10Var, g9 g9Var, hn.c cVar) {
        super(2, cVar);
        this.f88686b = g10Var;
        this.f88687c = g9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new d10(this.f88686b, this.f88687c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new d10(this.f88686b, this.f88687c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        g10 g10Var = this.f88686b;
        b12 b12Var = new b12(g10Var.f89763b, ((iu3) g10Var.f89762a).a());
        o02 o02Var = this.f88686b.f89765d;
        g9 g9Var = this.f88687c;
        v42 v42Var = v42.f95918c;
        o02Var.getClass();
        p02 p02Var = new p02(o02Var.f93062a, o02Var.f93063b, new a12(g9Var, v42Var, b12Var, 1), o02Var, o02Var.f93064c, 464);
        o02Var.f93065d.add(p02Var);
        c10 c10Var = o02Var.f93067f;
        v02 v02Var = p02Var.f93377b.f92201x;
        v02Var.f95901d = c10Var;
        v02Var.f95900c.a(c10Var, null, null);
        p02Var.a();
        return bn.r.f5635a;
    }
}
