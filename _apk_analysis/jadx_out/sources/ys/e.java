package ys;

/* JADX INFO: compiled from: VideoViewConfig.java */
/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f98105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f98106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f98107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zs.c f98108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f98109h;

    /* JADX INFO: compiled from: VideoViewConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f98110a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f98112c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f98114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f98115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zs.c f98116g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f98111b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f98113d = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f98117h = true;

        public static /* synthetic */ d e(b bVar) {
            bVar.getClass();
            return null;
        }

        public e j() {
            return new e(this);
        }

        public b k(c cVar) {
            this.f98114e = cVar;
            return this;
        }
    }

    public e(b bVar) {
        this.f98105d = bVar.f98110a;
        this.f98103b = bVar.f98112c;
        this.f98102a = bVar.f98111b;
        this.f98104c = bVar.f98113d;
        b.e(bVar);
        this.f98107f = bVar.f98115f;
        if (bVar.f98114e == null) {
            this.f98106e = ys.a.a();
        } else {
            this.f98106e = bVar.f98114e;
        }
        if (bVar.f98116g == null) {
            this.f98108g = zs.e.b();
        } else {
            this.f98108g = bVar.f98116g;
        }
        this.f98109h = bVar.f98117h;
    }

    public static b a() {
        return new b();
    }
}
