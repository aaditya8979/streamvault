package com.inmobi.media;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3733sd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f28116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733sd(Dd dd2, hn.c cVar) {
        super(2, cVar);
        this.f28116a = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3733sd(this.f28116a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3733sd(this.f28116a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        int i10 = AbstractC3536kf.f27473a;
        Context applicationContext = this.f28116a.f28550a.f28472a.f27734b.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        return jn.a.a(AbstractC3536kf.a(applicationContext));
    }
}
