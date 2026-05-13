package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i21 f90636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i21[] f90637d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90638b;

    static {
        i21 i21Var = new i21(0, "ICON_VERTICAL_POSITION_TOP", "top");
        i21 i21Var2 = new i21(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
        i21 i21Var3 = new i21(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
        f90636c = i21Var3;
        i21[] i21VarArr = {i21Var, i21Var2, i21Var3};
        f90637d = i21VarArr;
        kotlin.enums.a.a(i21VarArr);
    }

    public i21(int i10, String str, String str2) {
        this.f90638b = str2;
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) f90637d.clone();
    }
}
