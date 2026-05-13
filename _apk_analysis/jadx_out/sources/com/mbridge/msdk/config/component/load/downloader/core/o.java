package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PriorityThreadFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36143a;

    /* JADX INFO: compiled from: PriorityThreadFactory.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f36144a;

        public a(Runnable runnable) {
            this.f36144a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f36143a);
            } catch (Throwable unused) {
            }
            try {
                this.f36144a.run();
            } catch (Exception unused2) {
            }
        }
    }

    public o(int i10) {
        this.f36143a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
