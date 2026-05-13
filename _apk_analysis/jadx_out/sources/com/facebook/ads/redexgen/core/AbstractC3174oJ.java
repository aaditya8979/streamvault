package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3174oJ {
    public static <K, V> InterfaceC1668Ah<K, V> A00(final Map<K, Collection<V>> map, final InterfaceC2882jM<? extends List<V>> interfaceC2882jM) {
        return new C0Z<K, V>(map, interfaceC2882jM) { // from class: com.facebook.ads.redexgen.X.0H
            public static final long serialVersionUID = 0;
            public transient InterfaceC2882jM<? extends List<V>> A00;

            {
                this.A00 = (InterfaceC2882jM) AbstractC2871jA.A04(interfaceC2882jM);
            }

            private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
                objectInputStream.defaultReadObject();
                this.A00 = (InterfaceC2882jM) Objects.requireNonNull(objectInputStream.readObject());
                A0L((Map) Objects.requireNonNull(objectInputStream.readObject()));
            }

            private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
                objectOutputStream.defaultWriteObject();
                objectOutputStream.writeObject(this.A00);
                objectOutputStream.writeObject(A0I());
            }

            @Override // com.facebook.ads.redexgen.core.BD
            public final Map<K, Collection<V>> A00() {
                return A0J();
            }

            @Override // com.facebook.ads.redexgen.core.BD
            public final Set<K> A02() {
                return A0K();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC14501i
            /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
            public final List<V> A0D() {
                return this.A00.get();
            }
        };
    }

    public static boolean A01(@CheckForNull InterfaceC3169oE<?, ?> interfaceC3169oE, Object obj) {
        if (obj == interfaceC3169oE) {
            return true;
        }
        if (obj instanceof InterfaceC3169oE) {
            return interfaceC3169oE.A49().equals(((InterfaceC3169oE) obj).A49());
        }
        return false;
    }
}
