package org.eclipse.jetty.http;

import com.ironsource.C3978d4;
import com.ironsource.G5;
import gq.i;
import hq.e;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.jetty.util.StringMap;
import sq.m;
import sq.o;

/* JADX INFO: compiled from: HttpFields.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vq.c f76615c = vq.b.a(a.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f76616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hq.f f76617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f76618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f76619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<f> f76620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f76621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal<g> f76622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f76623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hq.d f76624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f76625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ConcurrentMap<String, hq.d> f76626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f76627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Float f76628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Float f76629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final StringMap f76630r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<h> f76631a = new ArrayList<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<hq.d, h> f76632b = new HashMap<>(32);

    /* JADX INFO: renamed from: org.eclipse.jetty.http.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpFields.java */
    public static class C0914a extends ThreadLocal<f> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f initialValue() {
            return new f(null);
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class b extends ThreadLocal<g> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g initialValue() {
            return new g(null);
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class c implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration f76633a;

        public c(Enumeration enumeration) {
            this.f76633a = enumeration;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() {
            return this.f76633a.nextElement().toString();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f76633a.hasMoreElements();
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class d implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f76635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f76636b;

        public d(h hVar) {
            this.f76636b = hVar;
            this.f76635a = hVar;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() throws NoSuchElementException {
            h hVar = this.f76635a;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f76635a = hVar.f76646c;
            return hVar.h();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f76635a != null;
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public class e implements Enumeration<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f76638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f76639b;

        public e(h hVar) {
            this.f76639b = hVar;
            this.f76638a = hVar;
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String nextElement() throws NoSuchElementException {
            h hVar = this.f76638a;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f76638a = hVar.f76646c;
            return hVar.h();
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f76638a != null;
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f76641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GregorianCalendar f76642b;

        public f() {
            this.f76641a = new StringBuilder(32);
            this.f76642b = new GregorianCalendar(a.f76616d);
        }

        public /* synthetic */ f(C0914a c0914a) {
            this();
        }

        public void a(StringBuilder sb2, long j10) {
            this.f76642b.setTimeInMillis(j10);
            int i10 = this.f76642b.get(7);
            int i11 = this.f76642b.get(5);
            int i12 = this.f76642b.get(2);
            int i13 = this.f76642b.get(1) % 10000;
            int i14 = (int) ((j10 / 1000) % 86400);
            int i15 = i14 % 60;
            int i16 = i14 / 60;
            sb2.append(a.f76618f[i10]);
            sb2.append(',');
            sb2.append(' ');
            o.a(sb2, i11);
            sb2.append('-');
            sb2.append(a.f76619g[i12]);
            sb2.append('-');
            o.a(sb2, i13 / 100);
            o.a(sb2, i13 % 100);
            sb2.append(' ');
            o.a(sb2, i16 / 60);
            sb2.append(':');
            o.a(sb2, i16 % 60);
            sb2.append(':');
            o.a(sb2, i15);
            sb2.append(" GMT");
        }

        public String b(long j10) {
            this.f76641a.setLength(0);
            this.f76642b.setTimeInMillis(j10);
            int i10 = this.f76642b.get(7);
            int i11 = this.f76642b.get(5);
            int i12 = this.f76642b.get(2);
            int i13 = this.f76642b.get(1);
            int i14 = this.f76642b.get(11);
            int i15 = this.f76642b.get(12);
            int i16 = this.f76642b.get(13);
            this.f76641a.append(a.f76618f[i10]);
            this.f76641a.append(',');
            this.f76641a.append(' ');
            o.a(this.f76641a, i11);
            this.f76641a.append(' ');
            this.f76641a.append(a.f76619g[i12]);
            this.f76641a.append(' ');
            o.a(this.f76641a, i13 / 100);
            o.a(this.f76641a, i13 % 100);
            this.f76641a.append(' ');
            o.a(this.f76641a, i14);
            this.f76641a.append(':');
            o.a(this.f76641a, i15);
            this.f76641a.append(':');
            o.a(this.f76641a, i16);
            this.f76641a.append(" GMT");
            return this.f76641a.toString();
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SimpleDateFormat[] f76643a;

        public g() {
            this.f76643a = new SimpleDateFormat[a.f76621i.length];
        }

        public /* synthetic */ g(C0914a c0914a) {
            this();
        }

        public long a(String str) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                SimpleDateFormat[] simpleDateFormatArr = this.f76643a;
                if (i11 < simpleDateFormatArr.length) {
                    if (simpleDateFormatArr[i11] == null) {
                        simpleDateFormatArr[i11] = new SimpleDateFormat(a.f76621i[i11], Locale.US);
                        this.f76643a[i11].setTimeZone(a.f76616d);
                    }
                    try {
                        continue;
                        return ((Date) this.f76643a[i11].parseObject(str)).getTime();
                    } catch (Exception unused) {
                        i11++;
                    }
                } else {
                    if (!str.endsWith(" GMT")) {
                        return -1L;
                    }
                    String strSubstring = str.substring(i10, str.length() - 4);
                    while (true) {
                        SimpleDateFormat[] simpleDateFormatArr2 = this.f76643a;
                        if (i10 >= simpleDateFormatArr2.length) {
                            return -1L;
                        }
                        try {
                            return ((Date) simpleDateFormatArr2[i10].parseObject(strSubstring)).getTime();
                        } catch (Exception unused2) {
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: HttpFields.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hq.d f76644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hq.d f76645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f76646c;

        public h(hq.d dVar, hq.d dVar2) {
            this.f76644a = dVar;
            this.f76645b = dVar2;
            this.f76646c = null;
        }

        public /* synthetic */ h(hq.d dVar, hq.d dVar2, C0914a c0914a) {
            this(dVar, dVar2);
        }

        public long e() {
            return hq.g.i(this.f76645b);
        }

        public String f() {
            return hq.g.f(this.f76644a);
        }

        public int g() {
            return i.f62809d.e(this.f76644a);
        }

        public String h() {
            return hq.g.f(this.f76645b);
        }

        public hq.d i() {
            return this.f76645b;
        }

        public int j() {
            return gq.h.f62794d.e(this.f76645b);
        }

        public void k(hq.d dVar) throws IOException {
            hq.d dVar2 = this.f76644a;
            if ((dVar2 instanceof e.a ? ((e.a) dVar2).e() : -1) >= 0) {
                dVar.k0(this.f76644a);
            } else {
                int index = this.f76644a.getIndex();
                int iT = this.f76644a.T();
                while (index < iT) {
                    int i10 = index + 1;
                    byte bQ = this.f76644a.Q(index);
                    if (bQ != 10 && bQ != 13 && bQ != 58) {
                        dVar.put(bQ);
                    }
                    index = i10;
                }
            }
            dVar.put((byte) 58);
            dVar.put((byte) 32);
            hq.d dVar3 = this.f76645b;
            if ((dVar3 instanceof e.a ? ((e.a) dVar3).e() : -1) >= 0) {
                dVar.k0(this.f76645b);
            } else {
                int index2 = this.f76645b.getIndex();
                int iT2 = this.f76645b.T();
                while (index2 < iT2) {
                    int i11 = index2 + 1;
                    byte bQ2 = this.f76645b.Q(index2);
                    if (bQ2 != 10 && bQ2 != 13) {
                        dVar.put(bQ2);
                    }
                    index2 = i11;
                }
            }
            hq.g.c(dVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3978d4.j.f31383d);
            sb2.append(f());
            sb2.append("=");
            sb2.append(this.f76645b);
            sb2.append(this.f76646c == null ? "" : "->");
            sb2.append(C3978d4.j.f31385e);
            return sb2.toString();
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f76616d = timeZone;
        hq.f fVar = new hq.f("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f76617e = fVar;
        timeZone.setID("GMT");
        fVar.e(timeZone);
        f76618f = new String[]{"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        f76619g = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};
        f76620h = new C0914a();
        f76621i = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};
        f76622j = new b();
        String strN = n(0L);
        f76623k = strN;
        f76624l = new hq.h(strN);
        f76625m = l(0L).trim();
        f76626n = new ConcurrentHashMap();
        f76627o = Integer.getInteger("org.eclipse.jetty.http.HttpFields.CACHE", 2000).intValue();
        Float f10 = new Float(NastAdapter.ADAPTER_SDK_VERSION_NAME);
        f76628p = f10;
        Float f11 = new Float("0.0");
        f76629q = f11;
        StringMap stringMap = new StringMap();
        f76630r = stringMap;
        stringMap.put((String) null, (Object) f10);
        stringMap.put(NastAdapter.ADAPTER_SDK_VERSION_NAME, (Object) f10);
        stringMap.put("1", (Object) f10);
        stringMap.put("0.9", (Object) new Float("0.9"));
        stringMap.put("0.8", (Object) new Float("0.8"));
        stringMap.put("0.7", (Object) new Float("0.7"));
        stringMap.put("0.66", (Object) new Float("0.66"));
        stringMap.put("0.6", (Object) new Float("0.6"));
        stringMap.put("0.5", (Object) new Float("0.5"));
        stringMap.put("0.4", (Object) new Float("0.4"));
        stringMap.put("0.33", (Object) new Float("0.33"));
        stringMap.put("0.3", (Object) new Float("0.3"));
        stringMap.put("0.2", (Object) new Float("0.2"));
        stringMap.put("0.1", (Object) new Float("0.1"));
        stringMap.put("0", (Object) f11);
        stringMap.put("0.0", (Object) f11);
    }

    public static String L(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            return str;
        }
        if (map == null) {
            return str.substring(0, iIndexOf).trim();
        }
        m mVar = new m(str.substring(iIndexOf), ";", false, true);
        while (mVar.hasMoreTokens()) {
            m mVar2 = new m(mVar.nextToken(), "= ");
            if (mVar2.hasMoreTokens()) {
                map.put(mVar2.nextToken(), mVar2.hasMoreTokens() ? mVar2.nextToken() : null);
            }
        }
        return str.substring(0, iIndexOf).trim();
    }

    public static String l(long j10) {
        StringBuilder sb2 = new StringBuilder(28);
        m(sb2, j10);
        return sb2.toString();
    }

    public static void m(StringBuilder sb2, long j10) {
        f76620h.get().a(sb2, j10);
    }

    public static String n(long j10) {
        return f76620h.get().b(j10);
    }

    public Collection<String> A(String str) {
        h hVarS = s(str);
        if (hVarS == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (hVarS != null) {
            arrayList.add(hVarS.h());
            hVarS = hVarS.f76646c;
        }
        return arrayList;
    }

    public void B(hq.d dVar, hq.d dVar2) {
        I(dVar);
        if (dVar2 == null) {
            return;
        }
        if (!(dVar instanceof e.a)) {
            dVar = i.f62809d.g(dVar);
        }
        if (!(dVar2 instanceof e.a)) {
            dVar2 = gq.h.f62794d.g(dVar2).m0();
        }
        h hVar = new h(dVar, dVar2, null);
        this.f76631a.add(hVar);
        this.f76632b.put(dVar, hVar);
    }

    public void C(hq.d dVar, String str) {
        B(i.f62809d.g(dVar), k(str));
    }

    public void D(String str, String str2) {
        if (str2 == null) {
            J(str);
        } else {
            B(i.f62809d.h(str), k(str2));
        }
    }

    public void E(hq.d dVar, long j10) {
        B(dVar, new hq.h(n(j10)));
    }

    public void F(String str, long j10) {
        E(i.f62809d.h(str), j10);
    }

    public void G(hq.d dVar, long j10) {
        B(dVar, hq.g.g(j10));
    }

    public void H(String str, long j10) {
        B(i.f62809d.h(str), hq.g.g(j10));
    }

    public void I(hq.d dVar) {
        if (!(dVar instanceof e.a)) {
            dVar = i.f62809d.g(dVar);
        }
        for (h hVarRemove = this.f76632b.remove(dVar); hVarRemove != null; hVarRemove = hVarRemove.f76646c) {
            this.f76631a.remove(hVarRemove);
        }
    }

    public void J(String str) {
        I(i.f62809d.h(str));
    }

    public int K() {
        return this.f76631a.size();
    }

    public void d(hq.d dVar, hq.d dVar2) throws IllegalArgumentException {
        if (dVar2 == null) {
            throw new IllegalArgumentException("null value");
        }
        if (!(dVar instanceof e.a)) {
            dVar = i.f62809d.g(dVar);
        }
        hq.d dVarM0 = dVar.m0();
        if (!(dVar2 instanceof e.a) && gq.h.i(i.f62809d.e(dVarM0))) {
            dVar2 = gq.h.f62794d.g(dVar2);
        }
        hq.d dVarM02 = dVar2.m0();
        C0914a c0914a = null;
        h hVar = null;
        for (h hVar2 = this.f76632b.get(dVarM0); hVar2 != null; hVar2 = hVar2.f76646c) {
            hVar = hVar2;
        }
        h hVar3 = new h(dVarM0, dVarM02, c0914a);
        this.f76631a.add(hVar3);
        if (hVar != null) {
            hVar.f76646c = hVar3;
        } else {
            this.f76632b.put(dVarM0, hVar3);
        }
    }

    public void e(String str, String str2) throws IllegalArgumentException {
        if (str2 == null) {
            return;
        }
        d(i.f62809d.h(str), k(str2));
    }

    public void f(gq.g gVar) {
        g(gVar.d(), gVar.f(), gVar.b(), gVar.e(), gVar.c(), gVar.a(), gVar.i(), gVar.h(), gVar.g());
    }

    public void g(String str, String str2, String str3, String str4, long j10, String str5, boolean z10, boolean z11, int i10) {
        boolean z12;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Bad cookie name");
        }
        StringBuilder sb2 = new StringBuilder(128);
        m.d(sb2, str, "\"\\\n\r\t\f\b%+ ;=");
        sb2.append(G5.T);
        String string = sb2.toString();
        if (str2 != null && str2.length() > 0) {
            m.d(sb2, str2, "\"\\\n\r\t\f\b%+ ;=");
        }
        if (str5 != null && str5.length() > 0) {
            sb2.append(";Comment=");
            m.d(sb2, str5, "\"\\\n\r\t\f\b%+ ;=");
        }
        boolean z13 = true;
        if (str4 == null || str4.length() <= 0) {
            z12 = false;
        } else {
            sb2.append(";Path=");
            if (str4.trim().startsWith("\"")) {
                sb2.append(str4);
            } else {
                m.d(sb2, str4, "\"\\\n\r\t\f\b%+ ;=");
            }
            z12 = true;
        }
        if (str3 == null || str3.length() <= 0) {
            z13 = false;
        } else {
            sb2.append(";Domain=");
            m.d(sb2, str3.toLowerCase(Locale.ENGLISH), "\"\\\n\r\t\f\b%+ ;=");
        }
        if (j10 >= 0) {
            sb2.append(";Expires=");
            if (j10 == 0) {
                sb2.append(f76625m);
            } else {
                m(sb2, System.currentTimeMillis() + (1000 * j10));
            }
            if (i10 > 0) {
                sb2.append(";Max-Age=");
                sb2.append(j10);
            }
        }
        if (z10) {
            sb2.append(";Secure");
        }
        if (z11) {
            sb2.append(";HttpOnly");
        }
        String string2 = sb2.toString();
        h hVar = null;
        for (h hVarS = s("Set-Cookie"); hVarS != null; hVarS = hVarS.f76646c) {
            String string3 = hVarS.f76645b == null ? null : hVarS.f76645b.toString();
            if (string3 != null && string3.startsWith(string)) {
                if (z13 || string3.contains("Domain")) {
                    if (z13) {
                        if (!string3.contains("Domain=" + str3)) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (z12 || string3.contains("Path")) {
                    if (z12) {
                        if (string3.contains("Path=" + str4)) {
                        }
                    } else {
                        continue;
                    }
                }
                this.f76631a.remove(hVarS);
                if (hVar == null) {
                    this.f76632b.put(i.f62820i0, hVarS.f76646c);
                } else {
                    hVar.f76646c = hVarS.f76646c;
                }
                d(i.f62820i0, new hq.h(string2));
                B(i.A, f76624l);
            }
            hVar = hVarS;
        }
        d(i.f62820i0, new hq.h(string2));
        B(i.A, f76624l);
    }

    public void h() {
        this.f76631a.clear();
        this.f76632b.clear();
    }

    public boolean i(hq.d dVar) {
        return this.f76632b.containsKey(i.f62809d.g(dVar));
    }

    public boolean j(String str) {
        return this.f76632b.containsKey(i.f62809d.h(str));
    }

    public final hq.d k(String str) {
        hq.d dVar = f76626n.get(str);
        if (dVar != null) {
            return dVar;
        }
        try {
            hq.h hVar = new hq.h(str, "ISO-8859-1");
            if (f76627o <= 0) {
                return hVar;
            }
            if (f76626n.size() > f76627o) {
                f76626n.clear();
            }
            hq.d dVarPutIfAbsent = f76626n.putIfAbsent(str, hVar);
            return dVarPutIfAbsent != null ? dVarPutIfAbsent : hVar;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public hq.d o(hq.d dVar) {
        h hVarR = r(dVar);
        if (hVarR == null) {
            return null;
        }
        return hVarR.f76645b;
    }

    public long p(String str) {
        String strL;
        h hVarS = s(str);
        if (hVarS == null || (strL = L(hq.g.f(hVarS.f76645b), null)) == null) {
            return -1L;
        }
        long jA = f76622j.get().a(strL);
        if (jA != -1) {
            return jA;
        }
        throw new IllegalArgumentException("Cannot convert date: " + strL);
    }

    public h q(int i10) {
        return this.f76631a.get(i10);
    }

    public final h r(hq.d dVar) {
        return this.f76632b.get(i.f62809d.g(dVar));
    }

    public final h s(String str) {
        return this.f76632b.get(i.f62809d.h(str));
    }

    public Enumeration<String> t() {
        return new c(Collections.enumeration(this.f76632b.keySet()));
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < this.f76631a.size(); i10++) {
                h hVar = this.f76631a.get(i10);
                if (hVar != null) {
                    String strF = hVar.f();
                    if (strF != null) {
                        stringBuffer.append(strF);
                    }
                    stringBuffer.append(": ");
                    String strH = hVar.h();
                    if (strH != null) {
                        stringBuffer.append(strH);
                    }
                    stringBuffer.append("\r\n");
                }
            }
            stringBuffer.append("\r\n");
            return stringBuffer.toString();
        } catch (Exception e10) {
            f76615c.e(e10);
            return e10.toString();
        }
    }

    public Collection<String> u() {
        ArrayList arrayList = new ArrayList(this.f76631a.size());
        for (h hVar : this.f76631a) {
            if (hVar != null) {
                arrayList.add(hq.g.f(hVar.f76644a));
            }
        }
        return arrayList;
    }

    public long v(hq.d dVar) throws NumberFormatException {
        h hVarR = r(dVar);
        if (hVarR == null) {
            return -1L;
        }
        return hVarR.e();
    }

    public String w(hq.d dVar) {
        h hVarR = r(dVar);
        if (hVarR == null) {
            return null;
        }
        return hVarR.h();
    }

    public String x(String str) {
        h hVarS = s(str);
        if (hVarS == null) {
            return null;
        }
        return hVarS.h();
    }

    public Enumeration<String> y(hq.d dVar) {
        h hVarR = r(dVar);
        return hVarR == null ? Collections.enumeration(Collections.emptyList()) : new e(hVarR);
    }

    public Enumeration<String> z(String str) {
        h hVarS = s(str);
        return hVarS == null ? Collections.enumeration(Collections.emptyList()) : new d(hVarS);
    }
}
