package qr;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import ur.r;
import ur.s;

/* JADX INFO: compiled from: RemoteService.java */
/* JADX INFO: loaded from: classes3.dex */
public class k extends l<i, k> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final URI f78463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final URI f78464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final URI f78465i;

    public k(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<k>[] aVarArr, m<k>[] mVarArr) throws ValidationException {
        super(sVar, rVar, aVarArr, mVarArr);
        this.f78463g = uri;
        this.f78464h = uri2;
        this.f78465i = uri3;
        List<ir.k> listQ = q();
        if (listQ.size() > 0) {
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", listQ);
        }
    }

    public URI n() {
        return this.f78464h;
    }

    public URI o() {
        return this.f78463g;
    }

    public URI p() {
        return this.f78465i;
    }

    public List<ir.k> q() {
        ArrayList arrayList = new ArrayList();
        if (o() == null) {
            arrayList.add(new ir.k(getClass(), "descriptorURI", "Descriptor location (SCPDURL) is required"));
        }
        if (n() == null) {
            arrayList.add(new ir.k(getClass(), "controlURI", "Control URL is required"));
        }
        if (p() == null) {
            arrayList.add(new ir.k(getClass(), "eventSubscriptionURI", "Event subscription URL is required"));
        }
        return arrayList;
    }

    @Override // qr.l
    public String toString() {
        return "(" + getClass().getSimpleName() + ") Descriptor: " + o();
    }
}
