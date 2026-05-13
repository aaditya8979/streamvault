package aa;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.List;

/* JADX INFO: compiled from: FileDownloadDatabase.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: aa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileDownloadDatabase.java */
    public interface InterfaceC0001a extends Iterable<FileDownloadModel> {
        void b(FileDownloadModel fileDownloadModel);

        void c(FileDownloadModel fileDownloadModel);

        void d(int i10, FileDownloadModel fileDownloadModel);

        void k();
    }

    void a(fa.a aVar);

    void b(int i10, Throwable th2);

    void c(int i10, String str, long j10, long j11, int i11);

    void clear();

    void d(int i10, int i11, long j10);

    void e(int i10);

    void f(int i10);

    InterfaceC0001a g();

    void h(int i10, long j10);

    void i(int i10);

    void insert(FileDownloadModel fileDownloadModel);

    void j(int i10, Throwable th2, long j10);

    void k(int i10, long j10);

    void l(int i10, long j10, String str, String str2);

    List<fa.a> m(int i10);

    FileDownloadModel n(int i10);

    void o(int i10, int i11);

    void p(int i10, long j10);

    boolean remove(int i10);

    void update(FileDownloadModel fileDownloadModel);
}
