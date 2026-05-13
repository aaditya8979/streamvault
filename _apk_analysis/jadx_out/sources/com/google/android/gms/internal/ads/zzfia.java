package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzfia implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzfid zzd;
    public final /* synthetic */ zzfie zze;

    public zzfia(zzfie zzfieVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfid zzfidVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfidVar;
        Objects.requireNonNull(zzfieVar);
        this.zze = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th2);
        }
        zzfie zzfieVar = this.zze;
        zzdue zzdueVar = (zzdue) zzfieVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdueVar == null ? zzfkm.zzb(th2, null) : zzdueVar.zza().zzg(th2);
        synchronized (zzfieVar) {
            if (zzdueVar != null) {
                zzdueVar.zze().zzdI(zzeVarZzb);
                zzfieVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzdI(zzeVarZzb);
                    }
                });
            } else {
                zzfieVar.zzg().zzdI(zzeVarZzb);
                zzfieVar.zze(this.zzd).zzh().zza().zzd().zzo();
            }
            zzfkh.zza(zzeVarZzb.zza, th2, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzi = zzfieVar.zzi();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzeVarZzb);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzi.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzeVarZzb);
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzj(th2);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0043, B:10:0x0047, B:12:0x008b, B:11:0x0067), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzfie r0 = r5.zze
            com.google.android.gms.internal.ads.zzdtz r6 = (com.google.android.gms.internal.ads.zzdtz) r6
            monitor-enter(r0)
            if (r6 == 0) goto La
            r6.zzt()     // Catch: java.lang.Throwable -> L8d
        La:
            com.google.android.gms.internal.ads.zzdev r1 = r6.zzq()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfhv r2 = r0.zzg()     // Catch: java.lang.Throwable -> L8d
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzese r1 = r5.zza     // Catch: java.lang.Throwable -> L8d
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.Executor r1 = r0.zzf()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfhv r2 = r0.zzg()     // Catch: java.lang.Throwable -> L8d
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfhy r3 = new com.google.android.gms.internal.ads.zzfhy     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            r1.execute(r3)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfhv r1 = r0.zzg()     // Catch: java.lang.Throwable -> L8d
            r1.onAdMetadataChanged()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzc     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L8d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L8d
            r2 = 1
            if (r1 == 0) goto L67
            com.google.android.gms.internal.ads.zzfoo r1 = r5.zzb     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L67
            com.google.android.gms.internal.ads.zzfjc r3 = r6.zzr()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfjb r3 = r3.zzb     // Catch: java.lang.Throwable -> L8d
            r1.zze(r3)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L8d
            r1.zzg(r6)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfoe r6 = r5.zzc     // Catch: java.lang.Throwable -> L8d
            r6.zzd(r2)     // Catch: java.lang.Throwable -> L8d
            r1.zza(r6)     // Catch: java.lang.Throwable -> L8d
            r1.zzh()     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L67:
            com.google.android.gms.internal.ads.zzfor r1 = r0.zzi()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfoe r3 = r5.zzc     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfjc r4 = r6.zzr()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfjb r4 = r4.zzb     // Catch: java.lang.Throwable -> L8d
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L8d
            r3.zzi(r6)     // Catch: java.lang.Throwable -> L8d
            r3.zzd(r2)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfoh r6 = r3.zzm()     // Catch: java.lang.Throwable -> L8d
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L8d
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            return
        L8d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfia.zzb(java.lang.Object):void");
    }
}
