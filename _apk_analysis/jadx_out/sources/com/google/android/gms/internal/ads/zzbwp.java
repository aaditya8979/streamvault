package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbwp implements View.OnClickListener {
    public final /* synthetic */ zzbwr zza;

    public zzbwp(zzbwr zzbwrVar) {
        Objects.requireNonNull(zzbwrVar);
        this.zza = zzbwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
