package kotlinx.coroutines.selects;

import kn.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TrySelectDetailedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TrySelectDetailedResult[] f73460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73461c;
    public static final TrySelectDetailedResult SUCCESSFUL = new TrySelectDetailedResult("SUCCESSFUL", 0);
    public static final TrySelectDetailedResult REREGISTER = new TrySelectDetailedResult("REREGISTER", 1);
    public static final TrySelectDetailedResult CANCELLED = new TrySelectDetailedResult("CANCELLED", 2);
    public static final TrySelectDetailedResult ALREADY_SELECTED = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    static {
        TrySelectDetailedResult[] trySelectDetailedResultArrD = d();
        f73460b = trySelectDetailedResultArrD;
        f73461c = kotlin.enums.a.a(trySelectDetailedResultArrD);
    }

    public TrySelectDetailedResult(String str, int i10) {
    }

    public static final /* synthetic */ TrySelectDetailedResult[] d() {
        return new TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    @NotNull
    public static a<TrySelectDetailedResult> getEntries() {
        return f73461c;
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f73460b.clone();
    }
}
