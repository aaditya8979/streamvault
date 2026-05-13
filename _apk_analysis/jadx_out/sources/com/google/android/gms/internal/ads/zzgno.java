package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgno implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    public zzgno(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final c8.i zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        }, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x0040, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:13:0x0019, B:15:0x0022, B:17:0x0026, B:19:0x002f, B:21:0x0033), top: B:31:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "ntc"
            r4.put(r1, r0)
            monitor-enter(r3)
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L33
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L19
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            r0 = 2
            goto L36
        L19:
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L40
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L26
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            r0 = 1
            goto L36
        L26:
            android.net.NetworkCapabilities r0 = r3.zzc     // Catch: java.lang.Throwable -> L40
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            r0 = 0
            goto L36
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            r0 = -1
        L36:
            java.lang.String r2 = "nt"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            return
        L40:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            throw r4
        L43:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgno.zzb(java.util.Map):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }

    public final /* synthetic */ void zze() {
        zzgnm zzgnmVar = new zzgnm(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgnmVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }
}
