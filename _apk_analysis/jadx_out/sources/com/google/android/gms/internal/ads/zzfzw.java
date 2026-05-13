package com.google.android.gms.internal.ads;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfzw extends SuspendLambda implements p {
    public int zza;
    public final /* synthetic */ zzgaf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzw(zzgaf zzgafVar, hn.c cVar) {
        super(2, cVar);
        this.zzb = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new zzfzw(this.zzb, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
        return ((zzfzw) create((l0) obj, (hn.c) obj2)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.zza;
        kotlin.c.b(obj);
        if (i10 == 0) {
            zzgaf zzgafVar = this.zzb;
            this.zza = 1;
            if (zzgafVar.zzn(this) == objG) {
                return objG;
            }
        }
        return r.f5635a;
    }
}
