package yads;

import java.lang.Thread;
import java.util.Set;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class ga3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f89895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f89896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nt2 f89897c;

    public ga3(at1 at1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, nt2 nt2Var) {
        this.f89895a = at1Var;
        this.f89896b = uncaughtExceptionHandler;
        this.f89897c = nt2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            Set setF = this.f89897c.f92963n0;
            if (setF == null) {
                setF = cn.w0.f();
            }
            Set set = h33.f90233a;
            if (h33.a(th2.getStackTrace(), setF)) {
                this.f89895a.reportUnhandledException(th2);
            }
            if (this.f89897c.f92961m0 || (uncaughtExceptionHandler = this.f89896b) == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                Result.a aVar = Result.Companion;
                this.f89895a.reportError("Failed to report uncaught exception", th3);
                Result.m7534constructorimpl(bn.r.f5635a);
            } finally {
                try {
                    if (this.f89897c.f92961m0 || (uncaughtExceptionHandler = this.f89896b) == null) {
                        return;
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } catch (Throwable th4) {
                }
            }
            if (this.f89897c.f92961m0) {
                return;
            } else {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }
}
