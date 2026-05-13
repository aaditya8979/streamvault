package sr;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: compiled from: Resource.java */
/* JADX INFO: loaded from: classes4.dex */
public class c<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URI f84563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f84564b;

    public c(URI uri, M m10) {
        try {
            this.f84563a = new URI(null, null, uri.getPath(), uri.getQuery(), null);
            this.f84564b = m10;
            if (m10 == null) {
                throw new IllegalArgumentException("Model instance must not be null");
            }
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    public M a() {
        return this.f84564b;
    }

    public URI b() {
        return this.f84563a;
    }

    public void c(List<Runnable> list, ir.d dVar) {
    }

    public boolean d(URI uri) {
        return uri.equals(b());
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && b().equals(((c) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") URI: " + b();
    }
}
