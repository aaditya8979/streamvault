package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagp implements zzaeu {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzagh zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzaex zzn;
    private zzagh zzo;
    private zzagh zzp;
    private zzafy zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i10 = zzago.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzfj.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzagp() {
        throw null;
    }

    public zzagp(int i10) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzp = zzaerVar;
    }

    private final boolean zzh(zzaev zzaevVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzaevVar, bArr)) {
            this.zzg = false;
            zzaevVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzaevVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzaevVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzaev zzaevVar, byte[] bArr) throws IOException {
        zzaevVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzaevVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0080, B:33:0x0081, B:34:0x009e), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0080, B:33:0x0081, B:34:0x009e), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzj(com.google.android.gms.internal.ads.zzaev r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.zzj
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto La0
            java.lang.String r0 = "Invalid padding bits for frame header "
            r10.zzl()     // Catch: java.io.EOFException -> L9f
            byte[] r4 = r9.zze     // Catch: java.io.EOFException -> L9f
            r10.zzi(r4, r1, r3)     // Catch: java.io.EOFException -> L9f
            r4 = r4[r1]     // Catch: java.io.EOFException -> L9f
            r5 = r4 & 131(0x83, float:1.84E-43)
            r6 = 0
            if (r5 > 0) goto L81
            int r0 = r4 >> 3
            java.lang.String r4 = "Illegal AMR "
            java.lang.String r5 = " frame type "
            boolean r7 = r9.zzg     // Catch: java.io.EOFException -> L9f
            r0 = r0 & 15
            if (r7 == 0) goto L2d
            r8 = 10
            if (r0 < r8) goto L38
            r8 = 13
            if (r0 <= r8) goto L2d
            goto L38
        L2d:
            if (r7 != 0) goto L56
            r8 = 12
            if (r0 < r8) goto L38
            r8 = 14
            if (r0 > r8) goto L38
            goto L56
        L38:
            if (r7 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.zzagp.zzb     // Catch: java.io.EOFException -> L9f
            r0 = r4[r0]     // Catch: java.io.EOFException -> L9f
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.zzagp.zza     // Catch: java.io.EOFException -> L9f
            r0 = r4[r0]     // Catch: java.io.EOFException -> L9f
        L43:
            r9.zzi = r0     // Catch: java.io.EOFException -> L9f
            r9.zzj = r0
            int r4 = r9.zzk
            if (r4 != r2) goto L4e
            r9.zzk = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto La0
            int r4 = r9.zzl
            int r4 = r4 + r3
            r9.zzl = r4
            goto La0
        L56:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r7) goto L5d
            r10 = r1
        L5d:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.io.EOFException -> L9f
            int r1 = r1.length()     // Catch: java.io.EOFException -> L9f
            int r1 = r1 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L9f
            r3.<init>(r1)     // Catch: java.io.EOFException -> L9f
            r3.append(r4)     // Catch: java.io.EOFException -> L9f
            r3.append(r10)     // Catch: java.io.EOFException -> L9f
            r3.append(r5)     // Catch: java.io.EOFException -> L9f
            r3.append(r0)     // Catch: java.io.EOFException -> L9f
            java.lang.String r10 = r3.toString()     // Catch: java.io.EOFException -> L9f
            com.google.android.gms.internal.ads.zzat r10 = com.google.android.gms.internal.ads.zzat.zzb(r10, r6)     // Catch: java.io.EOFException -> L9f
            throw r10     // Catch: java.io.EOFException -> L9f
        L81:
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch: java.io.EOFException -> L9f
            int r10 = r10.length()     // Catch: java.io.EOFException -> L9f
            int r10 = r10 + 38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L9f
            r1.<init>(r10)     // Catch: java.io.EOFException -> L9f
            r1.append(r0)     // Catch: java.io.EOFException -> L9f
            r1.append(r4)     // Catch: java.io.EOFException -> L9f
            java.lang.String r10 = r1.toString()     // Catch: java.io.EOFException -> L9f
            com.google.android.gms.internal.ads.zzat r10 = com.google.android.gms.internal.ads.zzat.zzb(r10, r6)     // Catch: java.io.EOFException -> L9f
            throw r10     // Catch: java.io.EOFException -> L9f
        L9f:
            return r2
        La0:
            com.google.android.gms.internal.ads.zzagh r4 = r9.zzp
            int r10 = r4.zza(r10, r0, r3)
            if (r10 != r2) goto La9
            return r2
        La9:
            int r0 = r9.zzj
            int r0 = r0 - r10
            r9.zzj = r0
            if (r0 <= 0) goto Lb1
            return r1
        Lb1:
            com.google.android.gms.internal.ads.zzagh r2 = r9.zzp
            long r3 = r9.zzh
            r5 = 1
            int r6 = r9.zzi
            r7 = 0
            r8 = 0
            r2.zze(r3, r5, r6, r7, r8)
            long r2 = r9.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.zzh = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagp.zzj(com.google.android.gms.internal.ads.zzaev):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzh(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzn = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(0, 1);
        this.zzo = zzaghVarZzu;
        this.zzp = zzaghVarZzu;
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzo.getClass();
        String str = zzfj.zza;
        if (zzaevVar.zzn() == 0 && !zzh(zzaevVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            String str2 = true != z10 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i10 = true != z10 ? 8000 : 16000;
            int i11 = z10 ? zzb[8] : zza[7];
            zzagh zzaghVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzl(str2);
            zztVar.zzm(str3);
            zztVar.zzn(i11);
            zztVar.zzE(1);
            zztVar.zzF(i10);
            zzaghVar.zzz(zztVar.zzM());
        }
        int iZzj = zzj(zzaevVar);
        if (this.zzq == null) {
            zzafx zzafxVar = new zzafx(-9223372036854775807L, 0L);
            this.zzq = zzafxVar;
            this.zzn.zzw(zzafxVar);
        }
        return iZzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j11;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
