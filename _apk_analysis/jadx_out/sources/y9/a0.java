package y9;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y9.a;

/* JADX INFO: compiled from: LostServiceConnectedHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public class a0 extends e implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a.b> f87384b = new ArrayList<>();

    @Override // y9.w
    public boolean a(a.b bVar) {
        if (!r.c().f()) {
            synchronized (this.f87384b) {
                if (!r.c().f()) {
                    if (ia.d.f64033a) {
                        ia.d.a(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.getOrigin().getId()));
                    }
                    n.b().o(ia.c.a());
                    if (!this.f87384b.contains(bVar)) {
                        bVar.free();
                        this.f87384b.add(bVar);
                    }
                    return true;
                }
            }
        }
        b(bVar);
        return false;
    }

    @Override // y9.w
    public void b(a.b bVar) {
        if (this.f87384b.isEmpty()) {
            return;
        }
        synchronized (this.f87384b) {
            this.f87384b.remove(bVar);
        }
    }

    @Override // y9.w
    public boolean c(a.b bVar) {
        return !this.f87384b.isEmpty() && this.f87384b.contains(bVar);
    }

    @Override // y9.e
    public void e() {
        x xVarE = r.c().e();
        if (ia.d.f64033a) {
            ia.d.a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f87384b) {
            List<a.b> list = (List) this.f87384b.clone();
            this.f87384b.clear();
            ArrayList arrayList = new ArrayList(xVarE.b());
            for (a.b bVar : list) {
                int iE = bVar.e();
                if (xVarE.a(iE)) {
                    bVar.getOrigin().f().a();
                    if (!arrayList.contains(Integer.valueOf(iE))) {
                        arrayList.add(Integer.valueOf(iE));
                    }
                } else {
                    bVar.o();
                }
            }
            xVarE.d(arrayList);
        }
    }

    @Override // y9.e
    public void f() {
        if (g() != DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            if (h.e().i() > 0) {
                ia.d.i(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(h.e().i()));
                return;
            }
            return;
        }
        x xVarE = r.c().e();
        if (ia.d.f64033a) {
            ia.d.a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(h.e().i()));
        }
        if (h.e().i() > 0) {
            synchronized (this.f87384b) {
                h.e().d(this.f87384b);
                Iterator<a.b> it = this.f87384b.iterator();
                while (it.hasNext()) {
                    it.next().free();
                }
                xVarE.c();
            }
            try {
                r.c().bindService();
            } catch (IllegalStateException unused) {
                ia.d.i(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }
}
