package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0e01  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzfu r78, com.google.android.gms.internal.ads.zzafn r79, long r80, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzq r82, boolean r83, boolean r84, com.google.android.gms.internal.ads.zzgqt r85, boolean r86) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 3602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzb(com.google.android.gms.internal.ads.zzfu, com.google.android.gms.internal.ads.zzafn, long, com.google.android.gms.internal.ads.zzq, boolean, boolean, com.google.android.gms.internal.ads.zzgqt, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzap zzc(com.google.android.gms.internal.ads.zzfv r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzc(com.google.android.gms.internal.ads.zzfv):com.google.android.gms.internal.ads.zzap");
    }

    public static zzfy zzd(zzer zzerVar) {
        long jZzD;
        long jZzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            jZzD = zzerVar.zzz();
            jZzD2 = zzerVar.zzz();
        } else {
            jZzD = zzerVar.zzD();
            jZzD2 = zzerVar.zzD();
        }
        return new zzfy(jZzD, jZzD2, zzerVar.zzz());
    }

    @Nullable
    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzfvVarZzc = zzfuVar.zzc(1751411826);
        zzfv zzfvVarZzc2 = zzfuVar.zzc(1801812339);
        zzfv zzfvVarZzc3 = zzfuVar.zzc(1768715124);
        if (zzfvVarZzc != null && zzfvVarZzc2 != null && zzfvVarZzc3 != null && zzi(zzfvVarZzc.zza) == 1835299937) {
            zzer zzerVar = zzfvVarZzc2.zza;
            zzerVar.zzh(12);
            int iZzB = zzerVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i10 = 0; i10 < iZzB; i10++) {
                int iZzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i10] = zzerVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzfvVarZzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int iZzg = zzerVar2.zzg() + zzerVar2.zzB();
                int iZzB3 = zzerVar2.zzB() - 1;
                if (iZzB3 < 0 || iZzB3 >= iZzB) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb2.append("Skipped metadata with unknown key index: ");
                    sb2.append(iZzB3);
                    zzee.zzc("BoxParsers", sb2.toString());
                } else {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzerVar2.zzg();
                        if (iZzg2 >= iZzg) {
                            zzfsVar = null;
                            break;
                        }
                        int iZzB4 = zzerVar2.zzB();
                        if (zzerVar2.zzB() == 1684108385) {
                            int iZzB5 = zzerVar2.zzB();
                            int iZzB6 = zzerVar2.zzB();
                            int i11 = iZzB4 - 16;
                            byte[] bArr = new byte[i11];
                            zzerVar2.zzm(bArr, 0, i11);
                            zzfsVar = new zzfs(str, bArr, iZzB6, iZzB5);
                            break;
                        }
                        zzerVar2.zzh(iZzg2 + iZzB4);
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                }
                zzerVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzerVar.zzh(iZzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzalf zzg(com.google.android.gms.internal.ads.zzalc r45, com.google.android.gms.internal.ads.zzfu r46, com.google.android.gms.internal.ads.zzafn r47, boolean r48) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzg(com.google.android.gms.internal.ads.zzalc, com.google.android.gms.internal.ads.zzfu, com.google.android.gms.internal.ads.zzafn, boolean):com.google.android.gms.internal.ads.zzalf");
    }

    @Nullable
    private static zzap zzh(zzer zzerVar) {
        short sZzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String strZzK = zzerVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    private static String zzj(byte[] bArr, int i10, int i11) {
        zzgrc.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            int iZze = zzgxz.zze(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3]);
            String str = zzfj.zza;
            int i13 = ((iZze >> 8) & 255) - 128;
            int i14 = (iZze >> 16) & 255;
            int i15 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i14 + ((i15 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i13 * 14075) / 10000) + i14, 255)) << 16) | (Math.max(0, Math.min((i14 - ((i15 * 3455) / 10000)) - ((i13 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgqw.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 7 + String.valueOf(i11).length() + 10 + strZzd.length() + 1);
        sb2.append("size: ");
        sb2.append(i10);
        sb2.append(VastAttributes.HORIZONTAL_POSITION);
        sb2.append(i11);
        sb2.append("\npalette: ");
        sb2.append(strZzd);
        sb2.append("\n");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzi zzk(com.google.android.gms.internal.ads.zzer r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzk(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzi");
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(bArrZzi, bArrZzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int iZzj = zzeqVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzeqVar.zzo(1);
            int iZzj2 = zzeqVar.zzj(8);
            for (int i11 = 0; i11 < iZzj2; i11++) {
                zzeqVar.zzh(6);
                boolean zZzi = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int iZzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzeqVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeqVar.zzj(8);
                    int iZzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zZzi2 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Nullable
    private static Pair zzn(zzfu zzfuVar) {
        zzfv zzfvVarZzc = zzfuVar.zzc(1701606260);
        if (zzfvVarZzc == null) {
            return null;
        }
        zzer zzerVar = zzfvVarZzc.zza;
        zzerVar.zzh(8);
        int iZza = zza(zzerVar.zzB());
        int iZzH = zzerVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i10 = 0; i10 < iZzH; i10++) {
            jArr[i10] = iZza == 1 ? zzerVar.zzJ() : zzerVar.zzz();
            jArr2[i10] = iZza == 1 ? zzerVar.zzD() : zzerVar.zzB();
            if (zzerVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzerVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzo(com.google.android.gms.internal.ads.zzer r34, int r35, int r36, int r37, int r38, @androidx.annotation.Nullable java.lang.String r39, boolean r40, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzq r41, com.google.android.gms.internal.ads.zzakd r42, int r43) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzo(com.google.android.gms.internal.ads.zzer, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzq, com.google.android.gms.internal.ads.zzakd, int):void");
    }

    private static zzajy zzp(zzer zzerVar, int i10) {
        zzerVar.zzh(i10 + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int iZzs = zzerVar.zzs();
        if ((iZzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String strZze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzajy(strZze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        long jZzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int iZzs2 = zzs(zzerVar);
        byte[] bArr = new byte[iZzs2];
        zzerVar.zzm(bArr, 0, iZzs2);
        return new zzajy(strZze, bArr, jZzz2 <= 0 ? -1L : jZzz2, jZzz > 0 ? jZzz : -1L);
    }

    private static zzajw zzq(zzer zzerVar, int i10) {
        zzerVar.zzh(i10 + 8);
        zzerVar.zzk(4);
        return new zzajw(zzerVar.zzz(), zzerVar.zzz());
    }

    @Nullable
    private static Pair zzr(zzer zzerVar, int i10, int i11) throws zzat {
        Integer num;
        zzald zzaldVar;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int iZzg = zzerVar.zzg();
        while (iZzg - i10 < i11) {
            zzerVar.zzh(iZzg);
            int iZzB = zzerVar.zzB();
            zzaey.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i14 = iZzg + 8;
                int i15 = 0;
                int i16 = -1;
                String strZzK = null;
                Integer numValueOf = null;
                while (i14 - iZzg < iZzB) {
                    zzerVar.zzh(i14);
                    int iZzB2 = zzerVar.zzB();
                    int iZzB3 = zzerVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzerVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        strZzK = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i16 = i14;
                        i15 = iZzB2;
                    }
                    i14 += iZzB2;
                }
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzaey.zza(numValueOf != null, "frma atom is mandatory");
                    zzaey.zza(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            zzaldVar = null;
                            break;
                        }
                        zzerVar.zzh(i17);
                        int iZzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int iZza = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (iZza == 0) {
                                zzerVar.zzk(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iZzs = zzerVar.zzs();
                                int i18 = (iZzs & 240) >> 4;
                                i12 = iZzs & 15;
                                i13 = i18;
                            }
                            boolean z10 = zzerVar.zzs() == 1;
                            int iZzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z10 && iZzs2 == 0) {
                                int iZzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzerVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            zzaldVar = new zzald(z10, strZzK, iZzs2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += iZzB4;
                        }
                    }
                    zzaey.zza(zzaldVar != null, "tenc atom is mandatory");
                    String str = zzfj.zza;
                    pairCreate = Pair.create(num, zzaldVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzer zzerVar) {
        int iZzs = zzerVar.zzs();
        int i10 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzerVar.zzs();
            i10 = (i10 << 7) | (iZzs & 127);
        }
        return i10;
    }
}
