package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import e8.o;
import e8.p;
import g8.e;
import g8.g;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f23546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FieldNamingStrategy f23547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Excluder f23548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f23549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i8.b f23550f = i8.b.a();

    public class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Field f23551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f23552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f23553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Gson f23554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ j8.a f23555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f23556i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, boolean z11, Field field, boolean z12, o oVar, Gson gson, j8.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f23551d = field;
            this.f23552e = z12;
            this.f23553f = oVar;
            this.f23554g = gson;
            this.f23555h = aVar;
            this.f23556i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public void a(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object objB = this.f23553f.b(jsonReader);
            if (objB == null && this.f23556i) {
                return;
            }
            this.f23551d.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public void b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            (this.f23552e ? this.f23553f : new com.google.gson.internal.bind.c(this.f23554g, this.f23553f, this.f23555h.getType())).d(jsonWriter, this.f23551d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public boolean c(Object obj) throws IllegalAccessException, IOException {
            return this.f23561b && this.f23551d.get(obj) != obj;
        }
    }

    public static final class b<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e<T> f23558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, c> f23559b;

        public b(e<T> eVar, Map<String, c> map) {
            this.f23558a = eVar;
            this.f23559b = map;
        }

        @Override // e8.o
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tA = this.f23558a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c cVar = this.f23559b.get(jsonReader.nextName());
                    if (cVar == null || !cVar.f23562c) {
                        jsonReader.skipValue();
                    } else {
                        cVar.a(jsonReader, tA);
                    }
                }
                jsonReader.endObject();
                return tA;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // e8.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (c cVar : this.f23559b.values()) {
                    if (cVar.c(t10)) {
                        jsonWriter.name(cVar.f23560a);
                        cVar.b(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23562c;

        public c(String str, boolean z10, boolean z11) {
            this.f23560a = str;
            this.f23561b = z10;
            this.f23562c = z11;
        }

        public abstract void a(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean c(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(g8.b bVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f23546b = bVar;
        this.f23547c = fieldNamingStrategy;
        this.f23548d = excluder;
        this.f23549e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public static boolean d(Field field, boolean z10, Excluder excluder) {
        return (excluder.d(field.getType(), z10) || excluder.g(field, z10)) ? false : true;
    }

    @Override // e8.p
    public <T> o<T> a(Gson gson, j8.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (Object.class.isAssignableFrom(clsC)) {
            return new b(this.f23546b.a(aVar), e(gson, aVar, clsC));
        }
        return null;
    }

    public final c b(Gson gson, Field field, String str, j8.a<?> aVar, boolean z10, boolean z11) {
        boolean zB = g.b(aVar.c());
        f8.b bVar = (f8.b) field.getAnnotation(f8.b.class);
        o<?> oVarB = bVar != null ? this.f23549e.b(this.f23546b, gson, aVar, bVar) : null;
        boolean z12 = oVarB != null;
        if (oVarB == null) {
            oVarB = gson.getAdapter(aVar);
        }
        return new a(str, z10, z11, field, z12, oVarB, gson, aVar, zB);
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f23548d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Map<String, c> e(Gson gson, j8.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        j8.a<?> aVarB = aVar;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z10);
                if (zC || zC2) {
                    this.f23550f.b(field);
                    Type typeP = C$Gson$Types.p(aVarB.getType(), clsC, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    ?? r22 = z10;
                    while (r22 < size) {
                        String str = listF.get(r22);
                        boolean z11 = r22 != 0 ? z10 : zC;
                        ?? r20 = r22;
                        c cVar2 = cVar;
                        int i11 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(gson, field, str, j8.a.b(typeP), z11, zC2)) : cVar2;
                        zC = z11;
                        listF = list;
                        size = i11;
                        field = field2;
                        z10 = false;
                        r22 = (r20 == true ? 1 : 0) + 1;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f23560a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVarB = j8.a.b(C$Gson$Types.p(aVarB.getType(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        f8.c cVar = (f8.c) field.getAnnotation(f8.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f23547c.translateName(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
