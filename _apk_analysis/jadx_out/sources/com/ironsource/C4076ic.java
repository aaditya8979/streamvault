package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C4076ic implements InterfaceC4299v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31952a = C4076ic.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31953b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4316w7 f31954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f31955d;

    /* JADX INFO: renamed from: com.ironsource.ic$a */
    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31956a;

        public a(Context context) {
            this.f31956a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C4076ic.this.f31954c.a(C3924a4.a(network, this.f31956a), C3924a4.a(this.f31956a, network));
                return;
            }
            InterfaceC4316w7 interfaceC4316w7 = C4076ic.this.f31954c;
            String strB = C3924a4.b(this.f31956a);
            Context context = this.f31956a;
            interfaceC4316w7.a(strB, C3924a4.a(context, C3924a4.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4076ic.this.f31954c.b(C3924a4.a(network, this.f31956a), C3924a4.a(this.f31956a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4076ic.this.f31954c.b(C3924a4.a(network, this.f31956a), C3924a4.a(this.f31956a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C3924a4.b(this.f31956a).equals("none")) {
                C4076ic.this.f31954c.a();
            }
        }
    }

    public C4076ic(InterfaceC4316w7 interfaceC4316w7) {
        this.f31954c = interfaceC4316w7;
    }

    @Override // com.ironsource.InterfaceC4299v7
    public void a() {
        this.f31955d = null;
    }

    @Override // com.ironsource.InterfaceC4299v7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f31953b || this.f31955d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f31955d);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            Log.e(this.f31952a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC4299v7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f31953b) {
            a(context);
            if (C3924a4.b(context).equals("none")) {
                this.f31954c.a();
            }
            if (this.f31955d == null) {
                this.f31955d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f31955d);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                Log.e(this.f31952a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC4299v7
    public JSONObject c(Context context) {
        return C3924a4.a(context, C3924a4.a(context));
    }
}
