package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdgj extends zzdhd implements zzbmz {
    public zzdgj(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
