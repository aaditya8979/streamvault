package com.google.android.gms.internal.ads;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfzs extends SuspendLambda implements p {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzs(zzfyu zzfyuVar, hn.c cVar) {
        super(2, cVar);
        this.zzb = zzfyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, cVar);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (hn.c) obj2)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzievVarZzb = zzfzaVarZza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String strZza = zzfyuVar.zza();
        tn.p.j(strZza, "getGwsQueryId(...)");
        zzfzaVarZza.zzc(zzievVarZzb, strZza, zzfyuVar);
        return zzfzaVarZza.zza();
    }
}
