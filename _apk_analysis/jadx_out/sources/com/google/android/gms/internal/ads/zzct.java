package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i10, int i11, float f10, float f11, int i12, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        this.zzh = i13 + i13;
        this.zzi = z10 ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i10, int i11) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i11);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i12 = this.zzk;
        int i13 = this.zzb;
        System.arraycopy(objZzr, i10 * i13, objZzq, i12 * i13, i11 * i13);
        this.zzk += i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzp() {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzct.zzp():void");
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i10 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i10), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i10, zzcrVar.zzq(), 0, this.zzk * i10);
    }

    public final void zzd() {
        int i10 = this.zzj;
        int i11 = this.zzo;
        int i12 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f11))) + 0.5d));
        this.zzq = 0.0d;
        int i14 = this.zzh;
        int i15 = i14 + i14;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i10 + i15);
        zzcrVar.zzm(i10 * this.zzb, i15);
        this.zzj += i15;
        zzp();
        if (this.zzk > i13) {
            this.zzk = Math.max(i13, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    public final /* synthetic */ int zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzh;
    }

    public final /* synthetic */ int zzi() {
        return this.zzj;
    }

    public final /* synthetic */ int zzj() {
        return this.zzk;
    }

    public final /* synthetic */ int zzk() {
        return this.zzl;
    }

    public final /* synthetic */ int zzl() {
        return this.zzm;
    }

    public final /* synthetic */ int zzm() {
        return this.zzn;
    }

    public final /* synthetic */ int zzn() {
        return this.zzp;
    }
}
