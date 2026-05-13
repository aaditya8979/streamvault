package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f87608a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sp0 f87609b;

    public static final void a(sp0 sp0Var) {
        f87609b = sp0Var;
        for (me2 me2Var : f87608a) {
            if (f87609b != null) {
                sp0 sp0Var2 = f87609b;
                if (sp0Var2 != null) {
                    ((zn0) sp0Var2.f94897a).a(me2Var);
                }
            } else {
                f87608a.add(me2Var);
            }
        }
    }
}
