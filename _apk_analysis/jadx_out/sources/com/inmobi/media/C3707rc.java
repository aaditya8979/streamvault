package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3707rc extends BroadcastReceiver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3832wc f28056b;

    public C3707rc(C3832wc c3832wc, String str) {
        tn.p.k(str, "jsCallbackNamespace");
        this.f28056b = c3832wc;
        this.f28055a = str;
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
        F3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(intent, "intent");
        if (tn.p.f("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3580m9 interfaceC3580m9 = this.f28056b.f28430b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.f28056b.b(this.f28055a, 1 == intExtra);
        }
    }
}
