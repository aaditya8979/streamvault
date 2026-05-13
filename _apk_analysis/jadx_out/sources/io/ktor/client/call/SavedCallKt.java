package io.ktor.client.call;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SavedCallKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.client.call.HttpClientCall r4, @org.jetbrains.annotations.NotNull hn.c<? super io.ktor.client.call.HttpClientCall> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.client.call.SavedCallKt$save$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.call.SavedCallKt$save$1 r0 = (io.ktor.client.call.SavedCallKt$save$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.SavedCallKt$save$1 r0 = new io.ktor.client.call.SavedCallKt$save$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            io.ktor.client.call.HttpClientCall r4 = (io.ktor.client.call.HttpClientCall) r4
            kotlin.c.b(r5)
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.c.b(r5)
            dl.c r5 = r4.e()
            io.ktor.utils.io.a r5 = r5.a()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = io.ktor.utils.io.ByteReadChannelOperationsKt.l(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            no.r r5 = (no.r) r5
            byte[] r5 = no.s.c(r5)
            vk.e r0 = new vk.e
            io.ktor.client.HttpClient r1 = r4.c()
            cl.b r2 = r4.d()
            dl.c r4 = r4.e()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.SavedCallKt.a(io.ktor.client.call.HttpClientCall, hn.c):java.lang.Object");
    }
}
