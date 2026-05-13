package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final class qp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op2 f94104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp2 f94105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f94106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp2 f94108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f94109g;

    public qp2(Context context, op2 op2Var) {
        mp2 mp2Var = mj0.f92367h;
        this.f94103a = context.getApplicationContext();
        this.f94104b = op2Var;
        this.f94105c = mp2Var;
        this.f94106d = ib3.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f94109g = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.f94109g.post(new Runnable() { // from class: bt.x8
            @Override // java.lang.Runnable
            public final void run() {
                this.f6400b.b();
            }
        });
    }

    public final /* synthetic */ void a(int i10) {
        this.f94104b.a(this, i10);
    }

    public final /* synthetic */ void b() {
        final int iA = this.f94105c.a(this.f94103a);
        if (this.f94107e != iA) {
            this.f94107e = iA;
            this.f94106d.post(new Runnable() { // from class: bt.y8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6425b.a(iA);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.f94105c.f92497b & 1) != 0) {
            if (ib3.f90737a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f94103a.getSystemService("connectivity");
                connectivityManager.getClass();
                pp2 pp2Var = new pp2(this);
                this.f94108f = pp2Var;
                connectivityManager.registerDefaultNetworkCallback(pp2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.f94105c.f92497b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.f94105c.f92497b & 4) != 0) {
            if (ib3.f90737a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.f94105c.f92497b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f94103a.registerReceiver(new np2(this), intentFilter, null, this.f94106d);
        return this.f94107e;
    }
}
