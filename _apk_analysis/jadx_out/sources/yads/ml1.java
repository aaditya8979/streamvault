package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class ml1 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f92439a;

    public /* synthetic */ ml1() {
        this(new rp3());
    }

    public ml1(rp3 rp3Var) {
        this.f92439a = rp3Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final kl1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        jl1 jl1Var;
        Integer numR;
        Integer numR2;
        Integer numR3;
        this.f92439a.getClass();
        xmlPullParser.require(2, null, VastTagName.MEDIA_FILE);
        this.f92439a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        this.f92439a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.f92439a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.f92439a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.f92439a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
        this.f92439a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
        this.f92439a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        this.f92439a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, VastAttributes.CODEC);
        this.f92439a.getClass();
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.f92439a.getClass();
        String strA = rp3.a(xmlPullParser);
        jl1[] jl1VarArrValues = jl1.values();
        int length = jl1VarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jl1Var = null;
                break;
            }
            jl1Var = jl1VarArrValues[i10];
            if (tn.p.f(jl1Var.f91270b, attributeValue)) {
                break;
            }
            i10++;
        }
        return new kl1(strA, attributeValue7, jl1Var, attributeValue2, attributeValue8, attributeValue9 != null ? bo.y.p(attributeValue9) : null, (attributeValue3 == null || (numR3 = bo.z.r(attributeValue3)) == null) ? 0 : numR3.intValue(), (attributeValue4 == null || (numR2 = bo.z.r(attributeValue4)) == null) ? 0 : numR2.intValue(), (attributeValue5 == null || (numR = bo.z.r(attributeValue5)) == null) ? 0 : numR.intValue(), attributeValue6);
    }
}
