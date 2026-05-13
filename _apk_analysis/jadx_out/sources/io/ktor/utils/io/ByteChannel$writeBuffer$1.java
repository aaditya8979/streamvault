package io.ktor.utils.io;

import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.l;

/* JADX INFO: compiled from: ByteChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class ByteChannel$writeBuffer$1 extends FunctionReferenceImpl implements l<Throwable, ClosedWriteChannelException> {
    public static final ByteChannel$writeBuffer$1 INSTANCE = new ByteChannel$writeBuffer$1();

    public ByteChannel$writeBuffer$1() {
        super(1, ClosedWriteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // sn.l
    public final ClosedWriteChannelException invoke(Throwable th2) {
        return new ClosedWriteChannelException(th2);
    }
}
