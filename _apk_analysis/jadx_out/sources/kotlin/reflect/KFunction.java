package kotlin.reflect;

import bn.e;

/* JADX INFO: compiled from: KFunction.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface KFunction<R> extends KCallable<R>, e<R> {

    /* JADX INFO: compiled from: KFunction.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void isExternal$annotations() {
        }

        public static /* synthetic */ void isInfix$annotations() {
        }

        public static /* synthetic */ void isInline$annotations() {
        }

        public static /* synthetic */ void isOperator$annotations() {
        }

        public static /* synthetic */ void isSuspend$annotations() {
        }
    }

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.KCallable
    boolean isSuspend();
}
