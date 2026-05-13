package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC3981d7 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31452b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31456a;

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final EnumC3981d7 a(int i10) {
            EnumC3981d7 enumC3981d7;
            EnumC3981d7[] enumC3981d7ArrValues = EnumC3981d7.values();
            int length = enumC3981d7ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC3981d7 = null;
                    break;
                }
                enumC3981d7 = enumC3981d7ArrValues[i11];
                if (enumC3981d7.b() == i10) {
                    break;
                }
                i11++;
            }
            return enumC3981d7 == null ? EnumC3981d7.SendEvent : enumC3981d7;
        }
    }

    EnumC3981d7(int i10) {
        this.f31456a = i10;
    }

    public final int b() {
        return this.f31456a;
    }
}
