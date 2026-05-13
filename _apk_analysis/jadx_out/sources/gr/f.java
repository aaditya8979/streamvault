package gr;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.xml.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qr.l;
import qr.o;

/* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends gr.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f62927b = Logger.getLogger(gr.c.class.getName());

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62928a;

        static {
            int[] iArr = new int[Descriptor$Service$ELEMENT.values().length];
            f62928a = iArr;
            try {
                iArr[Descriptor$Service$ELEMENT.name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.direction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.relatedStateVariable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.retval.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.dataType.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.defaultValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.allowedValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.minimum.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.maximum.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62928a[Descriptor$Service$ELEMENT.step.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class b extends i<fr.b> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62929f = Descriptor$Service$ELEMENT.argument;

        public b(fr.b bVar, i iVar) {
            super(bVar, iVar);
        }

        @Override // gr.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            int i10 = a.f62928a[descriptor$Service$ELEMENT.ordinal()];
            if (i10 == 1) {
                b().f61834a = a();
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    b().f61835b = a();
                    return;
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    b().f61837d = true;
                    return;
                }
            }
            String strA = a();
            try {
                b().f61836c = ActionArgument.Direction.valueOf(strA.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
                f.f62927b.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + strA);
                b().f61836c = ActionArgument.Direction.IN;
            }
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62929f);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class c extends i<List<fr.b>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62930f = Descriptor$Service$ELEMENT.argumentList;

        public c(List<fr.b> list, i iVar) {
            super(list, iVar);
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62930f);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(b.f62929f)) {
                fr.b bVar = new fr.b();
                b().add(bVar);
                new b(bVar, this);
            }
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class d extends i<fr.a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62931f = Descriptor$Service$ELEMENT.action;

        public d(fr.a aVar, i iVar) {
            super(aVar, iVar);
        }

        @Override // gr.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            if (a.f62928a[descriptor$Service$ELEMENT.ordinal()] != 1) {
                return;
            }
            b().f61832a = a();
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62931f);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(c.f62930f)) {
                ArrayList arrayList = new ArrayList();
                b().f61833b = arrayList;
                new c(arrayList, this);
            }
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class e extends i<List<fr.a>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62932f = Descriptor$Service$ELEMENT.actionList;

        public e(List<fr.a> list, i iVar) {
            super(list, iVar);
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62932f);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(d.f62931f)) {
                fr.a aVar = new fr.a();
                b().add(aVar);
                new d(aVar, this);
            }
        }
    }

    /* JADX INFO: renamed from: gr.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class C0774f extends i<List<String>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62933f = Descriptor$Service$ELEMENT.allowedValueList;

        public C0774f(List<String> list, i iVar) {
            super(list, iVar);
        }

        @Override // gr.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            if (a.f62928a[descriptor$Service$ELEMENT.ordinal()] != 7) {
                return;
            }
            b().add(a());
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62933f);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class g extends i<fr.c> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62934f = Descriptor$Service$ELEMENT.allowedValueRange;

        public g(fr.c cVar, i iVar) {
            super(cVar, iVar);
        }

        @Override // gr.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            try {
                switch (a.f62928a[descriptor$Service$ELEMENT.ordinal()]) {
                    case 8:
                        b().f61838a = Long.valueOf(a());
                        break;
                    case 9:
                        b().f61839b = Long.valueOf(a());
                        break;
                    case 10:
                        b().f61840c = Long.valueOf(a());
                        break;
                }
            } catch (Exception unused) {
            }
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62934f);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class h extends i<fr.f> {
        public h(fr.f fVar, SAXParser sAXParser) {
            super(fVar, sAXParser);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(e.f62932f)) {
                ArrayList arrayList = new ArrayList();
                b().f61871f = arrayList;
                new e(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(k.f62936f)) {
                ArrayList arrayList2 = new ArrayList();
                b().f61872g = arrayList2;
                new k(arrayList2, this);
            }
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class i<I> extends SAXParser.a<I> {
        public i(I i10, i iVar) {
            super(i10, iVar);
        }

        public i(I i10, SAXParser sAXParser) {
            super(i10, sAXParser);
        }

        @Override // org.seamless.xml.SAXParser.a
        public boolean d(String str, String str2, String str3) {
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            return descriptor$Service$ELEMENTValueOrNullOf != null && g(descriptor$Service$ELEMENTValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            super.endElement(str, str2, str3);
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (descriptor$Service$ELEMENTValueOrNullOf == null) {
                return;
            }
            f(descriptor$Service$ELEMENTValueOrNullOf);
        }

        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
        }

        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return false;
        }

        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            super.startElement(str, str2, str3, attributes);
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (descriptor$Service$ELEMENTValueOrNullOf == null) {
                return;
            }
            h(descriptor$Service$ELEMENTValueOrNullOf, attributes);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class j extends i<fr.g> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62935f = Descriptor$Service$ELEMENT.stateVariable;

        public j(fr.g gVar, i iVar) {
            super(gVar, iVar);
        }

        @Override // gr.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            int i10 = a.f62928a[descriptor$Service$ELEMENT.ordinal()];
            if (i10 == 1) {
                b().f61873a = a();
                return;
            }
            if (i10 != 5) {
                if (i10 != 6) {
                    return;
                }
                b().f61875c = a();
            } else {
                String strA = a();
                Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strA);
                b().f61874b = byDescriptorName != null ? byDescriptorName.getDatatype() : new ur.f(strA);
            }
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62935f);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(C0774f.f62933f)) {
                ArrayList arrayList = new ArrayList();
                b().f61876d = arrayList;
                new C0774f(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(g.f62934f)) {
                fr.c cVar = new fr.c();
                b().f61877e = cVar;
                new g(cVar, this);
            }
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class k extends i<List<fr.g>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62936f = Descriptor$Service$ELEMENT.serviceStateTable;

        public k(List<fr.g> list, i iVar) {
            super(list, iVar);
        }

        @Override // gr.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62936f);
        }

        @Override // gr.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(j.f62935f)) {
                fr.g gVar = new fr.g();
                String value = attributes.getValue(Descriptor$Service$ATTRIBUTE.sendEvents.toString());
                gVar.f61878f = new o(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                b().add(gVar);
                new j(gVar, this);
            }
        }
    }

    @Override // gr.e, gr.c
    public <S extends l> S a(S s10, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f62927b.fine("Reading service from XML descriptor");
            SAXParser sAXParser = new SAXParser();
            fr.f fVar = new fr.f();
            p(fVar, s10);
            new h(fVar, sAXParser);
            sAXParser.f(new InputSource(new StringReader(str.trim())));
            return (S) fVar.a(s10.d());
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e11.toString(), e11);
        }
    }
}
