package cl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestPipeline.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends ql.b<Object, d> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f6705h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ql.g f6706i = new ql.g("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ql.g f6707j = new ql.g("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ql.g f6708k = new ql.g("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ql.g f6709l = new ql.g("Render");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final ql.g f6710m = new ql.g("Send");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6711g;

    /* JADX INFO: compiled from: HttpRequestPipeline.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ql.g a() {
            return g.f6706i;
        }

        @NotNull
        public final ql.g b() {
            return g.f6709l;
        }

        @NotNull
        public final ql.g c() {
            return g.f6710m;
        }

        @NotNull
        public final ql.g d() {
            return g.f6707j;
        }
    }

    public g(boolean z10) {
        super(f6706i, f6707j, f6708k, f6709l, f6710m);
        this.f6711g = z10;
    }

    public /* synthetic */ g(boolean z10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ql.b
    public boolean g() {
        return this.f6711g;
    }
}
