package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbgq extends zzbgv {
    public zzbgq(int i10, String str, Boolean bool, Boolean bool2) {
        super(i10, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zze()))) : (Boolean) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zze(), ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zze(), ((Boolean) zzf()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zze(), ((Boolean) zzf()).booleanValue()));
    }
}
