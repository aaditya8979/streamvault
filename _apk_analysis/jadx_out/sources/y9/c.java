package y9;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.util.ArrayList;
import y9.a;
import y9.d;
import y9.y;

/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements y9.a, a.b, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f87391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.a f87392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<a.InterfaceC1109a> f87394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f87395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f87396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f87397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f87398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileDownloadHeader f87399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f87400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f87401k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f87410t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f87402l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f87403m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f87404n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f87405o = 100;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f87406p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f87407q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f87408r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f87409s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f87411u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f87412v = false;

    /* JADX INFO: compiled from: DownloadTask.java */
    public static final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f87413a;

        public b(c cVar) {
            this.f87413a = cVar;
            cVar.f87409s = true;
        }

        @Override // y9.a.c
        public int a() {
            int id2 = this.f87413a.getId();
            if (ia.d.f64033a) {
                ia.d.a(this, "add the task[%d] to the queue", Integer.valueOf(id2));
            }
            h.e().b(this.f87413a);
            return id2;
        }
    }

    public c(String str) {
        this.f87395e = str;
        Object obj = new Object();
        this.f87410t = obj;
        d dVar = new d(this, obj);
        this.f87391a = dVar;
        this.f87392b = dVar;
    }

    @Override // y9.a.b
    public void A() {
        this.f87412v = true;
    }

    @Override // y9.a
    public y9.a B(String str) {
        return L(str, false);
    }

    @Override // y9.a
    public String C() {
        return ia.f.B(getPath(), z(), n());
    }

    @Override // y9.a.b
    public y.a D() {
        return this.f87392b;
    }

    @Override // y9.a.b
    public void E() {
        this.f87408r = getListener() != null ? getListener().hashCode() : hashCode();
    }

    @Override // y9.a.b
    public boolean F() {
        return this.f87412v;
    }

    @Override // y9.a
    public boolean G() {
        return this.f87407q;
    }

    @Override // y9.a.b
    public boolean H() {
        ArrayList<a.InterfaceC1109a> arrayList = this.f87394d;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean J() {
        if (r.c().d().c(this)) {
            return true;
        }
        return fa.b.a(getStatus());
    }

    public boolean K() {
        return this.f87391a.getStatus() != 0;
    }

    public y9.a L(String str, boolean z10) {
        this.f87396f = str;
        if (ia.d.f64033a) {
            ia.d.a(this, "setPath %s", str);
        }
        this.f87398h = z10;
        if (z10) {
            this.f87397g = null;
        } else {
            this.f87397g = new File(str).getName();
        }
        return this;
    }

    public final int M() {
        if (!K()) {
            if (!isAttached()) {
                E();
            }
            this.f87391a.f();
            return getId();
        }
        if (J()) {
            throw new IllegalStateException(ia.f.o("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        }
        throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.f87391a.toString());
    }

    @Override // y9.a
    public Throwable a() {
        return this.f87391a.a();
    }

    @Override // y9.d.a
    public FileDownloadHeader b() {
        return this.f87399i;
    }

    @Override // y9.a
    public y9.a c(int i10) {
        this.f87391a.c(i10);
        return this;
    }

    @Override // y9.a
    public int d() {
        return this.f87391a.d();
    }

    @Override // y9.a.b
    public int e() {
        return this.f87408r;
    }

    @Override // y9.a
    public a.c f() {
        return new b();
    }

    @Override // y9.a.b
    public void free() {
        this.f87391a.free();
        if (h.e().g(this)) {
            this.f87412v = false;
        }
    }

    @Override // y9.a
    public int g() {
        return this.f87406p;
    }

    @Override // y9.a
    public int getId() {
        int i10 = this.f87393c;
        if (i10 != 0) {
            return i10;
        }
        if (TextUtils.isEmpty(this.f87396f) || TextUtils.isEmpty(this.f87395e)) {
            return 0;
        }
        int iS = ia.f.s(this.f87395e, this.f87396f, this.f87398h);
        this.f87393c = iS;
        return iS;
    }

    @Override // y9.a
    public i getListener() {
        return this.f87400j;
    }

    @Override // y9.a.b
    public y9.a getOrigin() {
        return this;
    }

    @Override // y9.a
    public String getPath() {
        return this.f87396f;
    }

    @Override // y9.a
    public byte getStatus() {
        return this.f87391a.getStatus();
    }

    @Override // y9.a
    public Object getTag() {
        return this.f87401k;
    }

    @Override // y9.a
    public String getUrl() {
        return this.f87395e;
    }

    @Override // y9.d.a
    public a.b h() {
        return this;
    }

    @Override // y9.a.b
    public boolean i(int i10) {
        return getId() == i10;
    }

    @Override // y9.a
    public boolean isAttached() {
        return this.f87408r != 0;
    }

    @Override // y9.a
    public int j() {
        return this.f87402l;
    }

    @Override // y9.a.b
    public Object k() {
        return this.f87410t;
    }

    @Override // y9.a
    public int l() {
        return this.f87405o;
    }

    @Override // y9.a
    public y9.a m(int i10) {
        this.f87405o = i10;
        return this;
    }

    @Override // y9.a
    public String n() {
        return this.f87397g;
    }

    @Override // y9.a.b
    public void o() {
        M();
    }

    @Override // y9.a
    public long p() {
        return this.f87391a.j();
    }

    @Override // y9.d.a
    public ArrayList<a.InterfaceC1109a> q() {
        return this.f87394d;
    }

    @Override // y9.a
    public long r() {
        return this.f87391a.m();
    }

    @Override // y9.a.b
    public boolean s() {
        return fa.b.e(getStatus());
    }

    @Override // y9.a
    public int start() {
        if (this.f87409s) {
            throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
        }
        return M();
    }

    @Override // y9.a
    public boolean t() {
        return this.f87403m;
    }

    public String toString() {
        return ia.f.o("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // y9.a
    public int u() {
        if (this.f87391a.m() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f87391a.m();
    }

    @Override // y9.d.a
    public void v(String str) {
        this.f87397g = str;
    }

    @Override // y9.a
    public boolean w() {
        return this.f87404n;
    }

    @Override // y9.a
    public y9.a x(i iVar) {
        this.f87400j = iVar;
        if (ia.d.f64033a) {
            ia.d.a(this, "setListener %s", iVar);
        }
        return this;
    }

    @Override // y9.a
    public int y() {
        if (this.f87391a.j() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.f87391a.j();
    }

    @Override // y9.a
    public boolean z() {
        return this.f87398h;
    }
}
