package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.mraid.MraidUtils;
import io.bidmachine.iab.vast.TrackingEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class CompanionTag extends VastXmlTag {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f69679j = {"width", "height", "id", VastAttributes.ASSET_WIDTH, VastAttributes.ASSET_HEIGHT, VastAttributes.EXPANDED_WIDTH, VastAttributes.EXPANDED_HEIGHT, VastAttributes.API_FRAMEWORK, VastAttributes.AD_SLOT_ID, VastAttributes.REQUIRED};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StaticResourceTag f69680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f69682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f69684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f69685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f69686i;

    public CompanionTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.COMPANION);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.STATIC_RESOURCE)) {
                    StaticResourceTag staticResourceTag = new StaticResourceTag(xmlPullParser);
                    if (staticResourceTag.isValidTag()) {
                        a(staticResourceTag);
                    }
                } else if (VastXmlTag.a(name, VastTagName.I_FRAME_RESOURCE)) {
                    n(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.HTML_RESOURCE)) {
                    setHtmlResource(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.COMPANION_CLICK_THROUGH)) {
                    m(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.COMPANION_CLICK_TRACKING)) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.TRACKING_EVENTS)) {
                    a(new TrackingEventsTag(xmlPullParser).a());
                } else if (VastXmlTag.a(name, VastTagName.AD_PARAMETERS)) {
                    setAdParameters(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.COMPANION);
    }

    private void a(StaticResourceTag staticResourceTag) {
        this.f69680c = staticResourceTag;
    }

    private void a(Map map) {
        this.f69685h = map;
    }

    private void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f69684g == null) {
            this.f69684g = new ArrayList();
        }
        this.f69684g.add(str);
    }

    private void m(String str) {
        this.f69683f = str;
    }

    private void n(String str) {
        this.f69681d = str;
    }

    @Nullable
    public String getAdParameters() {
        return this.f69686i;
    }

    @Nullable
    public String getCompanionClickThrough() {
        return this.f69683f;
    }

    @Nullable
    public List<String> getCompanionClickTrackingList() {
        return this.f69684g;
    }

    public int getHeight() {
        return b("height");
    }

    @Nullable
    public String getHtml() {
        String htmlForMraid = getHtmlForMraid();
        if (htmlForMraid != null) {
            return MraidUtils.processRawHtml(htmlForMraid);
        }
        return null;
    }

    @Nullable
    public String getHtmlForMraid() {
        String str = this.f69682e;
        if (str != null) {
            return str;
        }
        StaticResourceTag staticResourceTag = this.f69680c;
        if (staticResourceTag != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", this.f69683f, staticResourceTag.getText());
        }
        if (this.f69681d != null) {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), this.f69681d);
        }
        return null;
    }

    @Nullable
    public String getHtmlResource() {
        return this.f69682e;
    }

    @Nullable
    public String getIFrameResource() {
        return this.f69681d;
    }

    @Nullable
    public StaticResourceTag getStaticResourceTag() {
        return this.f69680c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f69679j;
    }

    @Nullable
    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f69685h;
    }

    public int getWidth() {
        return b("width");
    }

    public boolean hasCreative() {
        return (this.f69682e == null && this.f69680c == null && this.f69681d == null) ? false : true;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isValidTag() {
        return (TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height"))) ? false : true;
    }

    public void setAdParameters(@Nullable String str) {
        this.f69686i = str;
    }

    public void setHtmlResource(@Nullable String str) {
        this.f69682e = str;
    }
}
