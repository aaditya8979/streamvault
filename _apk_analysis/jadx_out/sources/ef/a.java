package ef;

import af.f;
import af.h;
import af.j;
import af.k;
import af.l;
import android.content.Context;
import android.widget.RelativeLayout;
import gf.e;
import gf.g;

/* JADX INFO: compiled from: ScarAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ff.a f61117e;

    /* JADX INFO: renamed from: ef.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdapter.java */
    public class RunnableC0745a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f61118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cf.c f61119c;

        /* JADX INFO: renamed from: ef.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0746a implements cf.b {
            public C0746a() {
            }

            @Override // cf.b
            public void onAdLoaded() {
                a.this.f3755b.put(RunnableC0745a.this.f61119c.c(), RunnableC0745a.this.f61118b);
            }
        }

        public RunnableC0745a(e eVar, cf.c cVar) {
            this.f61118b = eVar;
            this.f61119c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61118b.a(new C0746a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f61122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cf.c f61123c;

        /* JADX INFO: renamed from: ef.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScarAdapter.java */
        public class C0747a implements cf.b {
            public C0747a() {
            }

            @Override // cf.b
            public void onAdLoaded() {
                a.this.f3755b.put(b.this.f61123c.c(), b.this.f61122b);
            }
        }

        public b(g gVar, cf.c cVar) {
            this.f61122b = gVar;
            this.f61123c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61122b.a(new C0747a());
        }
    }

    /* JADX INFO: compiled from: ScarAdapter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gf.c f61126b;

        public c(gf.c cVar) {
            this.f61126b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61126b.a(null);
        }
    }

    public a(af.c<l> cVar, String str) {
        super(cVar);
        ff.a aVar = new ff.a(new bf.a(str));
        this.f61117e = aVar;
        this.f3754a = new hf.b(aVar);
    }

    @Override // af.e
    public void e(Context context, cf.c cVar, af.g gVar) {
        k.a(new RunnableC0745a(new e(context, this.f61117e, cVar, this.f3757d, gVar), cVar));
    }

    @Override // af.e
    public void f(Context context, cf.c cVar, h hVar) {
        k.a(new b(new g(context, this.f61117e, cVar, this.f3757d, hVar), cVar));
    }

    @Override // af.e
    public void g(Context context, RelativeLayout relativeLayout, cf.c cVar, int i10, int i11, f fVar) {
        k.a(new c(new gf.c(context, relativeLayout, this.f61117e, cVar, i10, i11, this.f3757d, fVar)));
    }
}
