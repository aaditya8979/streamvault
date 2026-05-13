package io.ktor.utils.io;

import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.l;

/* JADX INFO: compiled from: ByteChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class ByteChannel$readBuffer$1 extends FunctionReferenceImpl implements l<Throwable, ClosedReadChannelException> {
    public static final ByteChannel$readBuffer$1 INSTANCE = new ByteChannel$readBuffer$1();

    public ByteChannel$readBuffer$1() {
        super(1, ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // sn.l
    public final ClosedReadChannelException invoke(Throwable th2) {
        return new ClosedReadChannelException(th2);
    }
}
