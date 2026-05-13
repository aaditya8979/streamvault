package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgj {
    public final zzguf zza;
    public final zzgc zzb;

    @Nullable
    public final zzge zzc;

    @Nullable
    public final zzgi zzd;

    public zzgj(zzga zzgaVar, @Nullable List list, zzgc zzgcVar, @Nullable zzge zzgeVar, @Nullable zzgi zzgiVar) {
        this.zza = list != null ? zzguf.zzq(list) : zzguf.zzi();
        this.zzb = zzgcVar;
        this.zzc = zzgeVar;
        this.zzd = zzgiVar;
    }
}
