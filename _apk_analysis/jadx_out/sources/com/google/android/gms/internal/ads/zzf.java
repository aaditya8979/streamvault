package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzf implements zzbb {
    public final zzbe zza = new zzbe();

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        return zzh() == 3 && zzk() && zzi() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j10) {
        zzc(zzs(), j10, 5, false);
    }

    public abstract void zzc(int i10, long j10, int i11, boolean z10);
}
