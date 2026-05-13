package d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;
import java.util.Arrays;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f59476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f59479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f59480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaView f59481f;

    public a(Activity activity, NativeAd nativeAd) {
        this.f59476a = activity;
        View viewInflate = activity.getLayoutInflater().inflate(IDUtil.getLayoutID(activity, "main_layout_native_bigo"), (ViewGroup) null);
        this.f59479d = viewInflate;
        this.f59480e = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_bigo_native_im_close"));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "native_ad_view"));
        MediaView mediaView = (MediaView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_media_view"));
        this.f59481f = mediaView;
        ImageView imageView = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_icon_view"));
        AdOptionsView adOptionsView = (AdOptionsView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_option_view"));
        TextView textView = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_title"));
        textView.setTag(2);
        textView.setText(nativeAd.getTitle());
        TextView textView2 = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_description"));
        textView2.setTag(6);
        textView2.setText(nativeAd.getDescription());
        Button button = (Button) viewInflate.findViewById(IDUtil.getViewID(activity, "native_cta"));
        button.setTag(7);
        button.setText(nativeAd.getCallToAction());
        TextView textView3 = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_warning"));
        textView3.setTag(8);
        textView3.setText(nativeAd.getWarning());
        if (nativeAd.getCreativeType() == NativeAd.CreativeType.VIDEO) {
            VideoController videoController = nativeAd.getVideoController();
            if (videoController == null) {
                return;
            } else {
                videoController.mute(true);
            }
        }
        nativeAd.registerViewForInteraction(linearLayout, mediaView, imageView, adOptionsView, Arrays.asList(textView, textView2, button));
    }

    public final void a(Activity activity, int i10, int i11, int i12, int i13) {
        this.f59477b = i12;
        this.f59478c = i13;
        if (i12 == 0) {
            this.f59477b = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f59478c = (i12 * i11) / i10;
        } else {
            this.f59477b = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f59477b == 0 && this.f59478c == 0) {
            this.f59477b = screenWidth;
            this.f59478c = (i11 * screenWidth) / i10;
        }
        if (this.f59477b >= screenWidth) {
            this.f59477b = screenWidth;
            this.f59478c = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f59478c >= screenHeight) {
            this.f59478c = screenHeight;
            this.f59477b = (i10 * screenHeight) / i11;
        }
        AdLog.d("BigoNativeView", "expressWidth " + this.f59477b);
        AdLog.d("BigoNativeView", "expressHeight " + this.f59478c);
        RelativeLayout relativeLayout = (RelativeLayout) this.f59479d.findViewById(IDUtil.getViewID(this.f59476a, "main_bigo_native_root_rl"));
        if (relativeLayout == null) {
            AdLog.e("BigoNativeView", "BigoNativeView contentLayout == null");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.width = this.f59477b;
        layoutParams.height = this.f59478c;
        this.f59479d.setLayoutParams(layoutParams);
    }
}
