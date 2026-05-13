package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import e8.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c<T> extends o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f23636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<T> f23637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f23638c;

    public c(Gson gson, o<T> oVar, Type type) {
        this.f23636a = gson;
        this.f23637b = oVar;
        this.f23638c = type;
    }

    @Override // e8.o
    public T b(JsonReader jsonReader) throws IOException {
        return this.f23637b.b(jsonReader);
    }

    @Override // e8.o
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        o<T> adapter = this.f23637b;
        Type typeE = e(this.f23638c, t10);
        if (typeE != this.f23638c) {
            adapter = this.f23636a.getAdapter(j8.a.b(typeE));
            if (adapter instanceof ReflectiveTypeAdapterFactory.b) {
                o<T> oVar = this.f23637b;
                if (!(oVar instanceof ReflectiveTypeAdapterFactory.b)) {
                    adapter = oVar;
                }
            }
        }
        adapter.d(jsonWriter, t10);
    }

    public final Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
