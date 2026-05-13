package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class VideoClicksTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f69721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f69722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f69723e;

    public VideoClicksTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.VIDEO_CLICKS);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.CLICK_THROUGH)) {
                    n(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.CLICK_TRACKING)) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.CUSTOM_CLICK)) {
                    m(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.VIDEO_CLICKS);
    }

    private void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f69722d == null) {
            this.f69722d = new ArrayList();
        }
        this.f69722d.add(str);
    }

    private void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f69723e == null) {
            this.f69723e = new ArrayList();
        }
        this.f69723e.add(str);
    }

    private void n(String str) {
        this.f69721c = str;
    }

    @Nullable
    public String getClickThroughUrl() {
        return this.f69721c;
    }

    @Nullable
    public List<String> getClickTrackingUrlList() {
        return this.f69722d;
    }
}
