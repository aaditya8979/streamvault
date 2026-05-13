package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaak {
    public final int zza;
    public final zzmo[] zzb;
    public final zzaac[] zzc;
    public final zzbn zzd;

    @Nullable
    public final Object zze;

    public zzaak(zzmo[] zzmoVarArr, zzaac[] zzaacVarArr, zzbn zzbnVar, @Nullable Object obj) {
        int length = zzmoVarArr.length;
        zzgrc.zza(length == zzaacVarArr.length);
        this.zzb = zzmoVarArr;
        this.zzc = (zzaac[]) zzaacVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i10) {
        return this.zzb[i10] != null;
    }

    public final boolean zzb(@Nullable zzaak zzaakVar, int i10) {
        return zzaakVar != null && Objects.equals(this.zzb[i10], zzaakVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzaakVar.zzc[i10]);
    }
}
