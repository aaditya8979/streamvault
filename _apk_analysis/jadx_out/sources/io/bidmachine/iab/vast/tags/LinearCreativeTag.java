package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public class LinearCreativeTag extends CreativeContentTag {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f69691i = {VastAttributes.SKIP_OFFSET};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f69692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f69693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VideoClicksTag f69694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumMap f69696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69697h;

    public LinearCreativeTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f69697h = -1;
        xmlPullParser.require(2, null, VastTagName.LINEAR);
        int iE = VastXmlTag.e(a(VastAttributes.SKIP_OFFSET));
        if (iE > -1) {
            a(iE);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.DURATION)) {
                    float fE = VastXmlTag.e(VastXmlTag.c(xmlPullParser));
                    if (fE > -1.0f) {
                        setDurationSec(Float.valueOf(fE));
                    }
                } else if (VastXmlTag.a(name, VastTagName.MEDIA_FILES)) {
                    a(e(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.VIDEO_CLICKS)) {
                    a(new VideoClicksTag(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.AD_PARAMETERS)) {
                    setAdParameters(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.TRACKING_EVENTS)) {
                    a(new TrackingEventsTag(xmlPullParser).a());
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.LINEAR);
    }

    private void a(int i10) {
        this.f69697h = i10;
    }

    private void a(VideoClicksTag videoClicksTag) {
        this.f69694e = videoClicksTag;
    }

    private void a(EnumMap enumMap) {
        this.f69696g = enumMap;
    }

    private void a(List list) {
        this.f69693d = list;
    }

    private static List e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, VastTagName.MEDIA_FILES);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.MEDIA_FILE)) {
                    MediaFileTag mediaFileTag = new MediaFileTag(xmlPullParser);
                    if (mediaFileTag.isValidTag()) {
                        arrayList.add(mediaFileTag);
                    } else {
                        VastLog.d("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                    }
                }
                VastXmlTag.d(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, VastTagName.MEDIA_FILES);
        return arrayList;
    }

    @Nullable
    public String getAdParameters() {
        return this.f69695f;
    }

    @Nullable
    public Float getDurationSec() {
        return this.f69692c;
    }

    @Nullable
    public List<MediaFileTag> getMediaFileTagList() {
        return this.f69693d;
    }

    public int getSkipOffsetSec() {
        return this.f69697h;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f69691i;
    }

    @Nullable
    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f69696g;
    }

    @Nullable
    public VideoClicksTag getVideoClicksTag() {
        return this.f69694e;
    }

    public void setAdParameters(@Nullable String str) {
        this.f69695f = str;
    }

    public void setDurationSec(@Nullable Float f10) {
        this.f69692c = f10;
    }
}
