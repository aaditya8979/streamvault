package kl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i0;
import p000do.j2;

/* JADX INFO: compiled from: CoroutinesUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class a extends kotlin.coroutines.a implements i0 {
        public a(i0.b bVar) {
            super(bVar);
        }

        @Override // p000do.i0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        }
    }

    @NotNull
    public static final kotlin.coroutines.d a(@Nullable kotlinx.coroutines.g gVar) {
        return j2.a(gVar).plus(new a(i0.D8));
    }

    public static /* synthetic */ kotlin.coroutines.d b(kotlinx.coroutines.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return a(gVar);
    }
}
