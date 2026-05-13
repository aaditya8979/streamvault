package io.ktor.util.cio;

import bn.r;
import hn.c;
import in.a;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import on.b;
import sn.p;

/* JADX INFO: compiled from: FileChannels.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", l = {106}, m = "invokeSuspend")
public final class FileChannelsKt$writeChannel$1 extends SuspendLambda implements p<sl.p, c<? super r>, Object> {
    public final /* synthetic */ File $this_writeChannel;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$writeChannel$1(File file, c<? super FileChannelsKt$writeChannel$1> cVar) {
        super(2, cVar);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new FileChannelsKt$writeChannel$1(this.$this_writeChannel, cVar);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(sl.p pVar, c<? super r> cVar) {
        return ((FileChannelsKt$writeChannel$1) create(pVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        RandomAccessFile randomAccessFile;
        Object objG = a.g();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                kotlin.c.b(obj);
                sl.p pVar = (sl.p) this.L$0;
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.$this_writeChannel, "rw");
                io.ktor.utils.io.a aVarA = pVar.a();
                FileChannel channel = randomAccessFile2.getChannel();
                tn.p.j(channel, "getChannel(...)");
                this.L$0 = randomAccessFile2;
                this.L$1 = randomAccessFile2;
                this.label = 1;
                obj = ByteReadChannelOperations_jvmKt.c(aVarA, channel, 0L, this, 2, null);
                if (obj == objG) {
                    return objG;
                }
                randomAccessFile = randomAccessFile2;
                r12 = randomAccessFile2;
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RandomAccessFile randomAccessFile3 = (RandomAccessFile) this.L$1;
                Closeable closeable = (Closeable) this.L$0;
                kotlin.c.b(obj);
                randomAccessFile = randomAccessFile3;
                r12 = closeable;
            }
            randomAccessFile.setLength(((Number) obj).longValue());
            r rVar = r.f5635a;
            b.a(r12, null);
            return r.f5635a;
        } finally {
        }
    }
}
