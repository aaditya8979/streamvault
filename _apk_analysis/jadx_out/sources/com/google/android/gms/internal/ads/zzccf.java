package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.Y1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzccf implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = Y1.f30690f;
    private int zze = -1;

    public zzccf(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbf)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(Y1.f30690f))) {
            z10 = true;
        }
        this.zzc.zzw(z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzbh     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L51
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L32
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb5
            int r0 = r10.zzD()     // Catch: java.lang.Throwable -> Lb5
            if (r9 == r0) goto L2e
            r8.zzc()     // Catch: java.lang.Throwable -> Lb5
        L2e:
            r10.zzC(r9)     // Catch: java.lang.Throwable -> Lb5
            return
        L32:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb4
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r10.zzB()     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = java.util.Objects.equals(r9, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L4d
            r8.zzc()     // Catch: java.lang.Throwable -> Lb5
        L4d:
            r10.zzA(r9)     // Catch: java.lang.Throwable -> Lb5
            return
        L51:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> Lb5
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lb5
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> Lb5
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L75
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L6d
            goto L7d
        L6d:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L7d
            r10 = r7
            goto L7e
        L75:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L7d
            r10 = 0
            goto L7e
        L7d:
            r10 = r3
        L7e:
            if (r10 == 0) goto La1
            if (r10 == r7) goto L83
            goto Lb4
        L83:
            com.google.android.gms.internal.ads.zzbgv r10 = com.google.android.gms.internal.ads.zzbhe.zzbf     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzbhc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r10 = r0.zzd(r10)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto Lb4
            if (r9 == r3) goto Lb4
            int r10 = r8.zze     // Catch: java.lang.Throwable -> Lb5
            if (r10 == r9) goto Lb4
            r8.zze = r9     // Catch: java.lang.Throwable -> Lb5
            r8.zzb(r1, r9)     // Catch: java.lang.Throwable -> Lb5
            return
        La1:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != 0) goto Lb4
            java.lang.String r10 = r8.zzd     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != 0) goto Lb4
            r8.zzd = r1     // Catch: java.lang.Throwable -> Lb5
            r8.zzb(r1, r9)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            return
        Lb5:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcdu r10 = com.google.android.gms.ads.internal.zzt.zzh()
            java.lang.String r0 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            r10.zzg(r9, r0)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccf.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbh)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
