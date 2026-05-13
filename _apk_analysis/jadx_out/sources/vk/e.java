package vk;

import com.vungle.ads.internal.ui.AdActivity;
import gl.w;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends HttpClientCall {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final byte[] f86101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f86102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull HttpClient httpClient, @NotNull cl.b bVar, @NotNull dl.c cVar, @NotNull byte[] bArr) {
        super(httpClient);
        p.k(httpClient, "client");
        p.k(bVar, AdActivity.REQUEST_KEY_EXTRA);
        p.k(cVar, "response");
        p.k(bArr, "responseBody");
        this.f86101i = bArr;
        j(new f(this, bVar));
        k(new g(this, bArr, cVar));
        h.a(w.b(cVar), bArr.length, bVar.getMethod());
        this.f86102j = true;
    }

    @Override // io.ktor.client.call.HttpClientCall
    public boolean b() {
        return this.f86102j;
    }

    @Override // io.ktor.client.call.HttpClientCall
    @Nullable
    public Object f(@NotNull hn.c<? super io.ktor.utils.io.a> cVar) {
        return sl.a.c(this.f86101i, 0, 0, 6, null);
    }
}
