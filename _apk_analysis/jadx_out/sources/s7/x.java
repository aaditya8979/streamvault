package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: NetworkTypeObserver.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static x f79564e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f79565a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<c>> f79566b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f79567c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("networkTypeLock")
    public int f79568d = 0;

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    @RequiresApi(31)
    public static final class b {

        /* JADX INFO: compiled from: NetworkTypeObserver.java */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f79569a;

            public a(x xVar) {
                this.f79569a = xVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f79569a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, x xVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) s7.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(xVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                xVar.k(5);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public interface c {
        void onNetworkTypeChanged(int i10);
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG = x.g(context);
            if (m0.f79487a < 31 || iG != 5) {
                x.this.k(iG);
            } else {
                b.a(context, x.this);
            }
        }
    }

    public x(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m0.E0(context, new d(), intentFilter);
    }

    public static synchronized x d(Context context) {
        if (f79564e == null) {
            f79564e = new x(context);
        }
        return f79564e;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return m0.f79487a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.onNetworkTypeChanged(f());
    }

    public int f() {
        int i10;
        synchronized (this.f79567c) {
            i10 = this.f79568d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f79566b.add(new WeakReference<>(cVar));
        this.f79565a.post(new Runnable() { // from class: s7.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f79562b.h(cVar);
            }
        });
    }

    public final void j() {
        for (WeakReference<c> weakReference : this.f79566b) {
            if (weakReference.get() == null) {
                this.f79566b.remove(weakReference);
            }
        }
    }

    public final void k(int i10) {
        synchronized (this.f79567c) {
            if (this.f79568d == i10) {
                return;
            }
            this.f79568d = i10;
            for (WeakReference<c> weakReference : this.f79566b) {
                c cVar = weakReference.get();
                if (cVar != null) {
                    cVar.onNetworkTypeChanged(i10);
                } else {
                    this.f79566b.remove(weakReference);
                }
            }
        }
    }
}
