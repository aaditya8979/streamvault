package com.yandex.div.internal;

import bn.r;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KLog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class KLog {

    @NotNull
    public static final KLog INSTANCE = new KLog();

    @NotNull
    private static final List<LogListener> listeners = new ArrayList();

    private KLog() {
    }

    public final boolean isAtLeast(@NotNull Severity severity) {
        return Log.isAtLeast(severity);
    }

    public final void print(int i10, @NotNull String str, @NotNull String str2) {
        android.util.Log.println(i10, str, str2);
        List<LogListener> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((LogListener) it.next()).onNewMessage(i10, str, str2);
            }
            r rVar = r.f5635a;
        }
    }
}
