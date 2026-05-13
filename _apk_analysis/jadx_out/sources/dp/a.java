package dp;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59914b;

    public a(e eVar, Activity activity) {
        this.f59914b = eVar;
        this.f59913a = activity;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        this.f59914b.a("load img failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f59913a, this.f59914b.f71961j);
        this.f59914b.A();
    }
}
