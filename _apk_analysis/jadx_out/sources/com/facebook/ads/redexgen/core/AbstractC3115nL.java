package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3115nL {
    public static byte[] A00;
    public static String[] A01 = {"K5wWXkn1kn3vTm5TWZRpAJ13TGij4Off", "na1woSjLgBJfLtqhSRSkwOGg", "PhLAgNdVWkw0DSh4SzNoPunxC5fhlr", "P2EphC6Qbo", "AgH7SjrpzHTBb", "6lZG", "iuGyz0SG3T5uD6f3liiVpcsGpl9NN6eU", "8JXy4no7J"};

    static {
        A09();
    }

    public static <T> int A00(Iterator<T> it, InterfaceC2872jB<? super T> interfaceC2872jB) {
        AbstractC2871jA.A05(interfaceC2872jB, A08(0, 9, 27));
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC2872jB.A44(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> AbstractC3240pg<T> A01(final Iterator<T> it, final InterfaceC2872jB<? super T> interfaceC2872jB) {
        AbstractC2871jA.A04(it);
        AbstractC2871jA.A04(interfaceC2872jB);
        return new BI<T>() { // from class: com.facebook.ads.redexgen.X.1f
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.facebook.ads.redexgen.core.BI
            @CheckForNull
            public final T A02() {
                while (it.hasNext()) {
                    T t10 = (T) it.next();
                    if (interfaceC2872jB.A44(t10)) {
                        return t10;
                    }
                }
                return A01();
            }
        };
    }

    public static <T> Iterator<T> A02() {
        return EnumC3113nJ.A03;
    }

    public static <T> AbstractC3240pg<T> A03(@ParametricNullness T t10) {
        return t10 != null ? new C1670Aj(t10) : new C1669Ai(null);
    }

    public static <T> AbstractC3240pg<T> A04(Iterator<? extends T> it) {
        AbstractC2871jA.A04(it);
        return it instanceof AbstractC3240pg ? (AbstractC3240pg) it : new C1671Ak(it);
    }

    @CheckForNull
    public static <T> T A05(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @ParametricNullness
    public static <T> T A06(Iterator<T> it, InterfaceC2872jB<? super T> interfaceC2872jB) {
        AbstractC2871jA.A04(it);
        AbstractC2871jA.A04(interfaceC2872jB);
        while (it.hasNext()) {
            T next = it.next();
            if (interfaceC2872jB.A44(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public static <T> T A07(@ParametricNullness Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{-67, -65, -78, -79, -74, -80, -82, -63, -78};
    }

    public static void A0A(Iterator<?> it) {
        AbstractC2871jA.A04(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> boolean A0B(Collection<T> collection, Iterator<? extends T> it) {
        AbstractC2871jA.A04(collection);
        AbstractC2871jA.A04(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean A0C(Iterator<T> it, InterfaceC2872jB<? super T> interfaceC2872jB) {
        return A00(it, interfaceC2872jB) != -1;
    }

    public static <T> boolean A0D(Iterator<T> it, InterfaceC2872jB<? super T> interfaceC2872jB) {
        AbstractC2871jA.A04(interfaceC2872jB);
        boolean z10 = false;
        while (it.hasNext()) {
            if (interfaceC2872jB.A44(it.next())) {
                it.remove();
                if (A01[5].length() != 4) {
                    throw new RuntimeException();
                }
                A01[7] = "wI9B4C2he";
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean A0E(@CheckForNull Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0F(Iterator<?> it, Collection<?> collection) {
        AbstractC2871jA.A04(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean A0G(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !BX.A01(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
