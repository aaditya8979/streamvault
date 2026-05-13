package com.google.android.gms.internal.ads;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfzl extends SuspendLambda implements p {
    public /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(String str, hn.c cVar) {
        super(2, cVar);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, cVar);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
        return ((zzfzl) create((zzfyy) obj, (hn.c) obj2)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zzfzaVarZza.zzd(zzfzaVarZza.zzb(), this.zzb);
        return zzfzaVarZza.zza();
    }
}
