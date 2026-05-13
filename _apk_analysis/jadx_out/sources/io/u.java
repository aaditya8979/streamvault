package io;

import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import p000do.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f71731a = true;

    public static final v a(Throwable th2, String str) throws Throwable {
        if (f71731a) {
            return new v(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ v b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(@NotNull y1 y1Var) {
        return y1Var.I() instanceof v;
    }

    @NotNull
    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    public static final y1 e(@NotNull s sVar, @NotNull List<? extends s> list) {
        try {
            return sVar.c(list);
        } catch (Throwable th2) {
            return a(th2, sVar.b());
        }
    }
}
