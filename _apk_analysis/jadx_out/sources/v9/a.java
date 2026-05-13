package v9;

import androidx.annotation.RestrictTo;
import dm.q;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CallableC1078a f85929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Callable<Boolean> f85930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<Object> f85931c;

    /* JADX INFO: renamed from: v9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Functions.java */
    public static final class CallableC1078a implements Callable<Boolean>, q<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f85932b;

        public CallableC1078a(Boolean bool) {
            this.f85932b = bool;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            return this.f85932b;
        }

        @Override // dm.q
        public boolean test(Object obj) throws Exception {
            return this.f85932b.booleanValue();
        }
    }

    static {
        CallableC1078a callableC1078a = new CallableC1078a(Boolean.TRUE);
        f85929a = callableC1078a;
        f85930b = callableC1078a;
        f85931c = callableC1078a;
    }
}
