package com.google.gson.internal.bind;

import com.google.gson.Gson;
import e8.g;
import e8.n;
import e8.o;
import e8.p;

/* JADX INFO: loaded from: classes11.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f23536b;

    public JsonAdapterAnnotationTypeAdapterFactory(g8.b bVar) {
        this.f23536b = bVar;
    }

    @Override // e8.p
    public <T> o<T> a(Gson gson, j8.a<T> aVar) {
        f8.b bVar = (f8.b) aVar.c().getAnnotation(f8.b.class);
        if (bVar == null) {
            return null;
        }
        return (o<T>) b(this.f23536b, gson, aVar, bVar);
    }

    public o<?> b(g8.b bVar, Gson gson, j8.a<?> aVar, f8.b bVar2) {
        o<?> treeTypeAdapter;
        Object objA = bVar.a(j8.a.a(bVar2.value())).a();
        if (objA instanceof o) {
            treeTypeAdapter = (o) objA;
        } else if (objA instanceof p) {
            treeTypeAdapter = ((p) objA).a(gson, aVar);
        } else {
            boolean z10 = objA instanceof n;
            if (!z10 && !(objA instanceof g)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (n) objA : null, objA instanceof g ? (g) objA : null, gson, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar2.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }
}
