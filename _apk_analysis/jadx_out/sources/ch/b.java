package ch;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Optional.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f6566b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f6567c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final T f6568a;

    /* JADX INFO: compiled from: Optional.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final <T> b<T> a() {
            return b.f6567c;
        }

        @NotNull
        public final <T> b<T> b(@NotNull T t10) {
            p.k(t10, "value");
            return new b<>(t10, null);
        }
    }

    public b(T t10) {
        this.f6568a = t10;
    }

    public /* synthetic */ b(Object obj, i iVar) {
        this(obj);
    }

    @NotNull
    public final T b() {
        T t10 = this.f6568a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f6568a != null;
    }

    @Nullable
    public final T d() {
        return this.f6568a;
    }
}
