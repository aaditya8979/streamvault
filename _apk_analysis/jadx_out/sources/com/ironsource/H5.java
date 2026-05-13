package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface H5<T> {

    public static final class a<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f29502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f29503b;

        public a(@NotNull ArrayList<T> arrayList, @NotNull ArrayList<T> arrayList2) {
            tn.p.k(arrayList, "a");
            tn.p.k(arrayList2, "b");
            this.f29502a = arrayList;
            this.f29503b = arrayList2;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f29502a.contains(t10) || this.f29503b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f29502a.size() + this.f29503b.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return cn.f0.O0(this.f29502a, this.f29503b);
        }
    }

    public static final class b<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final H5<T> f29504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Comparator<T> f29505b;

        public b(@NotNull H5<T> h52, @NotNull Comparator<T> comparator) {
            tn.p.k(h52, "collection");
            tn.p.k(comparator, "comparator");
            this.f29504a = h52;
            this.f29505b = comparator;
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f29504a.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f29504a.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return cn.f0.X0(this.f29504a.value(), this.f29505b);
        }
    }

    public static final class c<T> implements H5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f29507b;

        public c(@NotNull H5<T> h52, int i10) {
            tn.p.k(h52, "collection");
            this.f29506a = i10;
            this.f29507b = h52.value();
        }

        @NotNull
        public final List<T> a() {
            int size = this.f29507b.size();
            int i10 = this.f29506a;
            if (size <= i10) {
                return cn.w.m();
            }
            List<T> list = this.f29507b;
            return list.subList(i10, list.size());
        }

        @NotNull
        public final List<T> b() {
            List<T> list = this.f29507b;
            return list.subList(0, zn.n.j(list.size(), this.f29506a));
        }

        @Override // com.ironsource.H5
        public boolean contains(T t10) {
            return this.f29507b.contains(t10);
        }

        @Override // com.ironsource.H5
        public int size() {
            return this.f29507b.size();
        }

        @Override // com.ironsource.H5
        @NotNull
        public List<T> value() {
            return this.f29507b;
        }
    }

    boolean contains(T t10);

    int size();

    @NotNull
    List<T> value();
}
