package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzgyl extends zzgyn {
    public zzgyl(c8.i iVar, zzgyw zzgywVar) {
        super(iVar, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* synthetic */ void zze(Object obj) {
        zzk((c8.i) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        c8.i iVarZza = zzgywVar.zza(obj2);
        zzgrc.zzl(iVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return iVarZza;
    }
}
