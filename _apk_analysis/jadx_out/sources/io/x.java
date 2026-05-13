package io;

import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static final <E> void a(@NotNull sn.l<? super E, bn.r> lVar, E e10, @NotNull kotlin.coroutines.d dVar) {
        UndeliveredElementException undeliveredElementExceptionB = b(lVar, e10, null);
        if (undeliveredElementExceptionB != null) {
            p000do.j0.a(dVar, undeliveredElementExceptionB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> UndeliveredElementException b(@NotNull sn.l<? super E, bn.r> lVar, E e10, @Nullable UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th2);
            }
            bn.d.a(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException c(sn.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(lVar, obj, undeliveredElementException);
    }
}
