package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public class AdContentTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdSystemTag f69650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f69651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f69652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f69653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f69654g;

    public AdContentTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    private ExtensionTag f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ExtensionTag appodealExtensionTag;
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        String strA = new ExtensionTag(xmlPullParser).a("type");
        if (VastXmlTag.a(strA, "appodeal")) {
            appodealExtensionTag = new AppodealExtensionTag(xmlPullParser);
        } else if (VastXmlTag.a(strA, "AdVerifications")) {
            AdVerificationsExtensionTag adVerificationsExtensionTag = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (VastXmlTag.a(xmlPullParser.getName(), "AdVerifications")) {
                        adVerificationsExtensionTag = new AdVerificationsExtensionTag(xmlPullParser);
                    } else {
                        VastXmlTag.d(xmlPullParser);
                    }
                }
            }
            appodealExtensionTag = adVerificationsExtensionTag;
        } else {
            VastXmlTag.d(xmlPullParser);
            appodealExtensionTag = null;
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSION);
        return appodealExtensionTag;
    }

    public void a(AdSystemTag adSystemTag) {
        this.f69650c = adSystemTag;
    }

    public void a(List list) {
        this.f69651d = list;
    }

    public void b(List list) {
        this.f69652e = list;
    }

    public List e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, VastTagName.CREATIVES);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.CREATIVE)) {
                    arrayList.add(new CreativeTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.CREATIVES);
        return arrayList;
    }

    public List g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, VastTagName.EXTENSIONS);
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.EXTENSION)) {
                    ExtensionTag extensionTagF = f(xmlPullParser);
                    if (extensionTagF != null) {
                        arrayList.add(extensionTagF);
                    }
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSIONS);
        return arrayList;
    }

    @Nullable
    public List<CreativeTag> getCreativeTagList() {
        return this.f69651d;
    }

    @Nullable
    public List<String> getErrorUrlList() {
        return this.f69654g;
    }

    @Nullable
    public List<ExtensionTag> getExtensionTagList() {
        return this.f69652e;
    }

    @Nullable
    public List<String> getImpressionUrlList() {
        return this.f69653f;
    }

    public void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f69654g == null) {
            this.f69654g = new ArrayList();
        }
        this.f69654g.add(str);
    }

    public void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f69653f == null) {
            this.f69653f = new ArrayList();
        }
        this.f69653f.add(str);
    }
}
