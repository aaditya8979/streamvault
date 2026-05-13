package n3;

import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: InMobiBannerWrapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f75082a;

    public e(InMobiBanner inMobiBanner) {
        this.f75082a = inMobiBanner;
    }

    public InMobiBanner a() {
        return this.f75082a;
    }

    public void b() {
        this.f75082a.load();
    }

    public void c(byte[] bArr) {
        this.f75082a.load(bArr);
    }

    public void d(InMobiBanner.AnimationType animationType) {
        this.f75082a.setAnimationType(animationType);
    }

    public void e(Boolean bool) {
        this.f75082a.setEnableAutoRefresh(bool.booleanValue());
    }

    public void f(Map<String, String> map) {
        this.f75082a.setExtras(map);
    }

    public void g(String str) {
        this.f75082a.setKeywords(str);
    }

    public void h(ViewGroup.LayoutParams layoutParams) {
        this.f75082a.setLayoutParams(layoutParams);
    }

    public void i(BannerAdEventListener bannerAdEventListener) {
        this.f75082a.setListener(bannerAdEventListener);
    }

    public void j(WatermarkData watermarkData) {
        this.f75082a.setWatermarkData(watermarkData);
    }
}
