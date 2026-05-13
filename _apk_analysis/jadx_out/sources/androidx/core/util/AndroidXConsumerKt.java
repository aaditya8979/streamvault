package androidx.core.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidXConsumer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AndroidXConsumerKt {
    @NotNull
    public static final <T> Consumer<T> asAndroidXConsumer(@NotNull hn.c<? super T> cVar) {
        return new AndroidXContinuationConsumer(cVar);
    }
}
