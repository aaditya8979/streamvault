package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC4364z4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f34487b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34493a;

    /* JADX INFO: renamed from: com.ironsource.z4$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final EnumC4364z4 a(@Nullable String str) {
            EnumC4364z4 enumC4364z4;
            EnumC4364z4[] enumC4364z4ArrValues = EnumC4364z4.values();
            int length = enumC4364z4ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC4364z4 = null;
                    break;
                }
                enumC4364z4 = enumC4364z4ArrValues[i10];
                if (tn.p.f(enumC4364z4.b(), str)) {
                    break;
                }
                i10++;
            }
            return enumC4364z4 == null ? EnumC4364z4.NONE : enumC4364z4;
        }
    }

    EnumC4364z4(String str) {
        this.f34493a = str;
    }

    @NotNull
    public static final EnumC4364z4 a(@Nullable String str) {
        return f34487b.a(str);
    }

    @NotNull
    public final String b() {
        return this.f34493a;
    }
}
