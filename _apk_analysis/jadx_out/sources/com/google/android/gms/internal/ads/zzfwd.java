package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfwd extends zzibr implements zzidd {
    private static final zzfwd zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfwa zze;

    static {
        zzfwd zzfwdVar = new zzfwd();
        zzf = zzfwdVar;
        zzibr.zzbu(zzfwd.class, zzfwdVar);
    }

    private zzfwd() {
    }

    public static zzfwb zza() {
        return (zzfwb) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzc(zzfwa zzfwaVar) {
        zzfwaVar.getClass();
        this.zze = zzfwaVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfwc.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfwd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfwb(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzg;
        if (zzibmVar == null) {
            synchronized (zzfwd.class) {
                zzibmVar = zzg;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzf);
                    zzg = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(int i10) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
