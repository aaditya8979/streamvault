package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzgye extends zzgyg {
    public zzgye(c8.i iVar, Class cls, zzgyw zzgywVar) {
        super(iVar, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ void zze(Object obj) {
        zzk((c8.i) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        c8.i iVarZza = zzgywVar.zza(th2);
        zzgrc.zzl(iVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return iVarZza;
    }
}
