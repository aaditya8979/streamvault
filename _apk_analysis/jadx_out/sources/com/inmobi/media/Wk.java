package com.inmobi.media;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Wk extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(Context context, hn.c cVar) {
        super(2, cVar);
        this.f26559b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Wk(this.f26559b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Wk(this.f26559b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (com.inmobi.media.Wj.b(r18) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
