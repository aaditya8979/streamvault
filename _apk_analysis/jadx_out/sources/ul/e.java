package ul;

import java.io.EOFException;
import no.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ByteReadPacket.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f85726a = new no.a();

    public static final long a(@NotNull r rVar, long j10) throws EOFException {
        p.k(rVar, "<this>");
        rVar.request(j10);
        long jMin = Math.min(j10, b(rVar));
        rVar.getBuffer().skip(jMin);
        return jMin;
    }

    public static final long b(@NotNull r rVar) {
        p.k(rVar, "<this>");
        return rVar.getBuffer().n();
    }

    public static final void c(@NotNull r rVar, @NotNull l<? super no.a, Boolean> lVar) {
        p.k(rVar, "<this>");
        p.k(lVar, "block");
        while (!rVar.exhausted() && lVar.invoke(rVar.getBuffer()).booleanValue()) {
        }
    }
}
