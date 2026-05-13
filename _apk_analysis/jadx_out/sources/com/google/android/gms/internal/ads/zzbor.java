package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbor implements com.google.android.gms.ads.internal.overlay.zzaa {
    public final /* synthetic */ zzbou zza;

    public zzbor(zzbou zzbouVar) {
        Objects.requireNonNull(zzbouVar);
        this.zza = zzbouVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i10) {
        this.zza.zzg(i10);
    }
}
