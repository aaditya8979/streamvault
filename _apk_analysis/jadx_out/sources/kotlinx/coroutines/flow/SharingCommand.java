package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SharingCommand {
    public static final SharingCommand START = new SharingCommand("START", 0);
    public static final SharingCommand STOP = new SharingCommand("STOP", 1);
    public static final SharingCommand STOP_AND_RESET_REPLAY_CACHE = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SharingCommand[] f73385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f73386c;

    static {
        SharingCommand[] sharingCommandArrD = d();
        f73385b = sharingCommandArrD;
        f73386c = kotlin.enums.a.a(sharingCommandArrD);
    }

    public SharingCommand(String str, int i10) {
    }

    public static final /* synthetic */ SharingCommand[] d() {
        return new SharingCommand[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    @NotNull
    public static kn.a<SharingCommand> getEntries() {
        return f73386c;
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f73385b.clone();
    }
}
