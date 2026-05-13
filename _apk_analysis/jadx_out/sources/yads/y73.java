package yads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class y73 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f97020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63 f97021b;

    public /* synthetic */ y73() {
        rp3 rp3Var = new rp3();
        g63[] g63VarArrValues = g63.values();
        this(rp3Var, new i63(new HashSet(cn.w.p(Arrays.copyOf(g63VarArrValues, g63VarArrValues.length)))));
    }

    public y73(rp3 rp3Var, i63 i63Var) {
        this.f97020a = rp3Var;
        this.f97021b = i63Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final x73 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f97020a.getClass();
        xmlPullParser.require(2, null, VastTagName.TRACKING);
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, TypedValues.CycleType.S_WAVE_OFFSET);
        this.f97020a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new x73(attributeValue, strA, attributeValue2 != null ? this.f97021b.a(attributeValue2) : null);
    }
}
