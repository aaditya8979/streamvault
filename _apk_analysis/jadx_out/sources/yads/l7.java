package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7 f91897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l7[] f91898d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91899b;

    static {
        l7 l7Var = new l7(0, "AUTOMATIC", "automatic");
        l7 l7Var2 = new l7(1, "MANUAL", "manual");
        f91897c = l7Var2;
        l7[] l7VarArr = {l7Var, l7Var2};
        f91898d = l7VarArr;
        kotlin.enums.a.a(l7VarArr);
    }

    public l7(int i10, String str, String str2) {
        this.f91899b = str2;
    }

    public static l7 valueOf(String str) {
        return (l7) Enum.valueOf(l7.class, str);
    }

    public static l7[] values() {
        return (l7[]) f91898d.clone();
    }
}
