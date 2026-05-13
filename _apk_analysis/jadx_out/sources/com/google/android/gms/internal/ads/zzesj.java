package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzesj implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzdmq zzd;
    public final /* synthetic */ zzesm zze;

    public zzesj(zzesm zzesmVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdmq zzdmqVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdmqVar;
        Objects.requireNonNull(zzesmVar);
        this.zze = zzesmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th2);
        }
        zzdmq zzdmqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdmqVar.zza().zzg(th2);
        zzdmqVar.zzb().zzdI(zzeVarZzg);
        zzesm zzesmVar = this.zze;
        zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdI(zzeVarZzg);
            }
        });
        zzfkh.zza(zzeVarZzg.zza, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
            zzfor zzforVarZzg = zzesmVar.zzg();
            zzfoe zzfoeVar = this.zzc;
            zzfoeVar.zzh(zzeVarZzg);
            zzfoeVar.zzj(th2);
            zzfoeVar.zzd(false);
            zzforVarZzg.zzb(zzfoeVar.zzm());
            return;
        }
        zzfooVar.zzf(zzeVarZzg);
        zzfoe zzfoeVar2 = this.zzc;
        zzfoeVar2.zzj(th2);
        zzfoeVar2.zzd(false);
        zzfooVar.zza(zzfoeVar2);
        zzfooVar.zzh();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x003d, B:10:0x0041, B:12:0x0085, B:11:0x0061), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzesm r0 = r5.zze
            com.google.android.gms.internal.ads.zzcwf r6 = (com.google.android.gms.internal.ads.zzcwf) r6
            monitor-enter(r0)
            if (r6 == 0) goto La
            r6.zzt()     // Catch: java.lang.Throwable -> L87
        La:
            com.google.android.gms.internal.ads.zzdev r1 = r6.zzq()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzesc r2 = r0.zzf()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzerp r2 = r2.zzc()     // Catch: java.lang.Throwable -> L87
            r1.zza(r2)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzese r1 = r5.zza     // Catch: java.lang.Throwable -> L87
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzcma r1 = r0.zze()     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.Executor r1 = r1.zzb()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzesi r2 = new com.google.android.gms.internal.ads.zzesi     // Catch: java.lang.Throwable -> L87
            r2.<init>()     // Catch: java.lang.Throwable -> L87
            r1.execute(r2)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzc     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L87
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L87
            r2 = 1
            if (r1 == 0) goto L61
            com.google.android.gms.internal.ads.zzfoo r1 = r5.zzb     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L61
            com.google.android.gms.internal.ads.zzfjc r3 = r6.zzr()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfjb r3 = r3.zzb     // Catch: java.lang.Throwable -> L87
            r1.zze(r3)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L87
            r1.zzg(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfoe r6 = r5.zzc     // Catch: java.lang.Throwable -> L87
            r6.zzd(r2)     // Catch: java.lang.Throwable -> L87
            r1.zza(r6)     // Catch: java.lang.Throwable -> L87
            r1.zzh()     // Catch: java.lang.Throwable -> L87
            goto L85
        L61:
            com.google.android.gms.internal.ads.zzfor r1 = r0.zzg()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfoe r3 = r5.zzc     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfjc r4 = r6.zzr()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfjb r4 = r4.zzb     // Catch: java.lang.Throwable -> L87
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzday r6 = r6.zzn()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.zze()     // Catch: java.lang.Throwable -> L87
            r3.zzi(r6)     // Catch: java.lang.Throwable -> L87
            r3.zzd(r2)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfoh r6 = r3.zzm()     // Catch: java.lang.Throwable -> L87
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return
        L87:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesj.zzb(java.lang.Object):void");
    }
}
