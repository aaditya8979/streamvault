package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class Kj extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        tn.p.k(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f25887a;
        tn.p.j("Lj", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((C3857xc) Ji.f25751e.getValue()).b(new I2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        tn.p.k(network, "network");
        ConcurrentHashMap concurrentHashMap = Lj.f25887a;
        tn.p.j("Lj", "access$getTAG$p(...)");
        super.onLost(network);
        ((C3857xc) Ji.f25751e.getValue()).b(new I2(10, 4, "lost"));
    }
}
