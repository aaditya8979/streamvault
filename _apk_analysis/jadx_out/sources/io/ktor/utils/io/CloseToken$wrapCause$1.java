package io.ktor.utils.io;

import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.l;

/* JADX INFO: compiled from: CloseToken.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class CloseToken$wrapCause$1 extends FunctionReferenceImpl implements l<Throwable, ClosedByteChannelException> {
    public static final CloseToken$wrapCause$1 INSTANCE = new CloseToken$wrapCause$1();

    public CloseToken$wrapCause$1() {
        super(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // sn.l
    public final ClosedByteChannelException invoke(Throwable th2) {
        return new ClosedByteChannelException(th2);
    }
}
