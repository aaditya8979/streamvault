package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3732sc extends BroadcastReceiver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3832wc f28115b;

    public C3732sc(C3832wc c3832wc, String str) {
        tn.p.k(str, "jsCallbackNamespace");
        this.f28115b = c3832wc;
        this.f28114a = str;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        F3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(intent, "intent");
        if (tn.p.f("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3580m9 interfaceC3580m9 = this.f28115b.f28430b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.f28115b.a(this.f28114a, 2 != intExtra);
        }
    }
}
