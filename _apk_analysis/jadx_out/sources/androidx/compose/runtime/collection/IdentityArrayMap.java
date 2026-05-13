package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: IdentityArrayMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010+\u001a\u00020\u0005¢\u0006\u0004\b,\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ \u0010\u0018\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0016H\u0086\bø\u0001\u0000J&\u0010\u001a\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0019H\u0086\bø\u0001\u0000R*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", "key", "", "find", "midIndex", "keyHash", "findExactIndex", "", "isEmpty", "isNotEmpty", "contains", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lbn/r;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "Lkotlin/Function1;", "block", "removeValueIf", "Lkotlin/Function2;", "forEach", "", "keys", "[Ljava/lang/Object;", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "values", "getValues$runtime_release", "setValues$runtime_release", "size", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "capacity", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class IdentityArrayMap<Key, Value> {

    @NotNull
    private Object[] keys;
    private int size;

    @NotNull
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int i10) {
        this.keys = new Object[i10];
        this.values = new Object[i10];
    }

    public /* synthetic */ IdentityArrayMap(int i10, int i11, i iVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    private final int find(Object key) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return key == obj ? i12 : findExactIndex(i12, key, iIdentityHashCode);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        return -(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            int r0 = r3 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L16
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return r0
        Lc:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L2
        L16:
            int r3 = r3 + 1
            int r0 = r2.size
        L1a:
            if (r3 >= r0) goto L30
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r3]
            if (r1 != r4) goto L23
            return r3
        L23:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L2d
        L29:
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        L2d:
            int r3 = r3 + 1
            goto L1a
        L30:
            int r3 = r2.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean contains(@NotNull Key key) {
        p.k(key, "key");
        return find(key) >= 0;
    }

    public final void forEach(@NotNull sn.p<? super Key, ? super Value, r> pVar) {
        p.k(pVar, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            }
            pVar.mo2invoke(obj, getValues()[i10]);
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        p.k(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return (Value) this.values[iFind];
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getKeys$runtime_release, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: getValues$runtime_release, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final boolean remove(@NotNull Key key) {
        p.k(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i10 = this.size;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i11 = iFind + 1;
        cn.p.l(objArr, objArr, iFind, i11, i10);
        cn.p.l(objArr2, objArr2, iFind, i11, i10);
        int i12 = i10 - 1;
        objArr[i12] = null;
        objArr2[i12] = null;
        this.size = i12;
        return true;
    }

    public final void removeValueIf(@NotNull l<? super Value, Boolean> lVar) {
        p.k(lVar, "block");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getValues()[i11];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = getKeys()[i11];
                    getValues()[i10] = obj;
                }
                i10++;
            }
        }
        if (getSize() > i10) {
            int size2 = getSize();
            for (int i12 = i10; i12 < size2; i12++) {
                getKeys()[i12] = null;
                getValues()[i12] = null;
            }
            setSize$runtime_release(i10);
        }
    }

    public final void set(@NotNull Key key, Value value) {
        p.k(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            this.values[iFind] = value;
            return;
        }
        int i10 = -(iFind + 1);
        int i11 = this.size;
        Object[] objArr = this.keys;
        boolean z10 = i11 == objArr.length;
        Object[] objArr2 = z10 ? new Object[i11 * 2] : objArr;
        int i12 = i10 + 1;
        cn.p.l(objArr, objArr2, i12, i10, i11);
        if (z10) {
            cn.p.p(this.keys, objArr2, 0, 0, i10, 6, null);
        }
        objArr2[i10] = key;
        this.keys = objArr2;
        Object[] objArr3 = z10 ? new Object[this.size * 2] : this.values;
        cn.p.l(this.values, objArr3, i12, i10, this.size);
        if (z10) {
            cn.p.p(this.values, objArr3, 0, 0, i10, 6, null);
        }
        objArr3[i10] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void setKeys$runtime_release(@NotNull Object[] objArr) {
        p.k(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i10) {
        this.size = i10;
    }

    public final void setValues$runtime_release(@NotNull Object[] objArr) {
        p.k(objArr, "<set-?>");
        this.values = objArr;
    }
}
