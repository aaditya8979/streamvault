package wr;

import java.util.logging.Logger;
import nr.i;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingSearch.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends vr.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f86693f = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UpnpHeader f86694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86695e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(br.b bVar, UpnpHeader upnpHeader, int i10) {
        super(bVar);
        if (UpnpHeader.Type.ST.isValidHeaderType(upnpHeader.getClass())) {
            this.f86694d = upnpHeader;
            this.f86695e = i10;
        } else {
            throw new IllegalArgumentException("Given search target instance is not a valid header class for type ST: " + upnpHeader.getClass());
        }
    }

    @Override // vr.f
    public void a() throws RouterException {
        f86693f.fine("Executing search for target: " + this.f86694d.a() + " with MX seconds: " + f());
        i iVar = new i(this.f86694d, f());
        g(iVar);
        for (int i10 = 0; i10 < d(); i10++) {
            try {
                b().c().e(iVar);
                f86693f.finer("Sleeping " + c() + " milliseconds");
                Thread.sleep((long) c());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public int c() {
        return 500;
    }

    public int d() {
        return 5;
    }

    public int f() {
        return this.f86695e;
    }

    public void g(i iVar) {
    }
}
