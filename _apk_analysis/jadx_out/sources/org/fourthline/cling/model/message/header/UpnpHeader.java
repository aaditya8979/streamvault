package org.fourthline.cling.model.message.header;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pr.a;
import pr.a0;
import pr.b;
import pr.b0;
import pr.c;
import pr.c0;
import pr.d;
import pr.d0;
import pr.e;
import pr.e0;
import pr.f;
import pr.g;
import pr.h;
import pr.i;
import pr.j;
import pr.k;
import pr.l;
import pr.m;
import pr.n;
import pr.o;
import pr.p;
import pr.q;
import pr.r;
import pr.s;
import pr.t;
import pr.u;
import pr.v;
import pr.w;
import pr.x;
import pr.y;
import pr.z;

/* JADX INFO: loaded from: classes10.dex */
public abstract class UpnpHeader<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f76849b = Logger.getLogger(UpnpHeader.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f76850a;

    public enum Type {
        USN("USN", d0.class, f.class, w.class, c0.class),
        NT("NT", s.class, a0.class, b0.class, e.class, v.class, c0.class, o.class),
        NTS("NTS", p.class),
        HOST("HOST", i.class),
        SERVER("SERVER", u.class),
        LOCATION("LOCATION", k.class),
        MAX_AGE("CACHE-CONTROL", n.class),
        USER_AGENT("USER-AGENT", e0.class),
        CONTENT_TYPE("CONTENT-TYPE", d.class),
        MAN("MAN", l.class),
        MX("MX", m.class),
        ST("ST", t.class, s.class, a0.class, b0.class, e.class, v.class, c0.class),
        EXT("EXT", g.class),
        SOAPACTION("SOAPACTION", x.class),
        TIMEOUT("TIMEOUT", z.class),
        CALLBACK("CALLBACK", b.class),
        SID("SID", y.class),
        SEQ("SEQ", h.class),
        RANGE("RANGE", r.class),
        CONTENT_RANGE("CONTENT-RANGE", c.class),
        PRAGMA("PRAGMA", q.class),
        EXT_IFACE_MAC("X-CLING-IFACE-MAC", j.class),
        EXT_AV_CLIENT_INFO("X-AV-CLIENT-INFO", a.class);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Map<String, Type> f76851b = new HashMap<String, Type>() { // from class: org.fourthline.cling.model.message.header.UpnpHeader.Type.1
            {
                for (Type type : Type.values()) {
                    put(type.getHttpName(), type);
                }
            }
        };
        private Class<? extends UpnpHeader>[] headerTypes;
        private String httpName;

        @SafeVarargs
        Type(String str, Class... clsArr) {
            this.httpName = str;
            this.headerTypes = clsArr;
        }

        public static Type getByHttpName(String str) {
            if (str == null) {
                return null;
            }
            return f76851b.get(str.toUpperCase(Locale.ROOT));
        }

        public Class<? extends UpnpHeader>[] getHeaderTypes() {
            return this.headerTypes;
        }

        public String getHttpName() {
            return this.httpName;
        }

        public boolean isValidHeaderType(Class<? extends UpnpHeader> cls) {
            for (Class<? extends UpnpHeader> cls2 : getHeaderTypes()) {
                if (cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static UpnpHeader c(Type type, String str) {
        UpnpHeader upnpHeaderNewInstance;
        Exception e10;
        UpnpHeader upnpHeader = null;
        for (int i10 = 0; i10 < type.getHeaderTypes().length && upnpHeader == null; i10++) {
            Class<? extends UpnpHeader> cls = type.getHeaderTypes()[i10];
            try {
                try {
                    f76849b.finest("Trying to parse '" + type + "' with class: " + cls.getSimpleName());
                    upnpHeaderNewInstance = cls.newInstance();
                    if (str != null) {
                        try {
                            upnpHeaderNewInstance.d(str);
                        } catch (Exception e11) {
                            e10 = e11;
                            Logger logger = f76849b;
                            logger.severe("Error instantiating header of type '" + type + "' with value: " + str);
                            logger.log(Level.SEVERE, "Exception root cause: ", os.a.a(e10));
                        }
                    }
                } catch (InvalidHeaderException e12) {
                    f76849b.finest("Invalid header value for tested type: " + cls.getSimpleName() + " - " + e12.getMessage());
                    upnpHeader = null;
                }
            } catch (Exception e13) {
                upnpHeaderNewInstance = upnpHeader;
                e10 = e13;
            }
            upnpHeader = upnpHeaderNewInstance;
        }
        return upnpHeader;
    }

    public abstract String a();

    public T b() {
        return this.f76850a;
    }

    public abstract void d(String str) throws InvalidHeaderException;

    public void e(T t10) {
        this.f76850a = t10;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + b() + "'";
    }
}
