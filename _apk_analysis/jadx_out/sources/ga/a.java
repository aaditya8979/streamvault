package ga;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y9.v;

/* JADX INFO: compiled from: BaseFileServiceUIGuard.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<CALLBACK extends Binder, INTERFACE extends IInterface> implements v, ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile INTERFACE f62251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f62252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62253e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, Object> f62254f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Context> f62255g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Runnable> f62256h = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CALLBACK f62250b = (CALLBACK) p();

    public a(Class<?> cls) {
        this.f62252d = cls;
    }

    public abstract INTERFACE d(IBinder iBinder);

    @Override // y9.v
    public boolean isConnected() {
        return u() != null;
    }

    @Override // y9.v
    public boolean m() {
        return this.f62253e;
    }

    @Override // y9.v
    public void n(Context context, Runnable runnable) {
        if (ia.f.J(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.f62252d);
        if (runnable != null && !this.f62256h.contains(runnable)) {
            this.f62256h.add(runnable);
        }
        if (!this.f62255g.contains(context)) {
            this.f62255g.add(context);
        }
        boolean zP = ia.f.P(context);
        this.f62253e = zP;
        intent.putExtra("is_foreground", zP);
        context.bindService(intent, this, 1);
        if (!this.f62253e) {
            context.startService(intent);
            return;
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // y9.v
    public void o(Context context) {
        n(context, null);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f62251c = (INTERFACE) d(iBinder);
        if (ia.d.f64033a) {
            ia.d.a(this, "onServiceConnected %s %s", componentName, this.f62251c);
        }
        try {
            v(this.f62251c, this.f62250b);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
        List list = (List) this.f62256h.clone();
        this.f62256h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        y9.f.e().b(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, this.f62252d));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (ia.d.f64033a) {
            ia.d.a(this, "onServiceDisconnected %s %s", componentName, this.f62251c);
        }
        w(true);
    }

    public abstract CALLBACK p();

    public INTERFACE u() {
        return this.f62251c;
    }

    public abstract void v(INTERFACE r12, CALLBACK callback) throws RemoteException;

    public final void w(boolean z10) {
        if (!z10 && this.f62251c != null) {
            try {
                x(this.f62251c, this.f62250b);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "release connect resources %s", this.f62251c);
        }
        this.f62251c = null;
        y9.f.e().b(new DownloadServiceConnectChangedEvent(z10 ? DownloadServiceConnectChangedEvent.ConnectStatus.lost : DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, this.f62252d));
    }

    public abstract void x(INTERFACE r12, CALLBACK callback) throws RemoteException;
}
