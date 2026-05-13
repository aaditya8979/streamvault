package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BufferOverflow.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BufferOverflow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BufferOverflow[] f73272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f73273c;
    public static final BufferOverflow SUSPEND = new BufferOverflow("SUSPEND", 0);
    public static final BufferOverflow DROP_OLDEST = new BufferOverflow("DROP_OLDEST", 1);
    public static final BufferOverflow DROP_LATEST = new BufferOverflow("DROP_LATEST", 2);

    static {
        BufferOverflow[] bufferOverflowArrD = d();
        f73272b = bufferOverflowArrD;
        f73273c = kotlin.enums.a.a(bufferOverflowArrD);
    }

    public BufferOverflow(String str, int i10) {
    }

    public static final /* synthetic */ BufferOverflow[] d() {
        return new BufferOverflow[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    @NotNull
    public static kn.a<BufferOverflow> getEntries() {
        return f73273c;
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f73272b.clone();
    }
}
