package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbmr extends zzbly {
    public final /* synthetic */ zzbms zza;

    public /* synthetic */ zzbmr(zzbms zzbmsVar, byte[] bArr) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbms zzbmsVar = this.zza;
        zzbmsVar.zzc().zzb(zzbmsVar.zze(zzblmVar));
    }
}
