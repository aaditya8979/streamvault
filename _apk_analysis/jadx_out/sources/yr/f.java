package yr;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kr.a;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.registry.RegistrationException;
import qr.a;
import ur.j;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: RegistryItems.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f<D extends qr.a, S extends kr.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<e<z, D>> f98076b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e<String, S>> f98077c = new HashSet();

    public f(d dVar) {
        this.f98075a = dVar;
    }

    public void a(S s10) {
        this.f98077c.add(new e<>(s10.I(), s10, s10.o()));
    }

    public Collection<D> b() {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f98076b.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return hashSet;
    }

    public Collection<D> c(j jVar) {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f98076b.iterator();
        while (it.hasNext()) {
            qr.a[] aVarArrF = it.next().b().f(jVar);
            if (aVarArrF != null) {
                hashSet.addAll(Arrays.asList(aVarArrF));
            }
        }
        return hashSet;
    }

    public Collection<D> d(s sVar) {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f98076b.iterator();
        while (it.hasNext()) {
            qr.a[] aVarArrG = it.next().b().g(sVar);
            if (aVarArrG != null) {
                hashSet.addAll(Arrays.asList(aVarArrG));
            }
        }
        return hashSet;
    }

    public D e(z zVar, boolean z10) {
        D d10;
        for (e<z, D> eVar : this.f98076b) {
            D dB = eVar.b();
            if (dB.r().b().equals(zVar)) {
                return dB;
            }
            if (!z10 && (d10 = (D) eVar.b().e(zVar)) != null) {
                return d10;
            }
        }
        return null;
    }

    public Set<e<z, D>> f() {
        return this.f98076b;
    }

    public S g(String str) {
        for (e<String, S> eVar : this.f98077c) {
            if (eVar.c().equals(str)) {
                return eVar.b();
            }
        }
        return null;
    }

    public sr.c[] getResources(qr.a aVar) throws RegistrationException {
        try {
            return this.f98075a.I().getNamespace().getResources(aVar);
        } catch (ValidationException e10) {
            throw new RegistrationException("Resource discover error: " + e10.toString(), e10);
        }
    }

    public Set<e<String, S>> h() {
        return this.f98077c;
    }

    public boolean i(S s10) {
        return this.f98077c.remove(new e(s10.I()));
    }

    public boolean j(S s10) {
        if (!i(s10)) {
            return false;
        }
        a(s10);
        return true;
    }
}
