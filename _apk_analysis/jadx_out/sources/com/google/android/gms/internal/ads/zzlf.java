package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;

    @Nullable
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;

    @Nullable
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i10, boolean z10, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j10, boolean z11, boolean z12, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, @Nullable zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j10;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zzmdVarZza = zzmd.zza(zzaakVar);
        this.zzG = zzmdVarZza;
        this.zzH = new zzlc(zzmdVarZza);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzmmVarZzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z13 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zzmlVarArr[i11].zzc(i11, zzpqVar, zzdnVar);
            this.zzc[i11] = zzmlVarArr[i11].zzb();
            this.zzc[i11].zzv(zzmmVarZzg);
            zzml zzmlVar = zzmlVarArr2[i11];
            if (zzmlVar != null) {
                zzmlVar.zzc(i11, zzpqVar, zzdnVar);
                z13 = true;
            }
            this.zzb[i11] = new zzmp(zzmlVarArr[i11], zzmlVarArr2[i11], i11);
        }
        this.zzy = z13;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzlq(zzmxVar, zzdxVarZzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzdxVarZzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper looperZza = zzmeVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i10) {
        zzlq zzlqVar = this.zzs;
        zziw zziwVarZza = zziw.zza(iOException, i10);
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm != null) {
            zziwVarZza = zziwVarZza.zzd(zzlnVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zziwVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zziwVarZza);
    }

    private final void zzB(int i10) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i10) {
            if (i10 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f10) throws zziw {
        this.zzac = f10;
        float fZza = f10 * this.zzz.zza();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) throws zziw {
        this.zzH.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) throws zziw {
        zzH(z10, this.zzz.zzc(z10, this.zzG.zze), i10, i11);
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) throws zziw {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzC;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z11 && zzmdVar.zzn == i11 && zzmdVar.zzm == i12) {
            return;
        }
        this.zzG = zzmdVar.zzi(z11, i12, i11);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z13 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i13 = this.zzG.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z10) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, jZzT, zzmdVar.zzc, zzmdVar.zzd, z10, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        zzaak zzaakVarZzr = zzlnVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j11 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmpVarArr[i10].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzR(com.google.android.gms.internal.ads.zzle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzR(com.google.android.gms.internal.ads.zzle):void");
    }

    private final long zzS(zzwk zzwkVar, long j10, boolean z10) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j10, zzlqVar.zzm() != zzlqVar.zzn(), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzT(com.google.android.gms.internal.ads.zzwk r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzT(com.google.android.gms.internal.ads.zzwk, long, boolean, boolean):long");
    }

    private final void zzU(long j10, boolean z10) throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzlnVarZzm == null ? 1000000000000L : zzlnVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmpVarArr[i10].zzE(zzlnVarZzm, this.zzT, z10);
        }
        for (zzln zzlnVarZzm2 = r0.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzmpVarArr[i10].zzz(this.zzC ? this.zzB : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzQ, false, true, false);
        this.zzH.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
     binds: [B:37:0x00b0, B:39:0x00b4, B:41:0x00c5, B:43:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwkVarZzy.zzb()) {
            zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
            if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzwkVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z10 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z10, boolean z11) {
        this.zzL = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    @Nullable
    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        zzbf zzbfVar2 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar3)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) != -1) {
            return (zzbfVar3.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzleVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar3, zzbfVar);
        if (iZzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzyc zzycVar = zzycVarArr[i10];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmpVarArr[i10].zzd();
            zzmpVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzR -= iZzd;
            i10++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzmp zzmpVar = zzmpVarArr[i10];
                int iZzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zziw {
        zziu zziuVar = this.zzo;
        float f10 = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z10 = true;
        while (zzlnVarZzm != null && zzlnVarZzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzaakVarZzk = zzlnVarZzm.zzk(f10, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzlnVarZzm == zzlqVar.zzm() ? zzaakVarZzk : zzaakVar;
            zzaak zzaakVarZzr = zzlnVarZzm.zzr();
            boolean z11 = false;
            if (zzaakVarZzr != null) {
                zzaac[] zzaacVarArr = zzaakVarZzk.zzc;
                if (zzaakVarZzr.zzc.length == zzaacVarArr.length) {
                    for (int i10 = 0; i10 < zzaacVarArr.length; i10++) {
                        if (zzaakVarZzk.zzb(zzaakVarZzr, i10)) {
                        }
                    }
                    if (zzlnVarZzm != zzlnVarZzn) {
                        z11 = true;
                    }
                    z10 &= z11;
                    zzlnVarZzm = zzlnVarZzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            int i11 = 2;
            if (z10) {
                zzln zzlnVarZzm2 = zzlqVar.zzm();
                int iZzs = zzlqVar.zzs(zzlnVarZzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long jZzm = zzlnVarZzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                boolean z12 = (zzmdVar2.zze == 4 || jZzm == zzmdVar2.zzs) ? false : true;
                zzmd zzmdVar3 = this.zzG;
                zzln zzlnVar = zzlnVarZzm2;
                this.zzG = zzao(zzmdVar3.zzb, jZzm, zzmdVar3.zzc, zzmdVar3.zzd, z12, 5);
                if (z12) {
                    zzU(jZzm, true);
                }
                zzab();
                i11 = 2;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (i12 < 2) {
                    int iZzd = zzmpVarArr[i12].zzd();
                    zArr2[i12] = zzmpVarArr[i12].zzM();
                    zzln zzlnVar2 = zzlnVar;
                    zzmpVarArr[i12].zzD(zzlnVar2.zzc[i12], zziuVar, this.zzT, zArr[i12]);
                    if (iZzd - zzmpVarArr[i12].zzd() > 0) {
                        zzN(i12, false);
                    }
                    this.zzR -= iZzd - zzmpVarArr[i12].zzd();
                    i12++;
                    zzlnVar = zzlnVar2;
                }
                zzaq(zArr2, this.zzT);
                zzlnVar.zzh = true;
            } else {
                zzlqVar.zzs(zzlnVarZzm);
                if (zzlnVarZzm.zze) {
                    long jMax = Math.max(zzlnVarZzm.zzg.zzb, this.zzT - zzlnVarZzm.zza());
                    if (this.zzy && zzaz() && zzlqVar.zzo() == zzlnVarZzm) {
                        zzab();
                    }
                    zzlnVarZzm.zzl(zzaakVarZzk, jMax, false);
                }
            }
            zzas(true);
            if (this.zzG.zze != 4) {
                zzam();
                zzL();
                this.zzi.zzh(i11);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzlnVarZzm = this.zzs.zzm();
        long j10 = zzlnVarZzm.zzg.zze;
        if (!zzlnVarZzm.zze) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzG.zzs < j10) {
            return true;
        }
        return !zzax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0443  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j10, boolean z10) throws zziw {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j10 != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j10));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z10) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long jZza = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i10 = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzmpVarArr[i10].zzp(zzlnVar)) {
                    long jZzf = zzmpVarArr[i10].zzf(zzlnVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzlnVarZzl = zzlqVar.zzl();
        if (zzlnVarZzl != null) {
            if (!zzlnVarZzl.zzd || zzlnVarZzl.zze) {
                zzwi zzwiVar = zzlnVarZzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlnVarZzl.zzg.zza, zzlnVarZzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzlnVarZzl.zzd) {
                        zzlnVarZzl.zzt(this, zzlnVarZzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzlnVarZzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzlnVarZzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzlnVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzlnVarZzm != null && zzlnVarZzm.zzg.zzi && this.zzJ) {
            z10 = true;
        }
        this.zzK = z10;
    }

    private final void zzak(zzav zzavVar, boolean z10) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzal(zzav zzavVar, float f10, boolean z10, boolean z11) throws zziw {
        int i10;
        if (z10) {
            if (z11) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzln zzlnVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzlnVarZzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzlnVarZzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i10 < length) {
                zzaac zzaacVar = zzaacVarArr[i10];
                i10++;
            }
            zzlnVarZzm = zzlnVarZzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i10 < 2) {
            zzmpVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzlq zzlqVar;
        boolean zZzh;
        zzlq zzlqVar2 = this.zzs;
        if (zzaF(zzlqVar2.zzk())) {
            zzln zzlnVarZzk = zzlqVar2.zzk();
            long jZzau = zzau(zzlnVarZzk.zzg());
            if (zzlnVarZzk == zzlqVar2.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlnVarZzk.zza();
            } else {
                jZza = this.zzT - zzlnVarZzk.zza();
                jZza2 = zzlnVarZzk.zzg.zzb;
            }
            zzlqVar = zzlqVar2;
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzlnVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            zZzh = zzljVar.zzh(zzliVar);
            zzln zzlnVarZzm = zzlqVar.zzm();
            if (!zZzh && zzlnVarZzm.zze && jZzau < 500000 && this.zzn > 0) {
                zzlnVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzljVar.zzh(zzliVar);
            }
        } else {
            zzlqVar = zzlqVar2;
            zZzh = false;
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzln zzlnVarZzk2 = zzlqVar.zzk();
            zzlnVarZzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzlnVarZzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzlnVarZzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzlnVarZzk = this.zzs.zzk();
        boolean z10 = false;
        if (this.zzN || (zzlnVarZzk != null && zzlnVarZzk.zza.zzn())) {
            z10 = true;
        }
        zzmd zzmdVar = this.zzG;
        if (z10 != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z10);
        }
    }

    @CheckResult
    private final zzmd zzao(zzwk zzwkVar, long j10, long j11, long j12, boolean z10, int i10) {
        List listZzi;
        zzyn zzynVar;
        zzaak zzaakVar;
        zzln zzlnVarZzm;
        int i11 = 0;
        this.zzW = (!this.zzW && j10 == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar2 = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzlnVarZzm2 = zzlqVar.zzm();
            zzyn zzynVarZzq = zzlnVarZzm2 == null ? zzyn.zza : zzlnVarZzm2.zzq();
            zzaak zzaakVarZzr = zzlnVarZzm2 == null ? this.zzf : zzlnVarZzm2.zzr();
            zzaac[] zzaacVarArr = zzaakVarZzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z11 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z11 = true;
                    }
                }
            }
            zzguf zzgufVarZzi = z11 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzlnVarZzm2 != null) {
                zzlo zzloVar = zzlnVarZzm2.zzg;
                if (zzloVar.zzc != j11) {
                    zzlnVarZzm2.zzg = zzloVar.zzb(j11);
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn() && (zzlnVarZzm = zzlqVar.zzm()) != null) {
                zzaak zzaakVarZzr2 = zzlnVarZzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr = this.zzb;
                    if (i11 >= 2) {
                        break;
                    }
                    if (zzaakVarZzr2.zza(i11)) {
                        if (zzmpVarArr[i11].zze() != 1) {
                            break;
                        }
                        int i12 = zzaakVarZzr2.zzb[i11].zzb;
                    }
                    i11++;
                }
            }
            listZzi = zzgufVarZzi;
            zzynVar = zzynVarZzq;
            zzaakVar = zzaakVarZzr;
        } else if (zzwkVar.equals(this.zzG.zzb)) {
            listZzi = list;
            zzynVar = zzynVar2;
            zzaakVar = zzaakVar2;
        } else {
            zzaakVar = this.zzf;
            zzynVar = zzyn.zza;
            listZzi = zzguf.zzi();
        }
        if (z10) {
            this.zzH.zzc(i10);
        }
        return this.zzG.zzc(zzwkVar, j10, j11, j12, zzat(), zzynVar, zzaakVar, listZzi);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j10) throws zziw {
        zzmp[] zzmpVarArr;
        zzln zzlnVarZzn = this.zzs.zzn();
        zzaak zzaakVarZzr = zzlnVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzaakVarZzr.zza(i10)) {
                zzmpVarArr[i10].zzG();
            }
            i10++;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzaakVarZzr.zza(i11) && !zzmpVarArr[i11].zzp(zzlnVarZzn)) {
                zzar(zzlnVarZzn, i11, zArr[i11], j10);
            }
        }
    }

    private final void zzar(zzln zzlnVar, int i10, boolean z10, long j10) throws zziw {
        zzmp zzmpVar = this.zzb[i10];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z11 = zzlnVar == this.zzs.zzm();
        zzaak zzaakVarZzr = zzlnVar.zzr();
        zzmo zzmoVar = zzaakVarZzr.zzb[i10];
        zzaac zzaacVar = zzaakVarZzr.zzc[i10];
        boolean z12 = zzax() && this.zzG.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i10], this.zzT, z13, z11, j10, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z12 && z11) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        zzwk zzwkVar = zzlnVarZzk == null ? this.zzG.zzb : zzlnVarZzk.zzg.zza;
        boolean z11 = !this.zzG.zzk.equals(zzwkVar);
        if (z11) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzlnVarZzk == null ? zzmdVar.zzs : zzlnVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((z11 || z10) && zzlnVarZzk != null && zzlnVarZzk.zze) {
            zzaw(zzlnVarZzk.zzg.zza, zzlnVarZzk.zzq(), zzlnVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j10) {
        zzln zzlnVarZzk = this.zzs.zzk();
        if (zzlnVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzT - zzlnVarZzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzk = zzlqVar.zzk();
        zzlnVarZzk.getClass();
        if (zzlnVarZzk == zzlqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzlnVarZzk.zza();
        } else {
            jZza = this.zzT - zzlnVarZzk.zza();
            jZza2 = zzlnVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, jZza - jZza2, zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i10) throws zziw, IOException {
        zzmp zzmpVar = this.zzb[i10];
        try {
            zzln zzlnVarZzm = this.zzs.zzm();
            zzlnVarZzm.getClass();
            zzmpVar.zzu(zzlnVarZzm);
        } catch (IOException | RuntimeException e10) {
            zzmpVar.zze();
            throw e10;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzmpVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar.zze(obj);
        int iZzc = zzbfVar.zzc();
        int iZzl = iZze;
        int i12 = 0;
        int iZze2 = -1;
        while (true) {
            if (i12 >= iZzc || iZze2 != -1) {
                break;
            }
            iZzl = zzbfVar.zzl(iZzl, zzbdVar, zzbeVar, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar.zzf(iZzl));
            i12++;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e10) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0af7: MOVE (r13 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:566:0x0af6 */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0af9: MOVE (r12 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:566:0x0af6 */
    /* JADX WARN: Removed duplicated region for block: B:234:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0580 A[Catch: zziw -> 0x0857, RuntimeException -> 0x0afd, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_LEAVE, TryCatch #12 {RuntimeException -> 0x0afd, blocks: (B:3:0x000b, B:171:0x0446, B:173:0x0459, B:176:0x0463, B:190:0x04a5, B:195:0x04ba, B:235:0x056f, B:238:0x0580, B:194:0x04b7), top: B:655:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063d A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0678 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, LOOP:18: B:293:0x0675->B:295:0x0678, LOOP_END, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0686 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06c4 A[Catch: RuntimeException -> 0x0852, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0852, blocks: (B:330:0x06f4, B:357:0x0776, B:360:0x0783, B:362:0x0787, B:364:0x078d, B:366:0x0793, B:368:0x079d, B:373:0x07a7, B:375:0x07b0, B:385:0x07db, B:309:0x06ba, B:313:0x06c4), top: B:653:0x06ba }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ca A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06fa A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0783 A[Catch: RuntimeException -> 0x0852, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #2 {RuntimeException -> 0x0852, blocks: (B:330:0x06f4, B:357:0x0776, B:360:0x0783, B:362:0x0787, B:364:0x078d, B:366:0x0793, B:368:0x079d, B:373:0x07a7, B:375:0x07b0, B:385:0x07db, B:309:0x06ba, B:313:0x06c4), top: B:653:0x06ba }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07a3 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07c2 A[Catch: RuntimeException -> 0x076f, zziw -> 0x0855, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x076f, blocks: (B:332:0x06fa, B:334:0x0700, B:337:0x0706, B:338:0x0710, B:340:0x0715, B:344:0x073b, B:346:0x0741, B:348:0x0749, B:350:0x0760, B:351:0x0765, B:371:0x07a3, B:377:0x07c2, B:379:0x07ca, B:381:0x07d2, B:267:0x060b, B:269:0x0612, B:271:0x0616, B:275:0x0627, B:304:0x06a0, B:277:0x0631, B:279:0x0635, B:284:0x063d, B:286:0x0645, B:288:0x0662, B:291:0x066b, B:292:0x0670, B:295:0x0678, B:296:0x0680, B:298:0x0686, B:311:0x06c0, B:317:0x06ca, B:320:0x06d3, B:322:0x06d9, B:326:0x06e7, B:328:0x06ee), top: B:657:0x0573 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0813 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, LOOP:12: B:392:0x0811->B:393:0x0813, LOOP_END, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0822 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0832 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0930 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09e6 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09f3 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09fa A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a17 A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a9c A[Catch: RuntimeException -> 0x0af3, zziw -> 0x0af5, IOException -> 0x0b2b, zzvk -> 0x0b33, zzhc -> 0x0b3b, zzat -> 0x0b43, zztg -> 0x0b5a, TryCatch #17 {zziw -> 0x0af5, RuntimeException -> 0x0af3, blocks: (B:405:0x084d, B:414:0x0868, B:419:0x0874, B:421:0x087c, B:422:0x0883, B:424:0x0891, B:425:0x08ab, B:427:0x08af, B:429:0x08b7, B:443:0x08e8, B:430:0x08bd, B:432:0x08c8, B:436:0x08d5, B:442:0x08e5, B:446:0x08f7, B:448:0x08fd, B:452:0x090a, B:454:0x0912, B:456:0x0916, B:457:0x0921, B:459:0x0927, B:510:0x0a39, B:513:0x0a41, B:515:0x0a45, B:517:0x0a4d, B:518:0x0a50, B:519:0x0a54, B:521:0x0a5a, B:523:0x0a63, B:525:0x0a6d, B:527:0x0a73, B:529:0x0a7e, B:536:0x0aa3, B:538:0x0aa9, B:542:0x0ab3, B:553:0x0acc, B:550:0x0ac5, B:552:0x0ac9, B:530:0x0a85, B:533:0x0a93, B:534:0x0a9b, B:535:0x0a9c, B:460:0x0930, B:462:0x0936, B:464:0x093a, B:489:0x09d9, B:491:0x09e6, B:467:0x0944, B:469:0x0948, B:471:0x095a, B:473:0x0968, B:475:0x0972, B:479:0x097b, B:481:0x0985, B:487:0x0990, B:492:0x09f3, B:494:0x09fa, B:496:0x09fe, B:500:0x0a07, B:502:0x0a17, B:504:0x0a1d, B:506:0x0a27, B:507:0x0a2c, B:508:0x0a31, B:509:0x0a36, B:445:0x08ef, B:387:0x07f6, B:389:0x0808, B:391:0x080e, B:393:0x0813, B:394:0x081b, B:396:0x0822, B:397:0x0825, B:398:0x082e, B:400:0x0832, B:402:0x0838, B:403:0x083d, B:557:0x0add, B:561:0x0ae8), top: B:662:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0bfa  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j10, long j11, zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzle(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(@Nullable Object obj, long j10) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j10 != -9223372036854775807L) {
            return zzdqVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    public final /* synthetic */ zzln zzt(zzlo zzloVar, long j10) {
        zzaan zzaanVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j10, this.zze, zzaanVarZze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    public final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i10, long j10, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i10, j10, null)).zza();
    }
}
