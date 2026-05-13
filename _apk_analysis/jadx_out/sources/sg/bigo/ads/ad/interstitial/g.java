package sg.bigo.ads.ad.interstitial;

import androidx.annotation.DrawableRes;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public enum g {
    BLACK(R.drawable.bigo_ad_ic_right_black, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half, R.drawable.bigo_ad_ic_star),
    WHITE(R.drawable.bigo_ad_ic_right_white, R.drawable.bigo_ad_ic_star_normal_white, R.drawable.bigo_ad_ic_star_half_white, R.drawable.bigo_ad_ic_star_white);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @DrawableRes
    public final int f80968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @DrawableRes
    public final int f80969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @DrawableRes
    public final int f80970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @DrawableRes
    public final int f80971f;

    g(int i10, int i11, int i12, int i13) {
        this.f80968c = i10;
        this.f80969d = i11;
        this.f80970e = i12;
        this.f80971f = i13;
    }
}
