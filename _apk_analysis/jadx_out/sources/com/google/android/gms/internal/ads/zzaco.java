package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzbsVarZzg = zzacgVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzdnVarZzi = zzacgVar.zzi();
        this.zzf = zzdnVarZzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzactVarZzk = zzacgVar.zzk();
        this.zzi = zzactVarZzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzactVarZzk, zzdnVarZzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: zzdu -> 0x0090, TRY_LEAVE, TryCatch #0 {zzdu -> 0x0090, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0024, B:16:0x0032, B:18:0x0038, B:21:0x003f, B:26:0x0060), top: B:36:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r11, int r12) throws com.google.android.gms.internal.ads.zzadq {
        /*
            r10 = this;
            int r12 = r10.zzo
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L8
            r12 = r0
            goto L9
        L8:
            r12 = r1
        L9:
            com.google.android.gms.internal.ads.zzgrc.zzi(r12)
            com.google.android.gms.internal.ads.zzi r12 = r11.zzE
            com.google.android.gms.internal.ads.zzi r12 = zzC(r12)
            int r2 = r12.zzd     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            r3 = 7
            if (r2 != r3) goto L32
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            r4 = 34
            if (r2 >= r4) goto L31
            boolean r2 = com.google.android.gms.internal.ads.zzdv.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            if (r2 != 0) goto L24
            goto L31
        L24:
            com.google.android.gms.internal.ads.zzh r12 = r12.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            r0 = 6
            r12.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            com.google.android.gms.internal.ads.zzi r12 = r12.zzg()     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            goto L62
        L31:
            r2 = r3
        L32:
            boolean r3 = com.google.android.gms.internal.ads.zzdv.zzc(r2)     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            if (r3 != 0) goto L59
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            r4 = 29
            if (r3 >= r4) goto L3f
            goto L59
        L3f:
            java.lang.String r12 = "PlaybackVidGraphWrapper"
            java.lang.String r3 = "Color transfer %d is not supported. Falling back to OpenGl tone mapping."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            r0[r1] = r2     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfj.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            java.util.Locale r1 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            java.lang.String r0 = java.lang.String.format(r1, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            com.google.android.gms.internal.ads.zzee.zzc(r12, r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
            goto L62
        L59:
            r0 = 2
            if (r2 == r0) goto L60
            r0 = 10
            if (r2 != r0) goto L62
        L60:
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L90
        L62:
            r2 = r12
            com.google.android.gms.internal.ads.zzdn r12 = r10.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r9 = 0
            com.google.android.gms.internal.ads.zzdx r12 = r12.zzd(r0, r9)
            r10.zzl = r12
            com.google.android.gms.internal.ads.zzbs r0 = r10.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            android.content.Context r1 = r10.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            com.google.android.gms.internal.ads.zzl r3 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            java.util.Objects.requireNonNull(r12)     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            com.google.android.gms.internal.ads.zzach r5 = new com.google.android.gms.internal.ads.zzach     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            r5.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            r6 = 0
            r8 = 0
            r4 = r10
            r0.zza(r1, r2, r3, r4, r5, r6, r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
            throw r9     // Catch: com.google.android.gms.internal.ads.zzbo -> L89
        L89:
            r12 = move-exception
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r12, r11)
            throw r0
        L90:
            r12 = move-exception
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r12, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j10, long j11) throws zzadq {
        this.zze.zzv(j10, j11);
    }

    public final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z10) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    public final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    public final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    public final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
