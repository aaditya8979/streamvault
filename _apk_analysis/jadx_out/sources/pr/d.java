package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ContentTypeHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends UpnpHeader<os.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final os.c f77535c = os.c.f("text/xml");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final os.c f77536d = os.c.f("text/xml;charset=\"utf-8\"");

    public d() {
        e(f77535c);
    }

    public d(os.c cVar) {
        e(cVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        e(os.c.f(str));
    }

    public boolean f() {
        return b() != null && b().getType().equals(f77535c.getType());
    }

    public boolean g() {
        return f() && b().c().equals(f77535c.c());
    }
}
