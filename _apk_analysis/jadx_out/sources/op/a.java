package op;

import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import wm.c;
import xl.k;
import xl.m;
import xl.n;

/* JADX INFO: compiled from: RxBus.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f76510c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Object> f76511a = PublishSubject.d().b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f76512b = new ConcurrentHashMap();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: op.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RxBus.java */
    public class C0910a<T> implements n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f76513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f76514b;

        public C0910a(Class cls, Object obj) {
            this.f76513a = cls;
            this.f76514b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xl.n
        public void subscribe(m<T> mVar) throws Exception {
            mVar.onNext(this.f76513a.cast(this.f76514b));
        }
    }

    public static a a() {
        if (f76510c == null) {
            synchronized (a.class) {
                if (f76510c == null) {
                    f76510c = new a();
                }
            }
        }
        return f76510c;
    }

    public void b(Object obj) {
        this.f76511a.onNext(obj);
    }

    public void c(Object obj) {
        synchronized (this.f76512b) {
            this.f76512b.put(obj.getClass(), obj);
        }
        b(obj);
    }

    public <T> k<T> d(Class<T> cls) {
        return (k<T>) this.f76511a.ofType(cls);
    }

    public <T> k<T> e(Class<T> cls) {
        synchronized (this.f76512b) {
            k<T> kVar = (k<T>) this.f76511a.ofType(cls);
            Object obj = this.f76512b.get(cls);
            if (obj == null) {
                return kVar;
            }
            return k.merge(kVar, k.create(new C0910a(cls, obj)));
        }
    }
}
