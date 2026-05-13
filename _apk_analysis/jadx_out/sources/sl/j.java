package sl;

import io.ktor.utils.io.CloseHookByteWriteChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CloseHookByteWriteChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    @NotNull
    public static final f a(@NotNull f fVar, @NotNull sn.l<? super hn.c<? super bn.r>, ? extends Object> lVar) {
        tn.p.k(fVar, "<this>");
        tn.p.k(lVar, "onClose");
        return new CloseHookByteWriteChannel(fVar, lVar);
    }
}
