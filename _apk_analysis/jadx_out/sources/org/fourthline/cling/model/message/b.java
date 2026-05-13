package org.fourthline.cling.model.message;

import java.net.URI;
import java.net.URL;
import org.fourthline.cling.model.message.UpnpRequest;

/* JADX INFO: compiled from: StreamRequestMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends UpnpMessage<UpnpRequest> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lr.a f76848g;

    public b(UpnpRequest.Method method, URI uri) {
        super(new UpnpRequest(method, uri));
    }

    public b(UpnpRequest.Method method, URL url) {
        super(new UpnpRequest(method, url));
    }

    public b(UpnpRequest upnpRequest) {
        super(upnpRequest);
    }

    public b(b bVar) {
        super(bVar);
        this.f76848g = bVar.u();
    }

    public lr.a u() {
        return this.f76848g;
    }

    public URI v() {
        return k().e();
    }

    public void w(lr.a aVar) {
        this.f76848g = aVar;
    }

    public void x(URI uri) {
        k().f(uri);
    }
}
