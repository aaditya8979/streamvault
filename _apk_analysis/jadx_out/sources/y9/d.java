package y9;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import y9.a;
import y9.y;

/* JADX INFO: compiled from: DownloadTaskHunter.java */
/* JADX INFO: loaded from: classes10.dex */
public class d implements y, y.b, y.a, a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f87419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f87421c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f87424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f87425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f87426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f87427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f87428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f87429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f87430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f87431m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte f87422d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f87423e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f87432n = false;

    /* JADX INFO: compiled from: DownloadTaskHunter.java */
    public interface a {
        FileDownloadHeader b();

        a.b h();

        ArrayList<a.InterfaceC1109a> q();

        void v(String str);
    }

    public d(a aVar, Object obj) {
        this.f87420b = obj;
        this.f87421c = aVar;
        b bVar = new b();
        this.f87424f = bVar;
        this.f87425g = bVar;
        this.f87419a = new k(aVar.h(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void update(MessageSnapshot messageSnapshot) {
        y9.a origin = this.f87421c.h().getOrigin();
        byte status = messageSnapshot.getStatus();
        this.f87422d = status;
        this.f87429k = messageSnapshot.n();
        if (status == -4) {
            this.f87424f.reset();
            int iC = h.e().c(origin.getId());
            if (iC + ((iC > 1 || !origin.z()) ? 0 : h.e().c(ia.f.r(origin.getUrl(), origin.C()))) <= 1) {
                byte bS = n.b().s(origin.getId());
                ia.d.i(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(origin.getId()), Integer.valueOf(bS));
                if (fa.b.a(bS)) {
                    this.f87422d = (byte) 1;
                    this.f87427i = messageSnapshot.i();
                    long jH = messageSnapshot.h();
                    this.f87426h = jH;
                    this.f87424f.b(jH);
                    this.f87419a.a(((MessageSnapshot.b) messageSnapshot).c());
                    return;
                }
            }
            h.e().h(this.f87421c.h(), messageSnapshot);
            return;
        }
        if (status == -3) {
            this.f87432n = messageSnapshot.p();
            this.f87426h = messageSnapshot.i();
            this.f87427i = messageSnapshot.i();
            h.e().h(this.f87421c.h(), messageSnapshot);
            return;
        }
        if (status == -1) {
            this.f87423e = messageSnapshot.m();
            this.f87426h = messageSnapshot.h();
            h.e().h(this.f87421c.h(), messageSnapshot);
            return;
        }
        if (status == 1) {
            this.f87426h = messageSnapshot.h();
            this.f87427i = messageSnapshot.i();
            this.f87419a.a(messageSnapshot);
            return;
        }
        if (status == 2) {
            this.f87427i = messageSnapshot.i();
            this.f87430l = messageSnapshot.o();
            this.f87431m = messageSnapshot.e();
            String strF = messageSnapshot.f();
            if (strF != null) {
                if (origin.n() != null) {
                    ia.d.i(this, "already has mFilename[%s], but assign mFilename[%s] again", origin.n(), strF);
                }
                this.f87421c.v(strF);
            }
            this.f87424f.b(this.f87426h);
            this.f87419a.j(messageSnapshot);
            return;
        }
        if (status == 3) {
            this.f87426h = messageSnapshot.h();
            this.f87424f.update(messageSnapshot.h());
            this.f87419a.d(messageSnapshot);
        } else if (status != 5) {
            if (status != 6) {
                return;
            }
            this.f87419a.b(messageSnapshot);
        } else {
            this.f87426h = messageSnapshot.h();
            this.f87423e = messageSnapshot.m();
            this.f87428j = messageSnapshot.j();
            this.f87424f.reset();
            this.f87419a.i(messageSnapshot);
        }
    }

    @Override // y9.y
    public Throwable a() {
        return this.f87423e;
    }

    @Override // y9.y.a
    public u b() {
        return this.f87419a;
    }

    @Override // y9.s
    public void c(int i10) {
        this.f87425g.c(i10);
    }

    @Override // y9.y
    public int d() {
        return this.f87428j;
    }

    @Override // y9.y.a
    public MessageSnapshot e(Throwable th2) {
        this.f87422d = (byte) -1;
        this.f87423e = th2;
        return com.liulishuo.filedownloader.message.a.b(o(), j(), th2);
    }

    @Override // y9.y
    public void f() {
        boolean z10;
        synchronized (this.f87420b) {
            if (this.f87422d != 0) {
                ia.d.i(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(o()), Byte.valueOf(this.f87422d));
                return;
            }
            this.f87422d = (byte) 10;
            a.b bVarH = this.f87421c.h();
            y9.a origin = bVarH.getOrigin();
            if (l.b()) {
                l.a().d(origin);
            }
            if (ia.d.f64033a) {
                ia.d.h(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", origin.getUrl(), origin.getPath(), origin.getListener(), origin.getTag());
            }
            try {
                p();
                z10 = true;
            } catch (Throwable th2) {
                h.e().a(bVarH);
                h.e().h(bVarH, e(th2));
                z10 = false;
            }
            if (z10) {
                q.a().b(this);
            }
            if (ia.d.f64033a) {
                ia.d.h(this, "the task[%d] has been into the launch pool.", Integer.valueOf(o()));
            }
        }
    }

    @Override // y9.y
    public void free() {
        if (ia.d.f64033a) {
            ia.d.a(this, "free the task %d, when the status is %d", Integer.valueOf(o()), Byte.valueOf(this.f87422d));
        }
        this.f87422d = (byte) 0;
    }

    @Override // y9.a.d
    public void g() {
        if (l.b() && getStatus() == 6) {
            l.a().a(this.f87421c.h().getOrigin());
        }
    }

    @Override // y9.y
    public byte getStatus() {
        return this.f87422d;
    }

    @Override // y9.a.d
    public void h() {
        y9.a origin = this.f87421c.h().getOrigin();
        if (l.b()) {
            l.a().b(origin);
        }
        if (ia.d.f64033a) {
            ia.d.h(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f87424f.e(this.f87426h);
        if (this.f87421c.q() != null) {
            ArrayList arrayList = (ArrayList) this.f87421c.q().clone();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a.InterfaceC1109a) arrayList.get(i10)).a(origin);
            }
        }
        r.c().d().b(this.f87421c.h());
    }

    @Override // y9.y.a
    public boolean i(MessageSnapshot messageSnapshot) {
        if (fa.b.b(getStatus(), messageSnapshot.getStatus())) {
            update(messageSnapshot);
            return true;
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f87422d), Byte.valueOf(getStatus()), Integer.valueOf(o()));
        }
        return false;
    }

    @Override // y9.y
    public long j() {
        return this.f87426h;
    }

    @Override // y9.y.a
    public boolean k(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte status2 = messageSnapshot.getStatus();
        if (-2 == status && fa.b.a(status2)) {
            if (ia.d.f64033a) {
                ia.d.a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(o()));
            }
            return true;
        }
        if (fa.b.c(status, status2)) {
            update(messageSnapshot);
            return true;
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f87422d), Byte.valueOf(getStatus()), Integer.valueOf(o()));
        }
        return false;
    }

    @Override // y9.y.a
    public boolean l(MessageSnapshot messageSnapshot) {
        if (!this.f87421c.h().getOrigin().z() || messageSnapshot.getStatus() != -4 || getStatus() != 2) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    @Override // y9.y
    public long m() {
        return this.f87427i;
    }

    @Override // y9.y.a
    public boolean n(MessageSnapshot messageSnapshot) {
        if (!fa.b.d(this.f87421c.h().getOrigin())) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    public final int o() {
        return this.f87421c.h().getOrigin().getId();
    }

    @Override // y9.a.d
    public void onBegin() {
        if (l.b()) {
            l.a().c(this.f87421c.h().getOrigin());
        }
        if (ia.d.f64033a) {
            ia.d.h(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    public final void p() throws IOException {
        File file;
        y9.a origin = this.f87421c.h().getOrigin();
        if (origin.getPath() == null) {
            origin.B(ia.f.v(origin.getUrl()));
            if (ia.d.f64033a) {
                ia.d.a(this, "save Path is null to %s", origin.getPath());
            }
        }
        if (origin.z()) {
            file = new File(origin.getPath());
        } else {
            String strA = ia.f.A(origin.getPath());
            if (strA == null) {
                throw new InvalidParameterException(ia.f.o("the provided mPath[%s] is invalid, can't find its directory", origin.getPath()));
            }
            file = new File(strA);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(ia.f.o("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    @Override // y9.y.b
    public void start() {
        if (this.f87422d != 10) {
            ia.d.i(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(o()), Byte.valueOf(this.f87422d));
            return;
        }
        a.b bVarH = this.f87421c.h();
        y9.a origin = bVarH.getOrigin();
        w wVarD = r.c().d();
        try {
            if (wVarD.a(bVarH)) {
                return;
            }
            synchronized (this.f87420b) {
                if (this.f87422d != 10) {
                    ia.d.i(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(o()), Byte.valueOf(this.f87422d));
                    return;
                }
                this.f87422d = (byte) 11;
                h.e().a(bVarH);
                if (ia.c.d(origin.getId(), origin.C(), origin.G(), true)) {
                    return;
                }
                boolean zT = n.b().t(origin.getUrl(), origin.getPath(), origin.z(), origin.l(), origin.g(), origin.j(), origin.G(), this.f87421c.b(), origin.w());
                if (this.f87422d == -2) {
                    ia.d.i(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(o()));
                    if (zT) {
                        n.b().q(o());
                        return;
                    }
                    return;
                }
                if (zT) {
                    wVarD.b(bVarH);
                    return;
                }
                if (wVarD.a(bVarH)) {
                    return;
                }
                MessageSnapshot messageSnapshotE = e(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                if (h.e().g(bVarH)) {
                    wVarD.b(bVarH);
                    h.e().a(bVarH);
                }
                h.e().h(bVarH, messageSnapshotE);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            h.e().h(bVarH, e(th2));
        }
    }
}
