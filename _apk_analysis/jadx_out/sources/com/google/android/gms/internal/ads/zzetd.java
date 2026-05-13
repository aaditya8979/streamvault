package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetd implements zzfax {
    private final c8.i zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzetd(c8.i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = iVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final c8.i zza() {
        c8.i iVar = this.zza;
        zzetc zzetcVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ c8.i zza(Object obj) {
                return zzgzo.zza(new zzete((String) obj));
            }
        };
        Executor executor = this.zzb;
        c8.i iVarZzj = zzgzo.zzj(iVar, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            iVarZzj = zzgzo.zzi(iVarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(iVarZzj, Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzetb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ c8.i zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgzo.zza(new zzete(Integer.toString(17))) : zzgzo.zza(new zzete(null));
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }
}
