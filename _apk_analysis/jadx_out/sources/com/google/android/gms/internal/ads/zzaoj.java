package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaoj(boolean z10, @Nullable String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzerVar.zzd(), i10 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        return i11 == i10;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzaghVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i10) {
        if (zzerVar.zzd() < i10) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzaghVarZzu;
        this.zzw = zzaghVarZzu;
        if (!this.zzb) {
            this.zzj = new zzaer();
            return;
        }
        zzaqbVar.zza();
        zzagh zzaghVarZzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzj = zzaghVarZzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaqbVar.zzc());
        zztVar.zzl(this.zzg);
        zztVar.zzm("application/id3");
        zzaghVarZzu2.zzz(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzv = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0259, code lost:
    
        r17.zzk = 1;
        r17.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025f, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0262, code lost:
    
        r18.zzh(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0245, code lost:
    
        r17.zzr = (r11 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x024e, code lost:
    
        if (1 == ((r11 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0250, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0252, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0253, code lost:
    
        r17.zzn = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0257, code lost:
    
        if (r17.zzo != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0245 A[EDGE_INSN: B:143:0x0245->B:94:0x0245 BREAK  A[LOOP:1: B:48:0x01a2->B:168:0x01a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0200  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r18) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }
}
