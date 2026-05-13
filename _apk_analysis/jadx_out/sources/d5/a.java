package d5;

import a6.k0;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer.scheduler.Requirements;

/* JADX INFO: compiled from: RequirementsWatcher.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f59563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Requirements f59564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f59565d = new Handler(k0.N());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f59566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d f59568g;

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            a.this.e();
        }
    }

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    public interface c {
        void a(a aVar, int i10);
    }

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    @RequiresApi(24)
    public final class d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f59571b;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (a.this.f59568g != null) {
                a.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (a.this.f59568g != null) {
                a.this.g();
            }
        }

        public final void e() {
            a.this.f59565d.post(new Runnable() { // from class: d5.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59573b.c();
                }
            });
        }

        public final void f() {
            a.this.f59565d.post(new Runnable() { // from class: d5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59574b.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f59570a && this.f59571b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f59570a = true;
                this.f59571b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public a(Context context, c cVar, Requirements requirements) {
        this.f59562a = context.getApplicationContext();
        this.f59563b = cVar;
        this.f59564c = requirements;
    }

    public final void e() {
        int iD = this.f59564c.d(this.f59562a);
        if (this.f59567f != iD) {
            this.f59567f = iD;
            this.f59563b.a(this, iD);
        }
    }

    public Requirements f() {
        return this.f59564c;
    }

    public final void g() {
        if ((this.f59567f & 3) == 0) {
            return;
        }
        e();
    }

    @TargetApi(24)
    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a6.a.e((ConnectivityManager) this.f59562a.getSystemService("connectivity"));
        d dVar = new d();
        this.f59568g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    public int i() {
        this.f59567f = this.f59564c.d(this.f59562a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f59564c.j()) {
            if (k0.f3574a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f59564c.e()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f59564c.h()) {
            if (k0.f3574a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        b bVar = new b();
        this.f59566e = bVar;
        this.f59562a.registerReceiver(bVar, intentFilter, null, this.f59565d);
        return this.f59567f;
    }

    public void j() {
        this.f59562a.unregisterReceiver((BroadcastReceiver) a6.a.e(this.f59566e));
        this.f59566e = null;
        if (k0.f3574a < 24 || this.f59568g == null) {
            return;
        }
        k();
    }

    @TargetApi(24)
    public final void k() {
        ((ConnectivityManager) this.f59562a.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) a6.a.e(this.f59568g));
        this.f59568g = null;
    }
}
