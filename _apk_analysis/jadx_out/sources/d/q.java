package d;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageLoader;
import com.yk.e.util.ScreenUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f59509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f59510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f59511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f59512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f59513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f59514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f59515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f59516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f59517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f59518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f59519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59521m;

    public q(Activity activity) {
        this.f59509a = activity;
    }

    public final void a(Activity activity) {
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_native_pgl"), (ViewGroup) null);
        this.f59511c = viewInflate;
        this.f59518j = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_content_ly"));
        this.f59512d = (TextView) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_tv_ad_title"));
        this.f59513e = (TextView) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_tv_ad_desc"));
        this.f59514f = (ImageView) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_im_icon"));
        this.f59515g = (ImageView) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_plg_native_im_dislike"));
        this.f59516h = (Button) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_btn_creative"));
        this.f59517i = (RelativeLayout) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_rl_ad_logo"));
        this.f59519k = (FrameLayout) this.f59511c.findViewById(IDUtil.getViewID(this.f59509a, "main_pgl_native_fl_video"));
        this.f59515g.setVisibility(4);
    }

    public final void b(PAGNativeAd pAGNativeAd, int i10, int i11, int i12, int i13) {
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        this.f59512d.setText(nativeAdData.getTitle());
        this.f59513e.setText(nativeAdData.getDescription());
        PAGImageItem icon = nativeAdData.getIcon();
        if (icon != null && icon.getImageUrl() != null) {
            new ImageLoader().loadImg(this.f59509a, icon.getImageUrl(), new p(this));
        }
        this.f59516h.setText(TextUtils.isEmpty(nativeAdData.getButtonText()) ? "Download" : nativeAdData.getButtonText());
        ImageView imageView = (ImageView) nativeAdData.getAdLogoView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f59517i.removeAllViews();
        this.f59517i.addView(imageView, layoutParams);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f59513e);
        arrayList.add(this.f59519k);
        arrayList.add(this.f59516h);
        pAGNativeAd.registerViewForInteraction((ViewGroup) this.f59511c, (List<View>) arrayList, (List<View>) arrayList, this.f59515g, new l(this));
        PAGMediaView mediaView = nativeAdData.getMediaView();
        if (mediaView != null) {
            mediaView.setVideoAdListener(new g(this));
            if (mediaView.getParent() == null) {
                this.f59519k.removeAllViews();
                this.f59519k.addView(mediaView);
            }
        }
        this.f59520l = i12;
        this.f59521m = i13;
        if (i12 == 0) {
            this.f59520l = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f59521m = (i12 * i11) / i10;
        } else {
            this.f59520l = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(this.f59509a);
        if (this.f59520l == 0 && this.f59521m == 0) {
            this.f59520l = screenWidth;
            this.f59521m = (i11 * screenWidth) / i10;
        }
        if (this.f59520l >= screenWidth) {
            this.f59520l = screenWidth;
            this.f59521m = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(this.f59509a);
        if (this.f59521m >= screenHeight) {
            this.f59521m = screenHeight;
            this.f59520l = (i10 * screenHeight) / i11;
        }
        AdLog.i("okt_pangle", "native, " + ("expressWidth " + this.f59520l));
        AdLog.i("okt_pangle", "native, " + ("expressHeight " + this.f59521m));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f59518j.getLayoutParams();
        layoutParams2.width = this.f59520l;
        layoutParams2.height = this.f59521m;
        this.f59511c.setLayoutParams(layoutParams2);
        this.f59510b.onAdLoaded(this.f59511c);
    }
}
