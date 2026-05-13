package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgbk implements zzikp {
    public final /* synthetic */ zzgbl zza;

    public zzgbk(zzgbl zzgblVar) {
        Objects.requireNonNull(zzgblVar);
        this.zza = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgbs(this.zza.zza(), null);
    }
}
