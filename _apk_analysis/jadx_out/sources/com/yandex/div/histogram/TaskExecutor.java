package com.yandex.div.histogram;

import androidx.annotation.AnyThread;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: TaskExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TaskExecutor {
    @AnyThread
    void post(@NotNull a<r> aVar);
}
