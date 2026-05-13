package ga;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Iterator;
import java.util.List;
import y9.z;

/* JADX INFO: compiled from: FileDownloadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa.a f62270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f62271b;

    public g() {
        ba.a aVarJ = ba.a.j();
        this.f62270a = aVarJ.f();
        this.f62271b = new h(aVarJ.k());
    }

    @Override // y9.z
    public boolean a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean zG = this.f62271b.g(fileDownloadModel.g());
        if (fa.b.e(fileDownloadModel.j())) {
            if (!zG) {
                return false;
            }
        } else if (!zG) {
            ia.d.b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.g()), Byte.valueOf(fileDownloadModel.j()));
            return false;
        }
        return true;
    }

    @Override // y9.z
    public int b(String str, int i10) {
        return this.f62271b.e(str, i10);
    }

    public void c() {
        this.f62270a.clear();
    }

    public boolean d(int i10) {
        if (i10 == 0) {
            ia.d.i(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i10));
            return false;
        }
        if (h(i10)) {
            ia.d.i(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i10));
            return false;
        }
        this.f62270a.remove(i10);
        this.f62270a.e(i10);
        return true;
    }

    public long e(int i10) {
        FileDownloadModel fileDownloadModelN = this.f62270a.n(i10);
        if (fileDownloadModelN == null) {
            return 0L;
        }
        int iC = fileDownloadModelN.c();
        if (iC <= 1) {
            return fileDownloadModelN.i();
        }
        List<fa.a> listM = this.f62270a.m(i10);
        if (listM == null || listM.size() != iC) {
            return 0L;
        }
        return fa.a.f(listM);
    }

    public byte f(int i10) {
        FileDownloadModel fileDownloadModelN = this.f62270a.n(i10);
        if (fileDownloadModelN == null) {
            return (byte) 0;
        }
        return fileDownloadModelN.j();
    }

    public long g(int i10) {
        FileDownloadModel fileDownloadModelN = this.f62270a.n(i10);
        if (fileDownloadModelN == null) {
            return 0L;
        }
        return fileDownloadModelN.m();
    }

    public boolean h(int i10) {
        return a(this.f62270a.n(i10));
    }

    public boolean i(String str, String str2) {
        return h(ia.f.r(str, str2));
    }

    public boolean j() {
        return this.f62271b.b() <= 0;
    }

    public boolean k(int i10) {
        if (ia.d.f64033a) {
            ia.d.a(this, "request pause the task %d", Integer.valueOf(i10));
        }
        FileDownloadModel fileDownloadModelN = this.f62270a.n(i10);
        if (fileDownloadModelN == null) {
            return false;
        }
        fileDownloadModelN.A((byte) -2);
        this.f62271b.a(i10);
        return true;
    }

    public void l() {
        List<Integer> listF = this.f62271b.f();
        if (ia.d.f64033a) {
            ia.d.a(this, "pause all tasks %d", Integer.valueOf(listF.size()));
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            k(it.next().intValue());
        }
    }

    public synchronized boolean m(int i10) {
        return this.f62271b.h(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0184 A[Catch: all -> 0x01cf, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0065, B:21:0x0072, B:23:0x0078, B:25:0x007c, B:29:0x008d, B:31:0x0096, B:33:0x009f, B:35:0x00a3, B:40:0x00b6, B:43:0x00bf, B:45:0x00c8, B:47:0x00d7, B:49:0x00db, B:51:0x00ec, B:55:0x00fa, B:57:0x0101, B:59:0x0108, B:61:0x010e, B:63:0x0115, B:65:0x011b, B:67:0x0121, B:69:0x013b, B:70:0x013f, B:72:0x0145, B:81:0x0184, B:82:0x0189, B:73:0x0154, B:75:0x015e, B:77:0x0164, B:78:0x016a, B:44:0x00c4, B:30:0x0092), top: B:88:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void n(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.liulishuo.filedownloader.model.FileDownloadHeader r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.g.n(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }
}
