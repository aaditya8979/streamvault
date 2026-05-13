package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class zzvg {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzun zza() throws zzuy {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzun) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z10, boolean z11) throws zzuy {
        zzux zzuxVar = new zzux(str, z10, z11);
        HashMap map = zzb;
        List list = (List) map.get(zzuxVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzuxVar, new zzvb(z10, z11, str.equals("video/mv-hevc")));
        if (z10) {
            arrayListZzh.isEmpty();
        }
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzun) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzj(arrayListZzh, new zzvf() { // from class: com.google.android.gms.internal.ads.zzvc
                @Override // com.google.android.gms.internal.ads.zzvf
                public final /* synthetic */ int zza(Object obj) {
                    int i10 = zzvg.zza;
                    String str2 = ((zzun) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzun) arrayListZzh.remove(0));
        }
        zzguf zzgufVarZzq = zzguf.zzq(arrayListZzh);
        map.put(zzuxVar, zzgufVarZzq);
        return zzgufVarZzq;
    }

    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z10, boolean z11) throws zzuy {
        List listZza = zzuwVar.zza(zzvVar.zzo, z10, z11);
        List listZzd = zzd(zzuwVar, zzvVar, z10, z11);
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(listZza);
        zzgucVar.zzh(listZzd);
        return zzgucVar.zzi();
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z10, boolean z11) throws zzuy {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzguf.zzi() : zzuwVar.zza(strZzg, z10, z11);
    }

    @CheckResult
    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvf() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvf
            public final /* synthetic */ int zza(Object obj) {
                int i10 = zzvg.zza;
                return ((zzun) obj).zzd(zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    @Nullable
    public static String zzg(zzv zzvVar) {
        Pair pairZzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a1, code lost:
    
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 7);
        r9.append(r1);
        r9.append(".secure");
        r8.add(com.google.android.gms.internal.ads.zzun.zza(r9.toString(), r26, r7, r13, r0, r21, r2, false, true));
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:59:0x00f2, B:66:0x010e, B:72:0x0122, B:74:0x0128, B:79:0x0138, B:81:0x0142, B:82:0x0147, B:84:0x0157, B:86:0x015f, B:75:0x012d), top: B:118:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzux r27, com.google.android.gms.internal.ads.zzuz r28) throws com.google.android.gms.internal.ads.zzuy {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvg.zzh(com.google.android.gms.internal.ads.zzux, com.google.android.gms.internal.ads.zzuz):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgql.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvf zzvfVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i10 = zzvg.zza;
                zzvf zzvfVar2 = zzvfVar;
                return zzvfVar2.zza(obj2) - zzvfVar2.zza(obj);
            }
        });
    }
}
