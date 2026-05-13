package kotlin;

import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class LazyThreadSafetyMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LazyThreadSafetyMode[] f73200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f73201c;
    public static final LazyThreadSafetyMode SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
    public static final LazyThreadSafetyMode PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
    public static final LazyThreadSafetyMode NONE = new LazyThreadSafetyMode(Constraint.NONE, 2);

    static {
        LazyThreadSafetyMode[] lazyThreadSafetyModeArrD = d();
        f73200b = lazyThreadSafetyModeArrD;
        f73201c = kotlin.enums.a.a(lazyThreadSafetyModeArrD);
    }

    public LazyThreadSafetyMode(String str, int i10) {
    }

    public static final /* synthetic */ LazyThreadSafetyMode[] d() {
        return new LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    @NotNull
    public static kn.a<LazyThreadSafetyMode> getEntries() {
        return f73201c;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f73200b.clone();
    }
}
