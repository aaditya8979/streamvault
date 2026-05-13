package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhal extends zzgzv {
    public final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    public zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgyv zzgyvVar = this.zzb;
        c8.i iVarZza = zzgyvVar.zza();
        zzgrc.zzl(iVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return iVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((c8.i) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
