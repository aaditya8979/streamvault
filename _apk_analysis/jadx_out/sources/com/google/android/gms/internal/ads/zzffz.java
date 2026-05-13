package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzffz implements zzfgj {

    @Nullable
    private zzdam zza;

    @Override // com.google.android.gms.internal.ads.zzfgj
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zza;
    }

    public final synchronized c8.i zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable zzdam zzdamVar) {
        zzcxj zzcxjVarZza;
        if (zzdamVar != null) {
            this.zza = zzdamVar;
        } else {
            this.zza = (zzdam) zzfgiVar.zza(zzfgkVar.zzb).zzh();
        }
        zzcxjVarZza = this.zza.zza();
        return zzcxjVarZza.zzc(zzcxjVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ c8.i zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
