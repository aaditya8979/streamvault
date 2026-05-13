package tr;

import ir.j;
import qr.f;
import qr.m;

/* JADX INFO: compiled from: StateVariableAccessor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: compiled from: StateVariableAccessor.java */
    public class a implements ir.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f85393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f85394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f85395c;

        public a(Object obj, m mVar) {
            this.f85394b = obj;
            this.f85395c = mVar;
        }

        @Override // ir.a
        public void a(j jVar) throws Exception {
            this.f85393a = c.this.b(this.f85394b);
            if (((f) this.f85395c.c()).t(this.f85393a)) {
                this.f85393a = this.f85393a.toString();
            }
        }
    }

    public abstract Class<?> a();

    public abstract Object b(Object obj) throws Exception;

    public d c(m<f> mVar, Object obj) throws Exception {
        a aVar = new a(obj, mVar);
        ((f) mVar.c()).q().b(aVar);
        return new d(mVar, aVar.f85393a);
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
