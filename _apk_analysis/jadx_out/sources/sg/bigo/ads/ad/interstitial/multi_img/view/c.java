package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f81204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f81205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f81206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f81207d;

    public c(Context context, boolean z10) {
        LinearLayout linearLayout = (LinearLayout) sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_more, null, false);
        this.f81204a = linearLayout;
        this.f81205b = (TextView) linearLayout.findViewById(R.id.bigo_ad_more_txt);
        this.f81206c = (ImageView) linearLayout.findViewById(R.id.bigo_ad_more_img);
        this.f81207d = z10;
        int iA = e.a(context, 20);
        if (z10) {
            linearLayout.setPadding(iA, 0, 0, 0);
        } else {
            linearLayout.setPadding(0, 0, iA, 0);
        }
        a(true);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f81205b.setTextColor(-1);
            this.f81206c.setImageResource(this.f81207d ? R.drawable.bigo_ad_ic_right_round_white : R.drawable.bigo_ad_ic_left_round_white);
        } else {
            this.f81205b.setTextColor(-14275021);
            this.f81206c.setImageResource(this.f81207d ? R.drawable.bigo_ad_ic_right_round_black : R.drawable.bigo_ad_ic_left_round_black);
        }
    }
}
