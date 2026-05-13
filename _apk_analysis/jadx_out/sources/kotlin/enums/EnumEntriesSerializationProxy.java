package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f73232b = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<E> f73233c;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] eArr) {
        p.k(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        p.h(cls);
        this.f73233c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f73233c.getEnumConstants();
        p.j(enumConstants, "getEnumConstants(...)");
        return kotlin.enums.a.a(enumConstants);
    }
}
