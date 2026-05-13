package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.d;

/* JADX INFO: compiled from: StreamResponseMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends UpnpMessage<UpnpResponse> {
    public c(String str) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.STRING, str);
    }

    public c(String str, d dVar) {
        this(str);
        j().n(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }

    public c(UpnpResponse.Status status) {
        super(new UpnpResponse(status));
    }

    public c(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public c(c cVar) {
        super(cVar);
    }

    public c(byte[] bArr) {
        super(new UpnpResponse(UpnpResponse.Status.OK), UpnpMessage.BodyType.BYTES, bArr);
    }

    public c(byte[] bArr, os.c cVar) {
        this(bArr, new d(cVar));
    }

    public c(byte[] bArr, d dVar) {
        this(bArr);
        j().n(UpnpHeader.Type.CONTENT_TYPE, dVar);
    }
}
