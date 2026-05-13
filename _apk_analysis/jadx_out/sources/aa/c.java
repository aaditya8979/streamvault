package aa;

import aa.a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import ia.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: RemitDatabase.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements aa.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f3678c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f3682g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f3680e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicInteger f3681f = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3676a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3677b = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3679d = ia.e.a().f64035b;

    /* JADX INFO: compiled from: RemitDatabase.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                if (c.this.f3682g != null) {
                    LockSupport.unpark(c.this.f3682g);
                    c.this.f3682g = null;
                }
                return false;
            }
            try {
                c.this.f3681f.set(i10);
                c.this.x(i10);
                c.this.f3680e.add(Integer.valueOf(i10));
                return false;
            } finally {
                c.this.f3681f.set(0);
                if (c.this.f3682g != null) {
                    LockSupport.unpark(c.this.f3682g);
                    c.this.f3682g = null;
                }
            }
        }
    }

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.D("RemitHandoverToDB"));
        handlerThread.start();
        this.f3678c = new Handler(handlerThread.getLooper(), new a());
    }

    @Override // aa.a
    public void a(fa.a aVar) {
        this.f3676a.a(aVar);
        if (w(aVar.c())) {
            return;
        }
        this.f3677b.a(aVar);
    }

    @Override // aa.a
    public void b(int i10, Throwable th2) {
        this.f3676a.b(i10, th2);
        if (w(i10)) {
            return;
        }
        this.f3677b.b(i10, th2);
    }

    @Override // aa.a
    public void c(int i10, String str, long j10, long j11, int i11) {
        this.f3676a.c(i10, str, j10, j11, i11);
        if (w(i10)) {
            return;
        }
        this.f3677b.c(i10, str, j10, j11, i11);
    }

    @Override // aa.a
    public void clear() {
        this.f3676a.clear();
        this.f3677b.clear();
    }

    @Override // aa.a
    public void d(int i10, int i11, long j10) {
        this.f3676a.d(i10, i11, j10);
        if (w(i10)) {
            return;
        }
        this.f3677b.d(i10, i11, j10);
    }

    @Override // aa.a
    public void e(int i10) {
        this.f3676a.e(i10);
        if (w(i10)) {
            return;
        }
        this.f3677b.e(i10);
    }

    @Override // aa.a
    public void f(int i10) {
        this.f3676a.f(i10);
        if (w(i10)) {
            return;
        }
        this.f3677b.f(i10);
    }

    @Override // aa.a
    public a.InterfaceC0001a g() {
        d dVar = this.f3677b;
        b bVar = this.f3676a;
        return dVar.t(bVar.f3672a, bVar.f3673b);
    }

    @Override // aa.a
    public void h(int i10, long j10) {
        this.f3676a.h(i10, j10);
        if (w(i10)) {
            this.f3678c.removeMessages(i10);
            if (this.f3681f.get() == i10) {
                this.f3682g = Thread.currentThread();
                this.f3678c.sendEmptyMessage(0);
                LockSupport.park();
                this.f3677b.h(i10, j10);
            }
        } else {
            this.f3677b.h(i10, j10);
        }
        this.f3680e.remove(Integer.valueOf(i10));
    }

    @Override // aa.a
    public void i(int i10) {
        this.f3678c.sendEmptyMessageDelayed(i10, this.f3679d);
    }

    @Override // aa.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.f3676a.insert(fileDownloadModel);
        if (w(fileDownloadModel.g())) {
            return;
        }
        this.f3677b.insert(fileDownloadModel);
    }

    @Override // aa.a
    public void j(int i10, Throwable th2, long j10) {
        this.f3676a.j(i10, th2, j10);
        if (w(i10)) {
            v(i10);
        }
        this.f3677b.j(i10, th2, j10);
        this.f3680e.remove(Integer.valueOf(i10));
    }

    @Override // aa.a
    public void k(int i10, long j10) {
        this.f3676a.k(i10, j10);
        if (w(i10)) {
            return;
        }
        this.f3677b.k(i10, j10);
    }

    @Override // aa.a
    public void l(int i10, long j10, String str, String str2) {
        this.f3676a.l(i10, j10, str, str2);
        if (w(i10)) {
            return;
        }
        this.f3677b.l(i10, j10, str, str2);
    }

    @Override // aa.a
    public List<fa.a> m(int i10) {
        return this.f3676a.m(i10);
    }

    @Override // aa.a
    public FileDownloadModel n(int i10) {
        return this.f3676a.n(i10);
    }

    @Override // aa.a
    public void o(int i10, int i11) {
        this.f3676a.o(i10, i11);
        if (w(i10)) {
            return;
        }
        this.f3677b.o(i10, i11);
    }

    @Override // aa.a
    public void p(int i10, long j10) {
        this.f3676a.p(i10, j10);
        if (w(i10)) {
            v(i10);
        }
        this.f3677b.p(i10, j10);
        this.f3680e.remove(Integer.valueOf(i10));
    }

    @Override // aa.a
    public boolean remove(int i10) {
        this.f3677b.remove(i10);
        return this.f3676a.remove(i10);
    }

    @Override // aa.a
    public void update(FileDownloadModel fileDownloadModel) {
        this.f3676a.update(fileDownloadModel);
        if (w(fileDownloadModel.g())) {
            return;
        }
        this.f3677b.update(fileDownloadModel);
    }

    public final void v(int i10) {
        this.f3678c.removeMessages(i10);
        if (this.f3681f.get() != i10) {
            x(i10);
            return;
        }
        this.f3682g = Thread.currentThread();
        this.f3678c.sendEmptyMessage(0);
        LockSupport.park();
    }

    public final boolean w(int i10) {
        return !this.f3680e.contains(Integer.valueOf(i10));
    }

    public final void x(int i10) {
        if (ia.d.f64033a) {
            ia.d.a(this, "sync cache to db %d", Integer.valueOf(i10));
        }
        this.f3677b.update(this.f3676a.n(i10));
        List<fa.a> listM = this.f3676a.m(i10);
        this.f3677b.e(i10);
        Iterator<fa.a> it = listM.iterator();
        while (it.hasNext()) {
            this.f3677b.a(it.next());
        }
    }
}
