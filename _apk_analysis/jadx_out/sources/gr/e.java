package gr;

import fr.g;
import ir.m;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import qr.k;
import qr.l;
import qr.o;

/* JADX INFO: compiled from: UDA10ServiceDescriptorBinderImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class e implements c, ErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f62926a = Logger.getLogger(c.class.getName());

    @Override // gr.c
    public <S extends l> S a(S s10, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f62926a.fine("Populating service from XML descriptor: " + s10);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(this);
            return (S) e(s10, documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e11.toString(), e11);
        }
    }

    @Override // gr.c
    public String b(l lVar) throws DescriptorBindingException {
        try {
            f62926a.fine("Generating XML descriptor from service model: " + lVar);
            return m.i(c(lVar));
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not build DOM: " + e10.getMessage(), e10);
        }
    }

    public Document c(l lVar) throws DescriptorBindingException {
        try {
            f62926a.fine("Generating XML descriptor from service model: " + lVar);
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
            i(lVar, documentNewDocument);
            return documentNewDocument;
        } catch (Exception e10) {
            throw new DescriptorBindingException("Could not generate service descriptor: " + e10.getMessage(), e10);
        }
    }

    public <S extends l> S d(S s10, fr.f fVar) throws ValidationException {
        return (S) fVar.a(s10.d());
    }

    public <S extends l> S e(S s10, Document document) throws ValidationException, DescriptorBindingException {
        try {
            f62926a.fine("Populating service from DOM: " + s10);
            fr.f fVar = new fr.f();
            p(fVar, s10);
            q(fVar, document.getDocumentElement());
            return (S) d(s10, fVar);
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service DOM: " + e11.toString(), e11);
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    public final void f(org.fourthline.cling.model.meta.a aVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.action);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, aVar.d());
        if (aVar.h()) {
            Element elementA2 = m.a(document, elementA, Descriptor$Service$ELEMENT.argumentList);
            for (ActionArgument actionArgument : aVar.a()) {
                g(actionArgument, document, elementA2);
            }
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    public final void g(ActionArgument actionArgument, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.argument);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, actionArgument.e());
        m.e(document, elementA, Descriptor$Service$ELEMENT.direction, actionArgument.d().toString().toLowerCase(Locale.ROOT));
        if (actionArgument.h()) {
            f62926a.warning("UPnP specification violation: Not producing <retval> element to be compatible with WMP12: " + actionArgument);
        }
        m.e(document, elementA, Descriptor$Service$ELEMENT.relatedStateVariable, actionArgument.f());
    }

    public final void h(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.actionList);
        for (org.fourthline.cling.model.meta.a aVar : lVar.b()) {
            if (!aVar.d().equals("QueryStateVariable")) {
                f(aVar, document, elementA);
            }
        }
    }

    public final void i(l lVar, Document document) {
        Element elementCreateElementNS = document.createElementNS("urn:schemas-upnp-org:service-1-0", Descriptor$Service$ELEMENT.scpd.toString());
        document.appendChild(elementCreateElementNS);
        k(lVar, document, elementCreateElementNS);
        if (lVar.j()) {
            h(lVar, document, elementCreateElementNS);
        }
        j(lVar, document, elementCreateElementNS);
    }

    public final void j(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.serviceStateTable);
        for (qr.m mVar : lVar.i()) {
            l(mVar, document, elementA);
        }
    }

    public final void k(l lVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.specVersion);
        m.e(document, elementA, Descriptor$Service$ELEMENT.major, Integer.valueOf(lVar.d().v().a()));
        m.e(document, elementA, Descriptor$Service$ELEMENT.minor, Integer.valueOf(lVar.d().v().b()));
    }

    public final void l(qr.m mVar, Document document, Element element) {
        Element elementA = m.a(document, element, Descriptor$Service$ELEMENT.stateVariable);
        m.e(document, elementA, Descriptor$Service$ELEMENT.name, mVar.b());
        if (mVar.d().d() instanceof ur.f) {
            m.e(document, elementA, Descriptor$Service$ELEMENT.dataType, ((ur.f) mVar.d().d()).h());
        } else {
            m.e(document, elementA, Descriptor$Service$ELEMENT.dataType, mVar.d().d().b().getDescriptorName());
        }
        m.e(document, elementA, Descriptor$Service$ELEMENT.defaultValue, mVar.d().e());
        if (mVar.a().c()) {
            elementA.setAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString(), "yes");
        } else {
            elementA.setAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString(), "no");
        }
        if (mVar.d().c() != null) {
            Element elementA2 = m.a(document, elementA, Descriptor$Service$ELEMENT.allowedValueList);
            for (String str : mVar.d().c()) {
                m.e(document, elementA2, Descriptor$Service$ELEMENT.allowedValue, str);
            }
        }
        if (mVar.d().b() != null) {
            Element elementA3 = m.a(document, elementA, Descriptor$Service$ELEMENT.allowedValueRange);
            m.e(document, elementA3, Descriptor$Service$ELEMENT.minimum, Long.valueOf(mVar.d().b().b()));
            m.e(document, elementA3, Descriptor$Service$ELEMENT.maximum, Long.valueOf(mVar.d().b().a()));
            if (mVar.d().b().c() >= 1) {
                m.e(document, elementA3, Descriptor$Service$ELEMENT.step, Long.valueOf(mVar.d().b().c()));
            }
        }
    }

    public void m(fr.a aVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    aVar.f61832a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.argumentList.equals(nodeItem)) {
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node nodeItem2 = childNodes2.item(i11);
                        if (nodeItem2.getNodeType() == 1) {
                            fr.b bVar = new fr.b();
                            n(bVar, nodeItem2);
                            aVar.f61833b.add(bVar);
                        }
                    }
                }
            }
        }
    }

    public void n(fr.b bVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    bVar.f61834a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.direction.equals(nodeItem)) {
                    String strM = m.m(nodeItem);
                    try {
                        bVar.f61836c = ActionArgument.Direction.valueOf(strM.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                        f62926a.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + strM);
                        bVar.f61836c = ActionArgument.Direction.IN;
                    }
                } else if (Descriptor$Service$ELEMENT.relatedStateVariable.equals(nodeItem)) {
                    bVar.f61835b = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.retval.equals(nodeItem)) {
                    bVar.f61837d = true;
                }
            }
        }
    }

    public void o(fr.f fVar, Node node) throws DescriptorBindingException {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Service$ELEMENT.action.equals(nodeItem)) {
                fr.a aVar = new fr.a();
                m(aVar, nodeItem);
                fVar.f61871f.add(aVar);
            }
        }
    }

    public void p(fr.f fVar, l lVar) {
        fVar.f61867b = lVar.f();
        fVar.f61866a = lVar.g();
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            fVar.f61869d = kVar.n();
            fVar.f61870e = kVar.p();
            fVar.f61868c = kVar.o();
        }
    }

    public void q(fr.f fVar, Element element) throws DescriptorBindingException {
        if (!Descriptor$Service$ELEMENT.scpd.equals((Node) element)) {
            throw new DescriptorBindingException("Root element name is not <scpd>: " + element.getNodeName());
        }
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && !Descriptor$Service$ELEMENT.specVersion.equals(nodeItem)) {
                if (Descriptor$Service$ELEMENT.actionList.equals(nodeItem)) {
                    o(fVar, nodeItem);
                } else if (Descriptor$Service$ELEMENT.serviceStateTable.equals(nodeItem)) {
                    r(fVar, nodeItem);
                } else {
                    f62926a.finer("Ignoring unknown element: " + nodeItem.getNodeName());
                }
            }
        }
    }

    public void r(fr.f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && Descriptor$Service$ELEMENT.stateVariable.equals(nodeItem)) {
                g gVar = new g();
                s(gVar, (Element) nodeItem);
                fVar.f61872g.add(gVar);
            }
        }
    }

    public void s(g gVar, Element element) {
        gVar.f61878f = new o(element.getAttribute("sendEvents") != null && element.getAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString()).toUpperCase(Locale.ROOT).equals("YES"));
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(nodeItem)) {
                    gVar.f61873a = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.dataType.equals(nodeItem)) {
                    String strM = m.m(nodeItem);
                    Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strM);
                    gVar.f61874b = byDescriptorName != null ? byDescriptorName.getDatatype() : new ur.f(strM);
                } else if (Descriptor$Service$ELEMENT.defaultValue.equals(nodeItem)) {
                    gVar.f61875c = m.m(nodeItem);
                } else if (Descriptor$Service$ELEMENT.allowedValueList.equals(nodeItem)) {
                    ArrayList arrayList = new ArrayList();
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node nodeItem2 = childNodes2.item(i11);
                        if (nodeItem2.getNodeType() == 1 && Descriptor$Service$ELEMENT.allowedValue.equals(nodeItem2)) {
                            arrayList.add(m.m(nodeItem2));
                        }
                    }
                    gVar.f61876d = arrayList;
                } else if (Descriptor$Service$ELEMENT.allowedValueRange.equals(nodeItem)) {
                    fr.c cVar = new fr.c();
                    NodeList childNodes3 = nodeItem.getChildNodes();
                    for (int i12 = 0; i12 < childNodes3.getLength(); i12++) {
                        Node nodeItem3 = childNodes3.item(i12);
                        if (nodeItem3.getNodeType() == 1) {
                            if (Descriptor$Service$ELEMENT.minimum.equals(nodeItem3)) {
                                try {
                                    cVar.f61838a = Long.valueOf(m.m(nodeItem3));
                                } catch (Exception unused) {
                                }
                            } else if (Descriptor$Service$ELEMENT.maximum.equals(nodeItem3)) {
                                cVar.f61839b = Long.valueOf(m.m(nodeItem3));
                            } else if (Descriptor$Service$ELEMENT.step.equals(nodeItem3)) {
                                cVar.f61840c = Long.valueOf(m.m(nodeItem3));
                            }
                        }
                    }
                    gVar.f61877e = cVar;
                }
            }
        }
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
        f62926a.warning(sAXParseException.toString());
    }
}
