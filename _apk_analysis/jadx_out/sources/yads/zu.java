package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class zu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zu f97767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zu f97768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zu[] f97769e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97770b;

    static {
        zu zuVar = new zu(0, "INTERNAL_BROWSER", "internal_browser");
        f97767c = zuVar;
        zu zuVar2 = new zu(1, "BROWSER", "browser");
        f97768d = zuVar2;
        zu[] zuVarArr = {zuVar, zuVar2, new zu(2, "UNKNOWN", "unknown")};
        f97769e = zuVarArr;
        kotlin.enums.a.a(zuVarArr);
    }

    public zu(int i10, String str, String str2) {
        this.f97770b = str2;
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) f97769e.clone();
    }
}
