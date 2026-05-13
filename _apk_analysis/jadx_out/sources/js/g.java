package js;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* JADX INFO: compiled from: GENAEventProcessorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class g implements ls.e, ErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f72599a = Logger.getLogger(ls.e.class.getName());

    @Override // ls.e
    public void a(or.a aVar) throws UnsupportedDataException {
        f72599a.fine("Reading body of: " + aVar);
        if (f72599a.isLoggable(Level.FINER)) {
            f72599a.finer("===================================== GENA BODY BEGIN ============================================");
            f72599a.finer(aVar.e() != null ? aVar.e().toString() : "null");
            f72599a.finer("-===================================== GENA BODY END ============================================");
        }
        String strD = d(aVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryC = c();
            documentBuilderFactoryC.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryC.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            f(g(documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(strD)))), aVar);
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10.getMessage(), e10, strD);
        }
    }

    @Override // ls.e
    public void b(or.e eVar) throws UnsupportedDataException {
        f72599a.fine("Writing body of: " + eVar);
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            i(documentNewDocument, j(documentNewDocument), eVar);
            eVar.r(UpnpMessage.BodyType.STRING, h(documentNewDocument));
            if (f72599a.isLoggable(Level.FINER)) {
                f72599a.finer("===================================== GENA BODY BEGIN ============================================");
                f72599a.finer(eVar.e().toString());
                f72599a.finer("====================================== GENA BODY END =============================================");
            }
        } catch (Exception e10) {
            throw new UnsupportedDataException("Can't transform message payload: " + e10.getMessage(), e10);
        }
    }

    public DocumentBuilderFactory c() throws FactoryConfigurationError {
        return DocumentBuilderFactory.newInstance();
    }

    public String d(UpnpMessage upnpMessage) throws UnsupportedDataException {
        if (upnpMessage.c()) {
            return upnpMessage.d().trim();
        }
        throw new UnsupportedDataException("Can't transform null or non-string/zero-length body of: " + upnpMessage);
    }

    public String e(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    public void f(Element element, or.a aVar) {
        NodeList childNodes = element.getChildNodes();
        qr.m<qr.k>[] mVarArrI = aVar.z().i();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && e(nodeItem).equals("property")) {
                NodeList childNodes2 = nodeItem.getChildNodes();
                for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                    Node nodeItem2 = childNodes2.item(i11);
                    if (nodeItem2.getNodeType() == 1) {
                        String strE = e(nodeItem2);
                        int length = mVarArrI.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                qr.m<qr.k> mVar = mVarArrI[i12];
                                if (mVar.b().equals(strE)) {
                                    f72599a.fine("Reading state variable value: " + strE);
                                    aVar.A().add(new tr.d(mVar, ir.m.m(nodeItem2)));
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    public Element g(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement == null || !e(documentElement).equals("propertyset")) {
            throw new RuntimeException("Root element was not 'propertyset'");
        }
        return documentElement;
    }

    public String h(Document document) throws Exception {
        String strI = ir.m.i(document);
        while (true) {
            if (!strI.endsWith("\n") && !strI.endsWith("\r")) {
                return strI;
            }
            strI = strI.substring(0, strI.length() - 1);
        }
    }

    public void i(Document document, Element element, or.e eVar) {
        for (tr.d dVar : eVar.y()) {
            Element elementCreateElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:property");
            element.appendChild(elementCreateElementNS);
            ir.m.c(document, elementCreateElementNS, dVar.d().b(), dVar.toString());
        }
    }

    public Element j(Document document) {
        Element elementCreateElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:propertyset");
        document.appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f72599a.warning(sAXParseException.toString());
    }
}
