package kotlin.coroutines.intrinsics;

import kn.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineSingletons {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CoroutineSingletons[] f73230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73231c;
    public static final CoroutineSingletons COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final CoroutineSingletons UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
    public static final CoroutineSingletons RESUMED = new CoroutineSingletons("RESUMED", 2);

    static {
        CoroutineSingletons[] coroutineSingletonsArrD = d();
        f73230b = coroutineSingletonsArrD;
        f73231c = kotlin.enums.a.a(coroutineSingletonsArrD);
    }

    public CoroutineSingletons(String str, int i10) {
    }

    public static final /* synthetic */ CoroutineSingletons[] d() {
        return new CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    @NotNull
    public static a<CoroutineSingletons> getEntries() {
        return f73231c;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f73230b.clone();
    }
}
