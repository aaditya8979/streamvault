package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgbq implements zzikp {
    public final /* synthetic */ zzgbr zza;

    public zzgbq(zzgbr zzgbrVar) {
        Objects.requireNonNull(zzgbrVar);
        this.zza = zzgbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbr zzgbrVar = this.zza;
        return new zzgbu(zzgbrVar.zzb(), zzgbrVar.zzc(), null);
    }
}
