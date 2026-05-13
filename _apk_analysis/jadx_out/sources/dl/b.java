package dl;

import bn.r;
import org.jetbrains.annotations.NotNull;
import ql.g;
import tn.i;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ql.b<c, r> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f59808h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final g f59809i = new g("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final g f59810j = new g("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final g f59811k = new g("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59812g;

    /* JADX INFO: compiled from: HttpResponsePipeline.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final g a() {
            return b.f59811k;
        }

        @NotNull
        public final g b() {
            return b.f59809i;
        }
    }

    public b(boolean z10) {
        super(f59809i, f59810j, f59811k);
        this.f59812g = z10;
    }

    public /* synthetic */ b(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ql.b
    public boolean g() {
        return this.f59812g;
    }
}
