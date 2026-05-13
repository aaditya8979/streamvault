package io.ktor.client.utils;

import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sl.s;
import sn.p;
import wk.a;

/* JADX INFO: compiled from: ByteChannelUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {22, 24, 26, 31}, m = "invokeSuspend")
public final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements p<s, c<? super r>, Object> {
    public final /* synthetic */ Long $contentLength;
    public final /* synthetic */ a $listener;
    public final /* synthetic */ io.ktor.utils.io.a $this_observable;
    public int I$0;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelUtilsKt$observable$1(io.ktor.utils.io.a aVar, a aVar2, Long l10, c<? super ByteChannelUtilsKt$observable$1> cVar) {
        super(2, cVar);
        this.$this_observable = aVar;
        this.$listener = aVar2;
        this.$contentLength = l10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$this_observable, this.$listener, this.$contentLength, cVar);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(s sVar, c<? super r> cVar) {
        return ((ByteChannelUtilsKt$observable$1) create(sVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x007f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:22:0x007f */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0080: MOVE (r3 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:22:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:60:0x01aa, B:31:0x00d3, B:33:0x00d9, B:37:0x0118, B:39:0x0120, B:53:0x017a, B:57:0x018f), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:60:0x01aa, B:31:0x00d3, B:33:0x00d9, B:37:0x0118, B:39:0x0120, B:53:0x017a, B:57:0x018f), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010f -> B:37:0x0118). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.ByteChannelUtilsKt$observable$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
