package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f80086h;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull Context context) {
        super(bVar, context);
        sg.bigo.ads.api.c.b.a(0);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_medium;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int b() {
        return e.a(this.f80066c, 8);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void b(int i10) {
        if (this.f80086h != null) {
            this.f80086h.setBackground(new BitmapDrawable(this.f80066c.getResources(), g()));
        }
        super.b(i10);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int[] c() {
        return new int[]{e.a(this.f80066c, -57), e.a(this.f80066c, 153)};
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void d() {
        this.f80065b = new FrameLayout(this.f80066c);
        int iA = e.a(this.f80066c, 276);
        int iA2 = e.a(this.f80066c, 174);
        MediaView mediaView = new MediaView(this.f80066c);
        this.f80067d = mediaView;
        mediaView.setImageBlurBorder(false);
        this.f80067d.setLayoutParams(new ViewGroup.LayoutParams(iA, iA2));
        View viewA = sg.bigo.ads.common.utils.a.a(this.f80066c, R.layout.bigo_ad_banner_placeholder_img, null, false);
        this.f80086h = viewA;
        if (viewA != null) {
            u.a(viewA, this.f80067d, null, -1);
            View view = this.f80086h;
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_background_text), this.f80064a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_image_title), this.f80064a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_image_description), this.f80064a.getDescription(), "");
            TextView textView = (TextView) view.findViewById(R.id.bigo_ad_banner_image_domain);
            String advertiser = this.f80064a.getAdvertiser();
            if (textView != null) {
                if (TextUtils.isEmpty(advertiser)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(advertiser);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int i() {
        return 300;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int j() {
        return 250;
    }
}
