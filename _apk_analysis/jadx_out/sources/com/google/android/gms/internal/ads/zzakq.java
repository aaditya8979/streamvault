package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzakq {
    public static void zza(int i10, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzgufVarZzd = zzapVar.zzd(zzfs.class);
            int size = zzgufVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzfs zzfsVar = (zzfs) zzgufVarZzd.get(i11);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i10, zzafn zzafnVar, zzt zztVar) {
        if (i10 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0286 A[Catch: all -> 0x01fe, TryCatch #0 {all -> 0x01fe, blocks: (B:9:0x0030, B:11:0x003b, B:13:0x0047, B:16:0x0053, B:19:0x0060, B:22:0x006d, B:25:0x007a, B:28:0x0087, B:30:0x0093, B:37:0x00ac, B:38:0x00ca, B:39:0x00dd, B:42:0x00e9, B:45:0x00f6, B:48:0x0103, B:51:0x0110, B:54:0x011d, B:57:0x012a, B:60:0x0137, B:63:0x0144, B:66:0x0151, B:69:0x0161, B:73:0x0175, B:75:0x017b, B:77:0x0190, B:78:0x0197, B:80:0x019e, B:85:0x01a9, B:90:0x01b5, B:136:0x0286, B:91:0x01ca, B:93:0x01d1, B:95:0x01dd, B:96:0x01f1, B:111:0x021e, B:114:0x022b, B:117:0x0238, B:120:0x0245, B:123:0x0251, B:126:0x025d, B:129:0x0267, B:132:0x0273, B:135:0x027f, B:137:0x02a3, B:138:0x02aa), top: B:143:0x0022 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzer r13) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakq.zzc(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzao");
    }

    @Nullable
    private static zzais zzd(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(iZzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    @Nullable
    private static zzain zze(int i10, String str, zzer zzerVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzerVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z10 ? new zzais(str, null, zzguf.zzj(Integer.toString(iZzf))) : new zzaih("und", str, Integer.toString(iZzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 == 1) {
                return zzerVar.zzs();
            }
            if (i10 == 2) {
                return zzerVar.zzt();
            }
            if (i10 == 3) {
                return zzerVar.zzx();
            }
            if (i10 == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzais zzg(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && iZzB >= 22) {
            zzerVar.zzk(10);
            int iZzt = zzerVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzerVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i10)));
        return null;
    }
}
