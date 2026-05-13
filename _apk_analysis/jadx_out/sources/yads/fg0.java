package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class fg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ fg0[] f89568b;

    static {
        fg0[] fg0VarArr = {new fg0(0, "AD", "ad"), new fg0(1, "PACK_SHOT", "pack_shot"), new fg0(2, "CLOSE_DIALOG", "close_dialog")};
        f89568b = fg0VarArr;
        kotlin.enums.a.a(fg0VarArr);
    }

    public fg0(int i10, String str, String str2) {
    }

    public static fg0 valueOf(String str) {
        return (fg0) Enum.valueOf(fg0.class, str);
    }

    public static fg0[] values() {
        return (fg0[]) f89568b.clone();
    }
}
