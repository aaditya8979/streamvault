package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class y53 extends v21 {
    public static final Parcelable.Creator<y53> CREATOR = new x53();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97010d;

    public y53(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f97009c = parcel.readString();
        this.f97010d = (String) ib3.a((Object) parcel.readString());
    }

    public y53(String str, String str2, String str3) {
        super(str);
        this.f97009c = str2;
        this.f97010d = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte b10;
        String str = this.f95910b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                b10 = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b10 = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b10 = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b10 = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b10 = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b10 = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b10 = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b10 = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b10 = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b10 = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b10 = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b10 = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569891:
                b10 = !str.equals("TDAT") ? (byte) -1 : (byte) 12;
                break;
            case 2570401:
                b10 = !str.equals("TDRC") ? (byte) -1 : (byte) 13;
                break;
            case 2570410:
                b10 = !str.equals("TDRL") ? (byte) -1 : (byte) 14;
                break;
            case 2571565:
                b10 = !str.equals("TEXT") ? (byte) -1 : (byte) 15;
                break;
            case 2575251:
                b10 = !str.equals("TIT2") ? (byte) -1 : (byte) 16;
                break;
            case 2581512:
                b10 = !str.equals("TPE1") ? (byte) -1 : (byte) 17;
                break;
            case 2581513:
                b10 = !str.equals("TPE2") ? (byte) -1 : (byte) 18;
                break;
            case 2581514:
                b10 = !str.equals("TPE3") ? (byte) -1 : (byte) 19;
                break;
            case 2583398:
                b10 = !str.equals("TRCK") ? (byte) -1 : (byte) 20;
                break;
            case 2590194:
                b10 = !str.equals("TYER") ? (byte) -1 : (byte) 21;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    im1Var.f90881c = this.f97010d;
                    break;
                case 1:
                case 11:
                    im1Var.f90902x = this.f97010d;
                    break;
                case 2:
                case 12:
                    int i10 = Integer.parseInt(this.f97010d.substring(2, 4));
                    int i11 = Integer.parseInt(this.f97010d.substring(0, 2));
                    im1Var.f90896r = Integer.valueOf(i10);
                    im1Var.f90897s = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    im1Var.f90880b = this.f97010d;
                    break;
                case 4:
                case 18:
                    im1Var.f90882d = this.f97010d;
                    break;
                case 5:
                case 19:
                    im1Var.f90903y = this.f97010d;
                    break;
                case 6:
                case 20:
                    String str2 = this.f97010d;
                    int i12 = ib3.f90737a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    im1Var.f90891m = Integer.valueOf(i13);
                    im1Var.f90892n = numValueOf;
                    break;
                case 7:
                case 16:
                    im1Var.f90879a = this.f97010d;
                    break;
                case 8:
                case 15:
                    im1Var.f90901w = this.f97010d;
                    break;
                case 9:
                case 21:
                    im1Var.f90895q = Integer.valueOf(Integer.parseInt(this.f97010d));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f97010d);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                im1Var.f90897s = (Integer) arrayListA.get(2);
                            }
                        }
                        im1Var.f90896r = (Integer) arrayListA.get(1);
                    }
                    im1Var.f90895q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f97010d);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                im1Var.f90900v = (Integer) arrayListA2.get(2);
                            }
                        }
                        im1Var.f90899u = (Integer) arrayListA2.get(1);
                    }
                    im1Var.f90898t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y53.class != obj.getClass()) {
            return false;
        }
        y53 y53Var = (y53) obj;
        return ib3.a(this.f95910b, y53Var.f95910b) && ib3.a(this.f97009c, y53Var.f97009c) && ib3.a(this.f97010d, y53Var.f97010d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f95910b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f97009c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f97010d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f95910b + ": description=" + this.f97009c + ": value=" + this.f97010d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f95910b);
        parcel.writeString(this.f97009c);
        parcel.writeString(this.f97010d);
    }
}
