package ir;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import org.seamless.util.URIUtil;

/* JADX INFO: compiled from: Namespace.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f71775c = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URI f71776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71777b;

    public g() {
        this("");
    }

    public g(String str) {
        this(URI.create(str));
    }

    public g(URI uri) {
        this.f71776a = uri;
        this.f71777b = uri.getPath();
    }

    public URI a(String str) {
        try {
            return new URI(this.f71776a.getScheme(), null, this.f71776a.getHost(), this.f71776a.getPort(), this.f71777b + str, null, null);
        } catch (URISyntaxException unused) {
            return URI.create(this.f71776a + str);
        }
    }

    public URI b() {
        return this.f71776a;
    }

    public URI c(qr.l lVar) {
        return a(l(lVar) + "/action");
    }

    public URI d(qr.a aVar) {
        return a(g(aVar.t()) + "/desc");
    }

    public URI e(qr.l lVar) {
        return a(l(lVar) + "/desc");
    }

    public String f(qr.a aVar) {
        return this.f71777b + g(aVar.t()) + "/desc";
    }

    public String g(qr.a aVar) {
        if (aVar.r().b() == null) {
            throw new IllegalStateException("Can't generate local URI prefix without UDN");
        }
        return "/dev/" + URIUtil.d(aVar.r().b().a());
    }

    public sr.c[] getResources(qr.a aVar) throws ValidationException {
        if (!aVar.A()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        f71775c.fine("Discovering local resources of device graph");
        for (sr.c cVar : aVar.a(this)) {
            Logger logger = f71775c;
            logger.finer("Discovered: " + cVar);
            if (!hashSet.add(cVar)) {
                logger.finer("Local resource already exists, queueing validation error");
                arrayList.add(new k(getClass(), "resources", "Local URI namespace conflict between resources of device: " + cVar));
            }
        }
        if (arrayList.size() <= 0) {
            return (sr.c[]) hashSet.toArray(new sr.c[hashSet.size()]);
        }
        throw new ValidationException("Validation of device graph failed, call getErrors() on exception", arrayList);
    }

    public URI h(qr.l lVar) {
        return a(l(lVar) + "/event/cb");
    }

    public String i(qr.l lVar) {
        return this.f71777b + l(lVar) + "/event/cb";
    }

    public URI j(qr.l lVar) {
        return a(l(lVar) + "/event");
    }

    public URI k(qr.d dVar) {
        return a(g(dVar.d()) + "/" + dVar.g().toString());
    }

    public String l(qr.l lVar) {
        if (lVar.f() == null) {
            throw new IllegalStateException("Can't generate local URI prefix without service ID");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g(lVar.d()));
        sb2.append("/svc/" + lVar.f().b() + "/" + lVar.f().a());
        return sb2.toString();
    }

    public boolean m(URI uri) {
        return uri.toString().endsWith("/action");
    }

    public boolean n(URI uri) {
        return uri.toString().endsWith("/cb");
    }

    public boolean o(URI uri) {
        return uri.toString().endsWith("/event");
    }

    public URI p(qr.a aVar, URI uri) {
        if (uri.isAbsolute() || uri.getPath().startsWith("/")) {
            return uri;
        }
        return a(g(aVar) + "/" + uri);
    }
}
