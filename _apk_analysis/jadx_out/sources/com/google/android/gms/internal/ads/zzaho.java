package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzaho implements zzaeu {
    private zzaex zzb;
    private zzahv zzc;
    private zzaev zzd;
    private zzagd zze;

    @Nullable
    private zzakw zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzaev r13) throws java.io.IOException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzer r0 = new com.google.android.gms.internal.ads.zzer
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = 0
            r4 = r2
        La:
            r5 = 8
            r0.zza(r5)
            byte[] r6 = r0.zzi()
            boolean r6 = r13.zzh(r6, r3, r5, r2)
            if (r6 != 0) goto L1b
        L19:
            r2 = r3
            goto L70
        L1b:
            long r6 = r0.zzz()
            int r8 = r0.zzB()
            r9 = 1
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 != 0) goto L3a
            byte[] r6 = r0.zzi()
            boolean r6 = r13.zzh(r6, r5, r5, r2)
            if (r6 != 0) goto L34
            goto L19
        L34:
            long r6 = r0.zzJ()
            r9 = r1
            goto L3b
        L3a:
            r9 = r5
        L3b:
            long r9 = (long) r9
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L41
            goto L19
        L41:
            long r6 = r6 - r9
            int r6 = (int) r6
            if (r4 == 0) goto L6b
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r8 != r4) goto L19
            if (r6 >= r5) goto L4d
            goto L19
        L4d:
            r4 = 4
            r0.zza(r4)
            byte[] r5 = r0.zzi()
            r7 = r13
            com.google.android.gms.internal.ads.zzael r7 = (com.google.android.gms.internal.ads.zzael) r7
            r7.zzh(r5, r3, r4, r3)
            int r4 = r0.zzB()
            r5 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r5) goto L65
            goto L19
        L65:
            int r6 = r6 + (-4)
            r7.zzj(r6, r3)
            goto L79
        L6b:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r8 != r4) goto L71
        L70:
            return r2
        L71:
            if (r6 == 0) goto L79
            r4 = r13
            com.google.android.gms.internal.ads.zzael r4 = (com.google.android.gms.internal.ads.zzael) r4
            r4.zzj(r6, r3)
        L79:
            r4 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaho.zza(com.google.android.gms.internal.ads.zzaev):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            int i10 = this.zzg;
            if (i10 == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzerVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzaevVar.zzn();
                    this.zzk = jZzn;
                    long j10 = this.zzj;
                    zzahv zzahvVar = new zzahv(0L, jZzn - j10, -9223372036854775807L, jZzn, jZzJ - j10);
                    this.zzc = zzahvVar;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzagh zzaghVarZzu = zzaexVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/heic");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzaghVarZzu.zzz(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i10 == 1) {
                zzaevVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaevVar != this.zzd) {
                        this.zzd = zzaevVar;
                        this.zze = new zzagd(zzaevVar, this.zzk);
                    }
                    zzakw zzakwVar = this.zzf;
                    zzakwVar.getClass();
                    int iZzd = zzakwVar.zzd(this.zze, zzafvVar);
                    if (iZzd == 1) {
                        zzafvVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzk);
                this.zze = zzagdVar;
                if (this.zzf.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzf;
                    long j11 = this.zzk;
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzakwVar2.zzc(new zzagf(j11, zzaexVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        if (j10 != 0) {
            if (this.zzg == 3) {
                zzakw zzakwVar = this.zzf;
                zzakwVar.getClass();
                zzakwVar.zze(j10, j11);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
