package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.inmobi.media.Jj;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class Jj extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        Lj.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(intent, "intent");
        Runnable runnable = new Runnable() { // from class: n9.c2
            @Override // java.lang.Runnable
            public final void run() {
                Jj.a(intent, context);
            }
        };
        Context context2 = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }
}
