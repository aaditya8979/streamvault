package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: TaskExecutor.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DefaultTaskExecutor implements TaskExecutor {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(@NotNull final a<r> aVar) {
        if (p.f(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: qg.b
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
    }
}
