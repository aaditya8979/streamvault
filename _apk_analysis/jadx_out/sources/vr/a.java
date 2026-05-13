package vr;

import java.net.URL;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.protocol.ProtocolCreationException;
import xr.h;
import xr.i;
import xr.j;

/* JADX INFO: compiled from: ProtocolFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {
    xr.g a(kr.b bVar);

    j b(kr.c cVar);

    i c(kr.c cVar) throws ProtocolCreationException;

    xr.f d(jr.d dVar, URL url);

    c e(lr.b bVar) throws ProtocolCreationException;

    wr.g f(UpnpHeader upnpHeader, int i10);

    wr.e g(qr.e eVar);

    wr.f h(qr.e eVar);

    h i(kr.c cVar);

    d j(org.fourthline.cling.model.message.b bVar) throws ProtocolCreationException;
}
