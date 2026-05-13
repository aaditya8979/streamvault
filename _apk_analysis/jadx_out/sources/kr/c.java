package kr;

import ir.e;
import ir.g;
import ir.h;
import java.beans.PropertyChangeSupport;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import qr.k;
import tr.d;

/* JADX INFO: compiled from: RemoteGENASubscription.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends a<k> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PropertyChangeSupport f73567h;

    public c(k kVar, int i10) {
        super(kVar, i10);
        this.f73567h = new PropertyChangeSupport(this);
    }

    public synchronized void L(CancelReason cancelReason, UpnpResponse upnpResponse) {
        M(cancelReason, upnpResponse);
    }

    public abstract void M(CancelReason cancelReason, UpnpResponse upnpResponse);

    public synchronized void N() {
        e();
    }

    public abstract void O(int i10);

    public synchronized void P(UpnpResponse upnpResponse) {
        Q(upnpResponse);
    }

    public abstract void Q(UpnpResponse upnpResponse);

    public synchronized List<URL> R(List<h> list, g gVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new e(it.next(), gVar.i(H())).c());
        }
        return arrayList;
    }

    public synchronized URL S() {
        return H().d().O(H().p());
    }

    public abstract void T(UnsupportedDataException unsupportedDataException);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public synchronized void U(org.fourthline.cling.model.types.b bVar, Collection<d> collection) {
        org.fourthline.cling.model.types.b bVar2 = this.f73561f;
        if (bVar2 != null) {
            if (bVar2.c().equals(Long.valueOf(this.f73561f.a().getMaxValue())) && bVar.c().longValue() == 1) {
                System.err.println("TODO: HANDLE ROLLOVER");
                return;
            } else {
                if (this.f73561f.c().longValue() >= bVar.c().longValue()) {
                    return;
                }
                int iLongValue = (int) (bVar.c().longValue() - (this.f73561f.c().longValue() + 1));
                if (iLongValue != 0) {
                    O(iLongValue);
                }
            }
        }
        this.f73561f = bVar;
        for (d dVar : collection) {
            this.f73562g.put(dVar.d().b(), (d<S>) dVar);
        }
        g();
    }

    @Override // kr.a
    public String toString() {
        return "(SID: " + I() + ") " + H();
    }
}
