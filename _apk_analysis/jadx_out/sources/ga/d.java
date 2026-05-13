package ga;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import da.b;
import ea.c;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: FDServiceSeparateHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends b.a implements c.b, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteCallbackList<da.a> f62265b = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f62266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<FileDownloadService> f62267d;

    public d(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f62267d = weakReference;
        this.f62266c = gVar;
        ea.c.a().c(this);
    }

    @Override // da.b
    public void A(int i10, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f62267d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f62267d.get().startForeground(i10, notification);
    }

    @Override // da.b
    public boolean B(int i10) throws RemoteException {
        return this.f62266c.m(i10);
    }

    @Override // da.b
    public boolean C(int i10) throws RemoteException {
        return this.f62266c.d(i10);
    }

    @Override // da.b
    public long D(int i10) throws RemoteException {
        return this.f62266c.e(i10);
    }

    @Override // ga.j
    public void c(Intent intent, int i10, int i11) {
    }

    @Override // ea.c.b
    public void d(MessageSnapshot messageSnapshot) {
        g(messageSnapshot);
    }

    public final synchronized int g(MessageSnapshot messageSnapshot) {
        int iBeginBroadcast;
        RemoteCallbackList<da.a> remoteCallbackList;
        iBeginBroadcast = this.f62265b.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            try {
                try {
                    ((da.a) this.f62265b.getBroadcastItem(i10)).b(messageSnapshot);
                } catch (Throwable th2) {
                    this.f62265b.finishBroadcast();
                    throw th2;
                }
            } catch (RemoteException e10) {
                ia.d.c(this, e10, "callback error", new Object[0]);
                remoteCallbackList = this.f62265b;
                remoteCallbackList.finishBroadcast();
                return iBeginBroadcast;
            }
        }
        remoteCallbackList = this.f62265b;
        remoteCallbackList.finishBroadcast();
        return iBeginBroadcast;
    }

    @Override // ga.j
    public IBinder onBind(Intent intent) {
        return this;
    }

    @Override // da.b
    public boolean p() throws RemoteException {
        return this.f62266c.j();
    }

    @Override // da.b
    public boolean q(int i10) throws RemoteException {
        return this.f62266c.k(i10);
    }

    @Override // da.b
    public void r(boolean z10) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f62267d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f62267d.get().stopForeground(z10);
    }

    @Override // da.b
    public byte s(int i10) throws RemoteException {
        return this.f62266c.f(i10);
    }

    @Override // da.b
    public void t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws RemoteException {
        this.f62266c.n(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }

    @Override // da.b
    public void u() throws RemoteException {
        this.f62266c.c();
    }

    @Override // da.b
    public long v(int i10) throws RemoteException {
        return this.f62266c.g(i10);
    }

    @Override // da.b
    public void w(da.a aVar) throws RemoteException {
        this.f62265b.unregister(aVar);
    }

    @Override // da.b
    public void x(da.a aVar) throws RemoteException {
        this.f62265b.register(aVar);
    }

    @Override // da.b
    public void y() throws RemoteException {
        this.f62266c.l();
    }

    @Override // da.b
    public boolean z(String str, String str2) throws RemoteException {
        return this.f62266c.i(str, str2);
    }
}
