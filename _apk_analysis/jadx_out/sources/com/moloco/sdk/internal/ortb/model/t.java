package com.moloco.sdk.internal.ortb.model;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@so.k
public final class t {

    @NotNull
    public static final a Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g<KSerializer<Object>> f46437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f46438b = new t("Start", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f46439c = new t("Center", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f46440d = new t("End", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f46441e = new t("Left", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f46442f = new t("Right", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t[] f46443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46444h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) t.f46437a.getValue();
        }

        @NotNull
        public final KSerializer<t> serializer() {
            return a();
        }
    }

    static {
        t[] tVarArrA = a();
        f46443g = tVarArrA;
        f46444h = kotlin.enums.a.a(tVarArrA);
        Companion = new a(null);
        f46437a = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: com.moloco.sdk.internal.ortb.model.b0
            @Override // sn.a
            public final Object invoke() {
                return i0.a("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", t.values(), new String[]{"start", "center", "end", "left", "right"}, new Annotation[][]{null, null, null, null, null}, null);
            }
        });
    }

    public t(String str, int i10) {
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{f46438b, f46439c, f46440d, f46441e, f46442f};
    }

    @NotNull
    public static kn.a<t> d() {
        return f46444h;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f46443g.clone();
    }
}
