package yr;

import java.net.URI;
import java.util.Collection;
import org.fourthline.cling.registry.RegistrationException;
import ur.j;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    boolean A(z zVar);

    void B(kr.c cVar);

    void C(qr.i iVar, Exception exc);

    <T extends sr.c> T D(Class<T> cls, URI uri) throws IllegalArgumentException;

    kr.b a(String str);

    ir.c b(z zVar);

    Collection<qr.a> c();

    Collection<qr.a> d(s sVar);

    sr.c e(URI uri) throws IllegalArgumentException;

    boolean f(kr.b bVar);

    void g(kr.c cVar);

    Collection<g> getListeners();

    Collection<sr.c> getResources();

    <T extends sr.c> Collection<T> getResources(Class<T> cls);

    boolean h(qr.i iVar);

    void i(kr.b bVar);

    boolean j(qr.e eVar);

    void k(kr.c cVar);

    kr.c l(String str);

    boolean m(qr.i iVar);

    void n(g gVar);

    qr.e o(z zVar, boolean z10);

    kr.c p(String str);

    boolean q(kr.b bVar);

    qr.i r(z zVar, boolean z10);

    void s(kr.c cVar);

    void shutdown();

    void t(g gVar);

    Collection<qr.a> u(j jVar);

    boolean update(qr.j jVar);

    Collection<qr.e> v();

    void w(qr.e eVar) throws RegistrationException;

    void x(kr.c cVar);

    qr.a y(z zVar, boolean z10);

    void z(qr.i iVar) throws RegistrationException;
}
