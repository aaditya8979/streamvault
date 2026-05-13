package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzfdx implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzfdy zzd;
    public final /* synthetic */ zzfeb zze;

    public zzfdx(zzfeb zzfebVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfdy zzfdyVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfdyVar;
        Objects.requireNonNull(zzfebVar);
        this.zze = zzfebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
        }
        zzfeb zzfebVar = this.zze;
        zzcth zzcthVar = (zzcth) zzfebVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcthVar == null ? zzfkm.zzb(th2, null) : zzcthVar.zza().zzg(th2);
        synchronized (zzfebVar) {
            zzfebVar.zzl(null);
            if (zzcthVar != null) {
                zzcthVar.zze().zzdI(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                    zzfebVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzi().zzdI(zzeVarZzb);
                        }
                    });
                }
            } else {
                zzfebVar.zzi().zzdI(zzeVarZzb);
                ((zzcth) zzfebVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzfkh.zza(zzeVarZzb.zza, th2, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzeVarZzb);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzk.zzb(zzfoeVar.zzm());
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzfeb r0 = r5.zze
            com.google.android.gms.internal.ads.zzcwf r6 = (com.google.android.gms.internal.ads.zzcwf) r6
            monitor-enter(r0)
            if (r6 == 0) goto La
            r6.zzt()     // Catch: java.lang.Throwable -> L89
        La:
            r1 = 0
            r0.zzl(r1)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzjx     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L89
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L2b
            com.google.android.gms.internal.ads.zzdev r1 = r6.zzq()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfer r2 = r0.zzi()     // Catch: java.lang.Throwable -> L89
            r1.zzc(r2)     // Catch: java.lang.Throwable -> L89
        L2b:
            com.google.android.gms.internal.ads.zzese r1 = r5.zza     // Catch: java.lang.Throwable -> L89
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzc     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L89
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L89
            r2 = 1
            if (r1 == 0) goto L63
            com.google.android.gms.internal.ads.zzfoo r1 = r5.zzb     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L63
            com.google.android.gms.internal.ads.zzfjc r3 = r6.zzr()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfjb r3 = r3.zzb     // Catch: java.lang.Throwable -> L89
            r1.zze(r3)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L89
            r1.zzg(r6)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfoe r6 = r5.zzc     // Catch: java.lang.Throwable -> L89
            r6.zzd(r2)     // Catch: java.lang.Throwable -> L89
            r1.zza(r6)     // Catch: java.lang.Throwable -> L89
            r1.zzh()     // Catch: java.lang.Throwable -> L89
            goto L87
        L63:
            com.google.android.gms.internal.ads.zzfor r1 = r0.zzk()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfoe r3 = r5.zzc     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfjc r4 = r6.zzr()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfjb r4 = r4.zzb     // Catch: java.lang.Throwable -> L89
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L89
            r3.zzi(r6)     // Catch: java.lang.Throwable -> L89
            r3.zzd(r2)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfoh r6 = r3.zzm()     // Catch: java.lang.Throwable -> L89
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L89
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdx.zzb(java.lang.Object):void");
    }
}
