package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C4228r4;
import com.ironsource.Cc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f31621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cc f31622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31623c = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Cc cc2 = networkStateReceiver.f31622b;
            if (cc2 != null) {
                cc2.a(networkStateReceiver.f31623c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Cc cc2) {
        this.f31622b = cc2;
        if (context != null) {
            this.f31621a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private boolean a() {
        boolean z10 = this.f31623c;
        ConnectivityManager connectivityManager = this.f31621a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f31623c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                this.f31623c = false;
            }
        } else {
            this.f31623c = false;
        }
        return z10 != this.f31623c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
