package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z10 = true; zzerVar.zzd() > 0 && z10; z10 = false) {
                char c10 = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int iZzg = zzerVar.zzg();
                    int iZze = zzerVar.zze();
                    byte[] bArrZzi = zzerVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i10 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i11 = i10 + 1;
                            if (bArrZzi[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i11]) == '*' && ((char) bArrZzi[i12]) == '/') {
                                        iZze = i12 + 1;
                                        i11 = iZze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzerVar.zzk(iZze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    @Nullable
    public static String zzc(zzer zzerVar, StringBuilder sb2) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzerVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzerVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }

    private static String zzd(zzer zzerVar, StringBuilder sb2) {
        boolean z10;
        char c10;
        sb2.setLength(0);
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z10; true) {
                c10 = (char) zzerVar.zzi()[iZzg];
                z10 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb2.append(c10);
            iZzg++;
        }
        zzerVar.zzk(iZzg - zzerVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x030b, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzer r18) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzano.zza(com.google.android.gms.internal.ads.zzer):java.util.List");
    }
}
