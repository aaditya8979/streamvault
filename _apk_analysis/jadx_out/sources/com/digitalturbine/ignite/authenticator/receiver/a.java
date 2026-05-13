package com.digitalturbine.ignite.authenticator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d1.d;
import f1.h;
import k1.b;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f14949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14950b = false;

    public a(b bVar) {
        this.f14949a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            l1.b.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (bVar = this.f14949a) == null) {
                return;
            }
            d dVar = (d) bVar;
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i10))) {
                        l1.b.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!dVar.f59549c.c()) {
                            h hVar = dVar.f59550d;
                            if (hVar != null) {
                                hVar.m();
                                return;
                            }
                            return;
                        }
                        l1.b.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        h hVar2 = dVar.f59550d;
                        if (hVar2 != null) {
                            l1.b.a("%s : one dt refresh required", "OneDTAuthenticator");
                            hVar2.f61431l.set(true);
                        }
                        dVar.f59549c.l();
                        return;
                    }
                }
            } catch (JSONException e10) {
                h1.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_BROADCAST_ERROR, e10);
            }
        }
    }
}
