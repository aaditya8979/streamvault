package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ee3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f89224d = "yandex_tracking_events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f89225e = cn.w.p(CreativeInfo.S, "social_ad_info", "AdTune", "yandex_ad_info", "bannerId", "VitrinaTVIsInteractive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f89226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz2 f89227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp3 f89228c;

    public ee3() {
        rp3 rp3Var = new rp3();
        this.f89226a = rp3Var;
        this.f89227b = new bz2(rp3Var);
        this.f89228c = a();
    }

    public static pp3 a() {
        return new pp3(new y73(), VastTagName.EXTENSION, VastTagName.TRACKING);
    }
}
