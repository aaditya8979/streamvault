package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f93055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f93056c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f93057d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f93058e = yd1.f97088b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f93059f;

    public o(a0 a0Var) {
        this.f93059f = a0Var;
        this.f93055b = a0Var.f87525f.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f93055b.hasNext() || this.f93058e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f93058e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f93055b.next();
            this.f93056c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f93057d = collection;
            this.f93058e = collection.iterator();
        }
        return a(this.f93056c, this.f93058e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f93058e.remove();
        Collection collection = this.f93057d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f93055b.remove();
        }
        a0 a0Var = this.f93059f;
        a0Var.f87526g--;
    }
}
