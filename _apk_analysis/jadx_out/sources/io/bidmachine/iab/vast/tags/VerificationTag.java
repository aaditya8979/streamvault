package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public class VerificationTag extends VastXmlTag {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f69718e = {"vendor"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JavaScriptResourceTag f69719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69720d;

    public VerificationTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.VERIFICATION);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.JAVA_SCRIPT_RESOURCE)) {
                    this.f69719c = new JavaScriptResourceTag(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.VERIFICATION_PARAMETERS)) {
                    this.f69720d = VastXmlTag.c(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.VERIFICATION);
    }

    @Nullable
    public JavaScriptResourceTag getJavaScriptResourceTag() {
        return this.f69719c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f69718e;
    }

    @Nullable
    public String getVendor() {
        return a("vendor");
    }

    @Nullable
    public String getVerificationParameters() {
        return this.f69720d;
    }
}
