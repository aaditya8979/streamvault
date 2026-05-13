package zo;

import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: zo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class C1121a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KSerializer<?> f98373a;

        @Override // zo.a
        @NotNull
        public KSerializer<?> a(@NotNull List<? extends KSerializer<?>> list) {
            p.k(list, "typeArgumentsSerializers");
            return this.f98373a;
        }

        @NotNull
        public final KSerializer<?> b() {
            return this.f98373a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C1121a) && p.f(((C1121a) obj).f98373a, this.f98373a);
        }

        public int hashCode() {
            return this.f98373a.hashCode();
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final l<List<? extends KSerializer<?>>, KSerializer<?>> f98374a;

        @Override // zo.a
        @NotNull
        public KSerializer<?> a(@NotNull List<? extends KSerializer<?>> list) {
            p.k(list, "typeArgumentsSerializers");
            return this.f98374a.invoke(list);
        }

        @NotNull
        public final l<List<? extends KSerializer<?>>, KSerializer<?>> b() {
            return this.f98374a;
        }
    }

    @NotNull
    public abstract KSerializer<?> a(@NotNull List<? extends KSerializer<?>> list);
}
