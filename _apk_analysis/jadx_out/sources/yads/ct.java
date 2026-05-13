package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ct f88597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ct f88598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ct[] f88599d;

    static {
        ct ctVar = new ct(0, "ACTIVE");
        f88597b = ctVar;
        ct ctVar2 = new ct(1, "CANCELED");
        f88598c = ctVar2;
        ct[] ctVarArr = {ctVar, ctVar2};
        f88599d = ctVarArr;
        kotlin.enums.a.a(ctVarArr);
    }

    public ct(int i10, String str) {
    }

    public static ct valueOf(String str) {
        return (ct) Enum.valueOf(ct.class, str);
    }

    public static ct[] values() {
        return (ct[]) f88599d.clone();
    }
}
