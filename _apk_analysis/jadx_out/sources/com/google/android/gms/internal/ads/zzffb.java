package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzffb implements zzgzl {
    public final /* synthetic */ zzfoo zza;
    public final /* synthetic */ zzfoe zzb;
    public final /* synthetic */ zzcvc zzc;
    public final /* synthetic */ zzfff zzd;

    public zzffb(zzfff zzfffVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzcvc zzcvcVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = zzcvcVar;
        Objects.requireNonNull(zzfffVar);
        this.zzd = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        zzfff zzfffVar = this.zzd;
        synchronized (zzfffVar) {
            zzcvc zzcvcVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcvcVar.zzc().zzg(th2);
            zzfffVar.zzs(zzeVarZzg);
            zzcvcVar.zzb().zzdI(zzeVarZzg);
            zzfkh.zza(zzeVarZzg.zza, th2, "BannerAdLoader.onFailure");
            if (zzfffVar.zzr()) {
                zzfffVar.zzn();
                zzfffVar.zzo().zzd(zzfffVar.zzq().zzc());
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzforVarZzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzh(zzeVarZzg);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzeVarZzg);
                zzfoe zzfoeVar2 = this.zzb;
                zzfoeVar2.zzj(th2);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzfff r0 = r5.zzd
            com.google.android.gms.internal.ads.zzctx r6 = (com.google.android.gms.internal.ads.zzctx) r6
            monitor-enter(r0)
            if (r6 == 0) goto La
            r6.zzt()     // Catch: java.lang.Throwable -> L6c
        La:
            boolean r1 = r0.zzr()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L13
            r0.zzc()     // Catch: java.lang.Throwable -> L6c
        L13:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzc     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6c
            r2 = 1
            if (r1 == 0) goto L46
            com.google.android.gms.internal.ads.zzfoo r1 = r5.zza     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L46
            com.google.android.gms.internal.ads.zzfjc r3 = r6.zzr()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfjb r3 = r3.zzb     // Catch: java.lang.Throwable -> L6c
            r1.zze(r3)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L6c
            r1.zzg(r6)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfoe r6 = r5.zzb     // Catch: java.lang.Throwable -> L6c
            r6.zzd(r2)     // Catch: java.lang.Throwable -> L6c
            r1.zza(r6)     // Catch: java.lang.Throwable -> L6c
            r1.zzh()     // Catch: java.lang.Throwable -> L6c
            goto L6a
        L46:
            com.google.android.gms.internal.ads.zzfor r1 = r0.zzp()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfoe r3 = r5.zzb     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfjc r4 = r6.zzr()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfjb r4 = r4.zzb     // Catch: java.lang.Throwable -> L6c
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L6c
            r3.zzi(r6)     // Catch: java.lang.Throwable -> L6c
            r3.zzd(r2)     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfoh r6 = r3.zzm()     // Catch: java.lang.Throwable -> L6c
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L6c
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffb.zzb(java.lang.Object):void");
    }
}
