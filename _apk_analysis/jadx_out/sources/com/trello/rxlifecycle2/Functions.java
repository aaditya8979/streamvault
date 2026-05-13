package com.trello.rxlifecycle2;

import cm.a;
import dm.o;
import dm.q;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class Functions {
    public static final o<Throwable, Boolean> RESUME_FUNCTION = new o<Throwable, Boolean>() { // from class: com.trello.rxlifecycle2.Functions.1
        @Override // dm.o
        public Boolean apply(Throwable th2) throws Exception {
            if (th2 instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            a.a(th2);
            return Boolean.FALSE;
        }
    };
    public static final q<Boolean> SHOULD_COMPLETE = new q<Boolean>() { // from class: com.trello.rxlifecycle2.Functions.2
        @Override // dm.q
        public boolean test(Boolean bool) throws Exception {
            return bool.booleanValue();
        }
    };
    public static final o<Object, xl.a> CANCEL_COMPLETABLE = new o<Object, xl.a>() { // from class: com.trello.rxlifecycle2.Functions.3
        @Override // dm.o
        public xl.a apply(Object obj) throws Exception {
            return xl.a.e(new CancellationException());
        }
    };

    private Functions() {
        throw new AssertionError("No instances!");
    }
}
