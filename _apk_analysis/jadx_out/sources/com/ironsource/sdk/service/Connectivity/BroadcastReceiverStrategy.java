package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C3924a4;
import com.ironsource.C4228r4;
import com.ironsource.InterfaceC4299v7;
import com.ironsource.InterfaceC4316w7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BroadcastReceiverStrategy implements InterfaceC4299v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4316w7 f34005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f34006b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = C3924a4.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f34005a.a();
            } else {
                BroadcastReceiverStrategy.this.f34005a.a(strB, IronSourceVideoBridge.jsonObjectInit());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC4316w7 interfaceC4316w7) {
        this.f34005a = interfaceC4316w7;
    }

    @Override // com.ironsource.InterfaceC4299v7
    public void a() {
        this.f34006b = null;
    }

    @Override // com.ironsource.InterfaceC4299v7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f34006b);
        } catch (IllegalArgumentException e10) {
            C4228r4.d().a(e10);
        } catch (Exception e11) {
            C4228r4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC4299v7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f34006b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4299v7
    public JSONObject c(Context context) {
        return IronSourceVideoBridge.jsonObjectInit();
    }
}
