package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f73311b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f73312c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f73313a;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Channel.kt */
    public static final class C0861a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Throwable f73314a;

        public C0861a(@Nullable Throwable th2) {
            this.f73314a = th2;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C0861a) && p.f(this.f73314a, ((C0861a) obj).f73314a);
        }

        public int hashCode() {
            Throwable th2 = this.f73314a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.a.c
        @NotNull
        public String toString() {
            return "Closed(" + this.f73314a + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        @NotNull
        public final <E> Object a(@Nullable Throwable th2) {
            return a.c(new C0861a(th2));
        }

        @NotNull
        public final <E> Object b() {
            return a.c(a.f73312c);
        }

        @NotNull
        public final <E> Object c(E e10) {
            return a.c(e10);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static class c {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ a(Object obj) {
        this.f73313a = obj;
    }

    public static final /* synthetic */ a b(Object obj) {
        return new a(obj);
    }

    @NotNull
    public static <T> Object c(@Nullable Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof a) && p.f(obj, ((a) obj2).k());
    }

    @Nullable
    public static final Throwable e(Object obj) {
        C0861a c0861a = obj instanceof C0861a ? (C0861a) obj : null;
        if (c0861a != null) {
            return c0861a.f73314a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof C0861a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    public static String j(Object obj) {
        if (obj instanceof C0861a) {
            return ((C0861a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f73313a, obj);
    }

    public int hashCode() {
        return g(this.f73313a);
    }

    public final /* synthetic */ Object k() {
        return this.f73313a;
    }

    @NotNull
    public String toString() {
        return j(this.f73313a);
    }
}
