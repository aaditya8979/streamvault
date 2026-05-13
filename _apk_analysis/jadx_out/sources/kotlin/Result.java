package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Result<T> implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    @Nullable
    private final Object value;

    /* JADX INFO: compiled from: Result.kt */
    public static final class Failure implements Serializable {

        @NotNull
        public final Throwable exception;

        public Failure(@NotNull Throwable th2) {
            p.k(th2, "exception");
            this.exception = th2;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && p.f(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Result m7533boximpl(Object obj) {
        return new Result(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m7534constructorimpl(@Nullable Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7535equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && p.f(obj, ((Result) obj2).m7542unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7536equalsimpl0(Object obj, Object obj2) {
        return p.f(obj, obj2);
    }

    @Nullable
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m7537exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7538hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m7539isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m7540isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7541toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m7535equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7538hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m7541toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m7542unboximpl() {
        return this.value;
    }
}
