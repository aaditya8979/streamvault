package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbwt implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwu zza;

    public zzbwt(zzbwu zzbwuVar) {
        Objects.requireNonNull(zzbwuVar);
        this.zza = zzbwuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
