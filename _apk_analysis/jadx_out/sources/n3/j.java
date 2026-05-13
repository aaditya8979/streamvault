package n3;

import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import java.util.Map;

/* JADX INFO: compiled from: InMobiInterstitialWrapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiInterstitial f75086a;

    public j(InMobiInterstitial inMobiInterstitial) {
        this.f75086a = inMobiInterstitial;
    }

    public Boolean a() {
        return Boolean.valueOf(this.f75086a.isReady());
    }

    public void b() {
        this.f75086a.load();
    }

    public void c(byte[] bArr) {
        this.f75086a.load(bArr);
    }

    public void d(Map<String, String> map) {
        this.f75086a.setExtras(map);
    }

    public void e(String str) {
        this.f75086a.setKeywords(str);
    }

    public void f(WatermarkData watermarkData) {
        this.f75086a.setWatermarkData(watermarkData);
    }

    public void g() {
        this.f75086a.show();
    }
}
