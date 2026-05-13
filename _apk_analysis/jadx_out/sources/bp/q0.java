package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.inf.IComCallback;
import com.yk.e.net.NetRequest;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f5858b;

    public q0(Context context, o0 o0Var) {
        this.f5857a = context;
        this.f5858b = o0Var;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (TextUtils.isEmpty(str) || NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            IComCallback iComCallback = this.f5858b;
            if (iComCallback != null) {
                iComCallback.onFailed(-1, "send collectLog failed, net error");
                return;
            }
            return;
        }
        b1 b1VarA = b1.a(this.f5857a);
        Context context = this.f5857a;
        String str2 = Constant.commonApi;
        AdLog.d(b1VarA.f5734d, "setNewHost " + str2);
        LocalSaveUtil.put(context, b1VarA.f5736f, str2);
        IComCallback iComCallback2 = this.f5858b;
        if (iComCallback2 != null) {
            iComCallback2.onSuccess();
        }
    }
}
