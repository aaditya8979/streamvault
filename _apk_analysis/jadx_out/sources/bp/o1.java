package bp;

import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainInitSdkCallback f5850a;

    public o1(MainInitSdkCallback mainInitSdkCallback) {
        this.f5850a = mainInitSdkCallback;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        AdLog.ad("3rdFsPartySdk init failed, code = " + i10 + ", msg = " + str);
        this.f5850a.onInitFailed(i10, str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        AdLog.ad("3rdFsPartySdk init success");
        this.f5850a.onInitSuccess();
    }
}
