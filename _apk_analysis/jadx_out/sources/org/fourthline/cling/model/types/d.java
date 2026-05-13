package org.fourthline.cling.model.types;

import org.fourthline.cling.model.types.UnsignedVariableInteger;

/* JADX INFO: compiled from: UnsignedIntegerTwoBytes.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends UnsignedVariableInteger {
    public d(long j10) throws NumberFormatException {
        super(j10);
    }

    public d(String str) throws NumberFormatException {
        super(str);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits a() {
        return UnsignedVariableInteger.Bits.SIXTEEN;
    }
}
