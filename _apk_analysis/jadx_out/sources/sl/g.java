package sl;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteWriteChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    @Nullable
    public static final Object a(@NotNull f fVar, @NotNull hn.c<? super bn.r> cVar) {
        Object objD;
        ByteReadChannelOperationsKt.u(fVar);
        ByteChannel byteChannel = fVar instanceof ByteChannel ? (ByteChannel) fVar : null;
        return (((byteChannel != null && byteChannel.n()) || ul.c.b(fVar.e()) >= 1048576) && (objD = fVar.d(cVar)) == in.a.g()) ? objD : bn.r.f5635a;
    }
}
