package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import e8.o;
import e8.p;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends o<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f23528c = new p() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // e8.p
        public <T> o<T> a(Gson gson, j8.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = C$Gson$Types.g(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(j8.a.b(typeG)), C$Gson$Types.k(typeG));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<E> f23529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<E> f23530b;

    public ArrayTypeAdapter(Gson gson, o<E> oVar, Class<E> cls) {
        this.f23530b = new c(gson, oVar, cls);
        this.f23529a = cls;
    }

    @Override // e8.o
    public Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f23530b.b(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f23529a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // e8.o
    public void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f23530b.d(jsonWriter, (E) Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
