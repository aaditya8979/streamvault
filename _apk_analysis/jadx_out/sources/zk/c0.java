package zk;

import com.vungle.ads.internal.ui.AdActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final cl.d f98287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final dl.c f98289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Throwable f98290d;

    public c0(@NotNull cl.d dVar, int i10, @Nullable dl.c cVar, @Nullable Throwable th2) {
        tn.p.k(dVar, AdActivity.REQUEST_KEY_EXTRA);
        this.f98287a = dVar;
        this.f98288b = i10;
        this.f98289c = cVar;
        this.f98290d = th2;
    }

    @Nullable
    public final Throwable a() {
        return this.f98290d;
    }

    @NotNull
    public final cl.d b() {
        return this.f98287a;
    }

    @Nullable
    public final dl.c c() {
        return this.f98289c;
    }

    public final int d() {
        return this.f98288b;
    }
}
