package nd;

import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: WeakHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Handler.Callback f75849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f75850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lock f75851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f75852d;

    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Lock f75853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Runnable f75854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public a f75855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f75856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final RunnableC0898c f75857e;

        public a(@NotNull Lock lock, @Nullable Runnable runnable) {
            p.k(lock, "lock");
            this.f75853a = lock;
            this.f75854b = runnable;
            this.f75857e = new RunnableC0898c(new WeakReference(runnable), new WeakReference(this));
        }

        @NotNull
        public final RunnableC0898c a() {
            return this.f75857e;
        }

        public final void b(@NotNull a aVar) {
            p.k(aVar, "candidate");
            this.f75853a.lock();
            try {
                a aVar2 = this.f75855c;
                if (aVar2 != null) {
                    p.h(aVar2);
                    aVar2.f75856d = aVar;
                }
                aVar.f75855c = this.f75855c;
                this.f75855c = aVar;
                aVar.f75856d = this;
            } finally {
                this.f75853a.unlock();
            }
        }

        @NotNull
        public final RunnableC0898c c() {
            this.f75853a.lock();
            try {
                a aVar = this.f75856d;
                if (aVar != null) {
                    p.h(aVar);
                    aVar.f75855c = this.f75855c;
                }
                a aVar2 = this.f75855c;
                if (aVar2 != null) {
                    p.h(aVar2);
                    aVar2.f75856d = this.f75856d;
                }
                this.f75856d = null;
                this.f75855c = null;
                this.f75853a.unlock();
                return this.f75857e;
            } catch (Throwable th2) {
                this.f75853a.unlock();
                throw th2;
            }
        }

        @Nullable
        public final RunnableC0898c d(@NotNull Runnable runnable) {
            p.k(runnable, IconCompat.EXTRA_OBJ);
            this.f75853a.lock();
            try {
                for (a aVar = this.f75855c; aVar != null; aVar = aVar.f75855c) {
                    if (aVar.f75854b == runnable) {
                        return aVar.c();
                    }
                }
                this.f75853a.unlock();
                return null;
            } finally {
                this.f75853a.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final WeakReference<Handler.Callback> f75858a = null;

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            Handler.Callback callback;
            p.k(message, NotificationCompat.CATEGORY_MESSAGE);
            WeakReference<Handler.Callback> weakReference = this.f75858a;
            if (weakReference == null || (callback = weakReference.get()) == null) {
                return;
            }
            callback.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: nd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class RunnableC0898c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final WeakReference<Runnable> f75859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final WeakReference<a> f75860c;

        public RunnableC0898c(@NotNull WeakReference<Runnable> weakReference, @NotNull WeakReference<a> weakReference2) {
            p.k(weakReference, "mDelegate");
            p.k(weakReference2, "mReference");
            this.f75859b = weakReference;
            this.f75860c = weakReference2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f75859b.get();
            a aVar = this.f75860c.get();
            if (aVar != null) {
                aVar.c();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f75851c = reentrantLock;
        this.f75852d = new a(reentrantLock, null);
        this.f75849a = null;
        this.f75850b = new b();
    }

    public final boolean a(@Nullable Runnable runnable, long j10) {
        return this.f75850b.postDelayed(c(runnable), j10);
    }

    public final void b(@NotNull Runnable runnable) {
        p.k(runnable, "r");
        RunnableC0898c runnableC0898cD = this.f75852d.d(runnable);
        if (runnableC0898cD != null) {
            this.f75850b.removeCallbacks(runnableC0898cD);
        }
    }

    public final RunnableC0898c c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Runnable can't be null");
        }
        a aVar = new a(this.f75851c, runnable);
        this.f75852d.b(aVar);
        return aVar.a();
    }
}
