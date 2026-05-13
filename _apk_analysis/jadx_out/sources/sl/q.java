package sl;

import io.ktor.utils.io.CloseToken;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SourceByteReadChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements io.ktor.utils.io.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final no.r f84419b;

    @Nullable
    private volatile CloseToken closed;

    public q(@NotNull no.r rVar) {
        tn.p.k(rVar, "source");
        this.f84419b = rVar;
    }

    @Override // io.ktor.utils.io.a, sl.f
    public void a(@Nullable Throwable th2) {
        String message;
        if (this.closed != null) {
            return;
        }
        this.f84419b.close();
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new CloseToken(new IOException(message, th2));
    }

    @Override // io.ktor.utils.io.a, sl.f
    @Nullable
    public Throwable b() {
        CloseToken closeToken = this.closed;
        if (closeToken != null) {
            return CloseToken.c(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.a
    @NotNull
    public no.r f() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.f84419b.getBuffer();
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.a
    @Nullable
    public Object g(int i10, @NotNull hn.c<? super Boolean> cVar) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return jn.a.a(this.f84419b.request(i10));
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.a
    public boolean h() {
        return this.f84419b.exhausted();
    }
}
