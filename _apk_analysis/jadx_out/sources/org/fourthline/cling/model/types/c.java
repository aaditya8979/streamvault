package org.fourthline.cling.model.types;

import org.fourthline.cling.model.types.UnsignedVariableInteger;

/* JADX INFO: compiled from: UnsignedIntegerOneByte.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends UnsignedVariableInteger {
    public c(String str) throws NumberFormatException {
        super(str);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits a() {
        return UnsignedVariableInteger.Bits.EIGHT;
    }
}
