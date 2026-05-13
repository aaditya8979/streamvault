package y9;

import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import da.a;
import da.b;

/* JADX INFO: compiled from: FileDownloadServiceUIGuard.java */
/* JADX INFO: loaded from: classes10.dex */
public class p extends ga.a<a, da.b> {

    /* JADX INFO: compiled from: FileDownloadServiceUIGuard.java */
    public static class a extends a.AbstractBinderC0729a {
        @Override // da.a
        public void b(MessageSnapshot messageSnapshot) throws RemoteException {
            ea.c.a().b(messageSnapshot);
        }
    }

    public p() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    @Override // ga.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(da.b bVar, a aVar) throws RemoteException {
        bVar.x(aVar);
    }

    @Override // ga.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void x(da.b bVar, a aVar) throws RemoteException {
        bVar.w(aVar);
    }

    @Override // y9.v
    public boolean q(int i10) {
        if (!isConnected()) {
            return ia.a.c(i10);
        }
        try {
            return u().q(i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // y9.v
    public void r(boolean z10) {
        if (!isConnected()) {
            ia.a.e(z10);
            return;
        }
        try {
            try {
                u().r(z10);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        } finally {
            this.f62253e = false;
        }
    }

    @Override // y9.v
    public byte s(int i10) {
        if (!isConnected()) {
            return ia.a.a(i10);
        }
        try {
            return u().s(i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // y9.v
    public boolean t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        if (!isConnected()) {
            return ia.a.d(str, str2, z10);
        }
        try {
            u().t(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
            return true;
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // ga.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public da.b d(IBinder iBinder) {
        return b.a.f(iBinder);
    }

    @Override // ga.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public a p() {
        return new a();
    }
}
