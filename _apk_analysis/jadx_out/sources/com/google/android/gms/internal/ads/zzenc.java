package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzenc {

    @GuardedBy("this")
    private final zzhah zzc;

    @GuardedBy("this")
    private zzens zzf;
    private final String zzh;
    private final int zzi;
    private final zzenr zzj;
    private zzfir zzk;

    @GuardedBy("this")
    private final Map zza = new HashMap();

    @GuardedBy("this")
    private final List zzb = new ArrayList();

    @GuardedBy("this")
    private final List zzd = new ArrayList();

    @GuardedBy("this")
    private final Set zze = new HashSet();

    @GuardedBy("this")
    private int zzg = Integer.MAX_VALUE;

    @GuardedBy("this")
    private boolean zzl = false;

    public zzenc(zzfjc zzfjcVar, zzenr zzenrVar, zzhah zzhahVar) {
        this.zzi = zzfjcVar.zzb.zzb.zzr;
        this.zzj = zzenrVar;
        this.zzc = zzhahVar;
        this.zzh = zzeny.zzb(zzfjcVar);
        List list = zzfjcVar.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzfir) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfir) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z10) {
        for (zzfir zzfirVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfirVar);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z10 || !this.zze.contains(zzfirVar.zzat)) {
                if (numValueOf.intValue() < this.zzg) {
                    return true;
                }
                if (numValueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        boolean z10;
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Integer num = (Integer) this.zza.get((zzfir) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzens zzensVar = this.zzf;
        if (zzensVar != null) {
            this.zzc.zza(zzensVar);
        } else {
            this.zzc.zzb(new zzenv(3, this.zzh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.zzav == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.zzl = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r6.zzd.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return (com.google.android.gms.internal.ads.zzfir) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfir zza() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zze()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L40
            r0 = 0
        L8:
            java.util.List r1 = r6.zzb     // Catch: java.lang.Throwable -> L43
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L43
            if (r0 >= r2) goto L40
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzfir r2 = (com.google.android.gms.internal.ads.zzfir) r2     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r2.zzat     // Catch: java.lang.Throwable -> L43
            java.util.Set r4 = r6.zze     // Catch: java.lang.Throwable -> L43
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.zzav     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L2a
            r5 = 1
            r6.zzl = r5     // Catch: java.lang.Throwable -> L43
        L2a:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L43
            if (r5 != 0) goto L33
            r4.add(r3)     // Catch: java.lang.Throwable -> L43
        L33:
            java.util.List r3 = r6.zzd     // Catch: java.lang.Throwable -> L43
            r3.add(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzfir r0 = (com.google.android.gms.internal.ads.zzfir) r0     // Catch: java.lang.Throwable -> L43
            monitor-exit(r6)
            return r0
        L40:
            r0 = 0
            monitor-exit(r6)
            return r0
        L43:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenc.zza():com.google.android.gms.internal.ads.zzfir");
    }

    public final synchronized void zzb(zzens zzensVar, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        if (zzd()) {
            zzensVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfirVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.zzg) {
            this.zzj.zzf(zzfirVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = numValueOf.intValue();
        this.zzf = zzensVar;
        this.zzk = zzfirVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized void zzc(Throwable th2, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        this.zze.remove(zzfirVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
