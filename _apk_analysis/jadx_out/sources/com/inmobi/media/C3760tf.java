package com.inmobi.media;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3760tf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Je f28187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3760tf(Je je2, hn.c cVar) {
        super(2, cVar);
        this.f28187b = je2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3760tf(this.f28187b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3760tf(this.f28187b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objG = in.a.g();
        int i10 = this.f28186a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3779u9 c3779u9 = (C3779u9) He.f25608c.getValue();
            Je je2 = this.f28187b;
            this.f28186a = 1;
            obj = c3779u9.f28245a.a(je2, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        Ne ne2 = (Ne) obj;
        if (!AbstractC3443gl.a(ne2)) {
            throw new IOException();
        }
        zn.i iVar = Se.f26314a;
        tn.p.k(ne2, "<this>");
        return ne2.d().string(bo.c.f5639b);
    }
}
