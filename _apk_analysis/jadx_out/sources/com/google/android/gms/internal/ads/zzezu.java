package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzezu implements zzfax {
    private final String zza;
    private final int zzb;

    public zzezu(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final c8.i zza() {
        return zzgzo.zza(new zzezv(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 31;
    }
}
