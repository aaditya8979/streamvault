package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import e8.f;
import e8.g;
import e8.h;
import e8.m;
import e8.n;
import e8.o;
import e8.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class TreeTypeAdapter<T> extends o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<T> f23567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<T> f23568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f23569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.a<T> f23570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f23571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f23572f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o<T> f23573g;

    public static final class SingleTypeFactory implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j8.a<?> f23574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Class<?> f23576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n<?> f23577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final g<?> f23578f;

        public SingleTypeFactory(Object obj, j8.a<?> aVar, boolean z10, Class<?> cls) {
            n<?> nVar = obj instanceof n ? (n) obj : null;
            this.f23577e = nVar;
            g<?> gVar = obj instanceof g ? (g) obj : null;
            this.f23578f = gVar;
            g8.a.a((nVar == null && gVar == null) ? false : true);
            this.f23574b = aVar;
            this.f23575c = z10;
            this.f23576d = cls;
        }

        @Override // e8.p
        public <T> o<T> a(Gson gson, j8.a<T> aVar) {
            j8.a<?> aVar2 = this.f23574b;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f23575c && this.f23574b.getType() == aVar.c()) : this.f23576d.isAssignableFrom(aVar.c())) {
                return new TreeTypeAdapter(this.f23577e, this.f23578f, gson, aVar, this);
            }
            return null;
        }
    }

    public final class b implements m, f {
        public b() {
        }
    }

    public TreeTypeAdapter(n<T> nVar, g<T> gVar, Gson gson, j8.a<T> aVar, p pVar) {
        this.f23567a = nVar;
        this.f23568b = gVar;
        this.f23569c = gson;
        this.f23570d = aVar;
        this.f23571e = pVar;
    }

    public static p f(j8.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.getType() == aVar.c(), null);
    }

    public static p g(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // e8.o
    public T b(JsonReader jsonReader) throws IOException {
        if (this.f23568b == null) {
            return e().b(jsonReader);
        }
        h hVarA = g8.h.a(jsonReader);
        if (hVarA.i()) {
            return null;
        }
        return this.f23568b.a(hVarA, this.f23570d.getType(), this.f23572f);
    }

    @Override // e8.o
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        n<T> nVar = this.f23567a;
        if (nVar == null) {
            e().d(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            g8.h.b(nVar.a(t10, this.f23570d.getType(), this.f23572f), jsonWriter);
        }
    }

    public final o<T> e() {
        o<T> oVar = this.f23573g;
        if (oVar != null) {
            return oVar;
        }
        o<T> delegateAdapter = this.f23569c.getDelegateAdapter(this.f23571e, this.f23570d);
        this.f23573g = delegateAdapter;
        return delegateAdapter;
    }
}
