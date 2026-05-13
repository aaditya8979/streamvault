package yads;

import android.content.Context;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s9 f95104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f95105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t9 f95106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t9 f95107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t9 f95108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t9[] f95109g;

    static {
        t9 t9Var = new t9(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f95106d = t9Var;
        t9 t9Var2 = new t9(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f95107e = t9Var2;
        t9 t9Var3 = new t9(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f95108f = t9Var3;
        t9[] t9VarArr = {t9Var, t9Var2, t9Var3};
        f95109g = t9VarArr;
        kotlin.enums.a.a(t9VarArr);
        f95104b = new s9();
        f95105c = kotlin.collections.a.o(bn.h.a(s9.a("values_dimen_%s", t9Var.name()), 48), bn.h.a(s9.a("values_dimen_%s_sw600dp", t9Var.name()), 56), bn.h.a(s9.a("values_dimen_%s", t9Var2.name()), 15), bn.h.a(s9.a("values_dimen_%s_sw600dp", t9Var2.name()), 17), bn.h.a(s9.a("values_dimen_%s", t9Var3.name()), 19), bn.h.a(s9.a("values_dimen_%s_sw600dp", t9Var3.name()), 23));
    }

    public t9(int i10, String str) {
    }

    public static t9 valueOf(String str) {
        return (t9) Enum.valueOf(t9.class, str);
    }

    public static t9[] values() {
        return (t9[]) f95109g.clone();
    }

    public final int a(Context context) {
        try {
            s9 s9Var = f95104b;
            StringBuilder sb2 = new StringBuilder(name());
            if (zn.n.j(kl3.d(context), kl3.b(context)) >= 600) {
                sb2.append("_sw600dp");
            }
            String string = sb2.toString();
            s9Var.getClass();
            Integer num = (Integer) f95105c.get(s9.a("values_dimen_%s", string));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            s9 s9Var2 = f95104b;
            String strName = name();
            s9Var2.getClass();
            Integer num2 = (Integer) f95105c.get(s9.a("values_dimen_%s", strName));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
