package js;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PullGENAEventProcessorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
@Alternative
public class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f72619b = Logger.getLogger(ls.e.class.getName());

    @Override // js.g, ls.e
    public void a(or.a aVar) throws UnsupportedDataException {
        f72619b.fine("Reading body of: " + aVar);
        if (f72619b.isLoggable(Level.FINER)) {
            f72619b.finer("===================================== GENA BODY BEGIN ============================================");
            f72619b.finer(aVar.e() != null ? aVar.e().toString() : null);
            f72619b.finer("-===================================== GENA BODY END ============================================");
        }
        String strD = d(aVar);
        try {
            k(qs.c.b(strD), aVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10.getMessage(), e10, strD);
        }
    }

    public void k(XmlPullParser xmlPullParser, or.a aVar) throws Exception {
        qr.m<qr.k>[] mVarArrI = aVar.z().i();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2 && xmlPullParser.getName().equals("property")) {
                l(xmlPullParser, aVar, mVarArrI);
            }
        }
    }

    public void l(XmlPullParser xmlPullParser, or.a aVar, qr.m[] mVarArr) throws Exception {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                int length = mVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    qr.m mVar = mVarArr[i10];
                    if (mVar.b().equals(name)) {
                        f72619b.fine("Reading state variable value: " + name);
                        aVar.A().add(new tr.d(mVar, xmlPullParser.nextText()));
                        break;
                    }
                    i10++;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getName().equals("property")) {
                return;
            }
        }
    }
}
