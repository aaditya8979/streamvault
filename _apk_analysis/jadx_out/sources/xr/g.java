package xr;

import java.net.URL;
import java.util.Iterator;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingEvent.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends vr.g<or.e, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f87112i = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f87113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final or.e[] f87114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final org.fourthline.cling.model.types.b f87115h;

    public g(br.b bVar, kr.b bVar2) {
        super(bVar, null);
        this.f87113f = bVar2.I();
        this.f87114g = new or.e[bVar2.O().size()];
        Iterator<URL> it = bVar2.O().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f87114g[i10] = new or.e(bVar2, it.next());
            b().getConfiguration().r().b(this.f87114g[i10]);
            i10++;
        }
        this.f87115h = bVar2.t();
        bVar2.P();
    }

    @Override // vr.g
    public org.fourthline.cling.model.message.c c() throws RouterException {
        f87112i.fine("Sending event for subscription: " + this.f87113f);
        org.fourthline.cling.model.message.c cVarF = null;
        for (or.e eVar : this.f87114g) {
            if (this.f87115h.c().longValue() == 0) {
                f87112i.fine("Sending initial event message to callback URL: " + eVar.v());
            } else {
                f87112i.fine("Sending event message '" + this.f87115h + "' to callback URL: " + eVar.v());
            }
            cVarF = b().c().f(eVar);
            f87112i.fine("Received event callback response: " + cVarF);
        }
        return cVarF;
    }
}
