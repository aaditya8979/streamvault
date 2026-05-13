package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafo {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final zzgj zzo;

    private zzafo(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, @Nullable String str, @Nullable zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = i19;
        this.zzj = i20;
        this.zzk = i21;
        this.zzl = f10;
        this.zzm = i22;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafo zza(zzer zzerVar) throws zzat {
        return zzc(zzerVar, false, null);
    }

    public static zzafo zzb(zzer zzerVar, zzgj zzgjVar) throws zzat {
        return zzc(zzerVar, true, zzgjVar);
    }

    private static zzafo zzc(zzer zzerVar, boolean z10, @Nullable zzgj zzgjVar) throws zzat {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        zzgf zzgfVar;
        int iMax;
        boolean z12;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17 = 4;
        boolean z13 = true;
        try {
            if (z10) {
                zzerVar.zzk(4);
            } else {
                zzerVar.zzk(21);
            }
            int iZzs = zzerVar.zzs() & 3;
            int iZzs2 = zzerVar.zzs();
            int iZzg = zzerVar.zzg();
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < iZzs2; i20++) {
                zzerVar.zzk(1);
                int iZzt = zzerVar.zzt();
                for (int i21 = 0; i21 < iZzt; i21++) {
                    int iZzt2 = zzerVar.zzt();
                    i19 += iZzt2 + 4;
                    zzerVar.zzk(iZzt2);
                }
            }
            zzerVar.zzh(iZzg);
            byte[] bArr = new byte[i19];
            zzgj zzgjVar2 = zzgjVar;
            int i22 = 0;
            float f10 = 1.0f;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            int i32 = -1;
            int i33 = -1;
            int i34 = -1;
            String strZzb = null;
            int i35 = 0;
            while (i35 < iZzs2) {
                int iZzs3 = zzerVar.zzs() & 63;
                int iZzt3 = zzerVar.zzt();
                int i36 = i18;
                zzgj zzgjVarZzf = zzgjVar2;
                while (i36 < iZzt3) {
                    try {
                        int iZzt4 = zzerVar.zzt();
                        int i37 = iZzs2;
                        System.arraycopy(zzgm.zza, i18, bArr, i22, i17);
                        int i38 = i22 + 4;
                        System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i38, iZzt4);
                        int i39 = 32;
                        if (iZzs3 == 32) {
                            if (i36 == 0) {
                                zzgjVarZzf = zzgm.zzf(bArr, i38, i38 + iZzt4);
                                i36 = i18;
                                i10 = iZzt3;
                                i11 = iZzs3;
                            }
                            i22 = i38 + iZzt4;
                            zzerVar.zzk(iZzt4);
                            i36++;
                            iZzs2 = i37;
                            iZzt3 = i10;
                            iZzs3 = i11;
                            i17 = 4;
                        } else {
                            i39 = iZzs3;
                        }
                        if (i39 != 33) {
                            i10 = iZzt3;
                            i11 = iZzs3;
                            if (i39 == 39 && i36 == 0) {
                                int i40 = i38 + 2;
                                int i41 = (i38 + iZzt4) - 1;
                                while (true) {
                                    byte b10 = bArr[i41];
                                    if (b10 != 0) {
                                        if (b10 == 0 || i41 <= i40) {
                                            break;
                                        }
                                        zzgn zzgnVar = new zzgn(bArr, i40, i41 + 1);
                                        while (zzgnVar.zzd(16)) {
                                            int iZzf = zzgnVar.zzf(8);
                                            int i42 = 0;
                                            while (iZzf == 255) {
                                                i42 += 255;
                                                iZzf = zzgnVar.zzf(8);
                                            }
                                            int i43 = i42 + iZzf;
                                            int iZzf2 = zzgnVar.zzf(8);
                                            int i44 = 0;
                                            while (iZzf2 == 255) {
                                                i44 += 255;
                                                iZzf2 = zzgnVar.zzf(8);
                                            }
                                            int i45 = i44 + iZzf2;
                                            if (i45 == 0 || !zzgnVar.zzd(i45)) {
                                                break;
                                            }
                                            if (i43 == 176) {
                                                int iZzg2 = zzgnVar.zzg();
                                                boolean zZze = zzgnVar.zze();
                                                int iZzg3 = zZze ? zzgnVar.zzg() : 0;
                                                int iZzg4 = zzgnVar.zzg();
                                                int i46 = 0;
                                                int iZzg5 = -1;
                                                int iZzg6 = -1;
                                                int i47 = -1;
                                                int iZzf3 = -1;
                                                int i48 = -1;
                                                int iZzf4 = -1;
                                                while (i46 <= iZzg4) {
                                                    iZzg5 = zzgnVar.zzg();
                                                    iZzg6 = zzgnVar.zzg();
                                                    i12 = i36;
                                                    int iZzf5 = zzgnVar.zzf(6);
                                                    if (iZzf5 != 63) {
                                                        if (iZzf5 == 0) {
                                                            i13 = i23;
                                                            iMax = Math.max(0, iZzg2 - 30);
                                                        } else {
                                                            i13 = i23;
                                                            iMax = Math.max(0, (iZzf5 + iZzg2) - 31);
                                                        }
                                                        iZzf3 = zzgnVar.zzf(iMax);
                                                        if (zZze) {
                                                            int iZzf6 = zzgnVar.zzf(6);
                                                            if (iZzf6 != 63) {
                                                                if (iZzf6 == 0) {
                                                                    z12 = zZze;
                                                                    iMax2 = Math.max(0, iZzg3 - 30);
                                                                } else {
                                                                    z12 = zZze;
                                                                    iMax2 = Math.max(0, (iZzf6 + iZzg3) - 31);
                                                                }
                                                                iZzf4 = zzgnVar.zzf(iMax2);
                                                                i48 = iZzf6;
                                                            }
                                                        } else {
                                                            z12 = zZze;
                                                        }
                                                        if (zzgnVar.zze()) {
                                                            zzgnVar.zzb(10);
                                                        }
                                                        i46++;
                                                        i47 = iZzf5;
                                                        i36 = i12;
                                                        zZze = z12;
                                                        i23 = i13;
                                                    }
                                                }
                                                i12 = i36;
                                                i13 = i23;
                                                zzgfVar = new zzgf(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i47, iZzf3, i48, iZzf4);
                                            } else {
                                                zzgnVar.zzb(i45 * 8);
                                                i36 = i36;
                                                i23 = i23;
                                            }
                                        }
                                        i22 = i38 + iZzt4;
                                        zzerVar.zzk(iZzt4);
                                        i36++;
                                        iZzs2 = i37;
                                        iZzt3 = i10;
                                        iZzs3 = i11;
                                        i17 = 4;
                                    } else {
                                        if (i41 <= i40) {
                                            break;
                                        }
                                        i41--;
                                    }
                                }
                                i12 = i36;
                                i13 = i23;
                                zzgfVar = null;
                                if (zzgfVar != null && zzgjVarZzf != null) {
                                    i18 = 0;
                                    if (zzgfVar.zza == ((zzfz) zzgjVarZzf.zza.get(0)).zzb) {
                                        i36 = i12;
                                        i23 = i13;
                                        i33 = 4;
                                        i22 = i38 + iZzt4;
                                        zzerVar.zzk(iZzt4);
                                        i36++;
                                        iZzs2 = i37;
                                        iZzt3 = i10;
                                        iZzs3 = i11;
                                        i17 = 4;
                                    } else {
                                        i33 = 5;
                                    }
                                }
                                i36 = i12;
                                i23 = i13;
                                i22 = i38 + iZzt4;
                                zzerVar.zzk(iZzt4);
                                i36++;
                                iZzs2 = i37;
                                iZzt3 = i10;
                                iZzs3 = i11;
                                i17 = 4;
                            } else {
                                i12 = i36;
                                i13 = i23;
                            }
                        } else if (i36 == 0) {
                            zzgg zzggVarZzg = zzgm.zzg(bArr, i38, i38 + iZzt4, zzgjVarZzf);
                            int i49 = zzggVarZzg.zza + 1;
                            int i50 = zzggVarZzg.zze;
                            int i51 = zzggVarZzg.zzf;
                            int i52 = zzggVarZzg.zzg;
                            int i53 = zzggVarZzg.zzh;
                            i28 = zzggVarZzg.zzc + 8;
                            int i54 = zzggVarZzg.zzd + 8;
                            int i55 = zzggVarZzg.zzk;
                            int i56 = zzggVarZzg.zzl;
                            int i57 = zzggVarZzg.zzm;
                            float f11 = zzggVarZzg.zzi;
                            int i58 = zzggVarZzg.zzj;
                            zzgb zzgbVar = zzggVarZzg.zzb;
                            if (zzgbVar != null) {
                                i14 = i58;
                                i15 = i51;
                                i10 = iZzt3;
                                i11 = iZzs3;
                                i16 = i50;
                                strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                            } else {
                                i14 = i58;
                                i15 = i51;
                                i10 = iZzt3;
                                i11 = iZzs3;
                                i16 = i50;
                            }
                            i23 = i49;
                            i24 = i16;
                            i18 = 0;
                            i26 = i52;
                            i25 = i15;
                            i34 = i14;
                            f10 = f11;
                            i32 = i57;
                            i31 = i56;
                            i30 = i55;
                            i29 = i54;
                            i27 = i53;
                            i22 = i38 + iZzt4;
                            zzerVar.zzk(iZzt4);
                            i36++;
                            iZzs2 = i37;
                            iZzt3 = i10;
                            iZzs3 = i11;
                            i17 = 4;
                        } else {
                            i10 = iZzt3;
                            i11 = iZzs3;
                            i12 = i36;
                            i13 = i23;
                        }
                        i18 = 0;
                        i36 = i12;
                        i23 = i13;
                        i22 = i38 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i36++;
                        iZzs2 = i37;
                        iZzt3 = i10;
                        iZzs3 = i11;
                        i17 = 4;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        e = e10;
                        z11 = true;
                        throw zzat.zzb("Error parsing".concat(z11 != z10 ? "HEVC config" : "L-HEVC config"), e);
                    }
                }
                i35++;
                zzgjVar2 = zzgjVarZzf;
                i17 = 4;
                z13 = true;
            }
            return new zzafo(i19 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzs + 1, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, f10, i34, strZzb, zzgjVar2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            z11 = z13;
        }
    }
}
