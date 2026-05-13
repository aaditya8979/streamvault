package y;

import a0.e;
import bn.h;
import cn.f0;
import cn.w;
import coil.ImageLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import d0.i;
import d0.l;
import j0.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ComponentRegistry.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B«\u0001\b\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00120\u0010 \u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u0015\u0012(\u0010#\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u0015\u0012(\u0010%\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u0015\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0015¢\u0006\u0004\b(\u0010)B\t\b\u0016¢\u0006\u0004\b(\u0010*J\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J8\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J8\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\u0006\u0010\u0014\u001a\u00020\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aRA\u0010 \u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR9\u0010#\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\"\u0010\u001aR9\u0010%\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d0\f0\u00158\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006+"}, d2 = {"Ly/b;", "", "data", "Lj0/j;", "options", "g", "", InneractiveMediationDefs.GENDER_FEMALE, "Lcoil/ImageLoader;", "imageLoader", "", "startIndex", "Lkotlin/Pair;", "Ld0/i;", "j", "Ld0/l;", "result", "La0/e;", "i", "Ly/b$a;", "h", "", "Le0/a;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "interceptors", "Lg0/d;", "Ljava/lang/Class;", "b", "e", "mappers", "Lf0/b;", "d", "keyers", "Ld0/i$a;", "fetcherFactories", "La0/e$a;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<e0.a> interceptors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<g0.d<? extends Object, ? extends Object>, Class<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<f0.b<? extends Object>, Class<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<e.a> decoderFactories;

    /* JADX INFO: compiled from: ComponentRegistry.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J0\u0010\u0007\u001a\u00020\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J,\u0010\n\u001a\u00020\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J,\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R@\u0010\u001a\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050\u00180\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R<\u0010\u001c\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050\u00180\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R<\u0010\u001e\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00050\u00180\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006$"}, d2 = {"Ly/b$a;", "", "T", "Lg0/d;", "mapper", "Ljava/lang/Class;", "type", "d", "Lf0/b;", "keyer", "c", "Ld0/i$a;", "factory", "b", "La0/e$a;", "a", "Ly/b;", "e", "", "Le0/a;", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "getMappers$coil_base_release", "mappers", "getKeyers$coil_base_release", "keyers", "g", "fetcherFactories", InneractiveMediationDefs.GENDER_FEMALE, "decoderFactories", "registry", "<init>", "(Ly/b;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<e0.a> interceptors;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<g0.d<? extends Object, ?>, Class<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<f0.b<? extends Object>, Class<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<e.a> decoderFactories;

        public a(@NotNull b bVar) {
            this.interceptors = f0.j1(bVar.c());
            this.mappers = f0.j1(bVar.e());
            this.keyers = f0.j1(bVar.d());
            this.fetcherFactories = f0.j1(bVar.b());
            this.decoderFactories = f0.j1(bVar.a());
        }

        @NotNull
        public final a a(@NotNull e.a factory) {
            this.decoderFactories.add(factory);
            return this;
        }

        @NotNull
        public final <T> a b(@NotNull i.a<T> factory, @NotNull Class<T> type) {
            this.fetcherFactories.add(h.a(factory, type));
            return this;
        }

        @NotNull
        public final <T> a c(@NotNull f0.b<T> keyer, @NotNull Class<T> type) {
            this.keyers.add(h.a(keyer, type));
            return this;
        }

        @NotNull
        public final <T> a d(@NotNull g0.d<T, ?> mapper, @NotNull Class<T> type) {
            this.mappers.add(h.a(mapper, type));
            return this;
        }

        @NotNull
        public final b e() {
            return new b(o0.c.a(this.interceptors), o0.c.a(this.mappers), o0.c.a(this.keyers), o0.c.a(this.fetcherFactories), o0.c.a(this.decoderFactories), null);
        }

        @NotNull
        public final List<e.a> f() {
            return this.decoderFactories;
        }

        @NotNull
        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.fetcherFactories;
        }
    }

    public b() {
        this(w.m(), w.m(), w.m(), w.m(), w.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends e0.a> list, List<? extends Pair<? extends g0.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends f0.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends e.a> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.fetcherFactories = list4;
        this.decoderFactories = list5;
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, tn.i iVar) {
        this(list, list2, list3, list4, list5);
    }

    @NotNull
    public final List<e.a> a() {
        return this.decoderFactories;
    }

    @NotNull
    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.fetcherFactories;
    }

    @NotNull
    public final List<e0.a> c() {
        return this.interceptors;
    }

    @NotNull
    public final List<Pair<f0.b<? extends Object>, Class<? extends Object>>> d() {
        return this.keyers;
    }

    @NotNull
    public final List<Pair<g0.d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.mappers;
    }

    @Nullable
    public final String f(@NotNull Object data, @NotNull j options) {
        List<Pair<f0.b<? extends Object>, Class<? extends Object>>> list = this.keyers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<f0.b<? extends Object>, Class<? extends Object>> pair = list.get(i10);
            f0.b<? extends Object> bVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                p.i(bVarComponent1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVarComponent1.a(data, options);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object g(@NotNull Object data, @NotNull j options) {
        List<Pair<g0.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<g0.d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i10);
            g0.d<? extends Object, ? extends Object> dVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                p.i(dVarComponent1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVarComponent1.a(data, options);
                if (objA != null) {
                    data = objA;
                }
            }
        }
        return data;
    }

    @NotNull
    public final a h() {
        return new a(this);
    }

    @Nullable
    public final Pair<a0.e, Integer> i(@NotNull l result, @NotNull j options, @NotNull ImageLoader imageLoader, int startIndex) {
        int size = this.decoderFactories.size();
        while (startIndex < size) {
            a0.e eVarA = this.decoderFactories.get(startIndex).a(result, options, imageLoader);
            if (eVarA != null) {
                return h.a(eVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @Nullable
    public final Pair<i, Integer> j(@NotNull Object data, @NotNull j options, @NotNull ImageLoader imageLoader, int startIndex) {
        int size = this.fetcherFactories.size();
        while (startIndex < size) {
            Pair<i.a<? extends Object>, Class<? extends Object>> pair = this.fetcherFactories.get(startIndex);
            i.a<? extends Object> aVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(data.getClass())) {
                p.i(aVarComponent1, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                i iVarA = aVarComponent1.a(data, options, imageLoader);
                if (iVarA != null) {
                    return h.a(iVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }
}
