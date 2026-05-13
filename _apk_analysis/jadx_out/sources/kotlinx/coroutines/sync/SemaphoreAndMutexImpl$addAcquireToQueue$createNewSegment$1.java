package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import mo.k;
import mo.l;
import sn.p;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements p<Long, l, l> {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ l mo2invoke(Long l10, l lVar) {
        return invoke(l10.longValue(), lVar);
    }

    public final l invoke(long j10, l lVar) {
        return k.j(j10, lVar);
    }
}
