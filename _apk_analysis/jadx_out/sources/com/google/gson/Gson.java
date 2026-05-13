package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import e8.h;
import e8.i;
import e8.o;
import e8.p;
import g8.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes7.dex */
public final class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_LENIENT = false;
    public static final boolean DEFAULT_PRETTY_PRINT = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final j8.a<?> NULL_KEY_SURROGATE = j8.a.a(Object.class);
    public final List<p> builderFactories;
    public final List<p> builderHierarchyFactories;
    private final ThreadLocal<Map<j8.a<?>, f<?>>> calls;
    public final boolean complexMapKeySerialization;
    private final g8.b constructorConstructor;
    public final String datePattern;
    public final int dateStyle;
    public final Excluder excluder;
    public final List<p> factories;
    public final FieldNamingStrategy fieldNamingStrategy;
    public final boolean generateNonExecutableJson;
    public final boolean htmlSafe;
    public final Map<Type, e8.d<?>> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    public final boolean lenient;
    public final LongSerializationPolicy longSerializationPolicy;
    public final boolean prettyPrinting;
    public final boolean serializeNulls;
    public final boolean serializeSpecialFloatingPointValues;
    public final int timeStyle;
    private final Map<j8.a<?>, o<?>> typeTokenCache;

    public class a extends o<Number> {
        public a() {
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number.doubleValue());
                jsonWriter.value(number);
            }
        }
    }

    public class b extends o<Number> {
        public b() {
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number.floatValue());
                jsonWriter.value(number);
            }
        }
    }

    public static class c extends o<Number> {
        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    public static class d extends o<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f23493a;

        public d(o oVar) {
            this.f23493a = oVar;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f23493a.b(jsonReader)).longValue());
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f23493a.d(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    public static class e extends o<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f23494a;

        public e(o oVar) {
            this.f23494a = oVar;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f23494a.b(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f23494a.d(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    public static class f<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o<T> f23495a;

        @Override // e8.o
        public T b(JsonReader jsonReader) throws IOException {
            o<T> oVar = this.f23495a;
            if (oVar != null) {
                return oVar.b(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // e8.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            o<T> oVar = this.f23495a;
            if (oVar == null) {
                throw new IllegalStateException();
            }
            oVar.d(jsonWriter, t10);
        }

        public void e(o<T> oVar) {
            if (this.f23495a != null) {
                throw new AssertionError();
            }
            this.f23495a = oVar;
        }
    }

    public Gson() {
        this(Excluder.f23498h, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, e8.d<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, LongSerializationPolicy longSerializationPolicy, String str, int i10, int i11, List<p> list, List<p> list2, List<p> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        g8.b bVar = new g8.b(map);
        this.constructorConstructor = bVar;
        this.serializeNulls = z10;
        this.complexMapKeySerialization = z11;
        this.generateNonExecutableJson = z12;
        this.htmlSafe = z13;
        this.prettyPrinting = z14;
        this.lenient = z15;
        this.serializeSpecialFloatingPointValues = z16;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i10;
        this.timeStyle = i11;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f23543b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f23592m);
        arrayList.add(TypeAdapters.f23586g);
        arrayList.add(TypeAdapters.f23588i);
        arrayList.add(TypeAdapters.f23590k);
        o<Number> oVarLongAdapter = longAdapter(longSerializationPolicy);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, oVarLongAdapter));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, doubleAdapter(z16)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, floatAdapter(z16)));
        arrayList.add(TypeAdapters.f23603x);
        arrayList.add(TypeAdapters.f23594o);
        arrayList.add(TypeAdapters.f23596q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, atomicLongAdapter(oVarLongAdapter)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, atomicLongArrayAdapter(oVarLongAdapter)));
        arrayList.add(TypeAdapters.f23598s);
        arrayList.add(TypeAdapters.f23605z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f23583d);
        arrayList.add(DateTypeAdapter.f23534b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f23565b);
        arrayList.add(SqlDateTypeAdapter.f23563b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f23528c);
        arrayList.add(TypeAdapters.f23581b);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static o<AtomicLong> atomicLongAdapter(o<Number> oVar) {
        return new d(oVar).a();
    }

    private static o<AtomicLongArray> atomicLongArrayAdapter(o<Number> oVar) {
        return new e(oVar).a();
    }

    public static void checkValidFloatingPoint(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private o<Number> doubleAdapter(boolean z10) {
        return z10 ? TypeAdapters.f23601v : new a();
    }

    private o<Number> floatAdapter(boolean z10) {
        return z10 ? TypeAdapters.f23600u : new b();
    }

    private static o<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.f23599t : new c();
    }

    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z10 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z10 = false;
                    T tB = getAdapter(j8.a.b(type)).b(jsonReader);
                    jsonReader.setLenient(zIsLenient);
                    return tB;
                } catch (IOException e10) {
                    throw new JsonSyntaxException(e10);
                } catch (IllegalStateException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (EOFException e12) {
                if (!z10) {
                    throw new JsonSyntaxException(e12);
                }
                jsonReader.setLenient(zIsLenient);
                return null;
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e13.getMessage(), e13);
            }
        } catch (Throwable th2) {
            jsonReader.setLenient(zIsLenient);
            throw th2;
        }
    }

    public <T> T fromJson(h hVar, Class<T> cls) throws JsonSyntaxException {
        return (T) g.c(cls).cast(fromJson(hVar, (Type) cls));
    }

    public <T> T fromJson(h hVar, Type type) throws JsonSyntaxException {
        if (hVar == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.a(hVar), type);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        Object objFromJson = fromJson(jsonReaderNewJsonReader, cls);
        assertFullConsumption(objFromJson, jsonReaderNewJsonReader);
        return (T) g.c(cls).cast(objFromJson);
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t10 = (T) fromJson(jsonReaderNewJsonReader, type);
        assertFullConsumption(t10, jsonReaderNewJsonReader);
        return t10;
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) g.c(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public <T> o<T> getAdapter(j8.a<T> aVar) {
        o<T> oVar = (o) this.typeTokenCache.get(aVar == null ? NULL_KEY_SURROGATE : aVar);
        if (oVar != null) {
            return oVar;
        }
        Map<j8.a<?>, f<?>> map = this.calls.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<p> it = this.factories.iterator();
            while (it.hasNext()) {
                o<T> oVarA = it.next().a(this, aVar);
                if (oVarA != null) {
                    fVar2.e(oVarA);
                    this.typeTokenCache.put(aVar, oVarA);
                    return oVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.calls.remove();
            }
        }
    }

    public <T> o<T> getAdapter(Class<T> cls) {
        return getAdapter(j8.a.a(cls));
    }

    public <T> o<T> getDelegateAdapter(p pVar, j8.a<T> aVar) {
        if (!this.factories.contains(pVar)) {
            pVar = this.jsonAdapterFactory;
        }
        boolean z10 = false;
        for (p pVar2 : this.factories) {
            if (z10) {
                o<T> oVarA = pVar2.a(this, aVar);
                if (oVarA != null) {
                    return oVarA;
                }
            } else if (pVar2 == pVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toJson(h hVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(hVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((h) i.f60935b) : toJson(obj, obj.getClass());
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void toJson(h hVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                g8.h.b(hVar, jsonWriter);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void toJson(h hVar, Appendable appendable) throws JsonIOException {
        try {
            toJson(hVar, newJsonWriter(g8.h.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((h) i.f60935b, appendable);
        }
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        o adapter = getAdapter(j8.a.b(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                adapter.d(jsonWriter, obj);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(g8.h.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public h toJsonTree(Object obj) {
        return obj == null ? i.f60935b : toJsonTree(obj, obj.getClass());
    }

    public h toJsonTree(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        toJson(obj, type, bVar);
        return bVar.d();
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
