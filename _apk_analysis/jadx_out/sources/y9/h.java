package y9;

import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y9.a;

/* JADX INFO: compiled from: FileDownloadList.java */
/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a.b> f87436a;

    /* JADX INFO: compiled from: FileDownloadList.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f87437a = new h();
    }

    public h() {
        this.f87436a = new ArrayList<>();
    }

    public static h e() {
        return b.f87437a;
    }

    public void a(a.b bVar) {
        if (!bVar.getOrigin().isAttached()) {
            bVar.E();
        }
        if (bVar.D().b().k()) {
            b(bVar);
        }
    }

    public void b(a.b bVar) {
        if (bVar.F()) {
            return;
        }
        synchronized (this.f87436a) {
            if (this.f87436a.contains(bVar)) {
                ia.d.i(this, "already has %s", bVar);
            } else {
                bVar.A();
                this.f87436a.add(bVar);
                if (ia.d.f64033a) {
                    ia.d.h(this, "add list in all %s %d %d", bVar, Byte.valueOf(bVar.getOrigin().getStatus()), Integer.valueOf(this.f87436a.size()));
                }
            }
        }
    }

    public int c(int i10) {
        int i11;
        synchronized (this.f87436a) {
            Iterator<a.b> it = this.f87436a.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (it.next().i(i10)) {
                    i11++;
                }
            }
        }
        return i11;
    }

    public void d(List<a.b> list) {
        synchronized (this.f87436a) {
            for (a.b bVar : this.f87436a) {
                if (!list.contains(bVar)) {
                    list.add(bVar);
                }
            }
            this.f87436a.clear();
        }
    }

    public List<a.b> f(int i10) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f87436a) {
            for (a.b bVar : this.f87436a) {
                if (bVar.i(i10) && !bVar.s() && (status = bVar.getOrigin().getStatus()) != 0 && status != 10) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean g(a.b bVar) {
        return this.f87436a.isEmpty() || !this.f87436a.contains(bVar);
    }

    public boolean h(a.b bVar, MessageSnapshot messageSnapshot) {
        boolean zRemove;
        byte status = messageSnapshot.getStatus();
        synchronized (this.f87436a) {
            zRemove = this.f87436a.remove(bVar);
            if (zRemove && this.f87436a.size() == 0 && n.b().m()) {
                r.c().h(true);
            }
        }
        if (ia.d.f64033a && this.f87436a.size() == 0) {
            ia.d.h(this, "remove %s left %d %d", bVar, Byte.valueOf(status), Integer.valueOf(this.f87436a.size()));
        }
        if (zRemove) {
            u uVarB = bVar.D().b();
            if (status == -4) {
                uVarB.l(messageSnapshot);
            } else if (status == -3) {
                uVarB.m(com.liulishuo.filedownloader.message.a.e(messageSnapshot));
            } else if (status == -2) {
                uVarB.c(messageSnapshot);
            } else if (status == -1) {
                uVarB.h(messageSnapshot);
            }
        } else {
            ia.d.b(this, "remove error, not exist: %s %d", bVar, Byte.valueOf(status));
        }
        return zRemove;
    }

    public int i() {
        return this.f87436a.size();
    }
}
