package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeur implements zzfax {
    private final zzgzy zza;
    private final VersionInfoParcel zzb;

    public zzeur(VersionInfoParcel versionInfoParcel, zzgzy zzgzyVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final c8.i zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzeus zzc() {
        return zzeus.zzc(this.zzb);
    }
}
