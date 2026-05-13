package mo;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface a {

    /* JADX INFO: renamed from: mo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mutex.kt */
    public static final class C0887a {
        public static /* synthetic */ Object a(a aVar, Object obj, hn.c cVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj, cVar);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.d(obj);
        }
    }

    boolean a(@Nullable Object obj);

    @Nullable
    Object c(@Nullable Object obj, @NotNull hn.c<? super r> cVar);

    void d(@Nullable Object obj);
}
