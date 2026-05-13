package vk;

import gl.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static final void a(@Nullable Long l10, long j10, @NotNull x xVar) {
        p.k(xVar, "method");
        if (l10 == null || l10.longValue() < 0 || p.f(xVar, x.f62623b.c())) {
            return;
        }
        if (l10.longValue() == j10) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l10 + " bytes, but received " + j10 + " bytes").toString());
    }
}
