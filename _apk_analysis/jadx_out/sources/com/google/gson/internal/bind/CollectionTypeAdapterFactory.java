package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import e8.o;
import e8.p;
import g8.e;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f23531b;

    public static final class a<E> extends o<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o<E> f23532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e<? extends Collection<E>> f23533b;

        public a(Gson gson, Type type, o<E> oVar, e<? extends Collection<E>> eVar) {
            this.f23532a = new c(gson, oVar, type);
            this.f23533b = eVar;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionA = this.f23533b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionA.add(this.f23532a.b(jsonReader));
            }
            jsonReader.endArray();
            return collectionA;
        }

        @Override // e8.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f23532a.d(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(g8.b bVar) {
        this.f23531b = bVar;
    }

    @Override // e8.p
    public <T> o<T> a(Gson gson, j8.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = C$Gson$Types.h(type, clsC);
        return new a(gson, typeH, gson.getAdapter(j8.a.b(typeH)), this.f23531b.a(aVar));
    }
}
