package hn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f<T> implements c<T>, jn.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f63550c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<f<?>, Object> f63551d = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c<T> f63552b;

    @Nullable
    private volatile Object result;

    /* JADX INFO: compiled from: SafeContinuationJvm.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull c<? super T> cVar) {
        this(cVar, CoroutineSingletons.UNDECIDED);
        p.k(cVar, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull c<? super T> cVar, @Nullable Object obj) {
        p.k(cVar, "delegate");
        this.f63552b = cVar;
        this.result = obj;
    }

    @Nullable
    public final Object b() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (androidx.concurrent.futures.a.a(f63551d, this, coroutineSingletons, in.a.g())) {
                return in.a.g();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return in.a.g();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        c<T> cVar = this.f63552b;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return this.f63552b.getContext();
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (androidx.concurrent.futures.a.a(f63551d, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != in.a.g()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f63551d, this, in.a.g(), CoroutineSingletons.RESUMED)) {
                    this.f63552b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.f63552b;
    }
}
