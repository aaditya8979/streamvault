package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzenp implements zzgzl {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzfiu zzb;
    public final /* synthetic */ zzfir zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzfqg zze;
    public final /* synthetic */ zzfjc zzf;
    public final /* synthetic */ zzenr zzg;

    public zzenp(zzenr zzenrVar, long j10, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j10;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r6
      0x001a: PHI (r6v9 int) = (r6v0 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v10 int) binds: [B:17:0x0031, B:22:0x004c, B:24:0x0050, B:26:0x0059, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenp.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            if (zzenrVar.zzn()) {
                zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            if (zzenrVar.zzp()) {
                return;
            }
            zzfir zzfirVar = this.zzc;
            if (zzenrVar.zzi(zzfirVar)) {
                ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = jElapsedRealtime;
            } else {
                zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, jElapsedRealtime, null));
            }
            zzenrVar.zzo().zzd(zzfirVar, jElapsedRealtime, null);
        }
    }
}
