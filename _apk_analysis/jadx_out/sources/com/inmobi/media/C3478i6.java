package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3478i6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3552l6 f27339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3376e6 f27340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3478i6(C3552l6 c3552l6, C3376e6 c3376e6, hn.c cVar) {
        super(2, cVar);
        this.f27339b = c3552l6;
        this.f27340c = c3376e6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3478i6(this.f27339b, this.f27340c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3478i6(this.f27339b, this.f27340c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27338a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AbstractC3351d6 abstractC3351d6 = this.f27339b.f27536b;
            ArrayList arrayList = this.f27340c.f27092a;
            this.f27338a = 1;
            if (abstractC3351d6.a(arrayList, this) == objG) {
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
