package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgiu implements zzfxb {
    private final Context zza;
    private final zzgmz zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgiu(Context context, zzgbf zzgbfVar, zzgmz zzgmzVar) {
        this.zza = context;
        this.zzc = zzgbfVar.zzb();
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
        this.zzb = zzgmzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        c8.i iVar;
        zzaxg zzaxgVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            iVar = (c8.i) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (iVar == null || (Build.VERSION.SDK_INT >= 31 && !iVar.isDone()) || (zzaxgVar = (zzaxg) iVar.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzaxgVar.zzb().length() <= 1) ? ExifInterface.LONGITUDE_EAST : zzaxgVar.zzb();
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                c8.i iVar2 = (c8.i) map.get("ai");
                if (iVar2 != null) {
                    String str = (String) iVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put(ImpressionLog.f51753w, strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
