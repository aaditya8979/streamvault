package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public zzapt(int i10) {
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzaevVar.zzo();
            int iMin = (int) Math.min(112800L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzaevVar.zzn() == j11) {
                zzer zzerVar = this.zzb;
                zzerVar.zza(iMin);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                int i11 = iZze - 188;
                while (true) {
                    if (i11 < iZzg) {
                        break;
                    }
                    byte[] bArrZzi = zzerVar.zzi();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < iZzg || i14 >= iZze || bArrZzi[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long jZzb = zzaqd.zzb(zzerVar, i11, i10);
                                if (jZzb != -9223372036854775807L) {
                                    j10 = jZzb;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                this.zzg = j10;
                this.zze = true;
                return 0;
            }
            zzafvVar.zza = j11;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j12 = this.zzf;
                if (j12 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j12);
                zze(zzaevVar);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, zzaevVar.zzo());
            if (zzaevVar.zzn() == 0) {
                zzer zzerVar2 = this.zzb;
                zzerVar2.zza(iMin2);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
                int iZzg2 = zzerVar2.zzg();
                int iZze2 = zzerVar2.zze();
                while (true) {
                    if (iZzg2 >= iZze2) {
                        break;
                    }
                    if (zzerVar2.zzi()[iZzg2] == 71) {
                        long jZzb2 = zzaqd.zzb(zzerVar2, iZzg2, i10);
                        if (jZzb2 != -9223372036854775807L) {
                            j10 = jZzb2;
                            break;
                        }
                    }
                    iZzg2++;
                }
                this.zzf = j10;
                this.zzd = true;
                return 0;
            }
            zzafvVar.zza = 0L;
        }
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
