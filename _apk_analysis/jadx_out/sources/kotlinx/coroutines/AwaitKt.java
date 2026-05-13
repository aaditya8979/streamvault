package kotlinx.coroutines;

import cn.w;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.p0;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AwaitKt {
    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends p0<? extends T>> collection, @NotNull hn.c<? super List<? extends T>> cVar) {
        return collection.isEmpty() ? w.m() : new p000do.d((p0[]) collection.toArray(new p0[0])).c(cVar);
    }

    @Nullable
    public static final <T> Object b(@NotNull p0<? extends T>[] p0VarArr, @NotNull hn.c<? super List<? extends T>> cVar) {
        return p0VarArr.length == 0 ? w.m() : new p000do.d(p0VarArr).c(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlinx.coroutines.g> r4, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.AwaitKt$joinAll$3
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt$joinAll$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.c.b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.c.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.g r5 = (kotlinx.coroutines.g) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.c(java.util.Collection, hn.c):java.lang.Object");
    }
}
