package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class bd2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f87962w = (int) TimeUnit.SECONDS.toMillis(10);

    public bd2(Context context, String str, oo ooVar) {
        super(context, str, ooVar);
        a(context);
        l();
        m();
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        return new vp2(e82Var, v11.a(e82Var));
    }

    public final void a(Context context) {
        Integer num;
        Integer num2;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        int iIntValue = (nt2VarA == null || (num2 = nt2VarA.f92977u0) == null) ? f87962w : num2.intValue();
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f93682o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.K) == null) ? 0 : num.intValue());
    }
}
