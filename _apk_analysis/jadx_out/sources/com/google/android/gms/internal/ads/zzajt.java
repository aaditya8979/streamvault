package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzajt {
    public final zzafr zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzajt(zzafr zzafrVar, long j10, long j11, @Nullable long[] jArr, int i10, int i11) {
        this.zza = new zzafr(zzafrVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzajt zza(zzafr zzafrVar, zzer zzerVar) {
        long[] jArr;
        int i10;
        int i11;
        int iZzB = zzerVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzerVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzerVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzerVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzerVar.zzk(4);
        }
        if (zzerVar.zzd() >= 24) {
            zzerVar.zzk(21);
            int iZzx = zzerVar.zzx();
            i11 = iZzx & 4095;
            i10 = iZzx >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzajt(zzafrVar, iZzH, jZzz, jArr, i10, i11);
    }

    public final long zzb() {
        long j10 = this.zzb;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return zzfj.zzr((j10 * ((long) r4.zzg)) - 1, this.zza.zzd);
    }
}
