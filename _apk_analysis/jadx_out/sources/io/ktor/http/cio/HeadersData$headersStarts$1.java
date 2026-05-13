package io.ktor.http.cio;

import ao.k;
import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import sn.p;

/* JADX INFO: compiled from: HttpHeadersMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "io.ktor.http.cio.HeadersData$headersStarts$1", f = "HttpHeadersMap.kt", l = {264}, m = "invokeSuspend")
public final class HeadersData$headersStarts$1 extends RestrictedSuspendLambda implements p<k<? super Integer>, c<? super r>, Object> {
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HeadersData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadersData$headersStarts$1(HeadersData headersData, c<? super HeadersData$headersStarts$1> cVar) {
        super(2, cVar);
        this.this$0 = headersData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        HeadersData$headersStarts$1 headersData$headersStarts$1 = new HeadersData$headersStarts$1(this.this$0, cVar);
        headersData$headersStarts$1.L$0 = obj;
        return headersData$headersStarts$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(k<? super Integer> kVar, c<? super r> cVar) {
        return ((HeadersData$headersStarts$1) create(kVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:12:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:21:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:20:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            if (r1 != r2) goto L23
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$2
            int[] r5 = (int[]) r5
            java.lang.Object r6 = r11.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.L$0
            ao.k r7 = (ao.k) r7
            kotlin.c.b(r12)
            r12 = r6
            r6 = r5
            r5 = r11
            goto L77
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2b:
            kotlin.c.b(r12)
            java.lang.Object r12 = r11.L$0
            ao.k r12 = (ao.k) r12
            io.ktor.http.cio.HeadersData r1 = r11.this$0
            java.util.List r1 = io.ktor.http.cio.HeadersData.a(r1)
            java.util.Iterator r1 = r1.iterator()
            r4 = r11
            r5 = r3
        L3e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r1.next()
            int[] r6 = (int[]) r6
            r7 = r5
            r5 = r4
            r4 = r1
            r1 = r3
        L4e:
            int r8 = r6.length
            if (r1 >= r8) goto L80
            io.ktor.http.cio.HeadersData r8 = r5.this$0
            int r9 = r7 + 0
            int r8 = r8.c(r9)
            r9 = -1
            if (r8 == r9) goto L7b
            java.lang.Integer r8 = jn.a.d(r7)
            r5.L$0 = r12
            r5.L$1 = r4
            r5.L$2 = r6
            r5.I$0 = r7
            r5.I$1 = r1
            r5.label = r2
            java.lang.Object r8 = r12.b(r8, r5)
            if (r8 != r0) goto L73
            return r0
        L73:
            r10 = r7
            r7 = r12
            r12 = r4
            r4 = r10
        L77:
            r10 = r4
            r4 = r12
            r12 = r7
            r7 = r10
        L7b:
            int r1 = r1 + 6
            int r7 = r7 + 6
            goto L4e
        L80:
            r1 = r4
            r4 = r5
            r5 = r7
            goto L3e
        L84:
            bn.r r12 = bn.r.f5635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HeadersData$headersStarts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
