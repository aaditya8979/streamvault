package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(iZzt, iZzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i10) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11 = 8;
        int iZzj5 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzj6 = zzeqVar.zzj(i11);
            int iZzj7 = zzeqVar.zzj(i11);
            int i13 = i12 - 2;
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeqVar.zzj(i11);
                iZzj4 = zzeqVar.zzj(i11);
                iZzj = zzeqVar.zzj(i11);
                iZzj2 = zzeqVar.zzj(i11);
                i12 = i13 - 4;
            } else {
                int iZzj8 = zzeqVar.zzj(6) << 2;
                int iZzj9 = zzeqVar.zzj(4) << 4;
                i12 = i13 - 2;
                iZzj = zzeqVar.zzj(4) << 4;
                iZzj2 = zzeqVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d10 = iZzj3;
            String str = zzfj.zza;
            double d11 = iZzj4 - 128;
            double d12 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i11 = 8;
        }
        return new zzamj(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int iZzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int iZzj2 = zzeqVar.zzj(2);
        boolean zZzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeqVar.zzj(16);
                int iZzj4 = zzeqVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeqVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeqVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzaml(iZzj, zZzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaml(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzg(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzg(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzh(byte[] r24, int[] r25, int r26, int r27, int r28, @androidx.annotation.Nullable android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i10, int i11, zzeq zzeqVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzeqVar.zzj(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzalx zzalxVar;
        char c10;
        char c11;
        char c12;
        int i12;
        zzamq zzamqVar;
        zzamk zzamkVar;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        zzamo zzamoVar;
        int i16;
        int i17;
        zzamo zzamoVar2;
        int i18;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i19;
        int iZzj5;
        zzeq zzeqVar = new zzeq(bArr, i10 + i11);
        zzeqVar.zzf(i10);
        while (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
            zzamq zzamqVar2 = this.zzi;
            int iZzj6 = zzeqVar.zzj(8);
            int iZzj7 = zzeqVar.zzj(16);
            int iZzj8 = zzeqVar.zzj(16);
            int iZze = zzeqVar.zze() + iZzj8;
            if (iZzj8 * 8 > zzeqVar.zzc()) {
                zzee.zzc("DvbParser", "Data field length exceeds limit");
                zzeqVar.zzh(zzeqVar.zzc());
            } else {
                switch (iZzj6) {
                    case 16:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzamm zzammVar = zzamqVar2.zzi;
                            int iZzj9 = zzeqVar.zzj(8);
                            int iZzj10 = zzeqVar.zzj(4);
                            int iZzj11 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            SparseArray sparseArray = new SparseArray();
                            for (int i20 = iZzj8 - 2; i20 > 0; i20 -= 6) {
                                int iZzj12 = zzeqVar.zzj(8);
                                zzeqVar.zzh(8);
                                sparseArray.put(iZzj12, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                            }
                            zzamm zzammVar2 = new zzamm(iZzj9, iZzj10, iZzj11, sparseArray);
                            if (zzammVar2.zzb != 0) {
                                zzamqVar2.zzi = zzammVar2;
                                zzamqVar2.zzc.clear();
                                zzamqVar2.zzd.clear();
                                zzamqVar2.zze.clear();
                            } else if (zzammVar != null) {
                                if (zzammVar.zza != zzammVar2.zza) {
                                    zzamqVar2.zzi = zzammVar2;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzamm zzammVar3 = zzamqVar2.zzi;
                        if (iZzj7 == zzamqVar2.zza && zzammVar3 != null) {
                            int iZzj13 = zzeqVar.zzj(8);
                            zzeqVar.zzh(4);
                            boolean zZzi = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int iZzj14 = zzeqVar.zzj(16);
                            int iZzj15 = zzeqVar.zzj(16);
                            int iZzj16 = zzeqVar.zzj(3);
                            int iZzj17 = zzeqVar.zzj(3);
                            zzeqVar.zzh(2);
                            int iZzj18 = zzeqVar.zzj(8);
                            int iZzj19 = zzeqVar.zzj(8);
                            int iZzj20 = zzeqVar.zzj(4);
                            int iZzj21 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            int i21 = iZzj8 - 10;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i21 > 0) {
                                int iZzj22 = zzeqVar.zzj(16);
                                int iZzj23 = zzeqVar.zzj(2);
                                int iZzj24 = zzeqVar.zzj(2);
                                int iZzj25 = zzeqVar.zzj(12);
                                zzeqVar.zzh(4);
                                int iZzj26 = zzeqVar.zzj(12);
                                i21 -= 6;
                                if (iZzj23 == 1) {
                                    i21 -= 2;
                                    i18 = iZzj23;
                                    iZzj = zzeqVar.zzj(8);
                                    iZzj2 = zzeqVar.zzj(8);
                                } else if (iZzj23 == 2) {
                                    iZzj23 = 2;
                                    i21 -= 2;
                                    i18 = iZzj23;
                                    iZzj = zzeqVar.zzj(8);
                                    iZzj2 = zzeqVar.zzj(8);
                                } else {
                                    i18 = iZzj23;
                                    iZzj = 0;
                                    iZzj2 = 0;
                                }
                                sparseArray2.put(iZzj22, new zzamp(i18, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                            }
                            zzamo zzamoVar3 = new zzamo(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                            if (zzammVar3.zzb == 0 && (zzamoVar2 = (zzamo) zzamqVar2.zzc.get(zzamoVar3.zza)) != null) {
                                int i22 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = zzamoVar2.zzj;
                                    if (i22 < sparseArray3.size()) {
                                        zzamoVar3.zzj.put(sparseArray3.keyAt(i22), (zzamp) sparseArray3.valueAt(i22));
                                        i22++;
                                    }
                                }
                            }
                            zzamqVar2.zzc.put(zzamoVar3.zza, zzamoVar3);
                        }
                        break;
                    case 18:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzamj zzamjVarZzb = zzb(zzeqVar, iZzj8);
                            zzamqVar2.zzd.put(zzamjVarZzb.zza, zzamjVarZzb);
                        } else if (iZzj7 == zzamqVar2.zzb) {
                            zzamj zzamjVarZzb2 = zzb(zzeqVar, iZzj8);
                            zzamqVar2.zzf.put(zzamjVarZzb2.zza, zzamjVarZzb2);
                        }
                        break;
                    case 19:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzaml zzamlVarZzc = zzc(zzeqVar);
                            zzamqVar2.zze.put(zzamlVarZzc.zza, zzamlVarZzc);
                        } else if (iZzj7 == zzamqVar2.zzb) {
                            zzaml zzamlVarZzc2 = zzc(zzeqVar);
                            zzamqVar2.zzg.put(zzamlVarZzc2.zza, zzamlVarZzc2);
                        }
                        break;
                    case 20:
                        if (iZzj7 == zzamqVar2.zza) {
                            zzeqVar.zzh(4);
                            boolean zZzi2 = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int iZzj27 = zzeqVar.zzj(16);
                            int iZzj28 = zzeqVar.zzj(16);
                            if (zZzi2) {
                                int iZzj29 = zzeqVar.zzj(16);
                                iZzj3 = zzeqVar.zzj(16);
                                iZzj5 = zzeqVar.zzj(16);
                                iZzj4 = zzeqVar.zzj(16);
                                i19 = iZzj29;
                            } else {
                                iZzj3 = iZzj27;
                                iZzj4 = iZzj28;
                                i19 = 0;
                                iZzj5 = 0;
                            }
                            zzamqVar2.zzh = new zzamk(iZzj27, iZzj28, i19, iZzj3, iZzj5, iZzj4);
                        }
                        break;
                }
                zzeqVar.zzo(iZze - zzeqVar.zze());
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar2 = zzamqVar3.zzh;
            if (zzamkVar2 == null) {
                zzamkVar2 = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar2.zza + 1 != bitmap.getWidth() || zzamkVar2.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamkVar2.zza + 1, zzamkVar2.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i23 = 0;
            while (i23 < sparseArray4.size()) {
                Canvas canvas = this.zzf;
                canvas.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i23);
                zzamo zzamoVar4 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i23));
                int i24 = zzamnVar.zza + zzamkVar2.zzc;
                int i25 = zzamnVar.zzb + zzamkVar2.zze;
                int i26 = zzamoVar4.zzc;
                int i27 = i24 + i26;
                int iMin = Math.min(i27, zzamkVar2.zzd);
                int i28 = zzamoVar4.zzd;
                int i29 = i25 + i28;
                canvas.clipRect(i24, i25, iMin, Math.min(i29, zzamkVar2.zzf));
                int i30 = zzamoVar4.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i30);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i30)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar4.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i31 = i27;
                int i32 = 0;
                while (i32 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i32);
                    SparseArray sparseArray7 = sparseArray5;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i32);
                    int i33 = i26;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(iKeyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(iKeyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        int i34 = zzamoVar4.zze;
                        zzamqVar = zzamqVar3;
                        int i35 = zzampVar.zza + i24;
                        int i36 = zzampVar.zzb + i25;
                        int i37 = i24;
                        int[] iArr = i34 == 3 ? zzamjVar.zzd : i34 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i14 = i23;
                        i16 = i31;
                        arrayList = arrayList2;
                        zzamkVar = zzamkVar2;
                        i17 = i33;
                        i15 = i37;
                        i13 = i28;
                        zzamoVar = zzamoVar4;
                        zzh(zzamlVar.zzc, iArr, i34, i35, i36, paint, canvas);
                        zzh(zzamlVar.zzd, iArr, i34, i35, i36 + 1, paint, canvas);
                    } else {
                        zzamqVar = zzamqVar3;
                        zzamkVar = zzamkVar2;
                        i13 = i28;
                        i14 = i23;
                        arrayList = arrayList2;
                        i15 = i24;
                        zzamoVar = zzamoVar4;
                        i16 = i31;
                        i17 = i33;
                    }
                    i32++;
                    i24 = i15;
                    zzamoVar4 = zzamoVar;
                    i31 = i16;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                    i23 = i14;
                    arrayList2 = arrayList;
                    zzamkVar2 = zzamkVar;
                    i28 = i13;
                    i26 = i17;
                }
                zzamq zzamqVar4 = zzamqVar3;
                zzamk zzamkVar3 = zzamkVar2;
                int i38 = i28;
                int i39 = i23;
                ArrayList arrayList3 = arrayList2;
                int i40 = i26;
                int i41 = i24;
                zzamo zzamoVar5 = zzamoVar4;
                int i42 = i31;
                float f10 = i25;
                float f11 = i41;
                if (zzamoVar5.zzb) {
                    int i43 = zzamoVar5.zze;
                    if (i43 == 3) {
                        i12 = zzamjVar.zzd[zzamoVar5.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i43 == 2 ? zzamjVar.zzc[zzamoVar5.zzh] : zzamjVar.zzb[zzamoVar5.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i29;
                    float f13 = i42;
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(f11, f10, f13, f12, paint2);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i41, i25, i40, i38));
                zzamkVar2 = zzamkVar3;
                float f14 = zzamkVar2.zza;
                zzcwVar.zzi(f11 / f14);
                zzcwVar.zzj(0);
                float f15 = zzamkVar2.zzb;
                zzcwVar.zzf(f10 / f15, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i40 / f14);
                zzcwVar.zzn(i38 / f15);
                arrayList3.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                sparseArray4 = sparseArray6;
                arrayList2 = arrayList3;
                i23 = i39 + 1;
                zzamqVar3 = zzamqVar4;
            }
            zzalxVar = new zzalx(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
