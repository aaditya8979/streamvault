package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CoroutineStart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CoroutineStart[] f73247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f73248c;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    /* JADX INFO: compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CoroutineStart[] coroutineStartArrD = d();
        f73247b = coroutineStartArrD;
        f73248c = kotlin.enums.a.a(coroutineStartArrD);
    }

    public CoroutineStart(String str, int i10) {
    }

    public static final /* synthetic */ CoroutineStart[] d() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    @NotNull
    public static kn.a<CoroutineStart> getEntries() {
        return f73248c;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f73247b.clone();
    }

    public final <R, T> void invoke(@NotNull p<? super R, ? super hn.c<? super T>, ? extends Object> pVar, R r10, @NotNull hn.c<? super T> cVar) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            jo.a.d(pVar, r10, cVar);
            return;
        }
        if (i10 == 2) {
            hn.d.b(pVar, r10, cVar);
        } else if (i10 == 3) {
            jo.b.c(pVar, r10, cVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
