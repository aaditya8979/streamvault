package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public class PostBannerTag extends VastXmlTag {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69703g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IabElementStyle f69699c = new IabElementStyle();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IabElementStyle f69700d = new IabElementStyle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IabElementStyle f69701e = new IabElementStyle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IabElementStyle f69702f = new IabElementStyle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f69704h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f69705i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69706j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69707k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f69708l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f69709m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69710n = false;

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IabElementStyle iabElementStyle;
        xmlPullParser.require(2, null, VastTagName.POSTBANNER);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (VastXmlTag.a(name, VastTagName.CLOSE_TIME)) {
                        String strC = VastXmlTag.c(xmlPullParser);
                        if (!TextUtils.isEmpty(strC)) {
                            this.f69704h = Float.parseFloat(strC);
                        }
                    } else if (VastXmlTag.a(name, VastTagName.DURATION)) {
                        String strC2 = VastXmlTag.c(xmlPullParser);
                        if (!TextUtils.isEmpty(strC2)) {
                            this.f69705i = Float.parseFloat(strC2);
                        }
                    } else {
                        if (VastXmlTag.a(name, VastTagName.CLOSEABLE_VIEW)) {
                            iabElementStyle = this.f69699c;
                        } else if (VastXmlTag.a(name, VastTagName.COUNTDOWN)) {
                            iabElementStyle = this.f69700d;
                        } else if (VastXmlTag.a(name, VastTagName.LOADING_VIEW)) {
                            iabElementStyle = this.f69701e;
                        } else if (VastXmlTag.a(name, VastTagName.PROGRESS)) {
                            iabElementStyle = this.f69702f;
                        } else if (VastXmlTag.a(name, VastTagName.USE_NATIVE_CLOSE)) {
                            this.f69708l = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.IGNORE_SAFE_AREA)) {
                            this.f69707k = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.PRODUCT_LINK)) {
                            this.f69703g = VastXmlTag.c(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.R1)) {
                            this.f69709m = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.R2)) {
                            this.f69710n = VastXmlTag.b(xmlPullParser);
                        } else {
                            VastXmlTag.d(xmlPullParser);
                        }
                        VastXmlTag.a(xmlPullParser, iabElementStyle);
                    }
                } catch (Throwable th2) {
                    VastLog.e("VastXmlTag", th2);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.POSTBANNER);
    }

    @NonNull
    public IabElementStyle getCloseStyle() {
        return this.f69699c;
    }

    public float getCloseTimeSec() {
        return this.f69704h;
    }

    @NonNull
    public IabElementStyle getCountDownStyle() {
        return this.f69700d;
    }

    public float getDurationSec() {
        return this.f69705i;
    }

    @NonNull
    public IabElementStyle getLoadingStyle() {
        return this.f69701e;
    }

    @Nullable
    public String getProductLink() {
        return this.f69703g;
    }

    @NonNull
    public IabElementStyle getProgressStyle() {
        return this.f69702f;
    }

    public boolean isForceUseNativeClose() {
        return this.f69708l;
    }

    public boolean isIgnoreSafeArea() {
        return this.f69707k;
    }

    public boolean isR1() {
        return this.f69709m;
    }

    public boolean isR2() {
        return this.f69710n;
    }

    public boolean isVisible() {
        return this.f69706j;
    }

    public void setCloseTimeSec(int i10) {
        this.f69704h = i10;
    }

    public void setVisible(boolean z10) {
        this.f69706j = z10;
    }
}
