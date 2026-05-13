package zk;

import com.vungle.ads.internal.ui.AdActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final cl.d f98283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final dl.c f98284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Throwable f98285c;

    public b0(@NotNull cl.d dVar, @Nullable dl.c cVar, @Nullable Throwable th2) {
        tn.p.k(dVar, AdActivity.REQUEST_KEY_EXTRA);
        this.f98283a = dVar;
        this.f98284b = cVar;
        this.f98285c = th2;
    }

    @Nullable
    public final dl.c a() {
        return this.f98284b;
    }
}
