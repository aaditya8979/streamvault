package com.google.android.exoplayer.source.smoothstreaming.manifest;

import a6.k0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer.upstream.g;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q4.j;
import q4.m;

/* JADX INFO: loaded from: classes5.dex */
public class SsManifestParser implements g.a<com.google.android.exoplayer.source.smoothstreaming.manifest.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f20702a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final a f20705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Pair<String, Object>> f20706d = new LinkedList();

        public a(@Nullable a aVar, String str, String str2) {
            this.f20705c = aVar;
            this.f20703a = str;
            this.f20704b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        @Nullable
        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f20706d.size(); i10++) {
                Pair<String, Object> pair = this.f20706d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f20705c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new c(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new b(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f20704b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f20703a);
                            if (aVarE == null) {
                                i10 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw new ParserException(e10);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        public abstract void n(XmlPullParser xmlPullParser) throws ParserException;

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, @Nullable Object obj) {
            this.f20706d.add(Pair.create(str, obj));
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public UUID f20708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f20709g;

        public b(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static m[] q(byte[] bArr) {
            return new m[]{new m(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f20708f;
            return new a.C0293a(uuid, j.a(uuid, this.f20709g), q(this.f20709g));
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20707e = false;
            }
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f20707e = true;
                this.f20708f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f20707e) {
                this.f20709g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Format f20710e;

        public c(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrC = k0.C(str);
                byte[][] bArrM = a6.d.m(bArrC);
                if (bArrM == null) {
                    arrayList.add(bArrC);
                } else {
                    Collections.addAll(arrayList, bArrM);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f20710e;
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            int i10;
            int i11;
            int iIntValue = ((Integer) c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            String str = (String) c("Name");
            int iK = k(xmlPullParser, "Bitrate");
            String strR = r(m(xmlPullParser, "FourCC"));
            if (iIntValue == 2) {
                this.f20710e = Format.B(attributeValue, str, "video/mp4", strR, null, null, iK, k(xmlPullParser, "MaxWidth"), k(xmlPullParser, "MaxHeight"), -1.0f, q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0, 0);
                return;
            }
            if (iIntValue == 1) {
                if (strR == null) {
                    strR = "audio/mp4a-latm";
                }
                int iK2 = k(xmlPullParser, "Channels");
                int iK3 = k(xmlPullParser, "SamplingRate");
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listQ.isEmpty() && "audio/mp4a-latm".equals(strR)) {
                    listQ = Collections.singletonList(a6.d.b(iK3, iK2));
                }
                this.f20710e = Format.n(attributeValue, str, "audio/mp4", strR, null, null, iK, iK2, iK3, listQ, 0, 0, (String) c("Language"));
                return;
            }
            if (iIntValue != 3) {
                this.f20710e = Format.r(attributeValue, str, "application/mp4", strR, null, iK, 0, 0, null);
                return;
            }
            String str2 = (String) c("Subtype");
            str2.hashCode();
            if (str2.equals("CAPT")) {
                i10 = 64;
            } else {
                if (!str2.equals("DESC")) {
                    i11 = 0;
                    this.f20710e = Format.v(attributeValue, str, "application/mp4", strR, null, iK, 0, i11, (String) c("Language"));
                }
                i10 = 1024;
            }
            i11 = i10;
            this.f20710e = Format.v(attributeValue, str, "application/mp4", strR, null, iK, 0, i11, (String) c("Language"));
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<a.b> f20711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20714h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20715i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f20716j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20717k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20718l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public a.C0293a f20719m;

        public d(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f20717k = -1;
            this.f20719m = null;
            this.f20711e = new LinkedList();
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f20711e.add((a.b) obj);
            } else if (obj instanceof a.C0293a) {
                a6.a.f(this.f20719m == null);
                this.f20719m = (a.C0293a) obj;
            }
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f20711e.size();
            a.b[] bVarArr = new a.b[size];
            this.f20711e.toArray(bVarArr);
            if (this.f20719m != null) {
                a.C0293a c0293a = this.f20719m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0293a.f20742a, "video/mp4", c0293a.f20743b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f20745a;
                    if (i11 == 2 || i11 == 1) {
                        Format[] formatArr = bVar.f20754j;
                        for (int i12 = 0; i12 < formatArr.length; i12++) {
                            formatArr[i12] = formatArr[i12].e(drmInitData);
                        }
                    }
                }
            }
            return new com.google.android.exoplayer.source.smoothstreaming.manifest.a(this.f20712f, this.f20713g, this.f20714h, this.f20715i, this.f20716j, this.f20717k, this.f20718l, this.f20719m, bVarArr);
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            this.f20712f = k(xmlPullParser, "MajorVersion");
            this.f20713g = k(xmlPullParser, "MinorVersion");
            this.f20714h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f20715i = l(xmlPullParser, VastTagName.DURATION);
            this.f20716j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f20717k = i(xmlPullParser, "LookaheadCount", -1);
            this.f20718l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f20714h));
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<Format> f20721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20723h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20724i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f20725j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f20726k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20727l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f20728m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f20730o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f20731p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ArrayList<Long> f20732q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f20733r;

        public e(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f20720e = str;
            this.f20721f = new LinkedList();
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof Format) {
                this.f20721f.add((Format) obj);
            }
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            Format[] formatArr = new Format[this.f20721f.size()];
            this.f20721f.toArray(formatArr);
            return new a.b(this.f20720e, this.f20726k, this.f20722g, this.f20723h, this.f20724i, this.f20725j, this.f20727l, this.f20728m, this.f20729n, this.f20730o, this.f20731p, formatArr, this.f20732q, this.f20733r);
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.f20722g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.f20722g == 3) {
                this.f20723h = m(xmlPullParser, "Subtype");
            } else {
                this.f20723h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f20723h);
            this.f20725j = xmlPullParser.getAttributeValue(null, "Name");
            this.f20726k = m(xmlPullParser, "Url");
            this.f20727l = i(xmlPullParser, "MaxWidth", -1);
            this.f20728m = i(xmlPullParser, "MaxHeight", -1);
            this.f20729n = i(xmlPullParser, "DisplayWidth", -1);
            this.f20730o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f20731p = attributeValue;
            p("Language", attributeValue);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.f20724i = jI;
            if (jI == -1) {
                this.f20724i = ((Long) c("TimeScale")).longValue();
            }
            this.f20732q = new ArrayList<>();
        }

        public final void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f20732q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f20733r == -1) {
                        throw new ParserException("Unable to infer start time");
                    }
                    j10 = this.f20733r + this.f20732q.get(size - 1).longValue();
                }
            }
            this.f20732q.add(Long.valueOf(j10));
            this.f20733r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f20733r == -9223372036854775807L) {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f20732q.add(Long.valueOf((this.f20733r * j12) + j10));
                i10++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw new ParserException("Invalid key value[" + attributeValue + C3978d4.j.f31385e);
        }
    }

    public SsManifestParser() {
        try {
            this.f20702a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.g.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer.source.smoothstreaming.manifest.a parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f20702a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw new ParserException(e10);
        }
    }
}
