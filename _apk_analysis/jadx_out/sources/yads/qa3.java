package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qa3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qa3 f93964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qa3 f93965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qa3[] f93966d;

    static {
        qa3 qa3Var = new qa3(0, "AD");
        f93964b = qa3Var;
        qa3 qa3Var2 = new qa3(1, "PASSBACK");
        f93965c = qa3Var2;
        qa3[] qa3VarArr = {qa3Var, qa3Var2};
        f93966d = qa3VarArr;
        kotlin.enums.a.a(qa3VarArr);
    }

    public qa3(int i10, String str) {
    }

    public static qa3 valueOf(String str) {
        return (qa3) Enum.valueOf(qa3.class, str);
    }

    public static qa3[] values() {
        return (qa3[]) f93966d.clone();
    }
}
