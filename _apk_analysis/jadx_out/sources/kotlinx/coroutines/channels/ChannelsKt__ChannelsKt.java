package kotlinx.coroutines.channels;

import bn.r;
import fo.p;
import kotlinx.coroutines.channels.a;
import org.jetbrains.annotations.NotNull;
import p000do.h;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object a(@NotNull p<? super E> pVar, E e10) {
        Object objI = pVar.i(e10);
        if (objI instanceof a.c) {
            return ((a) h.b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(pVar, e10, null), 1, null)).k();
        }
        return a.f73311b.c(r.f5635a);
    }
}
