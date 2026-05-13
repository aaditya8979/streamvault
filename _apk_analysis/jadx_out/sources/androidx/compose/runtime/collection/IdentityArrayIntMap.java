package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import bn.r;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: IdentityArrayIntMap.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001J&\u0010\u0010\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\f2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000J&\u0010\u0013\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u000eH\u0086\bø\u0001\u0000R(\u0010\u0014\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u001b\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "key", "", "find", "midIndex", "value", "valueHash", "findExactIndex", "get", "Lbn/r;", ImpressionLog.f51742l, "", "remove", "Lkotlin/Function2;", "predicate", "removeValueIf", "any", "block", "forEach", "size", "I", "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "getKeys$annotations", "", "values", "[I", "getValues", "()[I", "setValues", "([I)V", "getValues$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class IdentityArrayIntMap {
    private int size;

    @NotNull
    private Object[] keys = new Object[4];

    @NotNull
    private int[] values = new int[4];

    private final int find(Object key) {
        int i10 = this.size - 1;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return obj == key ? i12 : findExactIndex(i12, key, iIdentityHashCode);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayIntMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public final void add(@NotNull Object obj, int i10) {
        int iFind;
        p.k(obj, "key");
        if (this.size > 0) {
            iFind = find(obj);
            if (iFind >= 0) {
                this.values[iFind] = i10;
                return;
            }
        } else {
            iFind = -1;
        }
        int i11 = -(iFind + 1);
        int i12 = this.size;
        Object[] objArr = this.keys;
        if (i12 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i13 = i11 + 1;
            cn.p.l(objArr, objArr2, i13, i11, i12);
            cn.p.j(this.values, iArr, i13, i11, this.size);
            cn.p.p(this.keys, objArr2, 0, 0, i11, 6, null);
            cn.p.o(this.values, iArr, 0, 0, i11, 6, null);
            this.keys = objArr2;
            this.values = iArr;
        } else {
            int i14 = i11 + 1;
            cn.p.l(objArr, objArr, i14, i11, i12);
            int[] iArr2 = this.values;
            cn.p.j(iArr2, iArr2, i14, i11, this.size);
        }
        this.keys[i11] = obj;
        this.values[i11] = i10;
        this.size++;
    }

    public final boolean any(@NotNull sn.p<Object, ? super Integer, Boolean> pVar) {
        p.k(pVar, "predicate");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            if (pVar.mo2invoke(obj, Integer.valueOf(getValues()[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(@NotNull sn.p<Object, ? super Integer, r> pVar) {
        p.k(pVar, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            pVar.mo2invoke(obj, Integer.valueOf(getValues()[i10]));
        }
    }

    public final int get(@NotNull Object key) {
        p.k(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object key) {
        p.k(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i10 = this.size;
        if (iFind < i10 - 1) {
            Object[] objArr = this.keys;
            int i11 = iFind + 1;
            cn.p.l(objArr, objArr, iFind, i11, i10);
            int[] iArr = this.values;
            cn.p.j(iArr, iArr, iFind, i11, this.size);
        }
        int i12 = this.size - 1;
        this.size = i12;
        this.keys[i12] = null;
        return true;
    }

    public final void removeValueIf(@NotNull sn.p<Object, ? super Integer, Boolean> pVar) {
        p.k(pVar, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            int i12 = getValues()[i11];
            if (!pVar.mo2invoke(obj, Integer.valueOf(i12)).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = i12;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i13 = i10; i13 < size2; i13++) {
            getKeys()[i13] = null;
        }
        setSize(i10);
    }

    public final void setKeys(@NotNull Object[] objArr) {
        p.k(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void setValues(@NotNull int[] iArr) {
        p.k(iArr, "<set-?>");
        this.values = iArr;
    }
}
