package fp;

import java.util.Comparator;

/* JADX INFO: compiled from: IDanmakus.java */
/* JADX INFO: loaded from: classes3.dex */
public interface k {

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class a implements Comparator<fp.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f61811b;

        public a(boolean z10) {
            b(z10);
        }

        /* JADX INFO: renamed from: a */
        public int compare(fp.c cVar, fp.c cVar2) {
            if (this.f61811b && lp.a.g(cVar, cVar2)) {
                return 0;
            }
            return lp.a.d(cVar, cVar2);
        }

        public void b(boolean z10) {
            this.f61811b = z10;
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static abstract class b<Progress, Result> {
        public abstract int a(Progress progress);

        public void b() {
        }

        public void c() {
        }

        public Result d() {
            return null;
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static abstract class c<Progress> extends b<Progress, Void> {
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class d extends a {
        public d(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(fp.c cVar, fp.c cVar2) {
            return super.compare(cVar, cVar2);
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class e extends a {
        public e(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(fp.c cVar, fp.c cVar2) {
            if (this.f61811b && lp.a.g(cVar, cVar2)) {
                return 0;
            }
            return Float.compare(cVar.l(), cVar2.l());
        }
    }

    /* JADX INFO: compiled from: IDanmakus.java */
    public static class f extends a {
        public f(boolean z10) {
            super(z10);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(fp.c cVar, fp.c cVar2) {
            if (this.f61811b && lp.a.g(cVar, cVar2)) {
                return 0;
            }
            return Float.compare(cVar2.l(), cVar.l());
        }
    }

    boolean a(fp.c cVar);

    k b(long j10, long j11);

    boolean c(fp.c cVar);

    void clear();

    void d(b<? super fp.c, ?> bVar);

    k e(long j10, long j11);

    boolean f(fp.c cVar);

    fp.c first();

    void g(b<? super fp.c, ?> bVar);

    boolean isEmpty();

    fp.c last();

    int size();
}
