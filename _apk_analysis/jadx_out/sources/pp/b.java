package pp;

/* JADX INFO: compiled from: BindingCommand.java */
/* JADX INFO: loaded from: classes11.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f77532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d<Boolean> f77533c;

    public b(a aVar) {
        this.f77531a = aVar;
    }

    public b(c<T> cVar) {
        this.f77532b = cVar;
    }

    public final boolean a() {
        d<Boolean> dVar = this.f77533c;
        if (dVar == null) {
            return true;
        }
        return dVar.call().booleanValue();
    }

    public void b() {
        if (this.f77531a == null || !a()) {
            return;
        }
        this.f77531a.call();
    }

    public void c(T t10) {
        if (this.f77531a != null && a()) {
            this.f77531a.call();
        } else {
            if (this.f77532b == null || !a()) {
                return;
            }
            this.f77532b.call(t10);
        }
    }
}
