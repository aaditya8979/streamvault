package y;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import d0.h;
import d0.i;
import j0.f;
import j0.j;
import j0.m;
import k0.Size;
import kotlin.Metadata;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.c;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 *2\u00020\u0001:\u0002\u0005&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0017J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J*\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u001dH\u0017J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001fH\u0017J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001fH\u0017J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0017J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0017J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020'H\u0017J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020)H\u0017¨\u0006+"}, d2 = {"Ly/c;", "Lj0/f$b;", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lbn/r;", "b", InneractiveMediationDefs.GENDER_MALE, "Lk0/g;", "size", "e", "", "input", "r", "output", CampaignEx.JSON_KEY_AD_K, "q", "", "n", "Ld0/i;", "fetcher", "Lj0/j;", "options", "l", "Ld0/h;", "result", "o", "La0/e;", "decoder", "j", "La0/c;", "g", "Landroid/graphics/Bitmap;", "p", "h", "Ln0/c;", "transition", InneractiveMediationDefs.GENDER_FEMALE, "i", "d", "Lj0/d;", "c", "Lj0/m;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f87207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f87206b = new a();

    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y/c$a", "Ly/c;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements c {
        @Override // y.c, j0.f.b
        @MainThread
        public void a(@NotNull j0.f fVar, @NotNull m mVar) {
            C1105c.l(this, fVar, mVar);
        }

        @Override // y.c, j0.f.b
        @MainThread
        public void b(@NotNull j0.f fVar) {
            C1105c.k(this, fVar);
        }

        @Override // y.c, j0.f.b
        @MainThread
        public void c(@NotNull j0.f fVar, @NotNull j0.d dVar) {
            C1105c.j(this, fVar, dVar);
        }

        @Override // y.c, j0.f.b
        @MainThread
        public void d(@NotNull j0.f fVar) {
            C1105c.i(this, fVar);
        }

        @Override // y.c
        @MainThread
        public void e(@NotNull j0.f fVar, @NotNull Size size) {
            C1105c.m(this, fVar, size);
        }

        @Override // y.c
        @MainThread
        public void f(@NotNull j0.f fVar, @NotNull n0.c cVar) {
            C1105c.r(this, fVar, cVar);
        }

        @Override // y.c
        @WorkerThread
        public void g(@NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar, @Nullable a0.c cVar) {
            C1105c.a(this, fVar, eVar, jVar, cVar);
        }

        @Override // y.c
        @WorkerThread
        public void h(@NotNull j0.f fVar, @NotNull Bitmap bitmap) {
            C1105c.o(this, fVar, bitmap);
        }

        @Override // y.c
        @MainThread
        public void i(@NotNull j0.f fVar, @NotNull n0.c cVar) {
            C1105c.q(this, fVar, cVar);
        }

        @Override // y.c
        @WorkerThread
        public void j(@NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar) {
            C1105c.b(this, fVar, eVar, jVar);
        }

        @Override // y.c
        @MainThread
        public void k(@NotNull j0.f fVar, @NotNull Object obj) {
            C1105c.g(this, fVar, obj);
        }

        @Override // y.c
        @WorkerThread
        public void l(@NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar) {
            C1105c.d(this, fVar, iVar, jVar);
        }

        @Override // y.c
        @MainThread
        public void m(@NotNull j0.f fVar) {
            C1105c.n(this, fVar);
        }

        @Override // y.c
        @MainThread
        public void n(@NotNull j0.f fVar, @Nullable String str) {
            C1105c.e(this, fVar, str);
        }

        @Override // y.c
        @WorkerThread
        public void o(@NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar, @Nullable h hVar) {
            C1105c.c(this, fVar, iVar, jVar, hVar);
        }

        @Override // y.c
        @WorkerThread
        public void p(@NotNull j0.f fVar, @NotNull Bitmap bitmap) {
            C1105c.p(this, fVar, bitmap);
        }

        @Override // y.c
        @MainThread
        public void q(@NotNull j0.f fVar, @NotNull Object obj) {
            C1105c.f(this, fVar, obj);
        }

        @Override // y.c
        @MainThread
        public void r(@NotNull j0.f fVar, @NotNull Object obj) {
            C1105c.h(this, fVar, obj);
        }
    }

    /* JADX INFO: renamed from: y.c$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Ly/c$b;", "", "Ly/c;", Constraint.NONE, "Ly/c;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f87207a = new Companion();
    }

    /* JADX INFO: renamed from: y.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C1105c {
        @WorkerThread
        public static void a(@NotNull c cVar, @NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar, @Nullable a0.c cVar2) {
        }

        @WorkerThread
        public static void b(@NotNull c cVar, @NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar) {
        }

        @WorkerThread
        public static void c(@NotNull c cVar, @NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar, @Nullable h hVar) {
        }

        @WorkerThread
        public static void d(@NotNull c cVar, @NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar) {
        }

        @MainThread
        public static void e(@NotNull c cVar, @NotNull j0.f fVar, @Nullable String str) {
        }

        @MainThread
        public static void f(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Object obj) {
        }

        @MainThread
        public static void g(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Object obj) {
        }

        @MainThread
        public static void h(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Object obj) {
        }

        @MainThread
        public static void i(@NotNull c cVar, @NotNull j0.f fVar) {
        }

        @MainThread
        public static void j(@NotNull c cVar, @NotNull j0.f fVar, @NotNull j0.d dVar) {
        }

        @MainThread
        public static void k(@NotNull c cVar, @NotNull j0.f fVar) {
        }

        @MainThread
        public static void l(@NotNull c cVar, @NotNull j0.f fVar, @NotNull m mVar) {
        }

        @MainThread
        public static void m(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Size size) {
        }

        @MainThread
        public static void n(@NotNull c cVar, @NotNull j0.f fVar) {
        }

        @WorkerThread
        public static void o(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Bitmap bitmap) {
        }

        @WorkerThread
        public static void p(@NotNull c cVar, @NotNull j0.f fVar, @NotNull Bitmap bitmap) {
        }

        @MainThread
        public static void q(@NotNull c cVar, @NotNull j0.f fVar, @NotNull n0.c cVar2) {
        }

        @MainThread
        public static void r(@NotNull c cVar, @NotNull j0.f fVar, @NotNull n0.c cVar2) {
        }
    }

    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ly/c$d;", "", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Ly/c;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f87210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f87209b = new d() { // from class: y.d
            @Override // y.c.d
            public final c a(j0.f fVar) {
                return c.d.b.a(fVar);
            }
        };

        /* JADX INFO: renamed from: y.c$d$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: EventListener.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Ly/c$d$a;", "", "Ly/c$d;", Constraint.NONE, "Ly/c$d;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f87210a = new Companion();
        }

        /* JADX INFO: compiled from: EventListener.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class b {
            public static c a(j0.f fVar) {
                return c.f87206b;
            }
        }

        @NotNull
        c a(@NotNull j0.f request);
    }

    @Override // j0.f.b
    @MainThread
    void a(@NotNull j0.f fVar, @NotNull m mVar);

    @Override // j0.f.b
    @MainThread
    void b(@NotNull j0.f fVar);

    @Override // j0.f.b
    @MainThread
    void c(@NotNull j0.f fVar, @NotNull j0.d dVar);

    @Override // j0.f.b
    @MainThread
    void d(@NotNull j0.f fVar);

    @MainThread
    void e(@NotNull j0.f fVar, @NotNull Size size);

    @MainThread
    void f(@NotNull j0.f fVar, @NotNull n0.c cVar);

    @WorkerThread
    void g(@NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar, @Nullable a0.c cVar);

    @WorkerThread
    void h(@NotNull j0.f fVar, @NotNull Bitmap bitmap);

    @MainThread
    void i(@NotNull j0.f fVar, @NotNull n0.c cVar);

    @WorkerThread
    void j(@NotNull j0.f fVar, @NotNull a0.e eVar, @NotNull j jVar);

    @MainThread
    void k(@NotNull j0.f fVar, @NotNull Object obj);

    @WorkerThread
    void l(@NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar);

    @MainThread
    void m(@NotNull j0.f fVar);

    @MainThread
    void n(@NotNull j0.f fVar, @Nullable String str);

    @WorkerThread
    void o(@NotNull j0.f fVar, @NotNull i iVar, @NotNull j jVar, @Nullable h hVar);

    @WorkerThread
    void p(@NotNull j0.f fVar, @NotNull Bitmap bitmap);

    @MainThread
    void q(@NotNull j0.f fVar, @NotNull Object obj);

    @MainThread
    void r(@NotNull j0.f fVar, @NotNull Object obj);
}
