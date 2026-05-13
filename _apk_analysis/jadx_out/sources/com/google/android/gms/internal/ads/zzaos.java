package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;

    @Nullable
    private final zzape zzf = new zzape(178, 128);

    @Nullable
    private final zzer zzc = new zzer();

    public zzaos(@Nullable zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = zzaghVarZzu;
        this.zzg = new zzaor(zzaghVarZzu);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r18) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaos.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z10) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
