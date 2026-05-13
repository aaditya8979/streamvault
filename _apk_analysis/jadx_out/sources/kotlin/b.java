package kotlin;

import bn.g;
import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: compiled from: LazyJVM.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final <T> g<T> a(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode, @NotNull sn.a<? extends T> aVar) {
        p.k(lazyThreadSafetyMode, C3978d4.a.f31224t);
        p.k(aVar, "initializer");
        int i10 = a.$EnumSwitchMapping$0[lazyThreadSafetyMode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            i iVar = null;
            return new SynchronizedLazyImpl(aVar, iVar, i11, iVar);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <T> g<T> b(@NotNull sn.a<? extends T> aVar) {
        p.k(aVar, "initializer");
        i iVar = null;
        return new SynchronizedLazyImpl(aVar, iVar, 2, iVar);
    }
}
