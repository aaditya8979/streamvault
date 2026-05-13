package y9;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;

/* JADX INFO: compiled from: FileDownloadConnectListener.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e extends ca.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DownloadServiceConnectChangedEvent.ConnectStatus f87434a;

    @Override // ca.c
    public boolean d(ca.b bVar) {
        if (!(bVar instanceof DownloadServiceConnectChangedEvent)) {
            return false;
        }
        DownloadServiceConnectChangedEvent.ConnectStatus connectStatusB = ((DownloadServiceConnectChangedEvent) bVar).b();
        this.f87434a = connectStatusB;
        if (connectStatusB == DownloadServiceConnectChangedEvent.ConnectStatus.connected) {
            e();
            return false;
        }
        f();
        return false;
    }

    public abstract void e();

    public abstract void f();

    public DownloadServiceConnectChangedEvent.ConnectStatus g() {
        return this.f87434a;
    }
}
