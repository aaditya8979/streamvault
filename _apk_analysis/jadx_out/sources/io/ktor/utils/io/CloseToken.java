package io.ktor.utils.io;

import bn.r;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b0;
import p000do.h1;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CloseToken.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CloseToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Throwable f71261a;

    public CloseToken(@Nullable Throwable th2) {
        this.f71261a = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Throwable c(CloseToken closeToken, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = CloseToken$wrapCause$1.INSTANCE;
        }
        return closeToken.b(lVar);
    }

    @Nullable
    public final r a(@NotNull l<? super Throwable, ? extends Throwable> lVar) throws Throwable {
        p.k(lVar, "wrap");
        Throwable thB = b(lVar);
        if (thB == null) {
            return null;
        }
        throw thB;
    }

    @Nullable
    public final Throwable b(@NotNull l<? super Throwable, ? extends Throwable> lVar) {
        p.k(lVar, "wrap");
        Object obj = this.f71261a;
        if (obj == null) {
            return null;
        }
        return obj instanceof b0 ? ((b0) obj).createCopy() : obj instanceof CancellationException ? h1.a(((CancellationException) obj).getMessage(), this.f71261a) : lVar.invoke(obj);
    }
}
