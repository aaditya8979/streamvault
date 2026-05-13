package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zaf extends zag {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ LifecycleFragment zab;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment, int i10) {
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    public static void safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(LifecycleFragment lifecycleFragment, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/common/api/internal/LifecycleFragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        lifecycleFragment.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(this.zab, intent, 2);
        }
    }
}
