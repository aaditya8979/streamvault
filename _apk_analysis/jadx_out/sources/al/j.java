package al;

import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ClientHook.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a<T> f3997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f3998b;

    public j(@NotNull a<T> aVar, T t10) {
        p.k(aVar, "hook");
        this.f3997a = aVar;
        this.f3998b = t10;
    }

    public final void a(@NotNull HttpClient httpClient) {
        p.k(httpClient, "client");
        this.f3997a.a(httpClient, this.f3998b);
    }
}
