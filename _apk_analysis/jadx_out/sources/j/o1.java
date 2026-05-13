package j;

import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.subad.MainFloatViewLoader;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements bp.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainFloatViewLoader f71984a;

    public o1(MainFloatViewLoader mainFloatViewLoader) {
        this.f71984a = mainFloatViewLoader;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f71984a.startLoadData(objArr);
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        MainFloatViewLoader mainFloatViewLoader = this.f71984a;
        MainFloatViewCallback mainFloatViewCallback = mainFloatViewLoader.f3390;
        mainFloatViewLoader.iIlLiL = false;
        AdLog.subAd(mainFloatViewLoader.curAdType + " sdk获取数据失败");
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdFail(i10, str);
        }
    }
}
