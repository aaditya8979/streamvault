package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4035g7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.ironsource.g7$a */
    public static final class a<T> implements wn.d<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private WeakReference<T> f31783a;

        public a(T t10) {
            this.f31783a = new WeakReference<>(t10);
        }

        @NotNull
        public final WeakReference<T> a() {
            return this.f31783a;
        }

        public final void a(@NotNull WeakReference<T> weakReference) {
            tn.p.k(weakReference, "<set-?>");
            this.f31783a = weakReference;
        }

        @Override // wn.d
        @Nullable
        public T getValue(@NotNull Object obj, @NotNull KProperty<?> kProperty) {
            tn.p.k(obj, "thisRef");
            tn.p.k(kProperty, "property");
            return this.f31783a.get();
        }

        @Override // wn.d
        public void setValue(@NotNull Object obj, @NotNull KProperty<?> kProperty, @Nullable T t10) {
            tn.p.k(obj, "thisRef");
            tn.p.k(kProperty, "property");
            this.f31783a = new WeakReference<>(t10);
        }
    }

    @NotNull
    public static final <T> wn.d<Object, T> a(@Nullable T t10) {
        return new a(t10);
    }

    public static /* synthetic */ wn.d a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }
}
