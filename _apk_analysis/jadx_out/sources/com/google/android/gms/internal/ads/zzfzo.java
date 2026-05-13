package com.google.android.gms.internal.ads;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfzo extends SuspendLambda implements p {
    public zzfzo(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new zzfzo(cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
        return ((zzfzo) create((zzfyy) obj, (hn.c) obj2)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        tn.p.j(zzfyyVarZzd, "getDefaultInstance(...)");
        return zzfyyVarZzd;
    }
}
