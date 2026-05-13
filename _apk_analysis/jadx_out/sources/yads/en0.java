package yads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class en0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f89318a;

    public en0(Handler handler) {
        this.f89318a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f89318a.post(runnable);
    }
}
