package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdwj implements zzikg {
    private final zzikp zza;

    private zzdwj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzdwj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdwj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue() ? Collections.singleton(new zzdje(((zzdxc) this.zza).zzb(), zzgzyVarZzc)) : Collections.emptySet();
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
