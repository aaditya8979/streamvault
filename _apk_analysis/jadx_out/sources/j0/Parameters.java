package j0;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: renamed from: j0.k, reason: from toString */
/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001a\u0013\u0019B\u001d\b\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u0016\u0010\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\tH\u0096\u0002J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lj0/k;", "", "Lkotlin/Pair;", "", "Lj0/k$c;", "", "isEmpty", "", InneractiveMediationDefs.GENDER_FEMALE, "", "iterator", "", "other", "equals", "", "hashCode", "toString", "Lj0/k$a;", "g", "b", "Ljava/util/Map;", "entries", "<init>", "(Ljava/util/Map;)V", "()V", "c", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, un.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Parameters f72154d = new Parameters();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Entry> entries;

    /* JADX INFO: renamed from: j0.k$a */
    /* JADX INFO: compiled from: Parameters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\f"}, d2 = {"Lj0/k$a;", "", "Lj0/k;", "a", "", "", "Lj0/k$c;", "Ljava/util/Map;", "entries", "parameters", "<init>", "(Lj0/k;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Entry> entries;

        public a(@NotNull Parameters parameters) {
            this.entries = kotlin.collections.a.C(parameters.entries);
        }

        @NotNull
        public final Parameters a() {
            return new Parameters(o0.c.b(this.entries), null);
        }
    }

    /* JADX INFO: renamed from: j0.k$c, reason: from toString */
    /* JADX INFO: compiled from: Parameters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lj0/k$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String memoryCacheKey;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Entry) {
                Entry entry = (Entry) other;
                if (p.f(this.value, entry.value) && p.f(this.memoryCacheKey, entry.memoryCacheKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.value;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.memoryCacheKey;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.value + ", memoryCacheKey=" + this.memoryCacheKey + ')';
        }
    }

    public Parameters() {
        this(kotlin.collections.a.j());
    }

    public Parameters(Map<String, Entry> map) {
        this.entries = map;
    }

    public /* synthetic */ Parameters(Map map, tn.i iVar) {
        this(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Parameters) && p.f(this.entries, ((Parameters) other).entries);
    }

    @NotNull
    public final Map<String, String> f() {
        if (isEmpty()) {
            return kotlin.collections.a.j();
        }
        Map<String, Entry> map = this.entries;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            String memoryCacheKey = entry.getValue().getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final a g() {
        return new a(this);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map<String, Entry> map = this.entries;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            arrayList.add(bn.h.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.entries + ')';
    }
}
