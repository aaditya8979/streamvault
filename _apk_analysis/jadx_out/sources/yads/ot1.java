package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import yads.ot1;

/* JADX INFO: loaded from: classes3.dex */
public final class ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f93322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f93323b;

    public /* synthetic */ ot1() {
        this(new Executor() { // from class: bt.x7
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ot1.a(runnable);
            }
        }, Executors.newFixedThreadPool(2));
    }

    public ot1(Executor executor, Executor executor2) {
        this.f93322a = executor;
        this.f93323b = executor2;
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
