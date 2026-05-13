package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f5304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5305c;

    public a(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f5305c = mainInterstitialActivity;
        this.f5304b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f5305c;
        if (mainInterstitialActivity.ILil.adAreaType == 1) {
            Activity activity = this.f5304b;
            String str = mainInterstitialActivity.iIi1;
            String str2 = mainInterstitialActivity.f3326lIlii;
            AdLog.i("addAdAreaCountData");
            String str3 = Constant.fileAdAreaTypeCount;
            HashMap<String, List<String>> map = Constant.adAreaNumMap;
            bp.g.b(activity, str.toLowerCase(Locale.getDefault()), str2, str3, map);
            AdLog.d("addAdAreaCountData " + map.toString());
            MainInterstitialActivity mainInterstitialActivity2 = this.f5305c;
            Activity activity2 = this.f5304b;
            if (bp.c.f5737b == null) {
                mainInterstitialActivity2.getClass();
                bp.c.f5737b = new bp.c();
            }
            bp.c.f5737b.a(activity2, 6, mainInterstitialActivity2.ILil, mainInterstitialActivity2.f3319ILl.adPlcID, false);
            this.f5305c.f59311Lil.onAdClick();
            this.f5305c.f59311Lil.onAdClose();
            this.f5305c.IL1Iii(this.f5304b);
        }
    }
}
