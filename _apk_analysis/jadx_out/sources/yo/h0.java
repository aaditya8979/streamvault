package yo;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r f97944a;

    public h0(@NotNull InputStream inputStream) {
        tn.p.k(inputStream, "stream");
        this.f97944a = new r(inputStream, bo.c.f5639b);
    }

    @Override // yo.f0
    public int a(@NotNull char[] cArr, int i10, int i11) {
        tn.p.k(cArr, "buffer");
        return this.f97944a.d(cArr, i10, i11);
    }

    public final void b() {
        this.f97944a.e();
    }
}
