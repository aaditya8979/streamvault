package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public enum EnumC4200p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f33244b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33249a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final EnumC4200p9 a(int i10) {
            EnumC4200p9 enumC4200p9;
            EnumC4200p9[] enumC4200p9ArrValues = EnumC4200p9.values();
            int length = enumC4200p9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4200p9 = null;
                    break;
                }
                enumC4200p9 = enumC4200p9ArrValues[i11];
                if (enumC4200p9.f33249a == i10) {
                    break;
                }
                i11++;
            }
            return enumC4200p9 == null ? EnumC4200p9.NotSupported : enumC4200p9;
        }
    }

    EnumC4200p9(int i10) {
        this.f33249a = i10;
    }

    public final int b() {
        return this.f33249a;
    }

    public final boolean b(@NotNull EnumC4200p9 enumC4200p9) {
        tn.p.k(enumC4200p9, "instanceType");
        return enumC4200p9.b() == this.f33249a;
    }
}
