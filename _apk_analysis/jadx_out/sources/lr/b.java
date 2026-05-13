package lr;

import java.net.InetAddress;
import lr.d;
import org.fourthline.cling.model.message.UpnpMessage;

/* JADX INFO: compiled from: IncomingDatagramMessage.java */
/* JADX INFO: loaded from: classes8.dex */
public class b<O extends d> extends UpnpMessage<O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetAddress f73917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f73918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InetAddress f73919i;

    public b(b<O> bVar) {
        super(bVar);
        this.f73917g = bVar.v();
        this.f73918h = bVar.w();
        this.f73919i = bVar.u();
    }

    public b(O o10, InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        super(o10);
        this.f73917g = inetAddress;
        this.f73918h = i10;
        this.f73919i = inetAddress2;
    }

    public InetAddress u() {
        return this.f73919i;
    }

    public InetAddress v() {
        return this.f73917g;
    }

    public int w() {
        return this.f73918h;
    }
}
