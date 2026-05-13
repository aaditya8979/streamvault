package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fw f89689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fw f89690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fw[] f89691d;

    static {
        fw fwVar = new fw(0, "TEXT");
        f89689b = fwVar;
        fw fwVar2 = new fw(1, "IMAGE");
        f89690c = fwVar2;
        fw[] fwVarArr = {fwVar, fwVar2};
        f89691d = fwVarArr;
        kotlin.enums.a.a(fwVarArr);
    }

    public fw(int i10, String str) {
    }

    public static fw valueOf(String str) {
        return (fw) Enum.valueOf(fw.class, str);
    }

    public static fw[] values() {
        return (fw[]) f89691d.clone();
    }
}
