package aa;

import aa.a;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NoDatabaseImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements aa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<FileDownloadModel> f3672a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<List<fa.a>> f3673b = new SparseArray<>();

    /* JADX INFO: compiled from: NoDatabaseImpl.java */
    public class a implements a.InterfaceC0001a {
        public a() {
        }

        @Override // aa.a.InterfaceC0001a
        public void b(FileDownloadModel fileDownloadModel) {
        }

        @Override // aa.a.InterfaceC0001a
        public void c(FileDownloadModel fileDownloadModel) {
        }

        @Override // aa.a.InterfaceC0001a
        public void d(int i10, FileDownloadModel fileDownloadModel) {
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            return b.this.new C0002b();
        }

        @Override // aa.a.InterfaceC0001a
        public void k() {
        }
    }

    /* JADX INFO: renamed from: aa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NoDatabaseImpl.java */
    public class C0002b implements Iterator<FileDownloadModel> {
        public C0002b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @Override // aa.a
    public void a(fa.a aVar) {
        int iC = aVar.c();
        synchronized (this.f3673b) {
            List<fa.a> arrayList = this.f3673b.get(iC);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f3673b.put(iC, arrayList);
            }
            arrayList.add(aVar);
        }
    }

    @Override // aa.a
    public void b(int i10, Throwable th2) {
    }

    @Override // aa.a
    public void c(int i10, String str, long j10, long j11, int i11) {
    }

    @Override // aa.a
    public void clear() {
        synchronized (this.f3672a) {
            this.f3672a.clear();
        }
    }

    @Override // aa.a
    public void d(int i10, int i11, long j10) {
        synchronized (this.f3673b) {
            List<fa.a> list = this.f3673b.get(i10);
            if (list == null) {
                return;
            }
            for (fa.a aVar : list) {
                if (aVar.d() == i11) {
                    aVar.g(j10);
                    return;
                }
            }
        }
    }

    @Override // aa.a
    public void e(int i10) {
        synchronized (this.f3673b) {
            this.f3673b.remove(i10);
        }
    }

    @Override // aa.a
    public void f(int i10) {
    }

    @Override // aa.a
    public a.InterfaceC0001a g() {
        return new a();
    }

    @Override // aa.a
    public void h(int i10, long j10) {
        remove(i10);
    }

    @Override // aa.a
    public void i(int i10) {
    }

    @Override // aa.a
    public void insert(FileDownloadModel fileDownloadModel) {
        synchronized (this.f3672a) {
            this.f3672a.put(fileDownloadModel.g(), fileDownloadModel);
        }
    }

    @Override // aa.a
    public void j(int i10, Throwable th2, long j10) {
    }

    @Override // aa.a
    public void k(int i10, long j10) {
    }

    @Override // aa.a
    public void l(int i10, long j10, String str, String str2) {
    }

    @Override // aa.a
    public List<fa.a> m(int i10) {
        List<fa.a> list;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3673b) {
            list = this.f3673b.get(i10);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // aa.a
    public FileDownloadModel n(int i10) {
        FileDownloadModel fileDownloadModel;
        synchronized (this.f3672a) {
            fileDownloadModel = this.f3672a.get(i10);
        }
        return fileDownloadModel;
    }

    @Override // aa.a
    public void o(int i10, int i11) {
    }

    @Override // aa.a
    public void p(int i10, long j10) {
    }

    @Override // aa.a
    public boolean remove(int i10) {
        synchronized (this.f3672a) {
            this.f3672a.remove(i10);
        }
        return true;
    }

    @Override // aa.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            ia.d.i(this, "update but model == null!", new Object[0]);
            return;
        }
        if (n(fileDownloadModel.g()) == null) {
            insert(fileDownloadModel);
            return;
        }
        synchronized (this.f3672a) {
            this.f3672a.remove(fileDownloadModel.g());
            this.f3672a.put(fileDownloadModel.g(), fileDownloadModel);
        }
    }
}
