package mm;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: ObservableBlockingSubscribe.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static <T> void a(xl.p<? extends T> pVar) {
        qm.d dVar = new qm.d();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.g(), dVar, dVar, Functions.g());
        pVar.subscribe(lambdaObserver);
        qm.c.a(dVar, lambdaObserver);
        Throwable th2 = dVar.f78357b;
        if (th2 != null) {
            throw ExceptionHelper.d(th2);
        }
    }

    public static <T> void b(xl.p<? extends T> pVar, dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar) {
        fm.a.e(gVar, "onNext is null");
        fm.a.e(gVar2, "onError is null");
        fm.a.e(aVar, "onComplete is null");
        c(pVar, new LambdaObserver(gVar, gVar2, aVar, Functions.g()));
    }

    public static <T> void c(xl.p<? extends T> pVar, xl.r<? super T> rVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        rVar.onSubscribe(blockingObserver);
        pVar.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    blockingObserver.dispose();
                    rVar.onError(e10);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || pVar == BlockingObserver.TERMINATED || NotificationLite.acceptFull(objPoll, rVar)) {
                return;
            }
        }
    }
}
