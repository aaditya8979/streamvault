package kotlin;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f73203a;

    static {
        Result.a aVar = Result.Companion;
        f73203a = Result.m7534constructorimpl(in.a.g());
    }

    public static final <T, R> R b(@NotNull bn.a<T, R> aVar, T t10) {
        p.k(aVar, "<this>");
        return (R) new bn.c(aVar.a(), t10).c();
    }
}
