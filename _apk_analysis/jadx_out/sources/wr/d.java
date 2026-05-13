package wr;

import androidx.compose.material.TextFieldImplKt;
import ir.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.transport.RouterException;
import ur.s;

/* JADX INFO: compiled from: SendingNotification.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends vr.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f86689e = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qr.e f86690d;

    public d(br.b bVar, qr.e eVar) {
        super(bVar);
        this.f86690d = eVar;
    }

    @Override // vr.f
    public void a() throws RouterException {
        List<h> listH = b().c().h(null);
        if (listH.size() == 0) {
            f86689e.fine("Aborting notifications, no active stream servers found (network disabled?)");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(new ir.e(it.next(), b().getConfiguration().getNamespace().f(h())));
        }
        for (int i10 = 0; i10 < g(); i10++) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j((ir.e) it2.next());
                }
                f86689e.finer("Sleeping " + f() + " milliseconds");
                Thread.sleep((long) f());
            } catch (InterruptedException e10) {
                f86689e.warning("Advertisement thread was interrupted: " + e10);
            }
        }
    }

    public List<nr.d> c(qr.e eVar, ir.e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar.A()) {
            arrayList.add(new nr.f(eVar2, eVar, i()));
        }
        arrayList.add(new nr.h(eVar2, eVar, i()));
        arrayList.add(new nr.e(eVar2, eVar, i()));
        return arrayList;
    }

    public List<nr.d> d(qr.e eVar, ir.e eVar2) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : eVar.k()) {
            arrayList.add(new nr.g(eVar2, eVar, i(), sVar));
        }
        return arrayList;
    }

    public int f() {
        return TextFieldImplKt.AnimationDuration;
    }

    public int g() {
        return 3;
    }

    public qr.e h() {
        return this.f86690d;
    }

    public abstract NotificationSubtype i();

    public void j(ir.e eVar) throws RouterException {
        f86689e.finer("Sending root device messages: " + h());
        Iterator<nr.d> it = c(h(), eVar).iterator();
        while (it.hasNext()) {
            b().c().e(it.next());
        }
        if (h().w()) {
            for (qr.e eVar2 : h().i()) {
                f86689e.finer("Sending embedded device messages: " + eVar2);
                Iterator<nr.d> it2 = c(eVar2, eVar).iterator();
                while (it2.hasNext()) {
                    b().c().e(it2.next());
                }
            }
        }
        List<nr.d> listD = d(h(), eVar);
        if (listD.size() > 0) {
            f86689e.finer("Sending service type messages");
            Iterator<nr.d> it3 = listD.iterator();
            while (it3.hasNext()) {
                b().c().e(it3.next());
            }
        }
    }
}
