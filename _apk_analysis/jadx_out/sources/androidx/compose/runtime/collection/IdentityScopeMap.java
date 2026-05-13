package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import bn.r;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: IdentityScopeMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0017\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010(J\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002J#\u0010\r\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0082\bJ\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\u0002J(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u000bJ\u001d\u0010\u001b\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0015J \u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\nH\u0086\bø\u0001\u0000J\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\u00020 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010(\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R6\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010(\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00108\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u0010(\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "", "T", "", "index", "valueAt", "Landroidx/compose/runtime/collection/IdentityArraySet;", "scopeSetAt", "value", "getOrCreateIdentitySet", "Lkotlin/Function1;", "Lbn/r;", "removalOperation", "removingScopes", "find", "midIndex", "valueHash", "findExactIndex", "scope", "", ImpressionLog.f51742l, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", "contains", "block", "forEachScopeOf", "clear", "remove", "predicate", "removeValueIf", "removeScope", "(Ljava/lang/Object;)V", "", "valueOrder", "[I", "getValueOrder", "()[I", "setValueOrder", "([I)V", "getValueOrder$annotations", "()V", "", "values", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "scopeSets", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "setScopeSets", "([Landroidx/compose/runtime/collection/IdentityArraySet;)V", "getScopeSets$annotations", "size", "I", "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class IdentityScopeMap<T> {

    @NotNull
    private IdentityArraySet<T>[] scopeSets;
    private int size;

    @NotNull
    private int[] valueOrder;

    @NotNull
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int find(Object value) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.values[this.valueOrder[i12]];
            p.h(obj);
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return value == obj ? i12 : findExactIndex(i12, value, iIdentityHashCode);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L1d
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r0]
            r1 = r1[r2]
            tn.p.h(r1)
            if (r1 != r5) goto L13
            return r0
        L13:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L1a
            goto L1d
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3e
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r4]
            r1 = r1[r2]
            tn.p.h(r1)
            if (r1 != r5) goto L31
            return r4
        L31:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L3b
        L37:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L3b:
            int r4 = r4 + 1
            goto L21
        L3e:
            int r4 = r3.size
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityScopeMap.findExactIndex(int, java.lang.Object, int):int");
    }

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object value) {
        int iFind;
        if (this.size > 0) {
            iFind = find(value);
            if (iFind >= 0) {
                return scopeSetAt(iFind);
            }
        } else {
            iFind = -1;
        }
        int i10 = -(iFind + 1);
        int i11 = this.size;
        int[] iArr = this.valueOrder;
        if (i11 < iArr.length) {
            int i12 = iArr[i11];
            this.values[i12] = value;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i12];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                this.scopeSets[i12] = identityArraySet;
            }
            int i13 = this.size;
            if (i10 < i13) {
                int[] iArr2 = this.valueOrder;
                cn.p.j(iArr2, iArr2, i10 + 1, i10, i13);
            }
            this.valueOrder[i10] = i12;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.scopeSets, length);
        p.j(objArrCopyOf, "copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[]) objArrCopyOf;
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i11] = identityArraySet2;
        Object[] objArrCopyOf2 = Arrays.copyOf(this.values, length);
        p.j(objArrCopyOf2, "copyOf(this, newSize)");
        this.values = objArrCopyOf2;
        objArrCopyOf2[i11] = value;
        int[] iArr3 = new int[length];
        int i14 = this.size;
        while (true) {
            i14++;
            if (i14 >= length) {
                break;
            }
            iArr3[i14] = i14;
        }
        int i15 = this.size;
        if (i10 < i15) {
            cn.p.j(this.valueOrder, iArr3, i10 + 1, i10, i15);
        }
        iArr3[i10] = i11;
        if (i10 > 0) {
            cn.p.o(this.valueOrder, iArr3, 0, 0, i10, 6, null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    public static /* synthetic */ void getScopeSets$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValueOrder$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private final void removingScopes(l<? super IdentityArraySet<T>, r> lVar) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            p.h(identityArraySet);
            lVar.invoke(identityArraySet);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        setSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int index) {
        IdentityArraySet<T> identityArraySet = this.scopeSets[this.valueOrder[index]];
        p.h(identityArraySet);
        return identityArraySet;
    }

    private final Object valueAt(int index) {
        Object obj = this.values[this.valueOrder[index]];
        p.h(obj);
        return obj;
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        p.k(value, "value");
        p.k(scope, "scope");
        return getOrCreateIdentitySet(value).add(scope);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        for (int i10 = 0; i10 < length; i10++) {
            IdentityArraySet<T> identityArraySet = this.scopeSets[i10];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.valueOrder[i10] = i10;
            this.values[i10] = null;
        }
        this.size = 0;
    }

    public final boolean contains(@NotNull Object element) {
        p.k(element, "element");
        return find(element) >= 0;
    }

    public final void forEachScopeOf(@NotNull Object obj, @NotNull l<? super T, r> lVar) {
        p.k(obj, "value");
        p.k(lVar, "block");
        int iFind = find(obj);
        if (iFind >= 0) {
            Iterator<T> it = scopeSetAt(iFind).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i10;
        IdentityArraySet<T> identityArraySet;
        p.k(value, "value");
        p.k(scope, "scope");
        int iFind = find(value);
        if (iFind < 0 || (identityArraySet = this.scopeSets[(i10 = this.valueOrder[iFind])]) == null) {
            return false;
        }
        boolean zRemove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i11 = iFind + 1;
            int i12 = this.size;
            if (i11 < i12) {
                int[] iArr = this.valueOrder;
                cn.p.j(iArr, iArr, iFind, i11, i12);
            }
            int[] iArr2 = this.valueOrder;
            int i13 = this.size;
            iArr2[i13 - 1] = i10;
            this.values[i10] = null;
            this.size = i13 - 1;
        }
        return zRemove;
    }

    public final void removeScope(@NotNull T scope) {
        p.k(scope, "scope");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            p.h(identityArraySet);
            identityArraySet.remove(scope);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        setSize(i10);
    }

    public final void removeValueIf(@NotNull l<? super T, Boolean> lVar) {
        p.k(lVar, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            p.h(identityArraySet);
            int size2 = identityArraySet.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = identityArraySet.getValues()[i14];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (!lVar.invoke(obj).booleanValue()) {
                    if (i13 != i14) {
                        identityArraySet.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i15 = i13; i15 < size3; i15++) {
                identityArraySet.getValues()[i15] = null;
            }
            identityArraySet.setSize(i13);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i16 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = getSize();
        for (int i17 = i10; i17 < size4; i17++) {
            getValues()[getValueOrder()[i17]] = null;
        }
        setSize(i10);
    }

    public final void setScopeSets(@NotNull IdentityArraySet<T>[] identityArraySetArr) {
        p.k(identityArraySetArr, "<set-?>");
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void setValueOrder(@NotNull int[] iArr) {
        p.k(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void setValues(@NotNull Object[] objArr) {
        p.k(objArr, "<set-?>");
        this.values = objArr;
    }
}
