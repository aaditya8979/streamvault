package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ironsource.C3978d4;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final e8.o<String> A;
    public static final e8.o<BigDecimal> B;
    public static final e8.o<BigInteger> C;
    public static final e8.p D;
    public static final e8.o<StringBuilder> E;
    public static final e8.p F;
    public static final e8.o<StringBuffer> G;
    public static final e8.p H;
    public static final e8.o<URL> I;
    public static final e8.p J;
    public static final e8.o<URI> K;
    public static final e8.p L;
    public static final e8.o<InetAddress> M;
    public static final e8.p N;
    public static final e8.o<UUID> O;
    public static final e8.p P;
    public static final e8.o<Currency> Q;
    public static final e8.p R;
    public static final e8.p S;
    public static final e8.o<Calendar> T;
    public static final e8.p U;
    public static final e8.o<Locale> V;
    public static final e8.p W;
    public static final e8.o<e8.h> X;
    public static final e8.p Y;
    public static final e8.p Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8.o<Class> f23580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e8.p f23581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e8.o<BitSet> f23582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e8.p f23583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e8.o<Boolean> f23584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e8.o<Boolean> f23585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e8.p f23586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e8.o<Number> f23587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e8.p f23588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e8.o<Number> f23589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e8.p f23590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e8.o<Number> f23591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e8.p f23592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e8.o<AtomicInteger> f23593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e8.p f23594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e8.o<AtomicBoolean> f23595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e8.p f23596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e8.o<AtomicIntegerArray> f23597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e8.p f23598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e8.o<Number> f23599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e8.o<Number> f23600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e8.o<Number> f23601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e8.o<Number> f23602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e8.p f23603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e8.o<Character> f23604y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e8.p f23605z;

    public static class a extends e8.o<AtomicIntegerArray> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(atomicIntegerArray.get(i10));
            }
            jsonWriter.endArray();
        }
    }

    public static class a0 extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class b extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class b0 extends e8.o<AtomicInteger> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    public static class c extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class c0 extends e8.o<AtomicBoolean> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    public static class d extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static final class d0<T extends Enum<T>> extends e8.o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, T> f23622a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<T, String> f23623b = new HashMap();

        public d0(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String strName = t10.name();
                    f8.c cVar = (f8.c) cls.getField(strName).getAnnotation(f8.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f23622a.put(str, t10);
                        }
                    }
                    this.f23622a.put(strName, t10);
                    this.f23623b.put(t10, strName);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.f23622a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            jsonWriter.value(t10 == null ? null : this.f23623b.get(t10));
        }
    }

    public static class e extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i10 = v.f23624a[jsonTokenPeek.ordinal()];
            if (i10 == 1 || i10 == 3) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            if (i10 == 4) {
                jsonReader.nextNull();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek);
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class f extends e8.o<Character> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strNextString);
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Character ch2) throws IOException {
            jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public static class g extends e8.o<String> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    public static class h extends e8.o<BigDecimal> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    public static class i extends e8.o<BigInteger> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    public static class j extends e8.o<StringBuilder> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
            jsonWriter.value(sb2 == null ? null : sb2.toString());
        }
    }

    public static class k extends e8.o<Class> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public static class l extends e8.o<StringBuffer> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public static class m extends e8.o<URL> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if ("null".equals(strNextString)) {
                return null;
            }
            return new URL(strNextString);
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    public static class n extends e8.o<URI> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    public static class o extends e8.o<InetAddress> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public static class p extends e8.o<UUID> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    public static class q extends e8.o<Currency> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    public static class r extends e8.o<Calendar> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                int iNextInt = jsonReader.nextInt();
                if ("year".equals(strNextName)) {
                    i10 = iNextInt;
                } else if ("month".equals(strNextName)) {
                    i11 = iNextInt;
                } else if ("dayOfMonth".equals(strNextName)) {
                    i12 = iNextInt;
                } else if ("hourOfDay".equals(strNextName)) {
                    i13 = iNextInt;
                } else if ("minute".equals(strNextName)) {
                    i14 = iNextInt;
                } else if ("second".equals(strNextName)) {
                    i15 = iNextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }
    }

    public static class s extends e8.o<Locale> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    public static class t extends e8.o<e8.h> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e8.h b(JsonReader jsonReader) throws IOException {
            switch (v.f23624a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new e8.l(new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new e8.l(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new e8.l(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return e8.i.f60935b;
                case 5:
                    e8.e eVar = new e8.e();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        eVar.m(b(jsonReader));
                    }
                    jsonReader.endArray();
                    return eVar;
                case 6:
                    e8.j jVar = new e8.j();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jVar.m(jsonReader.nextName(), b(jsonReader));
                    }
                    jsonReader.endObject();
                    return jVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, e8.h hVar) throws IOException {
            if (hVar == null || hVar.i()) {
                jsonWriter.nullValue();
                return;
            }
            if (hVar.l()) {
                e8.l lVarG = hVar.g();
                if (lVarG.v()) {
                    jsonWriter.value(lVarG.r());
                    return;
                } else if (lVarG.t()) {
                    jsonWriter.value(lVarG.m());
                    return;
                } else {
                    jsonWriter.value(lVarG.s());
                    return;
                }
            }
            if (hVar.h()) {
                jsonWriter.beginArray();
                Iterator<e8.h> it = hVar.e().iterator();
                while (it.hasNext()) {
                    d(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (!hVar.j()) {
                throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
            }
            jsonWriter.beginObject();
            for (Map.Entry<String, e8.h> entry : hVar.f().entrySet()) {
                jsonWriter.name(entry.getKey());
                d(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
    }

    public static class u extends e8.o<BitSet> {
        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet b(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.beginArray()
                com.google.gson.stream.JsonToken r1 = r8.peek()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.v.f23624a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.nextBoolean()
                goto L69
            L63:
                int r1 = r8.nextInt()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r8.peek()
                goto Le
            L75:
                r8.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.u.b(com.google.gson.stream.JsonReader):java.util.BitSet");
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    public static /* synthetic */ class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23624a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23624a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23624a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23624a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23624a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23624a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23624a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23624a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23624a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23624a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23624a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class w extends e8.o<Boolean> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    public static class x extends e8.o<Boolean> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    }

    public static class y extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class z extends e8.o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    static {
        e8.o<Class> oVarA = new k().a();
        f23580a = oVarA;
        f23581b = b(Class.class, oVarA);
        e8.o<BitSet> oVarA2 = new u().a();
        f23582c = oVarA2;
        f23583d = b(BitSet.class, oVarA2);
        w wVar = new w();
        f23584e = wVar;
        f23585f = new x();
        f23586g = c(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f23587h = yVar;
        f23588i = c(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f23589j = zVar;
        f23590k = c(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f23591l = a0Var;
        f23592m = c(Integer.TYPE, Integer.class, a0Var);
        e8.o<AtomicInteger> oVarA3 = new b0().a();
        f23593n = oVarA3;
        f23594o = b(AtomicInteger.class, oVarA3);
        e8.o<AtomicBoolean> oVarA4 = new c0().a();
        f23595p = oVarA4;
        f23596q = b(AtomicBoolean.class, oVarA4);
        e8.o<AtomicIntegerArray> oVarA5 = new a().a();
        f23597r = oVarA5;
        f23598s = b(AtomicIntegerArray.class, oVarA5);
        f23599t = new b();
        f23600u = new c();
        f23601v = new d();
        e eVar = new e();
        f23602w = eVar;
        f23603x = b(Number.class, eVar);
        f fVar = new f();
        f23604y = fVar;
        f23605z = c(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = b(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        e8.o<Currency> oVarA6 = new q().a();
        Q = oVarA6;
        R = b(Currency.class, oVarA6);
        S = new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            public class a extends e8.o<Timestamp> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e8.o f23606a;

                public a(e8.o oVar) {
                    this.f23606a = oVar;
                }

                @Override // e8.o
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Timestamp b(JsonReader jsonReader) throws IOException {
                    Date date = (Date) this.f23606a.b(jsonReader);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // e8.o
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public void d(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    this.f23606a.d(jsonWriter, timestamp);
                }
            }

            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar) {
                if (aVar.c() != Timestamp.class) {
                    return null;
                }
                return new a(gson.getAdapter(Date.class));
            }
        };
        r rVar = new r();
        T = rVar;
        U = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = b(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = e(e8.h.class, tVar);
        Z = new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                    return null;
                }
                if (!clsC.isEnum()) {
                    clsC = clsC.getSuperclass();
                }
                return new d0(clsC);
            }
        };
    }

    public static <TT> e8.p a(final j8.a<TT> aVar, final e8.o<TT> oVar) {
        return new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return oVar;
                }
                return null;
            }
        };
    }

    public static <TT> e8.p b(final Class<TT> cls, final e8.o<TT> oVar) {
        return new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar) {
                if (aVar.c() == cls) {
                    return oVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + oVar + C3978d4.j.f31385e;
            }
        };
    }

    public static <TT> e8.p c(final Class<TT> cls, final Class<TT> cls2, final e8.o<? super TT> oVar) {
        return new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return oVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + oVar + C3978d4.j.f31385e;
            }
        };
    }

    public static <TT> e8.p d(final Class<TT> cls, final Class<? extends TT> cls2, final e8.o<? super TT> oVar) {
        return new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // e8.p
            public <T> e8.o<T> a(Gson gson, j8.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return oVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + oVar + C3978d4.j.f31385e;
            }
        };
    }

    public static <T1> e8.p e(final Class<T1> cls, final e8.o<T1> oVar) {
        return new e8.p() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            public class a<T1> extends e8.o<T1> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Class f23620a;

                public a(Class cls) {
                    this.f23620a = cls;
                }

                @Override // e8.o
                public T1 b(JsonReader jsonReader) throws IOException {
                    T1 t12 = (T1) oVar.b(jsonReader);
                    if (t12 == null || this.f23620a.isInstance(t12)) {
                        return t12;
                    }
                    throw new JsonSyntaxException("Expected a " + this.f23620a.getName() + " but was " + t12.getClass().getName());
                }

                @Override // e8.o
                public void d(JsonWriter jsonWriter, T1 t12) throws IOException {
                    oVar.d(jsonWriter, t12);
                }
            }

            @Override // e8.p
            public <T2> e8.o<T2> a(Gson gson, j8.a<T2> aVar) {
                Class<? super T2> clsC = aVar.c();
                if (cls.isAssignableFrom(clsC)) {
                    return new a(clsC);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + oVar + C3978d4.j.f31385e;
            }
        };
    }
}
