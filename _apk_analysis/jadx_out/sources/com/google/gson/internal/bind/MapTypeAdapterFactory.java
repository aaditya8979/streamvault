package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import e8.h;
import e8.l;
import e8.o;
import e8.p;
import g8.d;
import g8.e;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23538c;

    public final class a<K, V> extends o<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o<K> f23539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o<V> f23540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<? extends Map<K, V>> f23541c;

        public a(Gson gson, Type type, o<K> oVar, Type type2, o<V> oVar2, e<? extends Map<K, V>> eVar) {
            this.f23539a = new c(gson, oVar, type);
            this.f23540b = new c(gson, oVar2, type2);
            this.f23541c = eVar;
        }

        public final String e(h hVar) {
            if (!hVar.l()) {
                if (hVar.i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            l lVarG = hVar.g();
            if (lVarG.v()) {
                return String.valueOf(lVarG.r());
            }
            if (lVarG.t()) {
                return Boolean.toString(lVarG.m());
            }
            if (lVarG.x()) {
                return lVarG.s();
            }
            throw new AssertionError();
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapA = this.f23541c.a();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K kB = this.f23539a.b(jsonReader);
                    if (mapA.put(kB, this.f23540b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB);
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    d.INSTANCE.promoteNameToValue(jsonReader);
                    K kB2 = this.f23539a.b(jsonReader);
                    if (mapA.put(kB2, this.f23540b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB2);
                    }
                }
                jsonReader.endObject();
            }
            return mapA;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f23538c) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f23540b.d(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                h hVarC = this.f23539a.c(entry2.getKey());
                arrayList.add(hVarC);
                arrayList2.add(entry2.getValue());
                z10 |= hVarC.h() || hVarC.j();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(e((h) arrayList.get(i10)));
                    this.f23540b.d(jsonWriter, (V) arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                g8.h.b((h) arrayList.get(i10), jsonWriter);
                this.f23540b.d(jsonWriter, (V) arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(g8.b bVar, boolean z10) {
        this.f23537b = bVar;
        this.f23538c = z10;
    }

    @Override // e8.p
    public <T> o<T> a(Gson gson, j8.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = C$Gson$Types.j(type, C$Gson$Types.k(type));
        return new a(gson, typeArrJ[0], b(gson, typeArrJ[0]), typeArrJ[1], gson.getAdapter(j8.a.b(typeArrJ[1])), this.f23537b.a(aVar));
    }

    public final o<?> b(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f23585f : gson.getAdapter(j8.a.b(type));
    }
}
