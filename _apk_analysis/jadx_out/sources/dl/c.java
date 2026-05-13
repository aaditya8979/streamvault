package dl;

import gl.a0;
import gl.u;
import gl.z;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseKt;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements u, l0 {
    @NotNull
    public abstract HttpClientCall L();

    @NotNull
    public abstract io.ktor.utils.io.a a();

    @NotNull
    public abstract nl.c b();

    @NotNull
    public abstract nl.c c();

    @NotNull
    public abstract a0 d();

    @NotNull
    public abstract z e();

    @NotNull
    public String toString() {
        return "HttpResponse[" + HttpResponseKt.d(this).getUrl() + ", " + d() + ']';
    }
}
