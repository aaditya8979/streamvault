package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;

    @Nullable
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    static {
        int i10 = zzajn.zza;
    }

    public zzajp() {
        throw null;
    }

    public zzajp(int i10) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzi(com.google.android.gms.internal.ads.zzaev r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzi(com.google.android.gms.internal.ads.zzaev):int");
    }

    private final long zzj(long j10) {
        return this.zzl + ((j10 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzaev zzaevVar, boolean z10) throws Throwable {
        int iZzm;
        int i10;
        int iZza;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzaevVar.zzm();
            if (!z10) {
                zzaevVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (!zzl(zzaevVar)) {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int iZzB = zzerVar.zzB();
                if ((i10 == 0 || zzn(iZzB, i10)) && (iZza = zzafs.zza(iZzB)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(iZzB);
                        i10 = iZzB;
                    }
                    zzaevVar.zzk(iZza - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z10) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(iZzm + i13);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                }
            } else if (i11 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z10) {
            zzaevVar.zzf(iZzm + i12);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i10;
        return true;
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long jZzf = zzajrVar.zzf();
            if (jZzf != -1 && zzaevVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j10 = this.zzo;
            if (j10 == -1 || j10 == this.zzq.zzf()) {
                return;
            }
            zzajk zzajkVarZzh = ((zzajk) this.zzq).zzh(this.zzo);
            this.zzq = zzajkVarZzh;
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(zzajkVarZzh);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(0, 1);
        this.zzh = zzaghVarZzu;
        this.zzi = zzaghVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfj.zza;
        int iZzi = zzi(zzaevVar);
        if (iZzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        zzajr zzajrVar = this.zzq;
        if (zzajrVar instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }
}
