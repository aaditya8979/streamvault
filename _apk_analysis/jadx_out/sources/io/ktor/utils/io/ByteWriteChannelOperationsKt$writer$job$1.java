package io.ktor.utils.io;

import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sl.s;
import sn.p;

/* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", l = {179, 189, 190, 189, 190, 189, 190}, m = "invokeSuspend")
public final class ByteWriteChannelOperationsKt$writer$job$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ p<s, c<? super r>, Object> $block;
    public final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ByteWriteChannelOperationsKt$writer$job$1(p<? super s, ? super c<? super r>, ? extends Object> pVar, ByteChannel byteChannel, c<? super ByteWriteChannelOperationsKt$writer$job$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
        this.$channel = byteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new ByteWriteChannelOperationsKt$writer$job$1(this.$block, this.$channel, cVar);
        byteWriteChannelOperationsKt$writer$job$1.L$0 = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(l0 l0Var, c<? super r> cVar) {
        return ((ByteWriteChannelOperationsKt$writer$job$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:21:0x0052, B:27:0x0089, B:29:0x009a, B:24:0x006a), top: B:69:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.g] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [do.w, kotlinx.coroutines.g] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
