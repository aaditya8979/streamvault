package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.net.NetRequest;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f5902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.d f5903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f5904c;

    public z0(a1 a1Var, s0 s0Var, i.d dVar) {
        this.f5904c = a1Var;
        this.f5902a = s0Var;
        this.f5903b = dVar;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (TextUtils.isEmpty(str) || NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
                b1.a(this.f5904c.f5726h).c(new z(this));
                return;
            }
            return;
        }
        b1 b1VarA = b1.a(this.f5904c.f5726h);
        Context context = this.f5904c.f5726h;
        String str2 = Constant.commonApi;
        AdLog.d(b1VarA.f5734d, "setNewHost " + str2);
        LocalSaveUtil.put(context, b1VarA.f5736f, str2);
        s0 s0Var = this.f5902a;
        if (s0Var != null) {
            s0Var.a(str);
        }
    }
}
