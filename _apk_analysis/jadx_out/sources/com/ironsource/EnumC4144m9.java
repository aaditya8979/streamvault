package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public enum EnumC4144m9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f32293b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32297a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final EnumC4144m9 a(int i10) {
            EnumC4144m9 enumC4144m9;
            EnumC4144m9[] enumC4144m9ArrValues = EnumC4144m9.values();
            int length = enumC4144m9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4144m9 = null;
                    break;
                }
                enumC4144m9 = enumC4144m9ArrValues[i11];
                if (enumC4144m9.b() == i10) {
                    break;
                }
                i11++;
            }
            return enumC4144m9 == null ? EnumC4144m9.APP_ACTIVITY : enumC4144m9;
        }
    }

    EnumC4144m9(int i10) {
        this.f32297a = i10;
    }

    public final int b() {
        return this.f32297a;
    }
}
