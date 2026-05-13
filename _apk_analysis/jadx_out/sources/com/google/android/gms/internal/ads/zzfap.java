package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfap implements zzfax {
    private final boolean zza;

    public zzfap(@Nullable zzfgn zzfgnVar) {
        this.zza = zzfgnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final c8.i zza() {
        return zzgzo.zza(new zzfao(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 36;
    }
}
