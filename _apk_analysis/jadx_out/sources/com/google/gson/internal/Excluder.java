package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import e8.b;
import e8.c;
import e8.o;
import e8.p;
import f8.d;
import f8.e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Excluder implements p, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Excluder f23498h = new Excluder();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23502e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23499b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23500c = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23501d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<b> f23503f = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<b> f23504g = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o<T> f23505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f23506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f23507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Gson f23508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j8.a f23509e;

        public a(boolean z10, boolean z11, Gson gson, j8.a aVar) {
            this.f23506b = z10;
            this.f23507c = z11;
            this.f23508d = gson;
            this.f23509e = aVar;
        }

        @Override // e8.o
        public T b(JsonReader jsonReader) throws IOException {
            if (!this.f23506b) {
                return e().b(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }

        @Override // e8.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (this.f23507c) {
                jsonWriter.nullValue();
            } else {
                e().d(jsonWriter, t10);
            }
        }

        public final o<T> e() {
            o<T> oVar = this.f23505a;
            if (oVar != null) {
                return oVar;
            }
            o<T> delegateAdapter = this.f23508d.getDelegateAdapter(Excluder.this, this.f23509e);
            this.f23505a = delegateAdapter;
            return delegateAdapter;
        }
    }

    @Override // e8.p
    public <T> o<T> a(Gson gson, j8.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zE = e(clsC);
        boolean z10 = zE || f(clsC, true);
        boolean z11 = zE || f(clsC, false);
        if (z10 || z11) {
            return new a(z11, z10, gson, aVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public Excluder c() {
        Excluder excluderClone = clone();
        excluderClone.f23501d = false;
        return excluderClone;
    }

    public boolean d(Class<?> cls, boolean z10) {
        return e(cls) || f(cls, z10);
    }

    public final boolean e(Class<?> cls) {
        if (this.f23499b == -1.0d || o((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f23501d && k(cls)) || j(cls);
        }
        return true;
    }

    public final boolean f(Class<?> cls, boolean z10) {
        Iterator<b> it = (z10 ? this.f23503f : this.f23504g).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z10) {
        f8.a aVar;
        if ((this.f23500c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f23499b != -1.0d && !o((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f23502e && ((aVar = (f8.a) field.getAnnotation(f8.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f23501d && k(field.getType())) || j(field.getType())) {
            return true;
        }
        List<b> list = z10 ? this.f23503f : this.f23504g;
        if (list.isEmpty()) {
            return false;
        }
        c cVar = new c(field);
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(cVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder i() {
        Excluder excluderClone = clone();
        excluderClone.f23502e = true;
        return excluderClone;
    }

    public final boolean j(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean k(Class<?> cls) {
        return cls.isMemberClass() && !l(cls);
    }

    public final boolean l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean m(d dVar) {
        return dVar == null || dVar.value() <= this.f23499b;
    }

    public final boolean n(e eVar) {
        return eVar == null || eVar.value() > this.f23499b;
    }

    public final boolean o(d dVar, e eVar) {
        return m(dVar) && n(eVar);
    }

    public Excluder p(b bVar, boolean z10, boolean z11) {
        Excluder excluderClone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f23503f);
            excluderClone.f23503f = arrayList;
            arrayList.add(bVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f23504g);
            excluderClone.f23504g = arrayList2;
            arrayList2.add(bVar);
        }
        return excluderClone;
    }

    public Excluder q(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f23500c = 0;
        for (int i10 : iArr) {
            excluderClone.f23500c = i10 | excluderClone.f23500c;
        }
        return excluderClone;
    }

    public Excluder r(double d10) {
        Excluder excluderClone = clone();
        excluderClone.f23499b = d10;
        return excluderClone;
    }
}
