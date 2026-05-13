package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class G7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f25515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rl f25516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(N7 n72, Rl rl2, hn.c cVar) {
        super(2, cVar);
        this.f25515b = n72;
        this.f25516c = rl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new G7(this.f25515b, this.f25516c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new G7(this.f25515b, this.f25516c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25514a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.k kVar = this.f25515b.f26004m;
            Rl rl2 = this.f25516c;
            this.f25514a = 1;
            if (kVar.emit(rl2, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
