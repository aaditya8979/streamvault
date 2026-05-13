package p001if;

import af.f;
import af.h;
import af.j;
import af.k;
import af.l;
import android.content.Context;
import android.widget.RelativeLayout;
import kf.e;
import kf.g;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jf.a f64194e;

    /* JADX INFO: renamed from: if.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0789a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f64195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cf.c f64196c;

        /* JADX INFO: renamed from: if.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0790a implements cf.b {
            public C0790a() {
            }

            @Override // cf.b
            public void onAdLoaded() {
                a.this.f3755b.put(RunnableC0789a.this.f64196c.c(), RunnableC0789a.this.f64195b);
            }
        }

        public RunnableC0789a(e eVar, cf.c cVar) {
            this.f64195b = eVar;
            this.f64196c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64195b.a(new C0790a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f64199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cf.c f64200c;

        /* JADX INFO: renamed from: if.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0791a implements cf.b {
            public C0791a() {
            }

            @Override // cf.b
            public void onAdLoaded() {
                a.this.f3755b.put(b.this.f64200c.c(), b.this.f64199b);
            }
        }

        public b(g gVar, cf.c cVar) {
            this.f64199b = gVar;
            this.f64200c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64199b.a(new C0791a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kf.c f64203b;

        public c(kf.c cVar) {
            this.f64203b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64203b.a(null);
        }
    }

    public a(af.c<l> cVar, String str) {
        super(cVar);
        jf.a aVar = new jf.a(new bf.a(str));
        this.f64194e = aVar;
        this.f3754a = new lf.b(aVar);
    }

    @Override // af.e
    public void e(Context context, cf.c cVar, af.g gVar) {
        k.a(new RunnableC0789a(new e(context, this.f64194e, cVar, this.f3757d, gVar), cVar));
    }

    @Override // af.e
    public void f(Context context, cf.c cVar, h hVar) {
        k.a(new b(new g(context, this.f64194e, cVar, this.f3757d, hVar), cVar));
    }

    @Override // af.e
    public void g(Context context, RelativeLayout relativeLayout, cf.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new kf.c(context, relativeLayout, this.f64194e, cVar, i10, i11, this.f3757d, fVar)));
    }
}
