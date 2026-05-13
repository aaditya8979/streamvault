package kotlinx.coroutines.flow;

import bn.r;
import fo.o;
import go.b;
import go.d;
import go.e;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    @NotNull
    public static final <T> d<T> b(@NotNull o<? extends T> oVar) {
        return new b(oVar, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull e<? super T> eVar, @NotNull o<? extends T> oVar, @NotNull c<? super r> cVar) {
        Object objD = d(eVar, oVar, true, cVar);
        return objD == in.a.g() ? objD : r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007e, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(go.e<? super T> r7, fo.o<? extends T> r8, boolean r9, hn.c<? super bn.r> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            fo.f r7 = (fo.f) r7
            java.lang.Object r8 = r0.L$1
            fo.o r8 = (fo.o) r8
            java.lang.Object r2 = r0.L$0
            go.e r2 = (go.e) r2
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L9b
        L39:
            r10 = r7
            r7 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            fo.f r7 = (fo.f) r7
            java.lang.Object r8 = r0.L$1
            fo.o r8 = (fo.o) r8
            java.lang.Object r2 = r0.L$0
            go.e r2 = (go.e) r2
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            kotlin.c.b(r10)
            go.f.t(r7)
            fo.f r10 = r8.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9b
            r0.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L75:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L93
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L9b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L9b
            r0.label = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L9b
            if (r10 != r1) goto L39
            return r1
        L93:
            if (r9 == 0) goto L98
            fo.i.a(r8, r5)
        L98:
            bn.r r7 = bn.r.f5635a
            return r7
        L9b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r9 == 0) goto La3
            fo.i.a(r8, r7)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.d(go.e, fo.o, boolean, hn.c):java.lang.Object");
    }

    @NotNull
    public static final <T> d<T> e(@NotNull o<? extends T> oVar) {
        return new b(oVar, false, null, 0, null, 28, null);
    }
}
