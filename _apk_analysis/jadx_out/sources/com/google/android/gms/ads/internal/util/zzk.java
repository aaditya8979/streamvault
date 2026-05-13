package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzikw;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk implements zzbie {
    public final /* synthetic */ zzbif zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ Uri zzd;

    public zzk(zzs zzsVar, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbifVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent customTabsIntent, Context context, Uri uri) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (uri == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(uri, g.f53134h);
        customTabsIntent.launchUrl(context, uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zza() {
        zzbif zzbifVar = this.zza;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbifVar.zzc());
        zzs.zzak(builder, this.zzb);
        CustomTabsIntent customTabsIntentBuild = builder.build();
        Intent intent = customTabsIntentBuild.intent;
        Context context = this.zzc;
        intent.setPackage(zzikw.zza(context));
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentBuild, context, this.zzd);
        zzbifVar.zzb((Activity) context);
    }
}
