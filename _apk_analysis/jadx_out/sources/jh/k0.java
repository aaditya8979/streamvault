package jh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f72450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f72451b;

    public k0(u uVar, Context context) {
        this.f72451b = uVar;
        this.f72450a = context;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f72451b.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f72450a, this.f72451b.f71961j);
        this.f72451b.A();
    }
}
