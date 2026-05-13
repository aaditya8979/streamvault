package dl;

import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import ql.g;
import tn.i;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends ql.b<d, HttpClientCall> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f59815h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final g f59816i = new g("Receive");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final g f59817j = new g("Parse");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final g f59818k = new g("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final g f59819l = new g("State");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final g f59820m = new g("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59821g;

    /* JADX INFO: compiled from: HttpResponsePipeline.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final g a() {
            return e.f59817j;
        }

        @NotNull
        public final g b() {
            return e.f59816i;
        }

        @NotNull
        public final g c() {
            return e.f59818k;
        }
    }

    public e(boolean z10) {
        super(f59816i, f59817j, f59818k, f59819l, f59820m);
        this.f59821g = z10;
    }

    public /* synthetic */ e(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ql.b
    public boolean g() {
        return this.f59821g;
    }
}
