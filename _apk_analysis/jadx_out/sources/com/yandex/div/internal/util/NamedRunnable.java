package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NamedRunnable implements Runnable {

    @NonNull
    private final String mThreadSuffix;

    public NamedRunnable(@NonNull String str) {
        this.mThreadSuffix = str;
    }

    @WorkerThread
    public abstract void execute();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + "-" + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
