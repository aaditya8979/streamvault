package com.moloco.sdk.internal.ortb.model;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class E {

    @NotNull
    public static final a Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g<KSerializer<Object>> f46299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f46300b = new E("Top", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f46301c = new E("Center", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f46302d = new E("Bottom", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ E[] f46303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46304f;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) E.f46299a.getValue();
        }

        @NotNull
        public final KSerializer<E> serializer() {
            return a();
        }
    }

    static {
        E[] eArrA = a();
        f46303e = eArrA;
        f46304f = kotlin.enums.a.a(eArrA);
        Companion = new a(null);
        f46299a = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: com.moloco.sdk.internal.ortb.model.h
            @Override // sn.a
            public final Object invoke() {
                return i0.a("com.moloco.sdk.internal.ortb.model.VerticalAlignment", E.values(), new String[]{"top", "center", "bottom"}, new Annotation[][]{null, null, null}, null);
            }
        });
    }

    public E(String str, int i10) {
    }

    public static final /* synthetic */ E[] a() {
        return new E[]{f46300b, f46301c, f46302d};
    }

    @NotNull
    public static kn.a<E> d() {
        return f46304f;
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f46303e.clone();
    }
}
