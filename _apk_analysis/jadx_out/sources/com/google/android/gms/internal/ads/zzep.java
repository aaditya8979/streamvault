package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzep {

    @Nullable
    private static zzep zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;

    @GuardedBy("lock")
    private int zze;

    @GuardedBy("lock")
    private boolean zzf;

    private zzep(final Context context) {
        Executor executorZza = zzdh.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzeo(this.zza, null), intentFilter);
            }
        });
    }

    public static synchronized zzep zza(Context context) {
        if (zza == null) {
            zza = new zzep(context);
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzel> copyOnWriteArrayList = this.zzc;
        for (zzel zzelVar : copyOnWriteArrayList) {
            if (zzelVar.zza()) {
                copyOnWriteArrayList.remove(zzelVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i10) {
        zzg();
        synchronized (this.zzd) {
            if (this.zzf && this.zze == i10) {
                return;
            }
            this.zzf = true;
            this.zze = i10;
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((zzel) it.next()).zzb();
            }
        }
    }

    public final void zzb(zzej zzejVar, Executor executor) {
        boolean z10;
        zzg();
        zzel zzelVar = new zzel(this, zzejVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzelVar);
            z10 = this.zzf;
        }
        if (z10) {
            zzelVar.zzb();
        }
    }

    public final int zzc() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzd(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 2
            r2 = 9
            r3 = 6
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 5
            if (r0 != 0) goto L14
        L12:
            r1 = r6
            goto L4e
        L14:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L12
            if (r0 == 0) goto L4d
            boolean r8 = r0.isConnected()
            if (r8 != 0) goto L21
            goto L4d
        L21:
            int r8 = r0.getType()
            if (r8 == 0) goto L38
            if (r8 == r5) goto L4e
            if (r8 == r4) goto L38
            if (r8 == r7) goto L38
            if (r8 == r3) goto L36
            if (r8 == r2) goto L34
            r1 = 8
            goto L4e
        L34:
            r1 = 7
            goto L4e
        L36:
            r1 = r7
            goto L4e
        L38:
            int r0 = r0.getSubtype()
            switch(r0) {
                case 1: goto L4b;
                case 2: goto L4b;
                case 3: goto L49;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                case 9: goto L49;
                case 10: goto L49;
                case 11: goto L49;
                case 12: goto L49;
                case 13: goto L36;
                case 14: goto L49;
                case 15: goto L49;
                case 16: goto L3f;
                case 17: goto L49;
                case 18: goto L4e;
                case 19: goto L3f;
                case 20: goto L41;
                default: goto L3f;
            }
        L3f:
            r1 = r3
            goto L4e
        L41:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            r1 = r2
            goto L4e
        L49:
            r1 = r4
            goto L4e
        L4b:
            r1 = 3
            goto L4e
        L4d:
            r1 = r5
        L4e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L73
            if (r1 != r7) goto L73
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L6f
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L6f
            r10.getClass()
            com.google.android.gms.internal.ads.zzei r0 = new com.google.android.gms.internal.ads.zzei     // Catch: java.lang.RuntimeException -> L6f
            r0.<init>(r9)     // Catch: java.lang.RuntimeException -> L6f
            java.util.concurrent.Executor r1 = r9.zzb     // Catch: java.lang.RuntimeException -> L6f
            androidx.media3.common.util.d.a(r10, r1, r0)     // Catch: java.lang.RuntimeException -> L6f
            androidx.media3.common.util.e.a(r10, r0)     // Catch: java.lang.RuntimeException -> L6f
            return
        L6f:
            r9.zze(r7)
            return
        L73:
            r9.zze(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzep.zzd(android.content.Context):void");
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
