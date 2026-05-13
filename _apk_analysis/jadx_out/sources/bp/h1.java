package bp;

import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.object.AdSdkStateCode;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f5777a;

    public h1(c1 c1Var) {
        this.f5777a = c1Var;
    }

    @Override // bp.i1
    public final void a() {
        d dVar = this.f5777a.f5741a;
        MainInitSdkCallback mainInitSdkCallback = dVar.f5745d;
        if (mainInitSdkCallback == null || dVar.f5744c) {
            return;
        }
        mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "请求初始化接口失败, msg = 网络错误");
    }

    @Override // bp.i1
    public final void b() {
        d dVar = this.f5777a.f5741a;
        a1.g(dVar.f5746e, dVar.f5743b, dVar.f5742a, dVar.f5745d);
    }
}
