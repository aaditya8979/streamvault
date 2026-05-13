package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes12.dex */
public final class pp2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f93712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qp2 f93713c;

    public pp2(qp2 qp2Var) {
        this.f93713c = qp2Var;
    }

    public final /* synthetic */ void a() {
        qp2 qp2Var = this.f93713c;
        if (qp2Var.f94108f != null) {
            qp2Var.a();
        }
    }

    public final void b() {
        qp2 qp2Var = this.f93713c;
        if (qp2Var.f94108f == null || (qp2Var.f94107e & 3) == 0) {
            return;
        }
        qp2Var.a();
    }

    public final void c() {
        this.f93713c.f94106d.post(new Runnable() { // from class: bt.j8
            @Override // java.lang.Runnable
            public final void run() {
                this.f6102b.a();
            }
        });
    }

    public final void d() {
        this.f93713c.f94106d.post(new Runnable() { // from class: bt.k8
            @Override // java.lang.Runnable
            public final void run() {
                this.f6119b.b();
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.f93711a && this.f93712b == zHasCapability) {
            if (zHasCapability) {
                d();
            }
        } else {
            this.f93711a = true;
            this.f93712b = zHasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
