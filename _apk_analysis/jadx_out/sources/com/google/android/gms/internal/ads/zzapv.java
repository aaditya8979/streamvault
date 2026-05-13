package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzapv implements zzapn {
    public final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i10) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzfg zzfgVar;
        int i10;
        zzfg zzfgVar2;
        int i11;
        zzeq zzeqVar;
        int i12;
        if (zzerVar.zzs() == 2) {
            zzapx zzapxVar = this.zza;
            zzfg zzfgVar3 = (zzfg) zzapxVar.zzh().get(0);
            if ((zzerVar.zzs() & 128) != 0) {
                zzerVar.zzk(1);
                int iZzt = zzerVar.zzt();
                int i13 = 3;
                zzerVar.zzk(3);
                zzeq zzeqVar2 = this.zzb;
                zzerVar.zzl(zzeqVar2, 2);
                zzeqVar2.zzh(3);
                int i14 = 13;
                zzapxVar.zzq(zzeqVar2.zzj(13));
                zzerVar.zzl(zzeqVar2, 2);
                int i15 = 4;
                zzeqVar2.zzh(4);
                int i16 = 12;
                zzerVar.zzk(zzeqVar2.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int iZzd = zzerVar.zzd();
                while (iZzd > 0) {
                    zzerVar.zzl(zzeqVar2, 5);
                    int iZzj = zzeqVar2.zzj(8);
                    zzeqVar2.zzh(i13);
                    int iZzj2 = zzeqVar2.zzj(i14);
                    zzeqVar2.zzh(i15);
                    int iZzj3 = zzeqVar2.zzj(i16);
                    int iZzg = zzerVar.zzg();
                    int i17 = iZzg + iZzj3;
                    int i18 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int iZzs = 0;
                    while (zzerVar.zzg() < i17) {
                        int iZzs2 = zzerVar.zzs();
                        int iZzg2 = zzerVar.zzg() + zzerVar.zzs();
                        if (iZzg2 > i17) {
                            break;
                        }
                        if (iZzs2 == 5) {
                            long jZzz = zzerVar.zzz();
                            if (jZzz != 1094921523) {
                                if (jZzz != 1161904947) {
                                    if (jZzz != 1094921524) {
                                        if (jZzz == 1212503619) {
                                            i12 = 36;
                                            i18 = i12;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i11 = iZzt;
                                        zzeqVar = zzeqVar2;
                                    }
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                    i18 = 172;
                                }
                                zzfgVar2 = zzfgVar3;
                                i11 = iZzt;
                                zzeqVar = zzeqVar2;
                                i18 = 135;
                            }
                            zzfgVar2 = zzfgVar3;
                            i11 = iZzt;
                            i18 = 129;
                            zzeqVar = zzeqVar2;
                        } else if (iZzs2 == 106) {
                            zzfgVar2 = zzfgVar3;
                            i11 = iZzt;
                            i18 = 129;
                            zzeqVar = zzeqVar2;
                        } else {
                            if (iZzs2 != 122) {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzerVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i12 = 136;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i12 = 139;
                                            }
                                            zzfgVar2 = zzfgVar3;
                                            i11 = iZzt;
                                            zzeqVar = zzeqVar2;
                                        }
                                        i18 = i12;
                                        zzfgVar2 = zzfgVar3;
                                        i11 = iZzt;
                                        zzeqVar = zzeqVar2;
                                    }
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                    i18 = 172;
                                } else if (iZzs2 == 123) {
                                    i12 = 138;
                                    i18 = i12;
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzerVar.zzs();
                                    str = strTrim;
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzerVar.zzg() < iZzg2) {
                                        zzeq zzeqVar3 = zzeqVar2;
                                        String strTrim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzerVar.zzs();
                                        zzfg zzfgVar4 = zzfgVar3;
                                        byte[] bArr = new byte[4];
                                        zzerVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzapy(strTrim2, iZzs4, bArr));
                                        zzfgVar3 = zzfgVar4;
                                        zzeqVar2 = zzeqVar3;
                                        iZzt = iZzt;
                                    }
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                    arrayList = arrayList2;
                                    i18 = 89;
                                } else {
                                    zzfgVar2 = zzfgVar3;
                                    i11 = iZzt;
                                    zzeqVar = zzeqVar2;
                                    if (iZzs2 == 111) {
                                        i18 = 257;
                                    }
                                }
                            }
                            zzfgVar2 = zzfgVar3;
                            i11 = iZzt;
                            zzeqVar = zzeqVar2;
                            i18 = 135;
                        }
                        zzerVar.zzk(iZzg2 - zzerVar.zzg());
                        zzfgVar3 = zzfgVar2;
                        zzeqVar2 = zzeqVar;
                        iZzt = i11;
                    }
                    zzfg zzfgVar5 = zzfgVar3;
                    int i19 = iZzt;
                    zzeq zzeqVar4 = zzeqVar2;
                    zzerVar.zzh(i17);
                    zzapz zzapzVar = new zzapz(i18, str, iZzs, arrayList, Arrays.copyOfRange(zzerVar.zzi(), iZzg, i17));
                    if (iZzj == 6 || iZzj == 5) {
                        iZzj = zzapzVar.zza;
                    }
                    iZzd -= iZzj3 + 5;
                    if (!zzapxVar.zzk().get(iZzj2)) {
                        zzaqc zzaqcVarZzb = zzapxVar.zzi().zzb(iZzj, zzapzVar);
                        sparseIntArray.put(iZzj2, iZzj2);
                        sparseArray.put(iZzj2, zzaqcVarZzb);
                    }
                    i15 = 4;
                    zzfgVar3 = zzfgVar5;
                    zzeqVar2 = zzeqVar4;
                    iZzt = i19;
                    i13 = 3;
                    i14 = 13;
                    i16 = 12;
                }
                zzfg zzfgVar6 = zzfgVar3;
                int i20 = iZzt;
                int size = sparseIntArray.size();
                int i21 = 0;
                while (i21 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i21);
                    int iValueAt = sparseIntArray.valueAt(i21);
                    zzapxVar.zzk().put(iKeyAt, true);
                    zzapxVar.zzl().put(iValueAt, true);
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i21);
                    if (zzaqcVar != null) {
                        i10 = i20;
                        zzfgVar = zzfgVar6;
                        zzaqcVar.zza(zzfgVar, zzapxVar.zzm(), new zzaqb(i10, iKeyAt, 8192));
                        zzapxVar.zzj().put(iValueAt, zzaqcVar);
                    } else {
                        zzfgVar = zzfgVar6;
                        i10 = i20;
                    }
                    i21++;
                    zzfgVar6 = zzfgVar;
                    i20 = i10;
                }
                zzapxVar.zzj().remove(this.zze);
                zzapxVar.zzo(0);
                if (zzapxVar.zzn() == 0) {
                    zzapxVar.zzm().zzv();
                    zzapxVar.zzp(true);
                }
            }
        }
    }
}
