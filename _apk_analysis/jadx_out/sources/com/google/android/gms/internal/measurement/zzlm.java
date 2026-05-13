package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes11.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i10, int i11, zzlj zzljVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmv.zzf(obj, j10)).longValue();
    }

    private final zzkg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkg) this.zzd[i11 + i11 + 1];
    }

    private final zzlu zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlu zzluVar = (zzlu) this.zzd[i12];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object objZzf = zzR(obj, i11, i10) ? zzmv.zzf(obj, j10) : null;
            Object objZzf2 = zzmv.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j10, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j10, objZzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmv.zzq(obj, zzy(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i10;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzf(i15, zzmv.zza(obj, j10));
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzo(i15, zzmv.zzb(obj, j10));
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzJ(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzb(i15, zzmv.zzw(obj, j10));
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzH(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzw(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzy(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzA(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzC(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 18:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 29:
                    z10 = false;
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 50:
                    zzM(zzndVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzf(i15, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzo(i15, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzt(i15, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzJ(i15, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzr(i15, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzm(i15, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzk(i15, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzb(i15, zzS(obj, j10));
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzH(i15, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzi(i15, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzw(i15, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzy(i15, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzC(i15, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 != 1048575) {
            return (zzmv.zzc(obj, j10) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j11 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j11)) != 0;
            case 2:
                return zzmv.zzd(obj, j11) != 0;
            case 3:
                return zzmv.zzd(obj, j11) != 0;
            case 4:
                return zzmv.zzc(obj, j11) != 0;
            case 5:
                return zzmv.zzd(obj, j11) != 0;
            case 6:
                return zzmv.zzc(obj, j11) != 0;
            case 7:
                return zzmv.zzw(obj, j11);
            case 8:
                Object objZzf = zzmv.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j11) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j11));
            case 11:
                return zzmv.zzc(obj, j11) != 0;
            case 12:
                return zzmv.zzc(obj, j11) != 0;
            case 13:
                return zzmv.zzc(obj, j11) != 0;
            case 14:
                return zzmv.zzd(obj, j11) != 0;
            case 15:
                return zzmv.zzc(obj, j11) != 0;
            case 16:
                return zzmv.zzd(obj, j11) != 0;
            case 17:
                return zzmv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzO(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmv.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i10, (String) obj);
        } else {
            zzndVar.zzd(i10, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r34, com.google.android.gms.internal.measurement.zzlo r35, com.google.android.gms.internal.measurement.zzkx r36, com.google.android.gms.internal.measurement.zzml r37, com.google.android.gms.internal.measurement.zzjp r38, com.google.android.gms.internal.measurement.zzle r39) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmv.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int i11;
        int iZzu;
        boolean z10;
        int iZzd2;
        int iZzi;
        int iZzz;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        int iZzA13;
        int iZzd3;
        int iZzA14;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int iZzA15 = 0;
        int i16 = 0;
        while (i15 < this.zzc.length) {
            int iZzB3 = zzB(i15);
            int[] iArr = this.zzc;
            int i17 = iArr[i15];
            int iZzA16 = zzA(iZzB3);
            if (iZzA16 <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                i10 = 1 << (i18 >>> 20);
                if (i19 != i14) {
                    i16 = unsafe.getInt(obj, i19);
                    i14 = i19;
                }
            } else {
                i10 = 0;
            }
            long j10 = iZzB3 & i13;
            switch (iZzA16) {
                case 0:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 1:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 2:
                    if ((i16 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i17 << 3);
                        iZzB = zzjj.zzB(j11);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if ((i16 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i17 << 3);
                        iZzB = zzjj.zzB(j12);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if ((i16 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzv(i20);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 5:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 6:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 7:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzjj.zzA(i17 << 3) + 1;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 8:
                    if ((i16 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzjb)) {
                            iZzA4 = zzjj.zzA(i17 << 3);
                            iZzv = zzjj.zzy((String) object);
                            i11 = iZzA4 + iZzv;
                            iZzA15 += i11;
                        } else {
                            iZzA6 = zzjj.zzA(i17 << 3);
                            iZzd = ((zzjb) object).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            iZzA15 += i11;
                        }
                    }
                    break;
                case 9:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzlw.zzo(i17, unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 10:
                    if ((i16 & i10) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j10);
                        iZzA6 = zzjj.zzA(i17 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        iZzA15 += i11;
                    }
                    break;
                case 11:
                    if ((i16 & i10) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzA(i21);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 12:
                    if ((i16 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzv(i22);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 13:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 14:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 15:
                    if ((i16 & i10) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzA((i23 >> 31) ^ (i23 + i23));
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 16:
                    if ((i10 & i16) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iZzA15 += zzjj.zzA(i17 << 3) + zzjj.zzB((j13 >> 63) ^ (j13 + j13));
                    }
                    break;
                case 17:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 18:
                    iZzA5 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 19:
                    iZzA5 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 20:
                    iZzA5 = zzlw.zzm(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 21:
                    iZzA5 = zzlw.zzx(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 22:
                    iZzA5 = zzlw.zzk(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 23:
                    iZzA5 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 24:
                    iZzA5 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 25:
                    iZzA5 = zzlw.zza(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 26:
                    iZzu = zzlw.zzu(i17, (List) unsafe.getObject(obj, j10));
                    iZzA15 += iZzu;
                    break;
                case 27:
                    iZzu = zzlw.zzp(i17, (List) unsafe.getObject(obj, j10), zzE(i15));
                    iZzA15 += iZzu;
                    break;
                case 28:
                    iZzu = zzlw.zzc(i17, (List) unsafe.getObject(obj, j10));
                    iZzA15 += iZzu;
                    break;
                case 29:
                    iZzu = zzlw.zzv(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzu;
                    break;
                case 30:
                    z10 = false;
                    iZzd2 = zzlw.zzd(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 31:
                    z10 = false;
                    iZzd2 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 32:
                    z10 = false;
                    iZzd2 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 33:
                    z10 = false;
                    iZzd2 = zzlw.zzq(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 34:
                    z10 = false;
                    iZzd2 = zzlw.zzs(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 35:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 36:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 37:
                    iZzi = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 38:
                    iZzi = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 39:
                    iZzi = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 40:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 41:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 42:
                    iZzi = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 43:
                    iZzi = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 44:
                    iZzi = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 45:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 46:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 47:
                    iZzi = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 48:
                    iZzi = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 49:
                    iZzu = zzlw.zzj(i17, (List) unsafe.getObject(obj, j10), zzE(i15));
                    iZzA15 += iZzu;
                    break;
                case 50:
                    zzle.zza(i17, unsafe.getObject(obj, j10), zzF(i15));
                    break;
                case 51:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i17, i15)) {
                        long jZzC = zzC(obj, j10);
                        iZzA12 = zzjj.zzA(i17 << 3);
                        iZzB2 = zzjj.zzB(jZzC);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i17, i15)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA12 = zzjj.zzA(i17 << 3);
                        iZzB2 = zzjj.zzB(jZzC2);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i17, i15)) {
                        int iZzr = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzv(iZzr);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 56:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzjj.zzA(i17 << 3) + 1;
                        iZzA15 += iZzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i17, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzjb) {
                            iZzA13 = zzjj.zzA(i17 << 3);
                            iZzd3 = ((zzjb) object2).zzd();
                            iZzA14 = zzjj.zzA(iZzd3);
                            i12 = iZzA13 + iZzA14 + iZzd3;
                            iZzA15 += i12;
                        } else {
                            iZzA9 = zzjj.zzA(i17 << 3);
                            iZzi = zzjj.zzy((String) object2);
                            i12 = iZzA9 + iZzi;
                            iZzA15 += i12;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzlw.zzo(i17, unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i17, i15)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j10);
                        iZzA13 = zzjj.zzA(i17 << 3);
                        iZzd3 = zzjbVar2.zzd();
                        iZzA14 = zzjj.zzA(iZzd3);
                        i12 = iZzA13 + iZzA14 + iZzd3;
                        iZzA15 += i12;
                    }
                    break;
                case 62:
                    if (zzR(obj, i17, i15)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzA(iZzr2);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 63:
                    if (zzR(obj, i17, i15)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzv(iZzr3);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 64:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i17, i15)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 67:
                    if (zzR(obj, i17, i15)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA15 += zzjj.zzA(i17 << 3) + zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzu;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int iZza = iZzA15 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzB2 = zzB(i12);
            int iZzA9 = zzA(iZzB2);
            int i13 = this.zzc[i12];
            long j10 = iZzB2 & 1048575;
            if (iZzA9 >= zzju.zzJ.zza() && iZzA9 <= zzju.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 1:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 2:
                    if (zzO(obj, i12)) {
                        long jZzd = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (zzO(obj, i12)) {
                        long jZzd2 = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (zzO(obj, i12)) {
                        int iZzc = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 5:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 6:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 7:
                    if (zzO(obj, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                    }
                    break;
                case 8:
                    if (zzO(obj, i12)) {
                        Object objZzf = zzmv.zzf(obj, j10);
                        if (objZzf instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                    break;
                case 9:
                    if (zzO(obj, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 10:
                    if (zzO(obj, i12)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                    }
                    break;
                case 11:
                    if (zzO(obj, i12)) {
                        int iZzc2 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzc2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 12:
                    if (zzO(obj, i12)) {
                        int iZzc3 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 13:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 14:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 15:
                    if (zzO(obj, i12)) {
                        int iZzc4 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 16:
                    if (zzO(obj, i12)) {
                        long jZzd3 = zzmv.zzd(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 17:
                    if (zzO(obj, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 48:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 49:
                    iZzo = zzlw.zzj(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 50:
                    zzle.zza(i13, zzmv.zzf(obj, j10), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i12)) {
                        long jZzC = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i12)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i12)) {
                        int iZzr = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i12)) {
                        Object objZzf2 = zzmv.zzf(obj, j10);
                        if (objZzf2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i12)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i12)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i12)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i12)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i12)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        return i11 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmv.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j10, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzip.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzip.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzip.zzj(bArr, i10, zzioVar);
                int i18 = zzioVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzkk.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzip.zzd(zzE(i17), bArr, i10, i11, zzioVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzip.zza(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, zzioVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                int i19 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i17);
                if (zzkgVarZzD == null || zzkgVarZzD.zza(i19)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                }
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iZzc = zzip.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzioVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkk.zzg(object2, zzioVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzc;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d9, code lost:
    
        if (r0 != r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02db, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f1, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0322, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzu(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.zzio r36) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzio zzioVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzj;
        int iZzj2 = i10;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j11);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzkjVarZzd);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVarZzd;
                    int iZzj3 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i21 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i21) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i21) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVarZzd;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i10)));
                    while (true) {
                        i17 = iZzj2 + 8;
                        if (i17 < i11) {
                            iZzj2 = zzip.zzj(bArr, i17, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVarZzd;
                    int iZzj4 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i22 = zzioVar.zza + iZzj4;
                    while (iZzj4 < i22) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i22) {
                        return iZzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVarZzd;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i10)));
                    while (true) {
                        i18 = iZzj2 + 4;
                        if (i18 < i11) {
                            iZzj2 = zzip.zzj(bArr, i18, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i18;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzky zzkyVar = (zzky) zzkjVarZzd;
                    int iZzj5 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i23 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i23) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i23) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVarZzd;
                    int iZzm = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                }
                if (i14 == 0) {
                    return zzip.zzl(i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVarZzd;
                    int iZzj7 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i24 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i24) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i24) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVarZzd;
                    zzkyVar4.zzg(zzip.zzn(bArr, i10));
                    while (true) {
                        i19 = iZzj2 + 8;
                        if (i19 < i11) {
                            iZzj2 = zzip.zzj(bArr, i19, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i19;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVarZzd;
                    int iZzj8 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i25 = zzioVar.zza + iZzj8;
                    while (iZzj8 < i25) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i25) {
                        return iZzj8;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVarZzd;
                    zzkdVar2.zzh(zzip.zzb(bArr, i10));
                    while (true) {
                        i20 = iZzj2 + 4;
                        if (i20 < i11) {
                            iZzj2 = zzip.zzj(bArr, i20, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i20;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i14 == 2) {
                    zziq zziqVar = (zziq) zzkjVarZzd;
                    iZzj = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i26 = zzioVar.zza + iZzj;
                    while (iZzj < i26) {
                        iZzj = zzip.zzm(bArr, iZzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj != i26) {
                        throw zzkm.zzf();
                    }
                    return iZzj;
                }
                if (i14 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVarZzd;
                    int iZzm2 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj9 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj9, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iZzj10 = zzip.zzj(bArr, iZzj2, zzioVar);
                        int i27 = zzioVar.zza;
                        if (i27 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i27 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            zzkjVarZzd.add(new String(bArr, iZzj10, i27, zzkk.zzb));
                            iZzj10 += i27;
                        }
                        while (iZzj10 < i11) {
                            int iZzj11 = zzip.zzj(bArr, iZzj10, zzioVar);
                            if (i12 != zzioVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzip.zzj(bArr, iZzj11, zzioVar);
                            int i28 = zzioVar.zza;
                            if (i28 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i28 == 0) {
                                zzkjVarZzd.add("");
                            } else {
                                zzkjVarZzd.add(new String(bArr, iZzj10, i28, zzkk.zzb));
                                iZzj10 += i28;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i29 = zzioVar.zza;
                    if (i29 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i29 == 0) {
                        zzkjVarZzd.add("");
                    } else {
                        int i30 = iZzj12 + i29;
                        if (!zzna.zzf(bArr, iZzj12, i30)) {
                            throw zzkm.zzc();
                        }
                        zzkjVarZzd.add(new String(bArr, iZzj12, i29, zzkk.zzb));
                        iZzj12 = i30;
                    }
                    while (iZzj12 < i11) {
                        int iZzj13 = zzip.zzj(bArr, iZzj12, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzip.zzj(bArr, iZzj13, zzioVar);
                        int i31 = zzioVar.zza;
                        if (i31 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i31 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            int i32 = iZzj12 + i31;
                            if (!zzna.zzf(bArr, iZzj12, i32)) {
                                throw zzkm.zzc();
                            }
                            zzkjVarZzd.add(new String(bArr, iZzj12, i31, zzkk.zzb));
                            iZzj12 = i32;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i14 == 2) {
                    return zzip.zze(zzE(i15), i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 28:
                if (i14 == 2) {
                    int iZzj14 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i33 = zzioVar.zza;
                    if (i33 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i33 > bArr.length - iZzj14) {
                        throw zzkm.zzf();
                    }
                    if (i33 == 0) {
                        zzkjVarZzd.add(zzjb.zzb);
                    } else {
                        zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i33));
                        iZzj14 += i33;
                    }
                    while (iZzj14 < i11) {
                        int iZzj15 = zzip.zzj(bArr, iZzj14, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzip.zzj(bArr, iZzj15, zzioVar);
                        int i34 = zzioVar.zza;
                        if (i34 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i34 > bArr.length - iZzj14) {
                            throw zzkm.zzf();
                        }
                        if (i34 == 0) {
                            zzkjVarZzd.add(zzjb.zzb);
                        } else {
                            zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i34));
                            iZzj14 += i34;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzj = zzip.zzl(i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                    }
                    return iZzj2;
                }
                iZzj = zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i13, zzkjVarZzd, zzD(i15), zzmmVar, this.zzn);
                if (objZzC != null) {
                    zzkcVar.zzc = (zzmm) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVarZzd;
                    int iZzj16 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i35 = zzioVar.zza + iZzj16;
                    while (iZzj16 < i35) {
                        iZzj16 = zzip.zzj(bArr, iZzj16, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj16 == i35) {
                        return iZzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVarZzd;
                    int iZzj17 = zzip.zzj(bArr, iZzj2, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj17 < i11) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVarZzd;
                    int iZzj19 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i36 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i36) {
                        iZzj19 = zzip.zzm(bArr, iZzj19, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj19 == i36) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVarZzd;
                    int iZzm3 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj20 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj20, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i14 == 3) {
                    zzlu zzluVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i10, i11, i37, zzioVar);
                    zzkjVarZzd.add(zzioVar.zzc);
                    while (iZzc < i11) {
                        int iZzj21 = zzip.zzj(bArr, iZzc, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj21, i11, i37, zzioVar);
                        zzkjVarZzd.add(zzioVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i10;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j10)));
                    i11 = i10 + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zza(zzS(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0467, code lost:
    
        if (r6 == 1048575) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0469, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x046f, code lost:
    
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0473, code lost:
    
        if (r3 >= r9.zzl) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0475, code lost:
    
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0487, code lost:
    
        if (r5 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x048e, code lost:
    
        if (r9.zzD(r4) != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0490, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0493, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzld) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x049b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x049c, code lost:
    
        if (r7 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04a0, code lost:
    
        if (r0 != r33) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04a7, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04aa, code lost:
    
        if (r0 > r33) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ac, code lost:
    
        if (r1 != r7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04b3, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzio r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmv.zzo(obj, j10, zzmv.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmv.zzp(obj, j10, zzmv.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmv.zzm(obj, j10, zzmv.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzioVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i10)) {
                        zzndVar.zzf(i11, zzmv.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(obj, i10)) {
                        zzndVar.zzo(i11, zzmv.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(obj, i10)) {
                        zzndVar.zzt(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(obj, i10)) {
                        zzndVar.zzJ(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(obj, i10)) {
                        zzndVar.zzr(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(obj, i10)) {
                        zzndVar.zzm(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(obj, i10)) {
                        zzndVar.zzk(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(obj, i10)) {
                        zzndVar.zzb(i11, zzmv.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(obj, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 10:
                    if (zzO(obj, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i10)) {
                        zzndVar.zzH(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(obj, i10)) {
                        zzndVar.zzi(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(obj, i10)) {
                        zzndVar.zzw(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(obj, i10)) {
                        zzndVar.zzy(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(obj, i10)) {
                        zzndVar.zzA(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(obj, i10)) {
                        zzndVar.zzC(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(obj, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 18:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 28:
                    zzlw.zzI(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 50:
                    zzM(zzndVar, i11, zzmv.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzf(i11, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzo(i11, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzt(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzJ(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzr(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzm(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzk(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzb(i11, zzS(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzR(obj, i11, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzH(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzi(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzw(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzy(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzA(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzC(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i10) || Double.doubleToLongBits(zzmv.zza(obj, j10)) != Double.doubleToLongBits(zzmv.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i10) || Float.floatToIntBits(zzmv.zzb(obj, j10)) != Float.floatToIntBits(zzmv.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i10) || zzmv.zzw(obj, j10) != zzmv.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i10) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzk(java.lang.Object):boolean");
    }
}
