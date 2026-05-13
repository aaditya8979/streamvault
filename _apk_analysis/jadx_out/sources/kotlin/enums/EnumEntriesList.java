package kotlin.enums;

import cn.d;
import cn.r;
import java.io.Serializable;
import java.lang.Enum;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes9.dex */
final class EnumEntriesList<T extends Enum<T>> extends d<T> implements kn.a<T>, Serializable {

    @NotNull
    private final T[] entries;

    public EnumEntriesList(@NotNull T[] tArr) {
        p.k(tArr, "entries");
        this.entries = tArr;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    public boolean contains(@NotNull T t10) {
        p.k(t10, "element");
        return ((Enum) r.d0(this.entries, t10.ordinal())) == t10;
    }

    @Override // cn.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // cn.d, java.util.List
    @NotNull
    public T get(int i10) {
        d.Companion.b(i10, this.entries.length);
        return this.entries[i10];
    }

    @Override // cn.d, cn.b
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.entries.length;
    }

    public int indexOf(@NotNull T t10) {
        p.k(t10, "element");
        int iOrdinal = t10.ordinal();
        if (((Enum) r.d0(this.entries, iOrdinal)) == t10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // cn.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    public int lastIndexOf(@NotNull T t10) {
        p.k(t10, "element");
        return indexOf((Object) t10);
    }

    @Override // cn.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }
}
