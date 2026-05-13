package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Zl extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f26721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3643om c3643om, hn.c cVar) {
        super(2, cVar);
        this.f26721a = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Zl(this.f26721a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Zl(this.f26721a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        ViewGroup viewGroup = this.f26721a.f27813j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return bn.r.f5635a;
    }
}
