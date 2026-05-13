package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzijc extends zzibr implements zzidd {
    private static final zzijc zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzd;
    private zzije zzi;
    private zzijg zzj;
    private zzhyi zzk;
    private zzian zzb = zzian.zza;
    private zzibz zzc = zzibr.zzbC();
    private zzibz zze = zzibr.zzbC();
    private zzicd zzf = zzibr.zzbM();
    private String zzg = "";
    private zzicd zzh = zzibr.zzbM();

    static {
        zzijc zzijcVar = new zzijc();
        zzl = zzijcVar;
        zzibr.zzbu(zzijc.class, zzijcVar);
    }

    private zzijc() {
    }

    public static zzijc zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzijc) zzibr.zzbV(zzl, bArr, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zziir.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzijc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijb(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzm;
        if (zzibmVar == null) {
            synchronized (zzijc.class) {
                zzibmVar = zzm;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzl);
                    zzm = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
