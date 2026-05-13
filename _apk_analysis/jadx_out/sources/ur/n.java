package ur;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: IntegerDatatype.java */
/* JADX INFO: loaded from: classes12.dex */
public class n extends org.fourthline.cling.model.types.a<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85815b;

    public n(int i10) {
        this.f85815b = i10;
    }

    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    public boolean d(Class cls) {
        return cls == Integer.TYPE || Integer.class.isAssignableFrom(cls);
    }

    public int h() {
        return this.f85815b;
    }

    public int i() {
        int iH = h();
        if (iH == 1) {
            return 127;
        }
        if (iH == 2) {
            return 32767;
        }
        if (iH == 4) {
            return Integer.MAX_VALUE;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + h());
    }

    public int j() {
        int iH = h();
        if (iH == 1) {
            return -128;
        }
        if (iH == 2) {
            return -32768;
        }
        if (iH == 4) {
            return Integer.MIN_VALUE;
        }
        throw new IllegalArgumentException("Invalid integer byte size: " + h());
    }

    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Integer num) {
        return num == null || (num.intValue() >= j() && num.intValue() <= i());
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        try {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(str.trim()));
            if (isValid(numValueOf)) {
                return numValueOf;
            }
            throw new InvalidValueException("Not a " + h() + " byte(s) integer: " + str);
        } catch (NumberFormatException e10) {
            if (str.equals("NOT_IMPLEMENTED")) {
                return Integer.valueOf(i());
            }
            throw new InvalidValueException("Can't convert string to number: " + str, e10);
        }
    }
}
