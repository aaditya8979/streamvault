package ga;

import android.util.SparseArray;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: FileDownloadThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f62273b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62275d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<DownloadLaunchRunnable> f62272a = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62274c = AndroidInitializeBoldSDK.MSG_NETWORK;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62276e = 0;

    public h(int i10) {
        this.f62273b = ia.b.a(i10, AndroidInitializeBoldSDK.MSG_NETWORK);
        this.f62275d = i10;
    }

    public void a(int i10) {
        d();
        synchronized (this) {
            DownloadLaunchRunnable downloadLaunchRunnable = this.f62272a.get(i10);
            if (downloadLaunchRunnable != null) {
                downloadLaunchRunnable.s();
                boolean zRemove = this.f62273b.remove(downloadLaunchRunnable);
                if (ia.d.f64033a) {
                    ia.d.a(this, "successful cancel %d %B", Integer.valueOf(i10), Boolean.valueOf(zRemove));
                }
            }
            this.f62272a.remove(i10);
        }
    }

    public synchronized int b() {
        d();
        return this.f62272a.size();
    }

    public void c(DownloadLaunchRunnable downloadLaunchRunnable) {
        downloadLaunchRunnable.u();
        synchronized (this) {
            this.f62272a.put(downloadLaunchRunnable.k(), downloadLaunchRunnable);
        }
        this.f62273b.execute(downloadLaunchRunnable);
        int i10 = this.f62276e;
        if (i10 < 600) {
            this.f62276e = i10 + 1;
        } else {
            d();
            this.f62276e = 0;
        }
    }

    public final synchronized void d() {
        SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
        int size = this.f62272a.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = this.f62272a.keyAt(i10);
            DownloadLaunchRunnable downloadLaunchRunnable = this.f62272a.get(iKeyAt);
            if (downloadLaunchRunnable != null && downloadLaunchRunnable.q()) {
                sparseArray.put(iKeyAt, downloadLaunchRunnable);
            }
        }
        this.f62272a = sparseArray;
    }

    public synchronized int e(String str, int i10) {
        if (str == null) {
            return 0;
        }
        int size = this.f62272a.size();
        for (int i11 = 0; i11 < size; i11++) {
            DownloadLaunchRunnable downloadLaunchRunnableValueAt = this.f62272a.valueAt(i11);
            if (downloadLaunchRunnableValueAt != null && downloadLaunchRunnableValueAt.q() && downloadLaunchRunnableValueAt.k() != i10 && str.equals(downloadLaunchRunnableValueAt.l())) {
                return downloadLaunchRunnableValueAt.k();
            }
        }
        return 0;
    }

    public synchronized List<Integer> f() {
        ArrayList arrayList;
        d();
        arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f62272a.size(); i10++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.f62272a;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i10)).k()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean g(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.liulishuo.filedownloader.download.DownloadLaunchRunnable> r0 = r1.f62272a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            com.liulishuo.filedownloader.download.DownloadLaunchRunnable r2 = (com.liulishuo.filedownloader.download.DownloadLaunchRunnable) r2     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            boolean r2 = r2.q()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.h.g(int):boolean");
    }

    public synchronized boolean h(int i10) {
        if (b() > 0) {
            ia.d.i(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int iB = ia.e.b(i10);
        if (ia.d.f64033a) {
            ia.d.a(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f62275d), Integer.valueOf(iB));
        }
        List<Runnable> listShutdownNow = this.f62273b.shutdownNow();
        this.f62273b = ia.b.a(iB, AndroidInitializeBoldSDK.MSG_NETWORK);
        if (listShutdownNow.size() > 0) {
            ia.d.i(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(listShutdownNow.size()));
        }
        this.f62275d = iB;
        return true;
    }
}
