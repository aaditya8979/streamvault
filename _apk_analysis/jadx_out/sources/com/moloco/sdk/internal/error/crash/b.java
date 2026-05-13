package com.moloco.sdk.internal.error.crash;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.error.crash.b;
import java.lang.Thread;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class b implements com.moloco.sdk.internal.error.crash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f46022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Thread.UncaughtExceptionHandler f46023b;

    @jn.d(c = "com.moloco.sdk.internal.error.crash.CrashDetectorServiceImpl$register$2", f = "CrashDetectorService.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46024a;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        public static final void a(b bVar, Thread thread, Throwable th2) {
            d dVar = bVar.f46022a;
            tn.p.h(th2);
            dVar.a(th2);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = bVar.f46023b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (b.this.f46023b == null) {
                b.this.f46023b = Thread.getDefaultUncaughtExceptionHandler();
                final b bVar = b.this;
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.c
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th2) {
                        b.a.a(bVar, thread, th2);
                    }
                });
            }
            return r.f5635a;
        }
    }

    public b(@NotNull d dVar) {
        tn.p.k(dVar, "crashHandler");
        this.f46022a = dVar;
    }

    @Override // com.moloco.sdk.internal.error.crash.a
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        Object objG = g.g(com.moloco.sdk.internal.scheduling.c.a().getMain(), new a(null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }
}
