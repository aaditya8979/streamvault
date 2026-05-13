package ga;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import da.b;
import java.lang.ref.WeakReference;
import y9.n;

/* JADX INFO: compiled from: FDServiceSharedHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends b.a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f62268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<FileDownloadService> f62269c;

    /* JADX INFO: compiled from: FDServiceSharedHandler.java */
    public interface a {
        void a(e eVar);
    }

    public e(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.f62269c = weakReference;
        this.f62268b = gVar;
    }

    @Override // da.b
    public void A(int i10, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.f62269c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f62269c.get().startForeground(i10, notification);
    }

    @Override // da.b
    public boolean B(int i10) {
        return this.f62268b.m(i10);
    }

    @Override // da.b
    public boolean C(int i10) {
        return this.f62268b.d(i10);
    }

    @Override // da.b
    public long D(int i10) {
        return this.f62268b.e(i10);
    }

    @Override // ga.j
    public void c(Intent intent, int i10, int i11) {
        n.a().a(this);
    }

    @Override // ga.j
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // da.b
    public boolean p() {
        return this.f62268b.j();
    }

    @Override // da.b
    public boolean q(int i10) {
        return this.f62268b.k(i10);
    }

    @Override // da.b
    public void r(boolean z10) {
        WeakReference<FileDownloadService> weakReference = this.f62269c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f62269c.get().stopForeground(z10);
    }

    @Override // da.b
    public byte s(int i10) {
        return this.f62268b.f(i10);
    }

    @Override // da.b
    public void t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        this.f62268b.n(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }

    @Override // da.b
    public void u() {
        this.f62268b.c();
    }

    @Override // da.b
    public long v(int i10) {
        return this.f62268b.g(i10);
    }

    @Override // da.b
    public void w(da.a aVar) {
    }

    @Override // da.b
    public void x(da.a aVar) {
    }

    @Override // da.b
    public void y() {
        this.f62268b.l();
    }

    @Override // da.b
    public boolean z(String str, String str2) {
        return this.f62268b.i(str, str2);
    }
}
