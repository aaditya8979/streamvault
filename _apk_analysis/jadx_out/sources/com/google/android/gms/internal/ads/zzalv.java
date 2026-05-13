package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzalv extends zzalt {

    @Nullable
    private zzalu zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzagm zzd;

    @Nullable
    private zzagk zze;

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i10 = !zzaluVar.zzd[(b10 >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i10;
        int iZzb;
        int i11;
        int i12;
        zzagm zzagmVar;
        long jFloor;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar2 = this.zzd;
        int i13 = 4;
        if (zzagmVar2 == null) {
            zzagn.zzd(1, zzerVar, false);
            int iZzI = zzerVar.zzI();
            int iZzs = zzerVar.zzs();
            int iZzI2 = zzerVar.zzI();
            int iZzC = zzerVar.zzC();
            int i14 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzerVar.zzC();
            int i15 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzerVar.zzC();
            int i16 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzerVar.zzs();
            this.zzd = new zzagm(iZzI, iZzs, iZzI2, i14, i15, i16, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i17 = zzagmVar2.zza;
                int i18 = 5;
                zzagn.zzd(5, zzerVar, false);
                int iZzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = 16;
                    if (i19 >= iZzs3) {
                        zzagm zzagmVar3 = zzagmVar2;
                        int i22 = 6;
                        int iZzb2 = zzagjVar.zzb(6) + 1;
                        for (int i23 = 0; i23 < iZzb2; i23++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i24 = 1;
                        int iZzb3 = zzagjVar.zzb(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < iZzb3) {
                                int iZzb4 = zzagjVar.zzb(i21);
                                if (iZzb4 == 0) {
                                    i11 = iZzb3;
                                    int i27 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int iZzb5 = zzagjVar.zzb(4) + 1;
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        zzagjVar.zzc(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i24) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb4).length() + 41);
                                        sb2.append("floor type greater than 1 not decodable: ");
                                        sb2.append(iZzb4);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    int iZzb6 = zzagjVar.zzb(i18);
                                    int[] iArr = new int[iZzb6];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < iZzb6; i30++) {
                                        int iZzb7 = zzagjVar.zzb(4);
                                        iArr[i30] = iZzb7;
                                        if (iZzb7 > i29) {
                                            i29 = iZzb7;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr2 = new int[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        iArr2[i32] = zzagjVar.zzb(i26) + 1;
                                        int iZzb8 = zzagjVar.zzb(i20);
                                        if (iZzb8 > 0) {
                                            i12 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i12 = 8;
                                        }
                                        int i33 = iZzb3;
                                        int i34 = 0;
                                        for (int i35 = 1; i34 < (i35 << iZzb8); i35 = 1) {
                                            zzagjVar.zzc(i12);
                                            i34++;
                                            i12 = 8;
                                        }
                                        i32++;
                                        iZzb3 = i33;
                                        i20 = 2;
                                        i26 = 3;
                                    }
                                    i11 = iZzb3;
                                    zzagjVar.zzc(i20);
                                    int iZzb9 = zzagjVar.zzb(4);
                                    int i36 = 0;
                                    int i37 = 0;
                                    for (int i38 = 0; i38 < iZzb6; i38++) {
                                        i36 += iArr2[iArr[i38]];
                                        while (i37 < i36) {
                                            zzagjVar.zzc(iZzb9);
                                            i37++;
                                        }
                                    }
                                }
                                i25++;
                                iZzb3 = i11;
                                i22 = 6;
                                i21 = 16;
                                i20 = 2;
                                i24 = 1;
                                i18 = 5;
                            } else {
                                int i39 = 1;
                                int iZzb10 = zzagjVar.zzb(i22) + 1;
                                int i40 = 0;
                                while (i40 < iZzb10) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int iZzb11 = zzagjVar.zzb(i22) + i39;
                                    int i41 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i42 = 0; i42 < iZzb11; i42++) {
                                        iArr3[i42] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i43 = 0;
                                    while (i43 < iZzb11) {
                                        int i44 = 0;
                                        while (i44 < i41) {
                                            if ((iArr3[i43] & (1 << i44)) != 0) {
                                                zzagjVar.zzc(i41);
                                            }
                                            i44++;
                                            i41 = 8;
                                        }
                                        i43++;
                                        i41 = 8;
                                    }
                                    i40++;
                                    i22 = 6;
                                    i39 = 1;
                                }
                                int iZzb12 = zzagjVar.zzb(i22) + 1;
                                for (int i45 = 0; i45 < iZzb12; i45++) {
                                    int iZzb13 = zzagjVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb13).length() + 41);
                                        sb3.append("mapping type other than 0 not supported: ");
                                        sb3.append(iZzb13);
                                        zzee.zze("VorbisUtil", sb3.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int iZzb14 = zzagjVar.zzb(8) + i10;
                                            for (int i46 = 0; i46 < iZzb14; i46++) {
                                                int i47 = i17 - 1;
                                                zzagjVar.zzc(zzagn.zza(i47));
                                                zzagjVar.zzc(zzagn.zza(i47));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i48 = 0; i48 < i17; i48++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < iZzb; i49++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzagjVar.zzb(6) + 1;
                                zzagl[] zzaglVarArr = new zzagl[iZzb15];
                                for (int i50 = 0; i50 < iZzb15; i50++) {
                                    zzaglVarArr[i50] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar3, zzagkVar, bArr, zzaglVarArr, zzagn.zza(iZzb15 - 1));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int iZzd = zzagjVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzagjVar.zzb(16);
                        int iZzb17 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagjVar.zzb(zzagn.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagjVar.zza();
                            for (int i51 = 0; i51 < iZzb17; i51++) {
                                if (!zZza) {
                                    zzagjVar.zzc(5);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzagjVar.zzb(i13);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzagmVar = zzagmVar2;
                            }
                            i19++;
                            zzagmVar2 = zzagmVar;
                            i13 = 4;
                        } else {
                            i20 = iZzb19;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int iZzb20 = zzagjVar.zzb(i13) + 1;
                        zzagjVar.zzc(1);
                        if (i20 != 1) {
                            zzagmVar = zzagmVar2;
                            jFloor = ((long) iZzb16) * ((long) iZzb17);
                        } else if (iZzb16 != 0) {
                            zzagmVar = zzagmVar2;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16)));
                        } else {
                            zzagmVar = zzagmVar2;
                            jFloor = 0;
                        }
                        zzagjVar.zzc((int) (jFloor * ((long) iZzb20)));
                        i19++;
                        zzagmVar2 = zzagmVar;
                        i13 = 4;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar4 = zzaluVar.zza;
        arrayList.add(zzagmVar4.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar4.zzd);
        zztVar.zzi(zzagmVar4.zzc);
        zztVar.zzE(zzagmVar4.zza);
        zztVar.zzF(zzagmVar4.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzapVarZzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zzj(long j10) {
        super.zzj(j10);
        this.zzc = j10 != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }
}
