package ol;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f76465b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f76466c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f76467d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "removedRef");

    @NotNull
    public volatile /* synthetic */ Object _next = this;

    @NotNull
    public volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object removedRef = null;

    public final c b(c cVar, d dVar) {
        Object obj;
        while (true) {
            c cVar2 = null;
            while (true) {
                obj = cVar._next;
                if (obj == dVar) {
                    return cVar;
                }
                if (obj instanceof d) {
                    ((d) obj).a(cVar);
                } else if (!(obj instanceof e)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof e) {
                        return null;
                    }
                    if (obj != this) {
                        p.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        cVar2 = cVar;
                        cVar = (c) obj;
                    } else {
                        if (obj2 == cVar) {
                            return null;
                        }
                        if (androidx.concurrent.futures.a.a(f76466c, this, obj2, cVar) && !(cVar._prev instanceof e)) {
                            return null;
                        }
                    }
                } else {
                    if (cVar2 != null) {
                        break;
                    }
                    cVar = b.a(cVar._prev);
                }
            }
            cVar.h();
            androidx.concurrent.futures.a.a(f76465b, cVar2, cVar, ((e) obj).f76468a);
            cVar = cVar2;
        }
    }

    public final c c() {
        c cVarF = this;
        while (!(cVarF instanceof a)) {
            cVarF = cVarF.f();
            if (!(cVarF != this)) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return cVarF;
    }

    public final void d(c cVar) {
        g();
        cVar.b(b.a(this._prev), null);
    }

    @NotNull
    public final Object e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof d)) {
                return obj;
            }
            ((d) obj).a(this);
        }
    }

    @NotNull
    public final c f() {
        return b.a(e());
    }

    public final void g() {
        Object objE;
        c cVarH = h();
        Object obj = this._next;
        p.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        c cVar = ((e) obj).f76468a;
        while (true) {
            c cVar2 = null;
            while (true) {
                Object objE2 = cVar.e();
                if (objE2 instanceof e) {
                    cVar.h();
                    cVar = ((e) objE2).f76468a;
                } else {
                    objE = cVarH.e();
                    if (objE instanceof e) {
                        if (cVar2 != null) {
                            break;
                        } else {
                            cVarH = b.a(cVarH._prev);
                        }
                    } else if (objE != this) {
                        p.i(objE, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        c cVar3 = (c) objE;
                        if (cVar3 == cVar) {
                            return;
                        }
                        cVar2 = cVarH;
                        cVarH = cVar3;
                    } else if (androidx.concurrent.futures.a.a(f76465b, cVarH, this, cVar)) {
                        return;
                    }
                }
            }
            cVarH.h();
            androidx.concurrent.futures.a.a(f76465b, cVar2, cVarH, ((e) objE).f76468a);
            cVarH = cVar2;
        }
    }

    public final c h() {
        Object obj;
        c cVarC;
        do {
            obj = this._prev;
            if (obj instanceof e) {
                return ((e) obj).f76468a;
            }
            if (obj == this) {
                cVarC = c();
            } else {
                p.i(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                cVarC = (c) obj;
            }
        } while (!androidx.concurrent.futures.a.a(f76466c, this, obj, cVarC.j()));
        return (c) obj;
    }

    public boolean i() {
        Object objE;
        c cVar;
        do {
            objE = e();
            if ((objE instanceof e) || objE == this) {
                return false;
            }
            p.i(objE, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            cVar = (c) objE;
        } while (!androidx.concurrent.futures.a.a(f76465b, this, objE, cVar.j()));
        d(cVar);
        return true;
    }

    public final e j() {
        e eVar = (e) this.removedRef;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        f76467d.lazySet(this, eVar2);
        return eVar2;
    }

    @NotNull
    public String toString() {
        return t.b(getClass()).getSimpleName() + '@' + hashCode();
    }
}
