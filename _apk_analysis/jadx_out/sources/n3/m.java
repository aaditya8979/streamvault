package n3;

import androidx.annotation.Nullable;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.Map;

/* JADX INFO: compiled from: InMobiNativeWrapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNative f75093a;

    public m(InMobiNative inMobiNative) {
        this.f75093a = inMobiNative;
    }

    @Nullable
    public String a() {
        return this.f75093a.getCtaText();
    }

    @Nullable
    public String b() {
        return this.f75093a.getAdDescription();
    }

    @Nullable
    public String c() {
        InMobiNativeImage adIcon = this.f75093a.getAdIcon();
        if (adIcon == null) {
            return null;
        }
        return adIcon.getUrl();
    }

    public float d() {
        return this.f75093a.getAdRating();
    }

    @Nullable
    public String e() {
        return this.f75093a.getAdTitle();
    }

    @Nullable
    public String f() {
        return this.f75093a.getAdvertiserName();
    }

    @Nullable
    public MediaView g() {
        return this.f75093a.getMediaView();
    }

    public Boolean h() {
        return Boolean.valueOf(this.f75093a.isVideo());
    }

    public void i() {
        this.f75093a.load();
    }

    public void j(byte[] bArr) {
        this.f75093a.load(bArr);
    }

    public void k(InMobiNativeViewData inMobiNativeViewData) {
        this.f75093a.registerViewForTracking(inMobiNativeViewData);
    }

    public void l(Map<String, String> map) {
        this.f75093a.setExtras(map);
    }

    public void m(String str) {
        this.f75093a.setKeywords(str);
    }

    public void n(VideoEventListener videoEventListener) {
        this.f75093a.setVideoEventListener(videoEventListener);
    }

    public void o() {
        this.f75093a.unTrackViews();
    }
}
