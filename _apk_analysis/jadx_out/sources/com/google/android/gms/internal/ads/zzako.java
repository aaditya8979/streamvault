package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;

    @Nullable
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i10 = zzakk.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    public zzako(zzamd zzamdVar, int i10, @Nullable zzfg zzfgVar, @Nullable zzalc zzalcVar, List list, @Nullable zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j10, zzer zzerVar) {
                this.zza.zzh(j10, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:306:0x07e1, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x07e4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(long r60) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 2021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzj(long):void");
    }

    private static int zzk(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i10, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i10 + 8);
        int iZzB = zzerVar.zzB();
        int i11 = zzakh.zza;
        int i12 = iZzB & ViewCompat.MEASURED_SIZE_MASK;
        if ((i12 & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (i12 & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i13 = zzaleVar.zze;
        if (iZzH != i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i13).length());
            sb2.append("Senc sample count ");
            sb2.append(iZzH);
            sb2.append(" is different from fragment sample count");
            sb2.append(i13);
            throw zzat.zzb(sb2.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, iZzH, z10);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzerVar.zzh(8);
        int iZza = zzakh.zza(zzerVar.zzB());
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar.zzz();
            jZzJ2 = zzerVar.zzz();
        } else {
            jZzJ = zzerVar.zzJ();
            jZzJ2 = zzerVar.zzJ();
        }
        long j11 = jZzJ;
        long j12 = j10 + jZzJ2;
        long jZzt = zzfj.zzt(j11, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar.zzk(2);
        int iZzt = zzerVar.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j13 = jZzt;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iZzt) {
            int iZzB = zzerVar.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jZzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i11 = iZzt;
            int[] iArr2 = iArr;
            long jZzt2 = zzfj.zzt(j15, 1000000L, jZzz, RoundingMode.DOWN);
            jArr5[i10] = jZzt2 - jArr4[i10];
            zzerVar.zzk(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr2 = jArr5;
            jArr = jArr;
            iZzt = i11;
            jArr3 = jArr4;
            j14 = j15;
            j13 = jZzt2;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzn(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private static final zzaki zzo(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i10);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzagcVarZza = zzalb.zza(zzaevVar);
        this.zzr = zzagcVarZza != null ? zzguf.zzj(zzagcVarZza) : zzguf.zzi();
        return zzagcVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i12 = 101;
            i10 = 1;
        } else {
            i10 = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i10);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i13 < this.zzK.length) {
            zzagh zzaghVarZzu = this.zzI.zzu(i12, 3);
            zzaghVarZzu.zzz((zzv) list.get(i13));
            this.zzK[i13] = zzaghVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f2, code lost:
    
        if (r26.zzH == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f4, code lost:
    
        r7 = r26.zzi;
        r7.zza(r3);
        r27.zzc(r7.zzi(), 0, r26.zzF);
        r6.zzc(r7, r26.zzF);
        r3 = r26.zzF;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0221, code lost:
    
        if (r5 != (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0223, code lost:
    
        r5 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0229, code lost:
    
        if (r5.zzb() == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022b, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022f, code lost:
    
        r9 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0235, code lost:
    
        if (r9.zzb() == r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0237, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023a, code lost:
    
        r5 = r26.zzp;
        r5.zzc(r10, r7);
        r9 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0245, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0247, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024b, code lost:
    
        r9 = r5;
        r3 = r6.zza(r27, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0251, code lost:
    
        r26.zzE += r3;
        r26.zzF -= r3;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0261, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0267, code lost:
    
        if (r26.zzG != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0269, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026c, code lost:
    
        r20 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0272, code lost:
    
        if (r1 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0274, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0279, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027b, code lost:
    
        r6.zze(r10, r20, r26.zzD, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0288, code lost:
    
        r1 = r26.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028e, code lost:
    
        if (r1.isEmpty() != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0290, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r26.zzy;
        r4 = r1.zzc;
        r26.zzy = r3 - r4;
        r5 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
    
        if (r1.zzb == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a3, code lost:
    
        r5 = r5 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a4, code lost:
    
        r1 = r26.zzJ;
        r3 = r1.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a8, code lost:
    
        if (r7 >= r3) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02aa, code lost:
    
        r1[r7].zze(r5, 1, r4, r26.zzy, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c2, code lost:
    
        if (r2.zzh() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c4, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c7, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c8, code lost:
    
        r26.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0578, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r26.zzs != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r26.zzD = r2.zzf();
        r4 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (java.util.Objects.equals(r4, "video/avc") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        java.util.Objects.equals(r4, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r2.zzf >= r2.zzi) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r27.zzf(r26.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        r4 = r2.zzb;
        r5 = r4.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r4.zzb(r2.zzf) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (r2.zzh() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ec, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r26.zzD -= 8;
        r27.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        r26.zzE = r2.zzi(r26.zzD, 7);
        r4 = r26.zzD;
        r8 = r26.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r4, r8);
        r2.zza.zzc(r8, 7);
        r4 = r26.zzE + 7;
        r26.zzE = r4;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        r6 = 0;
        r4 = r2.zzi(r26.zzD, 0);
        r26.zzE = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r26.zzD += r4;
        r26.zzs = 4;
        r26.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r4 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        if (r8 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        r4 = r26.zzE;
        r5 = r26.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        if (r4 >= r5) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        r26.zzE += r6.zza(r27, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        r13 = r26.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[2] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        if (r26.zzE >= r26.zzD) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0174, code lost:
    
        r3 = r26.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        if (r3 != 0) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (r26.zzK.length > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        if (r26.zzG != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        r3 = com.google.android.gms.internal.ads.zzgm.zzc(r4.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018e, code lost:
    
        if ((r8 + r3) <= (r26.zzD - r26.zzE)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0190, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0191, code lost:
    
        r27.zzc(r14, r12, r8 + r3);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019e, code lost:
    
        if (r9 < 0) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        r26.zzF = r9 - r3;
        r9 = r26.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r26.zzE += r5;
        r26.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
    
        if (r26.zzK.length <= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ba, code lost:
    
        if (r3 <= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r4.zzg, r14[r5]) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c9, code lost:
    
        r26.zzH = r7;
        r6.zzc(r13, r3);
        r26.zzE += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
    
        if (r3 <= 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        if (r26.zzG != false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01df, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r3, r4.zzg) == false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e1, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ef, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r27, com.google.android.gms.internal.ads.zzafv r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzakn) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ void zzh(long j10, zzer zzerVar) {
        zzaeh.zza(j10, zzerVar, this.zzK);
    }
}
