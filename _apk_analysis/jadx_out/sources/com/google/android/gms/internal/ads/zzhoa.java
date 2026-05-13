package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhoa extends zzibr implements zzidd {
    private static final zzhoa zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhoa zzhoaVar = new zzhoa();
        zzb = zzhoaVar;
        zzibr.zzbu(zzhoa.class, zzhoaVar);
    }

    private zzhoa() {
    }

    public static zzhnz zzb() {
        return (zzhnz) zzb.zzbn();
    }

    public static zzhoa zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhoa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnz(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzhoa.class) {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
