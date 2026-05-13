package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class AdVerificationsExtensionTag extends ExtensionTag {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f69658d;

    public AdVerificationsExtensionTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f69658d = new ArrayList();
        xmlPullParser.require(2, null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.VERIFICATION)) {
                    this.f69658d.add(new VerificationTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "AdVerifications");
    }

    @NonNull
    public List<VerificationTag> getVerificationTagList() {
        return this.f69658d;
    }
}
