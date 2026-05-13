package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f21 f89456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f21[] f89457d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89458b;

    static {
        f21 f21Var = new f21(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
        f21 f21Var2 = new f21(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
        f21 f21Var3 = new f21(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
        f89456c = f21Var3;
        f21[] f21VarArr = {f21Var, f21Var2, f21Var3};
        f89457d = f21VarArr;
        kotlin.enums.a.a(f21VarArr);
    }

    public f21(int i10, String str, String str2) {
        this.f89458b = str2;
    }

    public static f21 valueOf(String str) {
        return (f21) Enum.valueOf(f21.class, str);
    }

    public static f21[] values() {
        return (f21[]) f89457d.clone();
    }
}
