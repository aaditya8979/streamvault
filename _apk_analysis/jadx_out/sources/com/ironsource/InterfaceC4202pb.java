package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC4202pb<T> {

    /* JADX INFO: renamed from: com.ironsource.pb$a */
    public static final class a<T> implements InterfaceC4202pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSourceError f33253a;

        public a(@NotNull IronSourceError ironSourceError) {
            tn.p.k(ironSourceError, "error");
            this.f33253a = ironSourceError;
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f33253a;
            }
            return aVar.a(ironSourceError);
        }

        @NotNull
        public final IronSourceError a() {
            return this.f33253a;
        }

        @NotNull
        public final a<T> a(@NotNull IronSourceError ironSourceError) {
            tn.p.k(ironSourceError, "error");
            return new a<>(ironSourceError);
        }

        @NotNull
        public final IronSourceError b() {
            return this.f33253a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && tn.p.f(this.f33253a, ((a) obj).f33253a);
        }

        public int hashCode() {
            return this.f33253a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.f33253a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.pb$b */
    public static final class b<T> implements InterfaceC4202pb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f33254a;

        public b(T t10) {
            this.f33254a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f33254a;
            }
            return bVar.a(obj);
        }

        @NotNull
        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        public final T a() {
            return this.f33254a;
        }

        public final T b() {
            return this.f33254a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && tn.p.f(this.f33254a, ((b) obj).f33254a);
        }

        public int hashCode() {
            T t10 = this.f33254a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.f33254a + ")";
        }
    }
}
