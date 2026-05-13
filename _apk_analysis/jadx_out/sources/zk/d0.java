package zk;

import com.vungle.ads.internal.ui.AdActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final cl.d f98292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final dl.c f98293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Throwable f98294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98295d;

    public d0(@NotNull cl.d dVar, @Nullable dl.c cVar, @Nullable Throwable th2, int i10) {
        tn.p.k(dVar, AdActivity.REQUEST_KEY_EXTRA);
        this.f98292a = dVar;
        this.f98293b = cVar;
        this.f98294c = th2;
        this.f98295d = i10;
    }

    @NotNull
    public final cl.d a() {
        return this.f98292a;
    }

    public final int b() {
        return this.f98295d;
    }
}
