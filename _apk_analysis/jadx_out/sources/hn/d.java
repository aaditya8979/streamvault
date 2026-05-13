package hn;

import bn.r;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    @NotNull
    public static final <R, T> c<r> a(@NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @NotNull c<? super T> cVar) {
        tn.p.k(pVar, "<this>");
        tn.p.k(cVar, "completion");
        return new f(IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(pVar, r10, cVar)), in.a.g());
    }

    public static final <R, T> void b(@NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @NotNull c<? super T> cVar) {
        tn.p.k(pVar, "<this>");
        tn.p.k(cVar, "completion");
        c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(pVar, r10, cVar));
        Result.a aVar = Result.Companion;
        cVarD.resumeWith(Result.m7534constructorimpl(r.f5635a));
    }
}
