package d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f59489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxNativeAdView f59490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59492d;

    public d(Activity activity, int i10, int i11, int i12, int i13) {
        this.f59489a = activity;
        int layoutID = IDUtil.getLayoutID(activity, "main_layout_native_applovin_view");
        LayoutInflater.from(activity).inflate(layoutID, (ViewGroup) null);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(layoutID).setTitleTextViewId(IDUtil.getViewID(activity, "title_text_view")).setBodyTextViewId(IDUtil.getViewID(activity, "body_text_view")).setAdvertiserTextViewId(IDUtil.getViewID(activity, "advertiser_text_view")).setIconImageViewId(IDUtil.getViewID(activity, "icon_image_view")).setMediaContentViewGroupId(IDUtil.getViewID(activity, "media_view_container")).setOptionsContentViewGroupId(IDUtil.getViewID(activity, "options_view")).setCallToActionButtonId(IDUtil.getViewID(activity, "cta_button")).build(), activity);
        this.f59490b = maxNativeAdView;
        this.f59491c = i12;
        this.f59492d = i13;
        if (i12 == 0) {
            this.f59491c = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f59492d = (i12 * i11) / i10;
        } else {
            this.f59491c = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f59491c == 0 && this.f59492d == 0) {
            this.f59491c = screenWidth;
            this.f59492d = (i11 * screenWidth) / i10;
        }
        if (this.f59491c >= screenWidth) {
            this.f59491c = screenWidth;
            this.f59492d = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f59492d >= screenHeight) {
            this.f59492d = screenHeight;
            this.f59491c = (i10 * screenHeight) / i11;
        }
        AdLog.d("ApplovinNativeView", "expressWidth " + this.f59491c);
        AdLog.d("ApplovinNativeView", "expressHeight " + this.f59492d);
        LinearLayout linearLayout = (LinearLayout) maxNativeAdView.findViewById(IDUtil.getViewID(activity, "main_applovin_native_content_ly"));
        if (linearLayout == null) {
            AdLog.e("ApplovinNativeView", "ApplovinNativeView contentLayout == null");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = this.f59491c;
        layoutParams.height = this.f59492d;
        maxNativeAdView.setLayoutParams(layoutParams);
    }
}
