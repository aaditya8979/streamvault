package fo;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface o<E> {
    void cancel(@Nullable CancellationException cancellationException);

    @NotNull
    f<E> iterator();

    @Nullable
    Object j(@NotNull hn.c<? super E> cVar);

    @Nullable
    Object q(@NotNull hn.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar);

    @NotNull
    Object r();
}
