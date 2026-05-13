package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class jg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f91221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg1 f91222b;

    public /* synthetic */ jg0() {
        this(new lg0(), new yg1());
    }

    public jg0(lg0 lg0Var, yg1 yg1Var) {
        this.f91221a = lg0Var;
        this.f91222b = yg1Var;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        String lowerCase = this.f91221a.a(context).name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
