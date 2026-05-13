package d;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.adview.AdmobNativeSmallView;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f59482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdmobNativeSmallView f59483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdmobNativeMediaView f59484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59487f;

    public b(Activity activity, NativeAd nativeAd) {
        this.f59487f = false;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_native_admob"), (ViewGroup) null);
        this.f59482a = viewInflate;
        AdmobNativeMediaView admobNativeMediaView = (AdmobNativeMediaView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_admob_native_content_adv"));
        this.f59484c = admobNativeMediaView;
        AdmobNativeSmallView admobNativeSmallView = (AdmobNativeSmallView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_admob_native_sm_content_adv"));
        this.f59483b = admobNativeSmallView;
        this.f59487f = true;
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        f fVar = new f();
        fVar.f59494a = colorDrawable;
        AdLog.i("AdmobNativeView isShowMediaView true");
        admobNativeMediaView.setVisibility(0);
        admobNativeSmallView.setVisibility(8);
        admobNativeMediaView.setStyles(fVar);
        admobNativeMediaView.setNativeAd(nativeAd);
    }

    public final void a(Activity activity, int i10, int i11, int i12, int i13) {
        this.f59485d = i12;
        this.f59486e = i13;
        View view = this.f59487f ? this.f59484c : this.f59483b;
        if (i12 == 0) {
            this.f59485d = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f59486e = (i12 * i11) / i10;
        } else {
            this.f59485d = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f59485d == 0 && this.f59486e == 0) {
            this.f59485d = screenWidth;
            this.f59486e = (i11 * screenWidth) / i10;
        }
        if (this.f59485d >= screenWidth) {
            this.f59485d = screenWidth;
            this.f59486e = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f59486e >= screenHeight) {
            this.f59486e = screenHeight;
            this.f59485d = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + this.f59485d);
        AdLog.d("expressHeight " + this.f59486e);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f59485d;
        layoutParams.height = this.f59486e;
        this.f59482a.setLayoutParams(layoutParams);
    }
}
