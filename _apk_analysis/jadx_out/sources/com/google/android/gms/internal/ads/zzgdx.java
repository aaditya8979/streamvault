package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgdx implements zzgyw {
    public final /* synthetic */ zzgec zza;

    public zzgdx(zzgec zzgecVar) {
        Objects.requireNonNull(zzgecVar);
        this.zza = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ c8.i zza(Object obj) throws Exception {
        zzgdv zzgdvVar = (zzgdv) obj;
        if (zzgdvVar != null) {
            return zzgzo.zza(zzgdvVar);
        }
        zzgec zzgecVar = this.zza;
        zzgecVar.zza().zzb(51);
        return zzgecVar.zzd(2);
    }
}
