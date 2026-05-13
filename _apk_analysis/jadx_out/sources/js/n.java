package js;

import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;

/* JADX INFO: compiled from: RecoveringSOAPActionProcessorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
@Alternative
public class n extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Logger f72622c = Logger.getLogger(ls.h.class.getName());

    public void N(jr.d dVar, UnsupportedDataException unsupportedDataException, UnsupportedDataException unsupportedDataException2) throws UnsupportedDataException {
        throw unsupportedDataException;
    }

    @Override // js.l, js.o, ls.h
    public void a(mr.c cVar, jr.d dVar) throws UnsupportedDataException {
        try {
            super.a(cVar, dVar);
        } catch (UnsupportedDataException e10) {
            if (!cVar.c()) {
                throw e10;
            }
            f72622c.warning("Trying to recover from invalid SOAP XML response: " + e10);
            String strC = qs.c.c(i(cVar));
            if (strC.endsWith("</s:Envelop")) {
                strC = strC + "e>";
            }
            try {
                cVar.b(strC);
                super.a(cVar, dVar);
            } catch (UnsupportedDataException e11) {
                N(dVar, e10, e11);
            }
        }
    }

    @Override // js.l, js.o, ls.h
    public void d(mr.b bVar, jr.d dVar) throws UnsupportedDataException {
        try {
            super.d(bVar, dVar);
        } catch (UnsupportedDataException e10) {
            if (!bVar.c()) {
                throw e10;
            }
            f72622c.warning("Trying to recover from invalid SOAP XML request: " + e10);
            try {
                bVar.b(qs.c.c(i(bVar)));
                super.d(bVar, dVar);
            } catch (UnsupportedDataException e11) {
                N(dVar, e10, e11);
            }
        }
    }
}
