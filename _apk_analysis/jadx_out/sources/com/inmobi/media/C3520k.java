package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3520k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (tn.p.f(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3670q c3670q = C3670q.f27913a;
            C3850x5.f28483a.getClass();
            if (C3850x5.w()) {
                p000do.i.d(C3670q.f27919g, null, null, new C3570m(null), 3, null);
            } else {
                C3670q.a((Float) null);
            }
        }
    }
}
